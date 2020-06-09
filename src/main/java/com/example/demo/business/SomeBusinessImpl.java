package com.example.demo.business;

public class SomeBusinessImpl {
	
	SomeDataService someDateService;
	
	
	
	
	public void setSomeDateService(SomeDataService someDateService) {
		this.someDateService = someDateService;
	}

	public int calculateSum(int [] data) {
		int sum = 0;
		for(int value: data) {
			sum += value;
		}
		return sum;
	}
	
	public int calculateSumUsingDataService() {
		int sum = 0;
		int[] data = someDateService.retriveAllData();
		for(int value: data) {
			sum += value;
		}
		return sum;
	}
}
