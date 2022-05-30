package com.davsoncze;

import com.davsoncze.enums.CompareType;
import com.davsoncze.enums.Gender;
import com.davsoncze.enums.PlayerPosition;
import com.davsoncze.filters.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("OOPR2(7OPR2) | UKOL 2 |Vypracovaný ukol ");
        System.out.println("----------------------------------------");
        Player[] players = Initialization();
        System.out.println("----------------------------------------");
        System.out.println(Colors.ANSI_BLACK+Colors.ANSI_WHITE_BACKGROUND+"Vypisuju vygenerovaná hráče: "+Colors.ANSI_RESET);

        IntStream.range(0, players.length).forEach(i -> System.out.println(players[i].toString()));

        FilteringManager manager = new FilteringManager();

        for (Filter filter : new Filter[]{
                new GenderFilter(Gender.MALE),
                new HeightFilter(180, CompareType.HIGHER),
                new WeightFilter(100, CompareType.LOWER),
                new PositionFilter(PlayerPosition.SUPPORT),
                new NameContainsFilter("av")
        }) {
            filter.printTitle();
            Player[] filteredPlayers = manager.applyFilter(players, filter);
            Arrays.stream(filteredPlayers).forEach(Player::print);
        }

//        System.out.println("Vypisuju hráče filtrované podle pohlaví(Muž): ");
//        Player[] filtered = manager.applyFilter(players, new GenderFilter(Gender.MALE));
//        IntStream.range(0, filtered.length).forEach(i -> System.out.println(filtered[i].toString()));
//
//        System.out.println("Vypisuju hráče filtrované podle výšky(>180): ");
//        Player[] filtered2 = manager.applyFilter(players, new HeightFilter(180, CompareType.HIGHER));
//        IntStream.range(0, filtered2.length).forEach(i -> System.out.println(filtered2[i].toString()));
//
//        System.out.println("Vypisuju hráče filtrované podle váhy(<100): ");
//        Player[] filtered3 = manager.applyFilter(players, new WeightFilter(100, CompareType.LOWER));
//        IntStream.range(0, filtered3.length).forEach(i -> System.out.println(filtered3[i].toString()));
//
//        System.out.println("Vypisuju hráče filtrované podle pozice(support): ");
//        Player[] filtered4 = manager.applyFilter(players, new PositionFilter(PlayerPosition.SUPPORT));
//        IntStream.range(0, filtered4.length).forEach(i -> System.out.println(filtered4[i].toString()));
//
//        System.out.println("Vypisuju hráče filtrované podle obsahu jména/příjmení(av): ");
//        Player[] filtered5 = manager.applyFilter(players, new NameContainsFilter("av"));
//        IntStream.range(0, filtered5.length).forEach(i -> System.out.println(filtered5[i].toString()));

    }

    public static Player[] Initialization() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("David", "Slonka", "DavSonCZE", 'A', "slonka@seznam.cz", Gender.MALE, ((int) (Math.random() * 50 + 150)), ((int) (Math.random() * 100 + 60)), PlayerPosition.SUPPORT));
        players.add(new Player("Karolína", "Malá", "Karoli", 'B', "karoli@gmail.com", Gender.FEMALE, ((int) (Math.random() * 50 + 150)), ((int) (Math.random() * 100 + 60)), PlayerPosition.MIDDLE));
        players.add(new Player("Kuba", "Kubikula", "Kubikula", 'A', "kubikula@microsft.com", Gender.MALE, ((int) (Math.random() * 50 + 150)), ((int) (Math.random() * 100 + 60)), PlayerPosition.ATTACKER));
        players.add(new Player("Marek", "Mladý", "Mamla", 'A', "mamla@seznam.cz", Gender.MALE, ((int) (Math.random() * 50 + 150)), ((int) (Math.random() * 100 + 60)), PlayerPosition.DEFENDER));
        players.add(new Player("Mad", "Beast", "MadBeaster", 'A', "MadBeaster@seznam.cz", Gender.MALE, ((int) (Math.random() * 50 + 150)), ((int) (Math.random() * 100 + 60)), PlayerPosition.SWEEPER));
        players.add(new Player("Pavel", "Mikeš", "Herdon", 'A', "herdon@seznam.cz", Gender.MALE, ((int) (Math.random() * 50 + 150)), ((int) (Math.random() * 100 + 60)), PlayerPosition.ATTACKER));
        players.add(new Player("Adela", "Kruta", "Adelka", 'A', "adelka989@seznam.cz", Gender.FEMALE, ((int) (Math.random() * 50 + 150)), ((int) (Math.random() * 100 + 60)), PlayerPosition.SWEEPER));
        players.add(new Player("aaaaa", "AAAA", "aaa69", 'A', "aaa69@seznam.cz", Gender.MALE, ((int) (Math.random() * 50 + 150)), ((int) (Math.random() * 100 + 60)), PlayerPosition.MIDDLE));
        players.add(new Player("bbbb", "BBBB", "bbb70", 'A', "bbb70@seznam.cz", Gender.FEMALE, ((int) (Math.random() * 50 + 150)), ((int) (Math.random() * 100 + 60)), PlayerPosition.DEFENDER));
        players.add(new Player("cccc", "DDDD", "ccc90", 'A', "ccc90@seznam.cz", Gender.MALE, ((int) (Math.random() * 50 + 150)), ((int) (Math.random() * 100 + 60)), PlayerPosition.SUPPORT));
        return players.toArray(new Player[0]);
    }
}
