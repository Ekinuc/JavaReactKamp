package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu = "Ýnternet Þubesi";
		//int sadece tam sayý ondalýklý içim double kullanýlabilir.
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		
		else {
			System.out.println("Dolar eþit resmi");
		}
		
		
		String kredi1 ="Hýzlý Kredi";
		String kredi2 ="Mutlu Emekli Kredi";
		String kredi3 ="Konut Kredisi";
		String kredi4 ="Çiftçi Kredi";
		String kredi5 ="Msb Kredi";
		String kredi6 ="Meb Kredisi";
		String kredi7 ="Kültür Bakanlýðý kredisi";
		
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		String[] krediler = 
			{
					"Hýzlý Kredi",
					"Mutlu Emekli Kredi",
					"Konut Kredisi",
					"Çiftçi Kredi",
					"Msb Kredi",
					"Meb Kredisi",
					"Kültür Bakanlýðý kredisi"
			};
		//foreach
		for (String kredi :krediler) {
			System.out.println(kredi);
		}
		
		for(int i =0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
		
				
		
		
		
	}

}
