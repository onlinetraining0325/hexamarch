package com.hexaware.day1.sup;

public class MainProg {
	public static void main(String[] args) {
//		Employ emp1 = new Durga(1, "Durga", 94923.44);
//		Employ emp2 = new SivaHari(2, "Sivahari", 88485.23);
//		Employ emp3 = new Kailash(3, "Kailash", 99923.23);
		
		Employ[] arr = new Employ[] {
				new Durga(1, "Durga", 94923.44),
				new SivaHari(2, "Sivahari", 88485.23),
				new Kailash(3, "Kailash", 99923.23)
		};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
