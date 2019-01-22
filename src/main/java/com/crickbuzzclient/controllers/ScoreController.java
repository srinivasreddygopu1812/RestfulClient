package com.crickbuzzclient.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.crickbuzzclient.pojos.Score;
import com.crickbuzzclient.pojos.Team;
import com.google.gson.Gson;

@Controller
public class ScoreController {
	@RequestMapping(value="/getScore")
public String getScore(Model m)  {
		System.out.println("In getScore()");	
		RestTemplate restTemplate = new RestTemplate();
		 String result = restTemplate.getForObject("http://localhost:8080/crickbuzz/ipl/scoreGetter", String.class);
		 System.out.println(result);
	Score scr = new Gson().fromJson(result, Score.class);
		m.addAttribute("score", scr);
		
return "score";
}
@RequestMapping(value="/teamRegistration",method=RequestMethod.POST)
	public  String teamRegistration(Team team,Model m) {
	
	RestTemplate rt=new RestTemplate();
	
	HttpHeaders header=new HttpHeaders();
	header.setContentType(MediaType.APPLICATION_JSON);
	Gson gson=new Gson();
	String teamJson = gson.toJson(team);
	
	HttpEntity<String> entity=new HttpEntity<String>(teamJson,header);
	
	String uri="http://localhost:8080/crickbuzz/ipl/registerTeam";
	ResponseEntity<String> result = rt.exchange(uri, HttpMethod.POST, entity, String.class);
	if(result.getStatusCode().value()!=201) {
		m.addAttribute("message", "something went wrong with registration");
		return "Home";
	}
	
	Team resultTeam = gson.fromJson(result.getBody(), Team.class);
	
	if(resultTeam.getStatus().equals("Accepted")) {
		m.addAttribute("message", "You are qualified for this year ipl");
		return "Home";
	}
	
		m.addAttribute("message", " You are not qualified for this year ipl, Better luck next time");
	
	
	
	System.out.println(result);
	System.out.println(result.getStatusCode());
	System.out.println(result.getHeaders());
	System.out.println(result.getBody());
	
		
	return "Home";
	
	}
	
	
	

}
















////////instead of gson we can use  jackson////////
/* ObjectMapper mapper = new ObjectMapper();
		 Score scr = mapper.readValue(result, Score.class);*/

/////////testing through main method first For post request/////////
/*public static void main(String[] args) {
	RestTemplate rt=new RestTemplate();
	/////Http Header//////
	HttpHeaders header=new HttpHeaders();
	header.setContentType(MediaType.APPLICATION_JSON);
	/////Team Pojo///////
	Team team=new Team();
	team.setTeamName("srh");
	team.setTotalMatches(100d);
	team.setLosses(40d);
	team.setWins(60d);
	/////HttpEntity=team+header////////
	////Http Entity//////
	HttpEntity<Team> entity=new HttpEntity<Team>(team,header);
	
	String uri="http://localhost:8080/crickbuzz/ipl/registerTeam";
	ResponseEntity<String> result = rt.exchange(uri, HttpMethod.POST, entity, String.class);
	
	System.out.println(result);
}*/