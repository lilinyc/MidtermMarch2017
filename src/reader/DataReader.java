package reader;

import databases.ConnectDB;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

        String textFile = new File("").getAbsolutePath() + "/src/data/self-driving-car";

        List<String> results = new LinkedList<String>();

        System.out.println("Reading file:");
        try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
            br.readLine(); //skip first line
            for (String line; (line = br.readLine()) != null; ) {
                results.add(line.trim());
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Reading file completed.");
        }

        ConnectDB connectDB = new ConnectDB<Integer>();
        List<String> valuesFromDatabase = new ArrayList<String>();
        try {
            connectDB.deleteDataFromTable("tbl_dataReader");
            connectDB.InsertDataFromArrayListToMySql(results, "tbl_dataReader", "column_dataReader");
            valuesFromDatabase = connectDB.readDataBase("tbl_dataReader", "column_dataReader");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //When the database is read, line is not in order.
        System.out.println("Reading file from database:" + valuesFromDatabase.toString());

    }

}
