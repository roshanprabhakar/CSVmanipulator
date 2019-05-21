import java.util.*;

public class Rotator implements Manipulator {

    private ArrayList<String> identities;

    public Rotator(ArrayList<String> identities) {
        this.identities = identities;
    }

    @Override
    public ArrayList<ArrayList<String>> manipulate(ArrayList<String> lines) {

        ArrayList<String[]> limited = new ArrayList<>();
        for (String line : lines) {
            limited.add(line.split(","));
        }

        ArrayList<ArrayList<String>> rotated = new ArrayList<>();
        for (int c = 0; c < identities.size(); c++) {
            ArrayList<String> traversed = new ArrayList<>();
            for (int r = 0; r < limited.size(); r++) {
                traversed.add(limited.get(r)[c]);
            }
            rotated.add(traversed);
        }

        Utils.format(rotated);
//        Utils.print(rotated);
        return rotated;
    }
}
