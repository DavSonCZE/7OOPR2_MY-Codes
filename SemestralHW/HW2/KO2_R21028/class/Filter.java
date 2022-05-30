package com.davsoncze;

public abstract class Filter {
    protected Filter() {
    }

    public abstract boolean applyFilter(Player player);

    protected abstract String titleString();

    public void printTitle() {
        System.out.println(Colors.ANSI_BLACK+Colors.ANSI_WHITE_BACKGROUND+titleString()+Colors.ANSI_RESET);
    }
}
