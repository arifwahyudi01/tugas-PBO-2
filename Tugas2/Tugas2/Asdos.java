public class Asdos extends Mahasiswa{

    private int jamNgasdos;

   
    public Asdos(String nama, int sks, int jamNgasdos){
        super(nama, sks);
        jamSibuk = jamSibuk + jamNgasdos;
        
    }

    public int getjamSibuk(){
        return jamSibuk;
        
    }
    
    // Menggunakan method dari kelas induk abstrak
    @Override
    public void send(){
        System.out.println(this.nama+ " adalah seorang asdos dengan jam sibuk "+getjamSibuk());
    }



    
}
