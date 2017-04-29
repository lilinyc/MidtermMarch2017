package parser;

public class Student {

	/*
	 * Student class have 4 variables which will be constructed as Student Object into List<Student>.
	 */
	public String firstName;
	public String lastName;
	public int score;
	public String grade;
	public String id;
	
	@Override
	public String toString(){
		return "Student" + "("+"id= "+id+")"+ firstName+" "+lastName+" "+" Grade = "+grade+" Score = "+score;
	}
	
}
