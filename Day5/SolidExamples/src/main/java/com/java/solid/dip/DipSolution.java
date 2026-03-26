package com.java.solid.dip;

public class DipSolution {
	public static void main(String[] args) {
		ITrainerData trainer1 = new JavaInfo();
		ITrainerData trainer2 = new DotnetInfo();
		
		TrainerUtil util1 = new TrainerUtil(trainer1);
		TrainerUtil util2 = new TrainerUtil(trainer2);
		
		util1.showTrainerInfo();
		System.out.println("------------------------------------------");
		System.out.println("-------------------------------------------");
		util2.showTrainerInfo();
		
	}
}
