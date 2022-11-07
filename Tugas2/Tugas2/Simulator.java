public class Simulator {
    public static void main(String[] args) {
        Asdos a = new Asdos ("Fairuzikum" ,24, 1);
        Dosen b = new Dosen("Raja OP Damanik",5);
        Elemen c = new Asdos ("Angel-chan",21, 1);
        Mahasiswa d = new Mahasiswa ("Firman", 20);
        Elemen e = new Mahasiswa ("Nid to pass this sem", 23);
        Elemen f = (Elemen) new Dosen("Nivotko",3);
        
        int total = a.jamSibuk+b.getjamSibuk()+c.getjamSibuk()+d.jamSibuk+((Mahasiswa) e).getJamSibuk()+((Dosen) f).getjamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah "+total);
        
        
        a.send();
        b.send();
        c.send();
        d.send();
        e.send();
        f.send();

        
        total = a.jamSibuk+d.getjamSibuk() + a2.jamSibuk + m.jamSibuk + m2.jamSibuk + d2.getjamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + total);
   

     
        
    
}
}
