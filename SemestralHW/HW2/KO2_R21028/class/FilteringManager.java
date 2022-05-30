package com.davsoncze;

import java.util.Arrays;

public class FilteringManager {
    public Player[] applyFilter(Player[] players, Filter filter) {
        Player[] filtered = new Player[players.length];
        int i = 0;

        for (Player player : players) {
            if (filter.applyFilter(player)) filtered[i++] = player;
        }
        filtered = Arrays.copyOf(filtered, i);
        return filtered;
    }
}
