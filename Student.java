package com.example.demo;

import java.util.List;
import java.util.ArrayList;
public class Student {
	private String sName;
    private int sId;
    private double score;

    public Student(int sId, String sName, double score){
        this.sId = sId;
        this.sName = sName;
        this.score = score;
    }
    public void Student11(int sId2, String sName2, double score2) {
		// TODO Auto-generated constructor stub
	}
	public void Student1(int sId2, String sName2, double score2) {
		// TODO Auto-generated constructor stub
	}
	public String getsName() {
        return sName;
    }

    public int getsId() {
        return sId;
    }

    public double getScore() {
        return score;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public void setScore(double score) {
        this.score = score;
    }


}


