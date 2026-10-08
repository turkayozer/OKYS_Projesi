public class OduncKaydi {
    public String alisTarihi;
    public String teslimTarihi;
    
    // İlişki: Ödünç kaydı hangi kopyayı ve hangi kullanıcıyı içeriyor?
    public KitapKopyasi ilgiliKopya;
    public Kullanici ilgiliKullanici;

    public OduncKaydi(String alisTarihi, String teslimTarihi, KitapKopyasi kopya, Kullanici kullanici) {
        this.alisTarihi = alisTarihi;
        this.teslimTarihi = teslimTarihi;
        this.ilgiliKopya = kopya;
        this.ilgiliKullanici = kullanici;
    }
}