package id.go.lemhannas.go.latihanJava;

public class Segitiga extends Bentuk{

	double LuasSegitiga;
	double tinggi;
	double alas;
	
	public void HitungLuas(double a, double t) {
		this.tinggi = t;
		this.alas = a;
		
		this.LuasSegitiga = (this.tinggi * this.alas) / 2;
		System.out.println("Luas Segitiga yg anda hitung adalah : "+ LuasSegitiga);
	}

}
