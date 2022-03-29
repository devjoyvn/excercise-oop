package b3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCandidate managerCandidate = new ManagerCandidate();
        while (true) {
            System.out.println("Application Manager Candidate");
            System.out.println("Enter 1: To insert candidate");
            System.out.println("Enter 2: To show information of candidate: ");
            System.out.println("Enter 3: To search candidate by id");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Candidate A");
                    System.out.println("Enter b: to insert Candidate B");
                    System.out.println("Enter c: to insert Candidate C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            managerCandidate.add(createCadidate(scanner, "a"));
                            break;

                        }
                        case "b": {
                            managerCandidate.add(createCadidate(scanner, "b"));
                            break;
                        }
                        case "c": {
                            managerCandidate.add(createCadidate(scanner, "c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    managerCandidate.showInfor();
                    break;
                }
                case "3": {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    Candidate candidate = managerCandidate.searchById(id);
                    if (candidate == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(candidate.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }

    public static Candidate createCadidate(Scanner scanner, String cate) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Priotity: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if (cate.equals("a")) {
            return new CandidateA(id, name,address,priority);
        } else if (cate.equals("b")) {
            return new CandidateB(id, name,address,priority);
        } else {
            return new CandidateC(id, name,address,priority);
        }

    }
}
