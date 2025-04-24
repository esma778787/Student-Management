import java.util.Scanner;

public class OgrenciUygulamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		Ogrenci ogrenci=new Ogrenci();
		
		System.out.println("Adını Girin :");
		String ad=scanner.next();
		ogrenci.setAd(ad);
		
		System.out.println("Soyadını Girin :");
		String soyad=scanner.next();
		ogrenci.setSoyad(soyad);
		
		System.out.println("Numasını Girin :");
		int numara=scanner.nextInt();
		ogrenci.setOgrenciNo(numara);
		
		System.out.println("Vize Notu Girin :");
		double vizeNotu=scanner.nextDouble();
		ogrenci.setVizeNotu(vizeNotu);
		
		System.out.println("Final Notunu Giriniz");
		double finalNotu=scanner.nextDouble();
		ogrenci.setFinalNotu(finalNotu);
		
		//ogrenci.ogrenciBilgileriniGoster();
		
		Ders matematik = new Ders("Matematik");
        Ders fizik = new Ders("Fizik");
        Ders kimya = new Ders("Kimya");
        
        OgrenciYonetimSistemi yonetimSistemi = new OgrenciYonetimSistemi();
        yonetimSistemi.dersEkle(matematik);
        yonetimSistemi.dersEkle(fizik);
        yonetimSistemi.dersEkle(kimya);
        
        yonetimSistemi.ogrenciEkle(ogrenci);
        
     // Ogrenci ve ders bilgileri ekrana yazdırılıyor
        yonetimSistemi.ogrenciBilgileriniGoster();
        System.out.println("------------");
        yonetimSistemi.dersListesiniGoster();

	}

}
