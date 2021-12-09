/**
 * 
 */
package kitapProjesi_2;

/**
 * @author CELÝL
 */
public class Kitap {
	
	//Kitap icin gerekli degiskenleri olusturduk
	private int no;
	private String kitapAdi;
	private String yazarAdi;
	private int yayinYili;
	private double fiyat;
	private int sayfaSayisi;

	
	
	
	//Constructurumuzu olusturduk
	public Kitap(int no, String kitapAdi, String yazarAdi, int yayinYili,int sayfaSayisi
, double fiyat) {
		this.no = no;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayinYili = yayinYili;
		this.fiyat = fiyat;
		this.sayfaSayisi=sayfaSayisi;
	}
	
	
	//Kitap no ile kitabi cagirma icin  metod bu bize numara ile kitap silerken lazim olacak 
	public int getNo() {
		return no;
	}
	
	
	// kitap kaydederken 
	public  void setNo(int no) {
		this.no = no;
	}
	
}
