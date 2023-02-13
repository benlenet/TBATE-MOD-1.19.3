package net.bern.tbatemod;

import net.bern.tbatemod.event.KeyInputHandler;
import net.bern.tbatemod.networking.ModMessages;
import net.fabricmc.api.ClientModInitializer;

public class TBATEModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
        ModMessages.registerC2SPackets();
    }
}
