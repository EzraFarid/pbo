package totod;
import java.util.Scanner; 
public class totod {
	 public static void main(String[] args) {
		//Deklarasi variabel
	       double luas;
	       int alas, tinggi;

	       //Inisialisasi objek input dari class scanner
	       Scanner input=new Scanner(System.in);

	       
	       //Input nilai jari-jari
	       System.out.print("Masukan Alas : ");
	       alas= input.nextInt();
	       System.out.print("Masukan Tinggi : ");
	       tinggi= input.nextInt();

	       //Menghitung luas lingkaran
	       luas=alas*tinggi/2;

	       //Tampilkan hasil
	       System.out.println("Luas segitiga siku siku = "+luas);
	    } 
	}