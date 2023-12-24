package com.course.javabasics.oop.hw.present;

import java.util.Arrays;


public class Present {
	
	private Sweet[] sweetsInPresent;
	
	public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
		
		Sweet[] filteredSweets = new Sweet[this.sweetsInPresent.length];
		
		// Using For loop
		
//		for (int s = 0; s<this.sweetsInPresent.length; s++) {
//			if (this.sweetsInPresent[s].getSugarWeight() >= minSugarWeight && this.sweetsInPresent[s].getSugarWeight() <= maxSugarWeight) {
//				filteredSweets[s] = this.sweetsInPresent[s];
//			}
//		}
		
		// Using For Each loop
		
		int sweetCounter = 0;
		
		for (Sweet sweet: this.sweetsInPresent) {
			double sweetSugarWeight = sweet.getSugarWeight();
			if (sweetSugarWeight >= minSugarWeight && sweetSugarWeight <= maxSugarWeight) {
				filteredSweets[sweetCounter++] = sweet;
			}
		}
		
		filteredSweets = filterNulls(filteredSweets);
		
		return filteredSweets;
	}
	
	public double calculateTotalWeight() {
		double totalWeight = 0;
		
		for (Sweet sweet: this.sweetsInPresent) {
			totalWeight += sweet.getWeight();
		}
		
		return totalWeight;
	}
	
	public void addSweet(Sweet sweet) {
		
		if (sweet == null) {
			return;
		}
		if (this.sweetsInPresent == null) {
			this.sweetsInPresent = new Sweet[] {sweet};
		} else {
			int numOfSweetsInPresent = this.sweetsInPresent.length;
//			Sweet[] newSweetsArray = new Sweet[numOfSweetsInPresent+1];
//			
//			for (int s = 0; s < numOfSweetsInPresent; s++) {
//				newSweetsArray[s] = this.sweetsInPresent[s];
//			}
			
			Sweet[] newSweetsArray = Arrays.copyOf(this.sweetsInPresent, numOfSweetsInPresent+1);
			
			newSweetsArray[numOfSweetsInPresent] = sweet;
			
			this.sweetsInPresent = newSweetsArray;
			
		}
		
	}
	
	public Sweet[] getSweets() {
		return this.sweetsInPresent.clone();
	}

	@Override
	public String toString() {
		return "Present [sweetsInPresent=" + Arrays.toString(sweetsInPresent) + "]";
	}
	
	private Sweet[] filterNulls(Sweet[] sweets) {

		int numOfSweets = 0;

		for (Sweet sweet: sweets) {
			if (sweet != null) {
				numOfSweets++;
			}
		}

		Sweet[] sweetsWithoutNulls = new Sweet[numOfSweets];
		int sweetCounter = 0;

		for (Sweet sweet: sweets) {
			if (sweet != null) {
				sweetsWithoutNulls[sweetCounter++] = sweet;
			}
		}

		return sweetsWithoutNulls;
	}	

}
