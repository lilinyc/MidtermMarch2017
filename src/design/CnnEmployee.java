package design;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class CnnEmployee {

    /**
     * CnnEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     **/
    public static void main(String[] args) {
        EmployeeInfo.companyName = "CNN";

        EmployeeInfo first = new EmployeeInfo("Dora", 1);
        first.salary = 100;
        first.department = "accounting";
        first.years = 5;
        first.performance = "terrible";

        EmployeeInfo second = new EmployeeInfo("Betty", 2);
        second.salary = 200;
        second.department = "news";
        second.years = 11;
        second.performance = "best";


        List<EmployeeInfo> cnnEmployees = new ArrayList<EmployeeInfo>();
        cnnEmployees.add(first);
        cnnEmployees.add(second);

        EmployeeDataAccess connectDB = new EmployeeDataAccess();
        List<EmployeeInfo> valuesFromDatabase = new ArrayList<EmployeeInfo>();
        try {
            connectDB.deleteDataFromTable();

            for (EmployeeInfo employee : cnnEmployees) {
                connectDB.insertEmployeeToMySql(employee);
            }

            valuesFromDatabase = connectDB.readEmployeesFromMySql();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Database operations finished");
        }

        System.out.println(valuesFromDatabase.toString());

        for (EmployeeInfo employee : valuesFromDatabase) {
            System.out.println();
            System.out.println("Employee: " + employee.name);

            employee.assignDepartment();
            System.out.println("Salary:" + employee.calculateSalary());
            System.out.println("Pension:" + employee.calculateEmployeePension());

            employee.benefitLayout();
        }
    }

}
