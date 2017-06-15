package stormPath;

import java.util.ArrayList;

public class StormRecorder {
	public static void main(String[] args) {

		ArrayList cityList;


		System.out.println("Enter the name of a city");
		if (args[0].toLowerCase() == "exit"){
			System.exit(0);
		}
		else if (cityList.contains(args[0])){
			System.out.println();
		}
		else{
			System.out.println("This is not a valid city");
		}
	}

}