public class Main {

    public static void main(String[] args) {

        DataLoader loader = new DataLoader("responses.csv");
        Manipulator rotator = new Rotator(loader.getIdentities());
        new Writer("rotatedData.csv").write(rotator.manipulate(loader.getLines()));
    }
}
