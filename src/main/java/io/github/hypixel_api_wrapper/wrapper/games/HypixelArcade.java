package io.github.hypixel_api_wrapper.wrapper.games;

public class HypixelArcade implements HypixelGame {
    @Override
    public String getGameID() {
        return "ARCADE";
    }

    @Override
    public String getGameName() {
        return "Arcade";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
