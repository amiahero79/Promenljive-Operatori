package bozovic.milos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Operatori
		// Binarni operatori
		// 5 + 10
		
		// =
		
		//  = operator dodele vrednosti
		// vrednost koja se nalazi sa desne strane
		// znaka =  dodeljuje se promenljivoj koja se nalazi
		// sa leve strane znaka =
		
		int a = 5; // asocijativnost je sa desna na levo
		int b = 50;
		
		int zbir = a + b;
		System.out.println("Vrednost promenljive zbir je: " + zbir);
		
		// + je binarni operator
		// -, *, /, %
		
		int razlika = a - b;
		System.out.println("Vrednost promenljive razlika je: " + razlika);
		
		int proizvod = a * b;
		System.out.println("Proizvod = " + proizvod);
		
		// Operator / predstavlja celobrojno deljenje
		float kolicnik = b / a; // 10 / 3 = 3.33333 ovde dobijamo samo ceo broj bez ostatka
		System.out.println("Kolicnik = " + kolicnik);
		
		// Deljenje sa ostatkom - %
		int ostatak = 17 % 3;
		System.out.println("Ostatak = " + ostatak);
		// vraća se samo ostatak 10 % 3 = 1 (12 i ostatak od deljenja je 1)
		
		float tacnoDeljenje = 17/3;
		System.out.println(tacnoDeljenje);
		
		double provera = (double)50/3; // tačan rezultat deljenja - eksplicitna konverzija
		System.out.println("Provera = " + provera);

		

		
	}

}
