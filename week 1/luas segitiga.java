package tugas;
import java.util.Scanner; 
public class tugas {
	 public static void main(String[] args) {
		
	       double luas;
	       int alas, tinggi;

	       Scanner input=new Scanner(System.in);

	       System.out.print("Masukan Alas : ");
	       alas= input.nextInt();
	       System.out.print("Masukan Tinggi : ");
	       tinggi= input.nextInt();
	       luas=alas*tinggi/2;

	       System.out.println("Luas segitiga siku siku = "+luas);
	    } 
	}
