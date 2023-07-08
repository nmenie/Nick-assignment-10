package com.coderscampus.Nickassignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MealsMacros {

	@JsonProperty("calories")
	private Integer calories;
	@JsonProperty("protein")
	private Integer protein;
	@JsonProperty("fat")
	private Integer fat;
	@JsonProperty("carbohydrates")
	private Integer carbohydrates;

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getProtien() {
		return protein;
	}

	public void setProtien(Integer protien) {
		this.protein = protien;
	}

	public Integer getFat() {
		return fat;
	}

	public void setFat(Integer fat) {
		this.fat = fat;
	}

	public Integer getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Integer carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	@Override
	public String toString() {
		return "MealsMacros [calories=" + calories + ", protien=" + protein + ", fat=" + fat + ", carbohydrates="
				+ carbohydrates + "]";
	}
}
