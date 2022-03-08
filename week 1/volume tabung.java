package totod;
import java.util.Scanner; 
public class totod {
	 public static void main(String[] args) {
		//Deklarasi variabel
	       double volume, phi=3.14;
	       int r,t;

	       //Inisialisasi objek input dari class scanner
	       Scanner input=new Scanner(System.in);

	       
	       //Input nilai jari-jari
	       System.out.print("Masukan jari jari : ");
	       r= input.nextInt();
	       System.out.print("Masukan tinggi : ");
	       t= input.nextInt();

	       //Menghitung luas lingkaran
	       volume=phi*r*r*t;

	       //Tampilkan hasil
	       System.out.println("Keliling Tabung = "+volume);
	    } 
	}
