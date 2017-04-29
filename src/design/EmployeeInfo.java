package design;

import java.time.Year;

public class EmployeeInfo implements Employee {

 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

    /*
     * declare few static and final fields and some non-static fields
     */
    static String companyName;

    public int employeeID;
    public String name;
    public int years;
    public int salary;
    public String department;
    public String performance;

	/*
     * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */
    public EmployeeInfo(int employeeId) {
        this.employeeID = employeeId;
    }

    public EmployeeInfo(String name, int employeeId) {
        this.name = name;
        this.employeeID = employeeId;
        this.performance = "";
    }

    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public int calculateEmployeeBonus() {
        double bonus = 0;

        switch (performance) {
            case "best":
                bonus = 0.1;
                break;
            case "average":
                bonus = 0.8;
                break;
            default:
                bonus = 0.01;//im a generous employer
        }
        return (int) (bonus * salary);
    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     * So you probably need to send 2 arguments.
     *
     */
    public int calculateEmployeePension() {
        int total = 0;
        for (int i = 1; i < years; i++) {
            total = (int) (salary * i * 0.5);
        }

        return total;
    }

    public int employeeId() {
        return employeeID;
    }

    public String employeeName() {
        return name;
    }

    public void assignDepartment() {
        System.out.println("Department:" + department);
    }

    public int calculateSalary() {
        return salary + calculateEmployeeBonus();
    }

    public void benefitLayout() {
        switch (department) {
            case "accounting":
                System.out.println("Benefits: Free chicken");
                break;
            case "news":
                System.out.println("Benefits: Free doughnuts");
                break;
        }
    }

    public String toString() {
        return "{" + employeeID + ", " + name + ", " + department + ", " + years + ", " + salary + ", " + performance + "}";
    }
}
