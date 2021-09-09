package com.bridgelabz.moodanalyser;

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
				throw new MoodAnalyserException("Enter proper message");
			} 
			if(message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch(NullPointerException e)
		{
			throw new MoodAnalyserException("Enter proper message");
		}
	}
}

