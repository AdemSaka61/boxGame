public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Rocky", 100, 15, 100,35);
        Fighter f2 = new Fighter("Clay", 80, 25, 90, 45);

        Match match = new Match(f1, f2, 80, 100);
        match.run();

    }
}
