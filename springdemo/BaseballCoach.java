package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	@Override
		public String getDailyWorkout(){
			return "Spending 30 minutes on batting practice";
		}
}