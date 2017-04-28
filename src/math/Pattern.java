package math;

import databases.ConnectDB;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pattern {

    static List<Object> generatePattern(int startingNumber) {
        List<Object> result = new LinkedList<Object>();
        result.add(startingNumber);
        int currentNumber = startingNumber;
        int currentCounter = 1;
        while (currentNumber - currentCounter >= 0) {
            for (int i = 0; i < 10 && currentNumber - currentCounter >= 0; i++) {
                currentNumber -= currentCounter;
                result.add(currentNumber);
            }
            currentCounter++;
        }

        return result;
    }

    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

        List<Object> result = generatePattern(100);

        ConnectDB connectDB = new ConnectDB();

        List<String> valuesFromDatabase = new ArrayList<String>();
        try {
            connectDB.deleteDataFromTable("tbl_patternNumber");
            connectDB.InsertDataFromArrayListToMySql(result, "tbl_patternNumber", "column_patternNumber");
            valuesFromDatabase = connectDB.readDataBase("tbl_patternNumber", "column_patternNumber");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Pattern :" + valuesFromDatabase.toString());
    }
}
