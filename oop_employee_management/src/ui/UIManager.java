package ui;

import entity.Employee;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import exception.BirthDayException;
import exception.EmailException;
import exception.FullNameException;
import exception.PhoneException;
import service.EmployeeManager;
import service.ValidatorService;

import java.util.Scanner;

public class UIManager {

    private EmployeeManager employeeManager = new EmployeeManager();

    /**
     * @param type
     * @return Employee
     * type = 0 => Experience
     * type = 1 => Fresher
     * type = 2 => Intern
     */
    public void insert(int type) {
        Employee employee = null;
        if (type == 0) {
            employee = insertExperience();
        }
        if (type == 1) {
            employee = insertFresher();
        }
        if (type == 2) {
            employee = insertIntern();
        }

        try {
            checkData(employee);
        } catch (BirthDayException e) {
            // insert  => insert(type);
            insert(type);
        } catch (PhoneException e) {
            // insert  => insert(type);
            insert(type);
        } catch (EmailException e) {
            // insert  => insert(type);
            insert(type);
        } catch (FullNameException e) {
            // insert  => insert(type);
            insert(type);
        }

        this.employeeManager.insert(employee);
    }

    private Experience insertExperience() {
        Experience experience = new Experience();
        Scanner scanner = ScannerFactory.getScanner();
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        System.out.print("Input Name: ");
        String name = scanner.nextLine();
        System.out.print("Input Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Input Email: ");
        String email = scanner.nextLine();

        // TODO
        return experience;
    }

    private Intern insertIntern() {

        Intern intern = new Intern();
        // TODO
        return intern;
    }

    private Fresher insertFresher() {
        Fresher fresher = new Fresher();
        // TODO
        return fresher;
    }

    public void update() {
        System.out.print("Input ID to update: ");
        String id = ScannerFactory.getScanner().nextLine();
        Employee employee = this.employeeManager.findById(id);
        // TODO HERE
    }

    public void delete() {
        System.out.print("Input ID to deleet: ");
        String id = ScannerFactory.getScanner().nextLine();
        this.employeeManager.deleteById(id);
        // TODO SHOW MESSAGE HERE
    }

    public void showAllEmployee() {
        this.employeeManager.findAll().forEach(Employee::showInformation);
    }

    private void checkData(Employee employee) throws BirthDayException, PhoneException, EmailException, FullNameException {
        ValidatorService.birthdayCheck(employee.getBirthday());
        ValidatorService.phoneCheck(employee.getPhone());
        ValidatorService.emailCheck(employee.getEmail());
        ValidatorService.nameCheck(employee.getFullName());
    }

    // TODO
}
