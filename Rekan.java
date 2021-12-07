package polymorfisme;

class Rekan {

    public String nama;
    private final int harga;

    public Rekan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public int infoHarga() {

        return harga;
    }
}
