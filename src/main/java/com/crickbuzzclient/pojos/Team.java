package com.crickbuzzclient.pojos;

public class Team {
	
	private String teamName;
	private Double totalMatches;
	private Double wins;
	private Double losses;
	private String status="Rejected";

	public Double getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(Double totalMatches) {
		this.totalMatches = totalMatches;
	}
	public Double getWins() {
		return wins;
	}
	public void setWins(Double wins) {
		this.wins = wins;
	}
	public Double getLosses() {
		return losses;
	}
	public void setLosses(Double losses) {
		this.losses = losses;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
}
