import ui.ScannerFactory;
import ui.UIManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UIManager uiManager = new UIManager();
        Scanner scanner = ScannerFactory.getScanner();
        Integer ch = scanner.nextInt();
        while (true) {
            System.out.println("Application");
            System.out.println("Enter 1: To insert ");
            System.out.println("Enter 2: To search: ");
            // TODO HERE
            System.out.println("Enter 4: To exit:");
            switch (ch) {
                case 1: {
                    // input 0 => insert Experience
                    // input 1 => insert Fresher
                    // input 2 => insert Intern
                    int type = scanner.nextInt();
                    uiManager.insert(type);
                }
                // TODO HERE
            }
        }
    }
}
