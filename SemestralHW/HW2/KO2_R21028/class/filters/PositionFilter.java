package com.davsoncze.filters;

import com.davsoncze.Filter;
import com.davsoncze.Player;
import com.davsoncze.enums.PlayerPosition;

public class PositionFilter extends Filter {
    private final PlayerPosition position;

    public PositionFilter(PlayerPosition position) {
        super();
        this.position = position;
    }

    @Override
    public boolean applyFilter(Player player) {
        return position == player.getPosition();
    }

    @Override
    protected String titleString() {
        return "Vypisuju hráče filtrované podle pozice(%s): ".formatted(position);
    }
}
