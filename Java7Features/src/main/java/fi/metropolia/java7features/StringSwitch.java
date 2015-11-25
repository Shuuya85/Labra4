package fi.metropolia.java7features;

public class StringSwitch {

	private String day;
	private int lucifer = 666;

	public StringSwitch(String day) {
		this.day = day;
	}

	public int getDayNumber() {
		switch (day) {
		case "monday":
			return 0;
		case "tuesday":
			return 1;
		case "wednesday":
			return 2;
		case "thursday":
			return 3;
		case "friday":
			return 4;
		case "saturday":
			return 5;
		case "sunday":
			return 6;
		default:
			return 0;
		}
	}

}
