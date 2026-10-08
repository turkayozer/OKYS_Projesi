public class Main {
    public static void main(String[] args) {
        
        // 1. Kitap ve Kopya nesneleri üretiliyor
        Kitap kitap1 = new Kitap("Yönetim Bilişim Sistemleri", "Prof. Dr. Ahmet Yılmaz");
        KitapKopyasi kopya1 = new KitapKopyasi(101, kitap1);
        kitap1.kopyaEkle(kopya1); // Kopyayı kitaba bağladık

        // 2. Kullanıcı nesnesi üretiliyor
        Kullanici ogrenci1 = new Kullanici("Türkay Özer", 2026101);

        // 3. Kullanıcı kitabı ödünç alıyor (Program çalışıyor)
        System.out.println("Sistem Başlatıldı...");
        System.out.println("Kitap rafta mı? " + (kopya1.raftaMi ? "Evet" : "Hayır"));
        
        ogrenci1.oduncAl(kopya1, "08.10.2026", "22.10.2026");
        
        System.out.println("Kitap rafta mı? " + (kopya1.raftaMi ? "Evet" : "Hayır"));
    }
}