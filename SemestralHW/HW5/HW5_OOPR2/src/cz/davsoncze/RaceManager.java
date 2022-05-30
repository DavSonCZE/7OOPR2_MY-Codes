package cz.davsoncze;

import java.util.HashMap;
import java.util.Map;

public class RaceManager {
    private Map<String, Race> raceMap = new HashMap<>();

    public Race getRace(String raceName) {
        if (!raceMap.containsKey(raceName))
            throw new IllegalArgumentException("Race under name \"" + raceName + "\" does not exist");

        return raceMap.get(raceName);
    }

    public void addRace(String name, Race race) {
        if (name == null)
            throw new IllegalArgumentException("Name cannot be null");
        if (name.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        if (race == null)
            throw new IllegalArgumentException("Race cannot be null");
        raceMap.put(name, race);
    }
}
