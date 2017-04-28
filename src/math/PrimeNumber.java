package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrimeNumber {

    static List<Integer> generatePrimeNumbers(int startingNumber, int endingNumber) {
        List<Integer> result = new LinkedList<Integer>();

        for (int i = startingNumber; i <= endingNumber; i++) {
            boolean isPrime = true;
            for (Integer prime : result) {
                //for 1 million records it takes 49000ms with this if, and 141ms with the square root if
                //if (prime  > i/2) {
                if (prime * prime > i) {
                    break;
                }

                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

        long startTime = System.currentTimeMillis();
        List<Integer> result = generatePrimeNumbers(2, 1000000);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        long dbStartTime = 0;
        long dbEndTime = 0;
        long dbExecutionTime = 0;

        ConnectDB connectDB = new ConnectDB<Integer>();
        List<String> valuesFromDatabase = new ArrayList<String>();
        try {
            dbStartTime = System.currentTimeMillis();

            connectDB.deleteDataFromTable("tbl_primeNumber");
            connectDB.InsertDataFromArrayListToMySql(result, "tbl_primeNumber", "column_primeNumber");
            valuesFromDatabase = connectDB.readDataBase("tbl_primeNumber", "column_primeNumber");

            dbEndTime = System.currentTimeMillis();
            dbExecutionTime = dbEndTime - dbStartTime;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("We found :" + valuesFromDatabase.size() + " prime numbers in " + executionTime + " milli sec");
        System.out.println("DB operations took " + dbExecutionTime + " milli sec");
        System.out.println("Prime Numbers :" + valuesFromDatabase.toString());
    }

}
