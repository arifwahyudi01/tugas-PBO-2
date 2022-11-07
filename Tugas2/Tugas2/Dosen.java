public class Dosen extends Elemen {

    private int jumlahHariKerja;
    private int jamsibuk;

    public Dosen(String nama,int jumlahHariKerja){
        super(nama);
        jamsibuk = jumlahHariKerja *8;
        
    }

    
    // Menggunakan method dari kelas induk abstrak
    @Override
    public void send(){
        System.out.println(this.nama+ " adalah seorang dosen dengan jam sibuk "+getjamSibuk());
    }


    public int getjamSibuk(){
        return jamsibuk;
        
    }

    

}
