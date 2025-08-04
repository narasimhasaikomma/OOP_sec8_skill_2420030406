package skill_1;
import java.util.*;
import java.util.Scanner;

public class Student_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=sc.next();

		System.out.println("Enter the roll number");
		long number=sc.nextLong();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Name :"+str);
		System.out.println("Age is:"+age);
		System.out.println("Roll no is:"+number);
	}

}
