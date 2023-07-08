package com.coderscampus.Nickassignment10.dto;

import java.util.List;

public class DayResponse {
	
	private List<Meals> meals;
	private MealsMacros nutrients;
	public List<Meals> getMeals() {
		return meals;
	}
	public void setMeals(List<Meals> meals) {
		this.meals = meals;
	}
	public MealsMacros getNutrients() {
		return nutrients;
	}
	public void setNutrients(MealsMacros nutrients) {
		this.nutrients = nutrients;
	}
    
	
}
