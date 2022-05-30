package cz.davsoncze;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.ExpectedException;

import java.util.List;

public class MainTest {

    @Test
    public void RaceIsCannotBeNull() throws NullArgumentException{
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->{
            RaceManager manager = new RaceManager();
            manager.addRace("Monaco 1993", null);
            manager.getRace("Monaco 1993").printRacersSortedByTime();
        });
        Assertions.assertEquals("Race cannot be null", thrown.getMessage());
    }

    @Test
    public void DataOfRaceNameIsNull(){
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->{
            RaceManager manager = new RaceManager();
            manager.addRace("Monaco 1993", new Race(List.of(
                    new Racer(null, TimeUtils.getTimeInMillis("1:20.557")),
                    new Racer("Michael Schumacher", TimeUtils.getTimeInMillis("1:21.190"))
            )));
            manager.getRace("Monaco 1993").printRacersSortedByTime();
        });
        Assertions.assertEquals("Racer's name cannot null", thrown.getMessage());
    }

    @Test
    public void DataOfRaceNameIsEmpty(){
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->{
            RaceManager manager = new RaceManager();
            manager.addRace("Monaco 1993", new Race(List.of(
                    new Racer("", TimeUtils.getTimeInMillis("1:20.557")),
                    new Racer("Michael Schumacher", TimeUtils.getTimeInMillis("1:21.190"))
            )));
            manager.getRace("Monaco 1993").printRacersSortedByTime();
        });
        Assertions.assertEquals("Racer's name cannot empty", thrown.getMessage());
    }

    @Test
    public void DataNameOfRaceIsCannotBeEmpty(){
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->{
            RaceManager manager = new RaceManager();
            manager.addRace("Monaco 1993", new Race(List.of(
                    new Racer("", TimeUtils.getTimeInMillis("1:20.557")),
                    new Racer("Michael Schumacher", TimeUtils.getTimeInMillis("1:21.190"))
            )));
            manager.getRace("Monaco 1993").printRacersSortedByTime();
        });
        Assertions.assertEquals("Racer's name cannot empty", thrown.getMessage());
    }

    @Test
    public void DataNameOfRaceTimeIsZero(){
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->{
            RaceManager manager = new RaceManager();
            manager.addRace("Monaco 1993", new Race(List.of(
                    new Racer("Michael Kabul", TimeUtils.getTimeInMillis("0:00.000")),
                    new Racer("Michael Schumacher", TimeUtils.getTimeInMillis("1:21.190"))
            )));
            manager.getRace("Monaco 1993").printRacersSortedByTime();
        });
        Assertions.assertEquals("Racer's time cannot be zero", thrown.getMessage());
    }

    @Test
    public void DataNameOfRaceTimeIsNegativeTime(){
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->{
            RaceManager manager = new RaceManager();
            manager.addRace("Monaco 1993", new Race(List.of(
                    new Racer("Michael Kalich", TimeUtils.getTimeInMillis("-1:00.000")),
                    new Racer("Michael Schumacher", TimeUtils.getTimeInMillis("1:21.190"))
            )));
            manager.getRace("Monaco 1993").printRacersSortedByTime();
        });
        Assertions.assertEquals("Racer's time cannot be negative", thrown.getMessage());
    }
}