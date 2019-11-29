package com.cts.training.parallelstream;

public class Calculator {
	
	private int result;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	
	public void performSum(int input) {
		result+=input;
	}

}
