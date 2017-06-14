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
	}

	public boolean equals(Storm storm){
		if (name == storm.name && year == storm.year){
			return true;
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
		return name;
	}
}
