import java.util.ArrayList;
import java.util.List;

public class Kullanici {
    public String adSoyad;
    public int ogrenciNo;
    
    // İlişki: 1 Kullanıcı -> Birden fazla Ödünç Kaydı oluşturabilir
    public List<OduncKaydi> oduncKayitlari;

    public Kullanici(String adSoyad, int ogrenciNo) {
        this.adSoyad = adSoyad;
        this.ogrenciNo = ogrenciNo;
        this.oduncKayitlari = new ArrayList<>();
    }

    // Kullanıcının kitap kopyasını ödünç alma metodu
    public void oduncAl(KitapKopyasi kopya, String alisTarihi, String teslimTarihi) {
        if (kopya.raftaMi) {
            OduncKaydi kayit = new OduncKaydi(alisTarihi, teslimTarihi, kopya, this);
            oduncKayitlari.add(kayit);
            kopya.raftaMi = false; // Kitap alındığı için artık rafta değil
            System.out.println(adSoyad + ", '" + kopya.aitOlduguKitap.ad + "' kitabını ödünç aldı.");
        } else {
            System.out.println("Bu kitap kopyası şu an rafta değil, başkası almış!");
        }
    }
}