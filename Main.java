import polymorfisme.JumlahHarga;


public class Main extends JumlahHarga {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(" Harga project dan tunjangan");
        System.out.println("============================================");
        main.nim();
        main.nama();
        main.pekerjaan();
        main.hT();
        main.harga();
        System.out.println("============================================");
        System.out.println("Total Harga/project + Tunjangan : Rp. "+main.all()+",-");
        
    }
}
