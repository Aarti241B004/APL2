/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("enter any number");
	    int num=scanner.nextInt();
		for(int i=0;i<=10;i++){
		   System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
		    scanner.close();
		
	}
}
