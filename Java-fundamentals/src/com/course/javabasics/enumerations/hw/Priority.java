package com.course.javabasics.enumerations.hw;

public enum Priority {
	A("HIGH"), B("MEDIUM"), C("LOW"), D("LOW");
	
	private String priorityLevel;

	private Priority(String priorityLevel) {
		this.priorityLevel = priorityLevel;
	}
	
	public String getPriorityLevel() {
		return this.priorityLevel;
	}

}
