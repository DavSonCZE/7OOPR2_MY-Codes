package cz.davsoncze;

public class Racer {
    private String name;
    private long time; //in s

    public Racer(String name, long time) {
        if (name == null)
            throw new IllegalArgumentException("Racer's name cannot null");
        if (name.isEmpty())
            throw new IllegalArgumentException("Racer's name cannot empty");
        if (time < 0)
            throw new IllegalArgumentException("Racer's time cannot be negative");
        if (time != 0)
            throw new IllegalArgumentException("Racer's time cannot be zero");
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Racer{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}


