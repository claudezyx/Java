package stormPath;

import java.awt.*;
import java.util.ArrayList;

public class City {
	private String name;
	private ArrayList storms;

	public City(String name) {
		this.name = name;
		this.storms = new ArrayList();
	}

	public boolean wasHit(Storm storm){
		for (Object city : storm.getCities()){
			if (city.equals(this)){
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
		storms.add(storm);
		if (!storm.getCities().contains(this)){
			storm.addCity(this);
		}
	}

	public boolean equals(Object city){

		if (city instanceof City){
			if (!this.name.equals(((City) city).name)){
				return false;
			}
			if (this.storms.size() != (((City) city).storms.size())){
				return false;
			}
			for (Object temp : this.storms){
				if (!((City) city).storms.contains(temp)) {
					return false;
				}
			}
			return true;
		}
		else{
			return false;
		}
	}


	public String getName(){
		return name;
	}

	public ArrayList getStorms(){
	    return storms;
    }

	public  String toString(){
		String stormList = "";
		String[] stormNames = new String[storms.size()];
		for (int i = 0; i < storms.size(); i++){
		    System.out.println(((Storm)storms.get(i)).getName());
		    stormNames[i] = ((Storm)storms.get(i)).getName();
        }
		stormList = String.join(", ", stormNames);

//		for (Object storm : storms){
//			stormList = stormList + ((Storm)storm).getName();
//		}

		return name + " (" + stormList + ")";
	}

}
