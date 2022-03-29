package b4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// This is sudo code. To overview how to do it.
// You can finish by fill you code

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            // Input foreach famili

            System.out.println("Enter address:");
            scanner.nextLine();
            String address = scanner.nextLine();

            // Enter person number in family
            List<Person> persons = new ArrayList<>();
            System.out.println("Enter number person");
            int number = scanner.nextInt();

            for (int j = 0; j < number; j++) {
                // Inout person for family
            }

            // After done input
            town.addFamily(new Family(persons,address ));


        }
    }
}
