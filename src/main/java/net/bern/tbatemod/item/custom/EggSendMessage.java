package net.bern.tbatemod.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class EggSendMessage extends Item {
    public EggSendMessage(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            outputText(user);
            user.getItemCooldownManager().set(this, 100);
        }
        return super.use(world, user, hand);
    }
    private void outputText(PlayerEntity player) {
        int randomNum = Random.createLocal().nextInt(3);
        switch (randomNum) {
            case 0:  player.sendMessage(Text.literal("The egg hums quietly."));
            break;
            case 1:  player.sendMessage(Text.literal("You can feel power pulsing off of the egg."));
            break;
            case 2:  player.sendMessage(Text.literal("The egg gives you a newfound sense of strength."));
        }
    }
}
