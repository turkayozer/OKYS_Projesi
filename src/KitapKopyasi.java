public class KitapKopyasi {
    public int kopyaNo;
    public boolean raftaMi;
    
    // İlişki: Kopya hangi kitaba ait?
    public Kitap aitOlduguKitap;

    public KitapKopyasi(int kopyaNo, Kitap aitOlduguKitap) {
        this.kopyaNo = kopyaNo;
        this.raftaMi = true; // Sisteme ilk eklendiğinde raftadır
        this.aitOlduguKitap = aitOlduguKitap;
    }
}