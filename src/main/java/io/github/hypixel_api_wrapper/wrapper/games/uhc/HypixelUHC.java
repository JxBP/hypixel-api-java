package io.github.hypixel_api_wrapper.wrapper.games.uhc;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelUHC extends HypixelGame {

    protected HypixelUHC(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "UHC";
    }

    @Override
    public String getGameName() {
        return "UHC Champions";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
