package com.example.learnRest.rest_tutorial.models;

public class Score {
	
	private int Score;
	private int Correct;
	private int InCorrect;
	public Score(int score, int correct, int inCorrect) {
		super();
		Score = score;
		Correct = correct;
		InCorrect = inCorrect;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public int getCorrect() {
		return Correct;
	}
	public void setCorrect(int correct) {
		Correct = correct;
	}
	public int getInCorrect() {
		return InCorrect;
	}
	public void setInCorrect(int inCorrect) {
		InCorrect = inCorrect;
	}
	
}
