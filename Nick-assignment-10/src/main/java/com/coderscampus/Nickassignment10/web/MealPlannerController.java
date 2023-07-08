package com.coderscampus.Nickassignment10.web;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Nickassignment10.dto.DayResponse;

import com.coderscampus.Nickassignment10.dto.WeeklyMeals;

@RestController
public class MealPlannerController {

	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeeklyMeals> getWeekMeals(
			@RequestParam("targetCalories") String numCalories, 
			@RequestParam("diet") String diet, 
			@RequestParam("exclude") String exclusion) {
		
		RestTemplate rt = new RestTemplate();
		
		 URI builder = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
	                .queryParam("apiKey", "1d0ec4971829437a95d2dd3a431c0098")
	                .queryParam("timeFrame", "week")
	                .queryParam("targetCalories", numCalories)
	                .queryParam("diet", diet)
	                .queryParam("exclude", exclusion)
		            .build()
		            .toUri();
		 
		 ResponseEntity<WeeklyMeals> response = rt.getForEntity(builder, WeeklyMeals.class);
		 return response;

	  
	    }

	

	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals( 
	        @RequestParam("targetCalories") String numCalories, 
	        @RequestParam("diet") String diet, 
	        @RequestParam("exclude") String exclusion) {
		
		RestTemplate rt = new RestTemplate();
		
		 URI builder = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
	                .queryParam("apiKey", "1d0ec4971829437a95d2dd3a431c0098")
	                .queryParam("timeFrame", "day")
	                .queryParam("targetCalories", numCalories)
	                .queryParam("diet", diet)
	                .queryParam("exclude", exclusion)
		            .build()
		            .toUri();
		 
		 ResponseEntity<DayResponse> response = rt.getForEntity(builder, DayResponse.class);
		 return response;

	  
	    }


	}

