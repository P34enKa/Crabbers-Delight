package alabaster.crabbersdelight.common.item;

import alabaster.crabbersdelight.common.registry.ModItems;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingTickEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;
import java.util.function.Supplier;

@Mod.EventBusSubscriber
public class CrabClawItem extends Item {
    public static final int MAX_DAMAGE = 128;

    public static final AttributeModifier rangeAttributeModifier =
            new AttributeModifier(UUID.fromString("7f7dbdb2-0d0d-458a-aa40-ac7633691f66"), "Range Modifier", 3,
                    AttributeModifier.Operation.ADDITION);

    private static final Supplier<Multimap<Attribute, AttributeModifier>> rangeModifier = Suppliers.memoize(() ->
            ImmutableMultimap.of(ForgeMod.BLOCK_REACH.get(), rangeAttributeModifier));

    public CrabClawItem(Properties properties) {
        super(properties.defaultDurability(MAX_DAMAGE));
    }

    public static final String CLAW_HELD = "clawHeld";

    @SubscribeEvent
    public static void extendRange(LivingTickEvent event) {
        if (!(event.getEntity() instanceof Player))
            return;

        Player player = (Player) event.getEntity();
        CompoundTag persistentData = player.getPersistentData();

        boolean clawHeld = (player.getMainHandItem().is(ModItems.CRAB_CLAW.get()) || (player.getOffhandItem().is(ModItems.CRAB_CLAW.get())));
        boolean hadClaw = persistentData.contains(CLAW_HELD);

        if (clawHeld != hadClaw ) {
            if (!clawHeld) {
                player.getAttributes()
                        .removeAttributeModifiers(rangeModifier.get());
                persistentData.remove(CLAW_HELD);
            } else {
                player.getAttributes()
                        .addTransientAttributeModifiers(rangeModifier.get());
                persistentData.putBoolean(CLAW_HELD, true);
            }
        }
    }
}