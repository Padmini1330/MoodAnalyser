package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest 
{

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() 
	{
		
		MoodAnalyser moodAnalyser=new MoodAnalyser("This is a happy message");
		String mood= moodAnalyser.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
	
	
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() 
	{
		
		MoodAnalyser moodAnalyser=new MoodAnalyser("This is a sad message");
		String mood= moodAnalyser.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
	

}
