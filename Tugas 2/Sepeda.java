package Sepeda;

public class Sepeda {
	int rodasepeda;
	String jenissepeda, merksepeda;
	
	public Sepeda(int jumlahRoda, String jenis, String merk) {
		rodasepeda = jumlahRoda;
		jenissepeda = jenis;
		merksepeda = merk;
	}

	
public static void main(String[] args) {
	Sepeda sepeda= new Sepeda(2,"RGB power","Polygon");
	System.out.println("Sepeda "+sepeda.jenissepeda+" bermerk "+sepeda.merksepeda+" memiliki jumlahRoda "+sepeda.rodasepeda);
			}
	}
