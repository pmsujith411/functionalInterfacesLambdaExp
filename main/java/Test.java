package main.java;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Display Country Names");
		LambdaExercise.displayCountries();
		System.out.println();
		
		System.out.println("Display Country Names and Capitals");
		LambdaExercise.displayCountryCapitals();
		System.out.println();
		
		System.out.println("Display Country Names after sorted by names in reverse alphabetical order");
		LambdaExercise.sortCountriesByName();
		System.out.println();
	
		System.out.println("Display Country Names after sorted by length in descending order");
		LambdaExercise.sortCountriesBylength();
		System.out.println();
		
		System.out.println("Display Country Names after removed the country");
		LambdaExercise.removeCountry("Australia");
	}
}