package com.java.solid;

public class DipMain {

	public static void main(String[] args) {
		JavaTrgInfo jtInfo = new JavaTrgInfo(new JavaTrg());
		DotnetTrgInfo dtInfo = new DotnetTrgInfo(new DotnetTrg());
		
		jtInfo.details();
		dtInfo.details();
	}
}
