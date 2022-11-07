
public class Mahasiswa extends Elemen {
   private int sks;
   int jamSibuk;


   public Mahasiswa(String nama, int sks) {
        super(nama);
        jamSibuk = sks*3;
        
    }
 
    // Menggunakan method dari kelas induk abstrak
    @Override
   public void send(){
      System.out.println(this.nama+" adalah seorang mahasiswa dengan jam sibuk "+getJamSibuk());
    }


     public int getJamSibuk(){
        return jamSibuk;
     }
   
    
}
