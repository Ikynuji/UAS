public class Sepeda {
  // Variabel instance
  String merk;
  String warna;
  int tahun;
  int harga;

  // Constructor
  public Sepeda(String merk, String warna, int tahun, int harga) {
    this.merk = merk;
    this.warna = warna;
    this.tahun = tahun;
    this.harga = harga;
  }

  // Metode
  public void promosiSepeda() {
    System.out
        .println("Dijual Sepeda " + merk + " Warna " + warna + " Keluaran Tahun " + tahun + " dengan harga Rp." + harga);
  }

  // Metode
  public void diskonSepeda() {
    this.harga = harga - 1000000;
    System.out
        .println("Pembeli tercepat mendapat harga diskon Rp. " + harga);
  }

  // Metode
  public void lainSepeda() {
    System.out
        .println("Tersedia juga Sepeda " + merk + " Warna " + warna + " Keluaran Tahun " + tahun
            + " dengan harga Rp." + harga);
  }
}