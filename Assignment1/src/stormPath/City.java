package stormPath;

import java.util.ArrayList;

public class City {
	private String name;
	private ArrayList storms;

	public City(String name) {
		this.name = name;
		this.storms = new ArrayList();
	}

	public boolean wasHit(Storm storm){
		for (Object eachStorm : storms){
			if (storm.equals((Storm) eachStorm)){
				return true;
			}
		}
		return false;
	}

	public boolean onSamePath(City city){
		for (Object eachStorm : storms){
			ArrayList cityList = ((Storm)eachStorm).getCities();
			if (cityList.contains(city)){
				return true;
			}
		}
		return false;
	}


	public void addStorm(Storm storm){
		this.storms.add(storm);
	}

	public boolean equals(City city){
		if (!this.name.equals(city.name)) {
			return false;
		}
		if (this.storms.size() != city.storms.size()){
			return false;
		}
		for (Object temp : this.storms){
			if (!city.storms.contains(temp)) {
				return false;
			}
		}
		return true;
	}


	public String getName(){
		return name;
	}

	public  String toString(){
		return " " + name + " ";
	}

}
