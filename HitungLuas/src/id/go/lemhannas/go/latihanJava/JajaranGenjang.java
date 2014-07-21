package id.go.lemhannas.go.latihanJava;

public class JajaranGenjang extends Bentuk {
	
		double LuasJajaranGenjang;
		double tinggi;
		double alas;
		
		public void HitungLuas(double a, double t) {
			this.tinggi = t;
			this.alas = a;
			
			this.LuasJajaranGenjang = this.tinggi * this.alas;
			System.out.println("Luas Jajaran Genjang yg anda hitung adalah : "+ LuasJajaranGenjang);
		}

}
