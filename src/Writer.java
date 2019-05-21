import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Writer {

    private BufferedWriter writer;
    private String filepath;

    public Writer(String file) {

        this.filepath = file;

        try {
            writer = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            System.out.println("Could not initialize writer!");
            e.printStackTrace();
        }

    }

    public void write(ArrayList<ArrayList<String>> rotatedData) {
        try {
            for (ArrayList<String> line : rotatedData) {
                writer.write(line.toString());
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Unable to handle IOE!");
            e.printStackTrace();
        }
    }
}
