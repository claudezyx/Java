package stormPath;

import java.util.ArrayList;

public class Storm {
	private String name;
	private ArrayList cities;
	private int year;

	public Storm(String name, int year) {
		this.name = name;
		this.year = year;
		this.cities = new ArrayList();
	}

	public void addCity(City city){
		cities.add(city);
		if (!city.getStorms().contains(this)){
			city.addStorm(this);
		}
	}

	public boolean equals(Object storm){
		if (storm instanceof Storm){
			if (name == (((Storm)storm).name) && year == (((Storm)storm).year)){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}

	public ArrayList getCities(){
		return cities;
	}

	public String getName(){
		return name;
	}

	public int getYear(){
		return year;
	}

	public String toString(){
		String outputString = name + ", " + Integer.toString(year);
		for (Object city : cities){
			outputString = outputString + System.lineSeparator() + (((City)city).getName());
		}
		return outputString;

	}
}
