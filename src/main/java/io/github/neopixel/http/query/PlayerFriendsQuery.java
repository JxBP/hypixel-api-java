package io.github.neopixel.http.query;

import io.github.neopixel.http.Endpoint;
import java.util.UUID;
import okhttp3.HttpUrl;

public class PlayerFriendsQuery extends Query {
    private String username;
    private UUID uuid;

    protected PlayerFriendsQuery(String username) {
        this.username = username;
    }

    protected PlayerFriendsQuery(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public HttpUrl.Builder createRequest() {
        if(uuid != null ) {
            return HttpUrl.get(Endpoint.PLAYER_FRIENDS.getURL()).newBuilder()
                .addQueryParameter("uuid", uuid.toString());
        }
        return HttpUrl.get(Endpoint.PLAYER_FRIENDS.getURL()).newBuilder()
            .addQueryParameter("name", username);
    }

    public String getUsername() {
        return username;
    }

    public UUID getUUID() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        PlayerFriendsQuery other = (PlayerFriendsQuery) o;

        if(uuid != null) {
            return other.getUUID().equals(uuid);
        }

        return other.getUsername().equals(username);
    }
}
