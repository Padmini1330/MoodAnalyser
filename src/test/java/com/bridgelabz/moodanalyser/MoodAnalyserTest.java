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
	
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() 
	{
		
		MoodAnalyser moodAnalyser=new MoodAnalyser(null);
		try 
		{
			String mood= moodAnalyser.analyseMood();
		}
		catch(MoodAnalyserException e)
		{
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
		}
		
	}
	
	@Test
	public void givenMessage_WhenEmpty_ShouldReturnHappy() 
	{
		
		MoodAnalyser moodAnalyser=new MoodAnalyser("");
		try 
		{
			String mood= moodAnalyser.analyseMood();
		}
		catch(MoodAnalyserException e)
		{
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
		}
		
	}
	

}
