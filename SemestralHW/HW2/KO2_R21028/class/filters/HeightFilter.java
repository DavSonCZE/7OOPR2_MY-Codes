package com.davsoncze.filters;

import com.davsoncze.Filter;
import com.davsoncze.Player;
import com.davsoncze.enums.CompareType;

public class HeightFilter extends Filter {
    private final int height;
    private final CompareType compareType;

    public HeightFilter(int height, CompareType compareType) {
        super();
        this.height = height;
        this.compareType = compareType;
    }

    @Override
    public boolean applyFilter(Player player) {
        if (compareType == CompareType.HIGHER) {
            if (player.getHeight() > height) return true;
        } else if (compareType == CompareType.LOWER) {
            if (player.getHeight() < height) return true;
        } else {
            if (player.getHeight() == height) return true;
        }
        return false;
    }

    @Override
    protected String titleString() {
        return "Vypisuju hráče filtrované podle výšky(%s%d): "
                .formatted(
                        compareType == CompareType.HIGHER
                                ? ">"
                                : compareType == CompareType.LOWER
                                ? "<"
                                : "==",
                        height
                );
    }
}
