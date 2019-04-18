import java.text.DecimalFormat;
import java.util.*;

public class SolvingLinearEquations {
	//global variables
	static Scanner scn = new Scanner(System.in);
	static double m1=0, b1=0, m2=0, b2=0;
	static boolean consistent, dependent;
	static DecimalFormat dec = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		//user chooses their input type
		for(int i=1; i<=2; i++){
			System.out.println();
			switch (menu()){
			case 1:	slopeY(i);
			break;
			case 2:	twoPoints(i);
			break;
			case 3:	pointSlope(i);
			break;
			case 4:	coefficients(i);
			break;
			default: break;
			}
		}
		compare();
		
		if(consistent && !dependent){
			System.out.println("The lines are intersecting");
			System.out.println(solution());
		}else if(consistent && dependent)
			System.out.println("The equations are of the same line");
		else System.out.println("The lines are parallel");
	}
	//menu()
	public static int menu(){
		System.out.println("Which values are you inputting? \n"
						+  "------------------------------- \n \n"
						+  "1) Slope and y-intercept \n"
						+  "2) Two Points \n"
						+  "3) Slope and point \n"
						+  "4) Coefficients A, B, and C (Ax + By = C)");
		int choice = scn.nextInt();
		return choice;
	}
	
	// checks for consistency, dependence, and whether there is a solution
	public static void compare(){
		if(m1!=m2){				//intersecting
			consistent = true;
			dependent = false;
		}else if(b1==b2){		//same lines
			consistent = true;
			dependent = true;
		}else{					//parallel
			consistent = false;
			dependent = false;
		}	
	}
	
	
	//Slope & Y-intercept
	public static void slopeY(int e){
		if(e==1){
			System.out.print("Enter the slope of the equation: ");
			m1 = scn.nextDouble();
			System.out.print("Enter the Y-intercept of the equation: ");
			b1 = scn.nextDouble();
			System.out.println("y = " + m2 + "x = " + b2);
		}else{
			System.out.print("Enter the slope of the equation: ");
			m2 = scn.nextDouble();
			System.out.print("Enter the Y-intercept of the equation: ");
			b2 = scn.nextDouble();
			System.out.println("y = " + m2 + "x = " + b2);
		}
	}
	//Two Points
	public static void twoPoints(int e){
		// input
		System.out.print("Enter the x-value of the first point: ");
		double x1 = scn.nextDouble();
		System.out.print("Enter the y-value of the first point: ");
		double y1 = scn.nextDouble();
		System.out.print("Enter the x-value of the second point: ");
		double x2 = scn.nextDouble();
		System.out.print("Enter the y-value of the second point: ");
		double y2 = scn.nextDouble();
		
		// slope
		if(e==1)
			m1 = Math.abs((y2 - y1) / (x2 - x1));
		else
			m2 = Math.abs((y2 - y1) / (x2 - x1));
		// Y-intercept
		if(e==1)
			b1 = -1*(m1*x1-y1);
		else 
			b2 = -1*(m1*x1-y1);
	}
	//Slope & Point
	public static void pointSlope(int e){
		// equation 1
		System.out.print("Enter the x-value of the point: ");
		double x = scn.nextDouble();
		System.out.print("Enter the y-value of the point: ");
		double y = scn.nextDouble();
		System.out.print("Enter the slope: ");
		if(e==1)
			m1 = scn.nextDouble();
		else
			m2 = scn.nextDouble();
		
		//Y-intercept
		if(e==1)
			b1 = -1*(m1*x-y);
		else
			b2 = -1*(m1*x-y);
	}
	// coefficients
	public static void coefficients(int e){
		System.out.println("Enter the coefficients in this format: Ax + By = C");
		System.out.print("A: ");
		double a = scn.nextDouble();
		System.out.print("B: ");
		double b = scn.nextDouble();
		System.out.print("C: ");
		double c = scn.nextDouble();
		
		if(e==1){
			m1 = -(a/b);
			b1 = b/c;
		}else{
			m2= -(a/b);
			b2 = b/c;
		}
	}
	public static String solution(){
		double x = (m1-m2) / (b1-b2);
		double y = m1*x + b1;
		return "The solution is: (" + dec.format(x) + ',' + dec.format(y) + ')';
	}
	
	
}



