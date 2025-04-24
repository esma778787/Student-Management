import java.util.ArrayList;

public class OgrenciYonetimSistemi {
		private ArrayList<Ogrenci> ogrenciler;
	    private ArrayList<Ders> dersler;

	    public OgrenciYonetimSistemi() {
	        this.ogrenciler = new ArrayList<>();
	        this.dersler = new ArrayList<>();
	    }

	    public void ogrenciEkle(Ogrenci ogrenci) {
	        ogrenciler.add(ogrenci);
	    }

	    public void dersEkle(Ders ders) {
	        dersler.add(ders);
	    }

	    public void ogrenciBilgileriniGoster() {
	        System.out.println("Ogrenci Yonetim Sistemi:");
	        for (Ogrenci ogrenci : ogrenciler) {
	            ogrenci.ogrenciBilgileriniGoster();
	            System.out.println("------------");
	        }
	    }

	    public void dersListesiniGoster() {
	        System.out.println("Ders Listesi:");
	        for (Ders ders : dersler) {
	            System.out.println(ders.getDersAdi());
	        }
	    }

}
