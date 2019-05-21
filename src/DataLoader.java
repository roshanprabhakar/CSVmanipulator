import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataLoader {

    private ArrayList<String> lines;
    private ArrayList<String> identities;

    public DataLoader(String filepath) {
        lines = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(filepath)));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Unknown IOException caught!");
            e.printStackTrace();
        }

        identities = new ArrayList<>();
        for (int i = 0; i < lines.get(0).split(",").length; i++) {
            identities.add(lines.get(0).split(",")[i]);
        }
    }

    public ArrayList<String> getIdentities() {
        return identities;
    }

    public ArrayList<String> getLines() {
        return lines;
    }
}
