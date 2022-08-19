import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        String line = "Ahoj karle, jak se mas, co delas? Ja jsem v praze. Karel Karel mlask.";

        String[] words = line.split("[, ?.]+");

        Bag bag = new Bag();

        for (String w : words) {
            bag.add(w);
        }

        try {
            bag.save("words.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
