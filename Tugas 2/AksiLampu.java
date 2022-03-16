package Sepeda;

public class Lampu {  
    boolean nyala=false;
    
   public boolean nyalakanLampu(){
   return nyala = true;
   }
   
   public boolean matikanLampu(){
   return nyala = false;
}

    public static void main(String[] args) { 
    	Lampu lampu= new Lampu();
    	
    	System.out.println("Apakah Lampu Menyala ? "+ lampu.nyala);
    }  

}
