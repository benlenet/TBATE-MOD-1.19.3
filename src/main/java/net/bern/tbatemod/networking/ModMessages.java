package net.bern.tbatemod.networking;

import net.bern.tbatemod.TBATEMod;
import net.bern.tbatemod.networking.packets.TBATEC2SPacket;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class ModMessages {
    public static final Identifier MANA_ID = new Identifier(TBATEMod.MOD_ID, "mana");
    public static final Identifier MANA_SYNC_ID = new Identifier(TBATEMod.MOD_ID, "mana_sync");
    public static final Identifier TBATE_ID = new Identifier(TBATEMod.MOD_ID, "tbate");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(TBATE_ID, TBATEC2SPacket::receive);
    }

    public static void registerS2CPackets() {

    }
}
