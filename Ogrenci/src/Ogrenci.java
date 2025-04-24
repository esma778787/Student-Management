
public class Ogrenci {
	
	private String ad;
    private String soyad;
    private int ogrenciNo;
    private double vizeNotu;
    private double finalNotu;
    
 // Kurucu metot (Constructor)
    public Ogrenci(String ad, String soyad, int ogrenciNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.ogrenciNo = ogrenciNo;
    }
    
    public Ogrenci() {
    }
    
    
 // Getter ve setter metotları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public double getVizeNotu() {
        return vizeNotu;
    }

    public void setVizeNotu(double vizeNotu) {
        this.vizeNotu = vizeNotu;
    }

    public double getFinalNotu() {
        return finalNotu;
    }

    public void setFinalNotu(double finalNotu) {
        this.finalNotu = finalNotu;
    }
    
 // Not ortalamasını hesaplayan metot
    public double notOrtalamasiHesapla() {
        return (vizeNotu * 0.4) + (finalNotu * 0.6);
    }
    
 // Not durumunu hesaplayan metot
    public String notDurumuHesapla() {
    	double notOrtalamasi = notOrtalamasiHesapla();

        if (notOrtalamasi >= 90) {
            return "AA";
        } else if (notOrtalamasi >= 80) {
            return "BA";
        } else if (notOrtalamasi >= 70) {
            return "BB";
        } else if (notOrtalamasi >= 60) {
            return "CB";
        } else if (notOrtalamasi >= 50) {
            return "CC";
        } else {
            return "FF";
        }
    }
    
   
 // Öğrenci bilgilerini ekrana yazdıran metot
    public void ogrenciBilgileriniGoster() {
        System.out.println("Öğrenci Bilgileri:");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Öğrenci No: " + ogrenciNo);
        System.out.println("Vize Notu: " + vizeNotu);
        System.out.println("Final Notu: " + finalNotu);
        System.out.println("Not Ortalaması: " + notOrtalamasiHesapla());
        System.out.println("Harf Notu: " + notDurumuHesapla());
    }

}
