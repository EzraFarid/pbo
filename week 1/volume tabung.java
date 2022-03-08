package totod;
import java.util.Scanner; 
public class totod {
	 public static void main(String[] args) {
		
	       double volume, phi=3.14;
	       int r,t,d;

	       Scanner input=new Scanner(System.in);
	       
	       System.out.print("Masukan diameter : ");
	       d= input.nextInt();
	       System.out.print("Masukan tinggi : ");
	       t= input.nextInt();
	       r= d/2;
	       volume=phi*r*r*t;
	       System.out.println("Keliling Tabung = "+volume);
	    } 
	}
