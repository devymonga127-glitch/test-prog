import java.io.PrintStream;

public class Main {

    private static Object[] manufacturers;
    private static double differences;

    public static void main(String[] args) {
        // Single-dimensional arrays
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array: rows = cities, columns = consoles
        int[][] sales = {
                {1000, 2000, 3000},   // Cape Town
                {2000, 3000, 4000},  // Port Elizabeth
                {1500, 1100, 1200}    // Pretoria
        };

        String line =( "-------------------------------------------------------------");

        // ---- Report header ----
        System.out.println("--------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------------------");

        // Console names
        System.out.printf("%-20s", "");
        for (String console : consoles) {
            System.out.printf("%-10s", console);
        }
        System.out.println();

        // City + sales per console
        for (int i = 0; i < cities.length; i++) {
            PrintStream printf = System.out.printf("%-20s", cities[i]);

        }
    }
}
