package com.davsoncze.filters;

import com.davsoncze.Filter;
import com.davsoncze.Player;
import com.davsoncze.enums.CompareType;

public class WeightFilter extends Filter {
    private final int weight;
    private final CompareType compareType;

    public WeightFilter(int weight, CompareType compareType) {
        super();
        this.weight = weight;
        this.compareType = compareType;
    }

    @Override
    public boolean applyFilter(Player player) {
        if (compareType == CompareType.HIGHER) {
            if (player.getWeight() > weight) return true;
        } else if (compareType == CompareType.LOWER) {
            if (player.getWeight() < weight) return true;
        } else {
            if (player.getWeight() == weight) return true;
        }
        return false;
    }

    @Override
    protected String titleString() {
        return "Vypisuju hráče filtrované podle váhy(%s%d): "
                .formatted(
                        compareType == CompareType.HIGHER
                                ? ">"
                                : compareType == CompareType.LOWER
                                ? "<"
                                : "==",
                        weight
                );
    }
}
