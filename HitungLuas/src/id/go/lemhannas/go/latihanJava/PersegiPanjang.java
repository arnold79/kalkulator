package id.go.lemhannas.go.latihanJava;

public class PersegiPanjang extends Bentuk{

	double LuasPersegiPanjang;
	double tinggi;
	double alas;
	
	public void HitungLuas(double a, double t) {
		this.tinggi = t;
		this.alas = a;
		
		this.LuasPersegiPanjang = (this.tinggi * this.alas) / 2;
		System.out.println("Luas PersegiPanjang yg anda hitung adalah : "+ LuasPersegiPanjang);
	}
}
