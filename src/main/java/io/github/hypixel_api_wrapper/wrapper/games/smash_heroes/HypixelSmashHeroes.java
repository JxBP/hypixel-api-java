package io.github.hypixel_api_wrapper.wrapper.games.smash_heroes;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelSmashHeroes extends HypixelGame {

    protected HypixelSmashHeroes(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "SUPER_SMASH";
    }

    @Override
    public String getGameName() {
        return "Smash Heroes";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
