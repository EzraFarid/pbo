public class AksiSepeda {
    int rodasepeda;
    int gear = 5;

       String jenissepeda, merksepeda;

       public AksiSepeda(int jumlahRoda, String jenis, String merk) {
           rodasepeda = jumlahRoda;
           jenissepeda = jenis;
           merksepeda = merk;
       }

       void ngerem() {
           System.out.println("Sepeda Sedang di Rem");
       }
       void maju() {
           System.out.println("Sekarang Sedang berjalan");
       }


       public static void main(String[] args) {
           AksiSepeda sepeda= new AksiSepeda(5,"Polygon","Tesla");
           System.out.println("Sepeda "+sepeda.jenissepeda+" Bermerk "+sepeda.merksepeda+" memiliki Jumlah Roda "+sepeda.rodasepeda);

           int gearSepeda = sepeda.gear;
           System.out.println("gear sepeda: " + gearSepeda);
           sepeda.ngerem();
           sepeda.maju();
       }
}