package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaExercise 
{
	static List<String> countries = new ArrayList<>();
	
	static Map<String, String> countryCapitals = new HashMap<>();
	
	static
	{
		countries.add("Fiji");
		countries.add("Spain");
		countries.add("Nepal");
		countries.add("Australia");
		countries.add("India");
		countries.add("Jamaica");
		countries.add("Uganda");
		countries.add("Peru");
				
		countryCapitals = Map.of("Fiji", "Suva", "Spain", "Madrid", "Nepal", "Kathmandu", "Australia", "Canberra", "India", "New Delhi", "Jamaica", "Kingston", "Uganda", "Kampala", "Peru", "Lima");		
	}

	public static void displayCountries()
	{
		countries.forEach(System.out::println);
	}
	
	public static void displayCountryCapitals()
	{
		countryCapitals.forEach((k, v) -> System.out.println(k + " : " + v));
	}
	
	public static void sortCountriesByName()
	{
		Collections.sort(countries, (country1, country2) -> country2.compareTo(country1));
		displayCountries();
	}
	
	public static void sortCountriesBylength()
	{
		Collections.sort(countries, Comparator.comparing(String::length).reversed().thenComparing(String.CASE_INSENSITIVE_ORDER));
		displayCountries();
	}
	
	public static void removeCountry(String name)
	{
		if(countries.contains(name)&& name.length()>6)
			countries.remove(name);
		
		displayCountries();
	}
}