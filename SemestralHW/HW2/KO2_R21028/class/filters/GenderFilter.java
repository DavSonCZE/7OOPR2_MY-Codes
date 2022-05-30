package com.davsoncze.filters;

import com.davsoncze.Filter;
import com.davsoncze.Player;
import com.davsoncze.enums.Gender;

public class GenderFilter extends Filter {
    private final Gender gender;

    public GenderFilter(Gender gender) {
        super();
        this.gender = gender;
    }

    @Override
    public boolean applyFilter(Player player) {
        return player.getGender() == gender;
    }

    @Override
    protected String titleString() {
        return "Vypisuju hráče filtrované podle pohlaví(%s): ".formatted(gender);
    }
}
