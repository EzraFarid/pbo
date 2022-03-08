package tugas;
import java.util.Scanner; 
public class tugas {
	 public static void main(String[] args) {
		
	       double keliling, phi=3.14;
	       int D;
	       
	       Scanner input=new Scanner(System.in);
       	       
	       System.out.print("Masukan Diameter : ");
	       D= input.nextInt();
	       
	       keliling=phi*D;

	       System.out.println("Keliling Lingkaran = "+keliling);
	    } 
	}