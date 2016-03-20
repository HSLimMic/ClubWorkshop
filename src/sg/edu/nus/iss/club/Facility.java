package sg.edu.nus.iss.club;

import java.util.HashMap;

public class Facility {

	HashMap facilityHashMap = new HashMap();
	
    private String name;
    private String description;

    public Facility (String name) {
        this (name, null);
    }

    public Facility (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName () {
        return name;
    }

    public String getDescription () {
        return description;
    }

    public void show() {
        String fullName = toString();
        System.out.println (fullName);
    }

	@Override
	public String toString() {
		String fullName = name;
        if (description != null) {
            fullName += " (" + description + ")";
        }
		return fullName;
	}
}
