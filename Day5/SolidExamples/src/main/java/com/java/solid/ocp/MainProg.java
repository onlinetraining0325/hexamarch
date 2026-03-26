package com.java.solid.ocp;

public class MainProg {
	public void showInfo(ITraining iTraining) {
		iTraining.info();
		iTraining.timing();
	}
	
	public static void main(String[] args) {
		JavaTraining jt = new JavaTraining();
		MainProg ocp = new MainProg();
		ocp.showInfo(jt);
		
		DotnetTraining dt = new DotnetTraining();
		ocp.showInfo(dt);
		
		SapTraining pt = new SapTraining();
		ocp.showInfo(pt);
	}

}
