import java.util.ArrayList;
import java.util.List;

public class Kitap {
    public String ad;
    public String yazar;
    
    // İlişki: 1 Kitap -> Birden fazla KitapKopyasi barındırır (Diyagramdaki sahip ilişkisi)
    public List<KitapKopyasi> kopyalar;

    public Kitap(String ad, String yazar) {
        this.ad = ad;
        this.yazar = yazar;
        this.kopyalar = new ArrayList<>();
    }

    public void kopyaEkle(KitapKopyasi kopya) {
        kopyalar.add(kopya);
    }
}