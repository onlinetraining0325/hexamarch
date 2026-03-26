package com.java.solid.lsp;

public class LspExample {
	public static void main(String[] args) {
		Details[] arr = new Details[] {
			new Adesh(),
			new Durga(),
			new Shakira()
		};
		
		for (Details details : arr) {
			details.showInfo();
		}
	}
}
