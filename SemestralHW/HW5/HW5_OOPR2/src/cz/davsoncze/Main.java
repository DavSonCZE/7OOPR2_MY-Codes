package cz.davsoncze;

import java.util.List;

public class Main {

    public static void main(String[] args) throws NullArgumentException {
        RaceManager manager = new RaceManager();
        manager.addRace("Monaco 1993", new Race(List.of(
                new Racer("Alain Pros", TimeUtils.getTimeInMillis("1:20.557")),
                new Racer("Michael Schumacher", TimeUtils.getTimeInMillis("1:21.190")),
                new Racer("Ayrton Senna", TimeUtils.getTimeInMillis("1:21.552")),
                new Racer("Damon Hill", TimeUtils.getTimeInMillis("1:21.825")),
                new Racer("Jean Alesi", TimeUtils.getTimeInMillis("1:21.948")),
                new Racer("Riccardo Patrese", TimeUtils.getTimeInMillis("1:22.117")),
                new Racer("Gerhard Berger", TimeUtils.getTimeInMillis("1:22.394")),
                new Racer("Karl Wendlinger", TimeUtils.getTimeInMillis("1:22.477")),
                new Racer("Michael Andretti", TimeUtils.getTimeInMillis("1:22.994")),
                new Racer("Érik Comas", TimeUtils.getTimeInMillis("1:23.246"))
        )));
        manager.addRace("Monaco 2019", new Race(List.of(
                new Racer("Lewis Hamilton", TimeUtils.getTimeInMillis("1:10.166")),
                new Racer("Valtteri Bottas", TimeUtils.getTimeInMillis("1:10.252")),
                new Racer("Max Verstappen", TimeUtils.getTimeInMillis("1:10.641")),
                new Racer("Sebastian Vettel", TimeUtils.getTimeInMillis("1:10.947")),
                new Racer("Pierre Gasly", TimeUtils.getTimeInMillis("1:11.041")),
                new Racer("Kevin Magnussen", TimeUtils.getTimeInMillis("1:11.109")),
                new Racer("Daniel Ricciardo", TimeUtils.getTimeInMillis("1:11.218")),
                new Racer("Daniil Kvyat", TimeUtils.getTimeInMillis("1:11.271")),
                new Racer("Carlos Sainz Jr.", TimeUtils.getTimeInMillis("1:11.417")),
                new Racer("Alexander Albon", TimeUtils.getTimeInMillis("1:11.653"))
        )));
        System.out.println(" \nMonaco 1993:");
        manager.getRace("Monaco 1993").printRacersSortedByTime();

        System.out.println(" \nMonaco 2019:");
        manager.getRace("Monaco 2019").printRacersSortedByTime();
    }

}
