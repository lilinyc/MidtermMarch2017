package parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProcessStudentInfo {

		/*
		 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
		 * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and 
		 * 'C' for 70 to 79.
		 * 
		 * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map. 
		 * Once map has all data, retrieve those data and out put to console.
		 *
		 * Do any necessary steps that require for below successful output.
		 * ......................................................
		 * Student (id= 1) "Sharif" "Uddin"        		Grade= B
		 * Student (id= 2) "Asif" "Roni"          		Grade= A
		 * Student (id= 3) "Kafil" "Codelab"            Grade= F
		 * Student (id= 4) "Huda" "Parking Issue"       Grade= B
		 * Student (id= 5) "Aisha" "Loop Issue"         Grade= C
		 * ......................................................
		 * 
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and to retrieve data.
		 *
		 */
			public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
				//Path of XML data to be read.
				String pathSelenium  = System.getProperty("user.dir") +"/src/parser/selenium.xml";
				String pathQtp = System.getProperty("user.dir") + "/src/parser/qtp.xml";
				String tag = "id";

				//Declare a Map with List<String> into it.
				Map<String, List<String>> results = new HashMap<String, List<String>>();
				
				/*Declare 2 ArrayList with Student data type to store Selenium student into one of the ArrayList and
				  Qtp student into another ArrayList. */

				//Create XMLReader object.
				XmlReader xmlReader = new XmlReader();
				
				//Parse Data using parseData method and then store data into Selenium ArrayList.
				List<Student> gradeSelenium = xmlReader.parseData(tag, pathSelenium);

				//Parse Data using parseData method and then store data into Qtp ArrayList.
				List<Student> gradeQtp = xmlReader.parseData(tag, pathQtp);

				//add Selenium ArrayList data into map.
				for (Student student: gradeSelenium) {
					if (results.containsKey(student.grade)){
						results.get(student.grade).add(student.toString());
					} else {
						List<String> studentResults = new LinkedList<String>(){};
						studentResults.add(student.toString());
						results.put(student.grade, studentResults);
					}
				}

				//add Qtp ArrayList data into map.
				for (Student student: gradeQtp) {
					if (results.containsKey(student.grade)){
						results.get(student.grade).add(student.toString());
					} else {
						List<String> studentResults = new LinkedList<String>(){};
						studentResults.add(student.toString());
						results.put(student.grade, studentResults);
					}
				}

				System.out.println("Student Details");
				//Retrieve map data and display output.
				for (String key:results.keySet()) {
					for (String student: results.get(key)) {
						System.out.println(student);
					}
				}
				
			}

}
