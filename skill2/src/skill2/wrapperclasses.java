package skill2;
import java.util.*;
public class wrapperclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
		    
		        int a = sc.nextInt(); 
		        Integer wrapperA = Integer.valueOf(a);
		        int b = wrapperA; 

		        System.out.println("Primitive: " + a);
		        System.out.println("Wrapper (Boxed): " + wrapperA);
		        System.out.println("Unboxed: " + b);
		    }
		}
	


