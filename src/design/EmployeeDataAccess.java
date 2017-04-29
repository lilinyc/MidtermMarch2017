package design;

import databases.ConnectDB;
import databases.User;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lili on 4/28/2017.
 */
public class EmployeeDataAccess extends ConnectDB<EmployeeInfo> {
    private static final String tableName = "tbl_Employees";

    public void deleteDataFromTable() {
        super.deleteDataFromTable(tableName);
    }

    public void insertEmployeeToMySql(EmployeeInfo employee) {
        try {
            connectToMySql();
            ps = connect.prepareStatement("INSERT INTO " + tableName
                    + " ( column_id, column_name, column_years, column_salary, column_department, column_performance ) "
                    + " VALUES( ?, ?, ?, ?, ?, ?)");

            ps.setInt(1, employee.employeeId());
            ps.setString(2, employee.employeeName());
            ps.setInt(3, employee.years);
            ps.setInt(4, employee.salary);
            ps.setString(5, employee.department);
            ps.setString(6, employee.performance);

            ps.executeUpdate();


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<EmployeeInfo> readEmployeesFromMySql() throws IOException, SQLException, ClassNotFoundException {
        List<EmployeeInfo> list = new ArrayList<EmployeeInfo>();
        EmployeeInfo employee = null;
        try {
            Connection conn = connectToMySql();
            String query = "SELECT * FROM " + tableName;

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("column_name");
                int id = rs.getInt("column_id");
                //System.out.format("%s, %s\n", name, id);
                employee = new EmployeeInfo(name, id);
                employee.department = rs.getString("column_department");
                employee.years = rs.getInt("column_years");
                employee.salary = rs.getInt("column_salary");
                employee.performance = rs.getString("column_performance");
                list.add(employee);

            }
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return list;
    }

}
