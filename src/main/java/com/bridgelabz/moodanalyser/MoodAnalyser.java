package com.bridgelabz.moodanalyser;

import com.bridgelabz.moodanalyser.MoodAnalyserException.ExceptionType;

public class MoodAnalyser 
{
	String message;
	public MoodAnalyser()
	{
		
	}
	
	public MoodAnalyser(String message)
	{
		this.message=message;
	}
	
	public String analyseMood() throws MoodAnalyserException
	{
		try 
		{
			if(message.length()==0) 
			{
				throw new MoodAnalyserException(ExceptionType.ENTERED_EMPTY, "Enter Proper Mood Message. EMPTY string is not Allowed");
			} 
			if(message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch(NullPointerException e)
		{
			throw new MoodAnalyserException(ExceptionType.ENTERED_NULL, "Enter Proper Mood Message. NULL is not Allowed");
		}
	}
}

