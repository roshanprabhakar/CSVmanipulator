import java.util.ArrayList;

public class Utils {

    public static void print(ArrayList<ArrayList<String>> list) {
        for (ArrayList<String> line : list) {
            System.out.println(line);
        }
    }

    public static void format(ArrayList<ArrayList<String>> list) {
        for (int r = 0; r < list.size(); r++) {
            for (int c = 0; c < list.get(r).size(); c++) {
                list.get(r).set(c, list.get(r).get(c).trim());
            }
        }
    }
}
