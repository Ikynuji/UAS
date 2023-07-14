public class Main {
  public static void main(String[] args) {
    // Membuat objek dari kelas Sepeda
    Sepeda sepedaSaya = new Sepeda("BMX", "Hitam", 2023, 11200000);
    Sepeda sepedaLain = new Sepeda("Onthel", "Merah", 2023, 7000000);

    // Mengakses properti objek
    System.out.println("Merk: " + sepedaSaya.merk);
    System.out.println("Warna: " + sepedaSaya.warna);
    System.out.println("Tahun: " + sepedaSaya.tahun);
    System.out.println("Harga: " + sepedaSaya.harga);

    // Memanggil metode objek
    sepedaSaya.promosiSepeda();

    sepedaSaya.diskonSepeda();

    sepedaLain.lainSepeda();
  }
}