package cz.davsoncze;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Race {
    private List<Racer> racerList = new ArrayList<>();

    public Race(Collection<Racer> racers) {
        this.racerList.addAll(racers);
        this.racerList.sort(Comparator.comparingLong(Racer::getTime));
    }

    public List<Racer> getRacerList() {
        return racerList;
    }

    public void printRacersSortedByTime() {
        for (int i = 0; i < racerList.size(); i++) {
            Racer racer = racerList.get(i);
            System.out.printf(
                    "%d. %s (%02d:%02d)%n",
                    i + 1,
                    racer.getName(),
                    TimeUnit.MILLISECONDS.toMinutes(racer.getTime()) % TimeUnit.HOURS.toMinutes(1),
                    TimeUnit.MILLISECONDS.toSeconds(racer.getTime()) % TimeUnit.MINUTES.toSeconds(1)
            );
        }
    }
}



