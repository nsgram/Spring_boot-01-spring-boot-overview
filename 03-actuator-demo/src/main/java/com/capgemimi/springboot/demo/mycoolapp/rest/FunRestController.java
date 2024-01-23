package com.capgemimi.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	@Value("${coach.name}")
	private String coachName;
	@Value("${team.name}")
	private String team;
	
	
 //expose  "/" that the hello world return
	@GetMapping("/")
	public String sayHello() {
		return "Hello World <br/>"+coachName+"::::"+team;
	}
	
	//expose new endpoint for "workout"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard for 5km";
	}
	//expose new endpoint for "fortune"
		@GetMapping("/fortune")
		public String getDailyFortune() {
			return "Today is you lucky day...!!!";
		}
}
