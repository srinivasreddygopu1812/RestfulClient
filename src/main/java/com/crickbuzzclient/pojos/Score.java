package com.crickbuzzclient.pojos;

public class Score {
	
	private String country;
	private Integer runs;
	private Integer wickets;
	private double overs;
	private String bat1;
	private String bat2;
	public Integer getRuns() {
		return runs;
	}
	public void setRuns(Integer runs) {
		this.runs = runs;
	}
	public Integer getWickets() {
		return wickets;
	}
	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}
	public double getOvers() {
		return overs;
	}
	public void setOvers(double overs) {
		this.overs = overs;
	}
	public String getBat1() {
		return bat1;
	}
	public void setBat1(String bat1) {
		this.bat1 = bat1;
	}
	public String getBat2() {
		return bat2;
	}
	public void setBat2(String bat2) {
		this.bat2 = bat2;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
