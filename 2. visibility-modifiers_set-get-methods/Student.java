/**
 * Programming II (CSCI 185-M01) Fall 2021
 *	Name: Beza Nigatu
 *	Lab 1: Visibility Modifiers and Set/Get Methods Lab
 *	September 23, 2021
**/

//data
public class Student{
	private String name;
	private String stu_id; 
	private double GPA; 
	private int age; 

	//loaded constructor	
	Student(String name, String stu_id, double GPA, int age){
		this.name = name;
		this.stu_id = stu_id;
		this.GPA = GPA;
		this.age = age;
	}

	//no argument constructor
	Student(){
		this.name = "Peet";
		this.stu_id = "0000001";
		this.GPA = 1.0; //peet is also not doing so well in school :'(
		this.age = 10;
	} 

//get methods
	public double getGPA(){return this.GPA;}
	public int getAge(){return this.age;}
	public String getName(){return this.name;}
	public String getStu_id(){return this.stu_id;}

//set methods
	public void setGPA(double gpa){this.GPA = gpa;} 
	public void setAge(int age){this.age = age;}
	public void setName(String name){this.name = name;}
	public void setStu_id(String id){this.stu_id = id;}
}
	
/**
 * Checklist:
 * [x]Design a class named Student to represent a student. 
 * The class contains the following data fields: 
 * [x]name (private, String), stu_id (private, String), GPA (private, double), and age (private, int). 
 * [x]You should define the set/get methods for each field. 
 * [x]Also define two constructors, one fully loaded constructor and one no-arg constructor.
 * 
 * In a separate class named StudentAccess, 
 * [x]create a main method that instantiates three student objects 
 * [x]using the above two constructors separately. 
 * In addition, you should show how to access and mutate the object data field
 * [x]by calling the access/mutator methods.
 *
**/
