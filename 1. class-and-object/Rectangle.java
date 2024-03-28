/**
 *	Created By: Beza Nigatu
 *	Class & Object Lab
 *	September 23, 2021
**/
public class Rectangle {
	public static void main(String[] args){
	    Rectangle r1 = new Rectangle(); //default constructor
	    Rectangle r2 = new Rectangle(4.0, 40.0); //initialized rectangle
	      
	    //to print the first rectangle's area and second rectangle's perimeter:
	    System.out.println("The first rectangle's area is: \n" + r1.getArea() 
	    					+ "\n\nThe second rectangle's perimeter is: \n" 
	    					+ r2.getPerimeter()); 
	}

	//two rectangles, the measured and the empty 
	private double width;
	private double height;

	public Rectangle (double width, double height){
		this.width = width; //this references the data field of the object being constructed
		this.height = height;
	}
	public Rectangle() {
		this(1.0, 1.0); //sets default value of width & height
		//can also use this.height = 0;
	}
	public double getPerimeter(){
	    return 2*(this.width + this.height);
	}
	public double getArea() {
    	return this.width*this.height;
	}

}
