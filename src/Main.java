//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // data given
    String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
    String[] consoles = {"PS5", "XBOX", "SWITCH"};
    int[][] sales = {{1000, 2000, 1500}, {2000, 3000, 1100}, {3000, 4000, 1200}};

    int[] totals = new int[cities.length];

    System.out.println("----------------------------------");
    System.out.println("       GAMING CONSOLE REPORT       ");
    System.out.println("----------------------------------");

    System.out.printf("%-18s", "");

    // display console heading
    for (int i = 0; i < consoles.length; i++){
        System.out.printf("%-10dd", consoles[i]);
    }

    // display sales data

    for (int row = 0; row < sales.length; row++) {
        System.out.printf("%-18", cities[row]);

        for (int col = 0; col < sales[row].length; col++) {
            System.out.printf("%-10d", sales[row][col]);

            totals[row] += sales[row][col];
        }
        System.out.println();
    }
// DISPLAY TOTAL SALES FOR EACH CITY

    System.out.println("----------------------------------------");
    System.out.println("CONSOLE SALES FOR EACH CITY");
    System.out.println("-----------------------------------------");

    for (int i = 0; i < cities.length; i++) {
        System.out.println(cities[i] + "  " + totals[i]);

        //City with most sales
        int highest = totals[i];
        int highestIndex = 0;

        for (int x = 1; x < totals.length; x++) {

            if (totals[x] > highest) {
                highest = totals[x];
                highestIndex = x;

                System.out.println();
                System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex]);

                System.out.println("------------------------------");
            }
        }
    }
}
