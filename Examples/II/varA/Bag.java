import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Bag {
    private Set<String> words;

    public Bag() {
        this.words = new HashSet<String>();
    }

    public void add (String word){
        words.add(word.toLowerCase());
    }

    public void save(String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for (String w : words) {
            bw.write(w);
            bw.write('\n');
        }
        bw.close();
    }
}
