package com.davsoncze.filters;

import com.davsoncze.Filter;
import com.davsoncze.Player;

public class NameContainsFilter extends Filter {
    private final String string;

    public NameContainsFilter(String string) {
        super();
        this.string = string;
    }

    @Override
    public boolean applyFilter(Player player) {
        return (player.getName().contains(string) || player.getSurname().contains(string));
    }

    @Override
    protected String titleString() {
        return "Vypisuju hráče filtrované podle obsahu jména/příjmení(%s): ".formatted(string);
    }
}
