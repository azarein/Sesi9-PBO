package polymorfisme;
import polymorfisme.Harga;


public class JumlahHarga extends Harga{
    double all;
    
    public void harga(){
        JumlahHarga jumlahharga = new JumlahHarga();
        jumlahharga.h_project(10000000;
        jumlahharga.t(2000000);
        jumlahharga.t1(1000000);
        jumlahharga.t2(500000);
        jumlahharga.t3(200000);
        
        System.out.println("Harga Project \t : Rp. "+jumlahharga.h_project() +",-");
        System.out.println("Harga Tunjangan 1 \t : Rp. "+jumlahharga.hT1()  +",-");
        System.out.println("Harga Tunjangan 2 \t : Rp. "+jumlahharga.hT2() +",-");
        System.out.println("Harga Tunjangan 3 \t : Rp. "+jumlahharga.hT3() +",-");
        System.out.println("Harga Tunjangan 4 \t : Rp. "+jumlahharga.hT() +",-");  
        
        all = (double) jumlahharga.gGP()  + jumlahharga.gT1() + jumlahharga.gT2() + jumlahharga.gT3() + jumlahharga.gT(); 
    }
    
    public double all(){
        return all;
    }
}