
import java.io.*;
import java.util.*;
public class Cal{
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int row=sc.nextInt();
	int i,j;
	for(i=0;i<row;i++) 
	{
		
		for(j=0;j<row;j++) {
			
			if(i==0||j==0||i==row-1||j==row-1) {
				System.out.print("B");
				
				
			}
			else {
				System.out.print(" ");	
			}
			
				
		}
	
		System.out.println();
}}
}
