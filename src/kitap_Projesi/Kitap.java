/*====================PAZAR PROJEMIZ==============================
	 * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun
	 * program baslayinca menu isminde bir method calissin
 1-kitap ekle
2-numara ile kitap goruntule
3-bilgi ile kitap goruntule
4-numara ile kitap sil
5-tum kitaplari listele
6-cikis
************************************
1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait yazar adi olacak
ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer olmali yani bir
 list'te tutmamiz gerek
2-kitap numarasi 1000'den baslamali,her kitap
eklendiginde bir artacagi icin sayac gibi dusunulebilinir count=1000; menu
 isminde bir method olusturmaliyim,
3-kitap ekle diye bir method olusturmliyim,bu method farkli bir classda
 4-kullanicidn kitap adi yazar adi ve fiyat bilgileri istenmeli */

package kitap_Projesi;
/**
 * 
 * @author CELÝL
 */
public class Kitap {
	private int no;
	private String kitapAdi;
	private String yazarAdi;
	private int yayinYili;
	private double fiyat;
	
	public Kitap(int no, String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
		this.no = no;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayinYili = yayinYili;
		this.fiyat = fiyat;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public int getYayinYili() {
		return yayinYili;
	}

	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "No=" + no + ", Kitap Adi=" + kitapAdi + ", Yazar=" + yazarAdi + ", Yayi Yili=" + yayinYili
				+ ", fiyat=" + fiyat;
	}
	
	


}
