package ex01_Collections;

class Student {
	private String name;
	private int totalScore;
	private int subjectCount;

	public Student(String name) {
	    this.name = name;
	    this.totalScore = 0;
	    this.subjectCount = 0;
	}

	public void addScore(int score) {
	    this.totalScore += score;
	    this.subjectCount++;
	}

	public double getAverage() {
	    return (double) totalScore / subjectCount;
	}

	public String getName() {
	    return name;
	}
}