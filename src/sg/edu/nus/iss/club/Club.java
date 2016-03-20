package sg.edu.nus.iss.club;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Club {
	private int numMembers = 0;
	private int numFacilities = 0;	
	private int count=0;
	private int arrayCounter = 10;
	
	private ArrayList<Member> membersArrayList = new ArrayList<Member>();
	private ArrayList<Facility> facilitiesArrayList = new ArrayList<Facility>();
	private HashMap<String, Facility> facilityHashMap = new HashMap<String, Facility>();
	private ArrayList<Booking> bookingArrayList = new ArrayList<Booking>();
	
	public Club() {

	}

	public void addMember(String surname, String firstName, String secondName) {		
		count += 1;
		membersArrayList.add(new Member(surname, firstName, secondName, numMembers));		
		numMembers += 1;

	}
	
	public Member[] getMembers() {
		Member[]members = new Member[numMembers];
		members =  membersArrayList.toArray(members);
		
		return members;
	}
	
	public void showMember() {
			
		System.out.println("\nArrayList of GetMember:");
		
		for (Member membersArray:membersArrayList){
			membersArray.show();
			
		}
	}
	
	public Member getMember(int idx){
		return membersArrayList.get(idx);
	}
		
	public void removeMember (int membershipNumber){
		int y = 0;
		System.out.println("\nArrayList of remove Member: " + membershipNumber);
		
		for (Member membersArray:membersArrayList){
			if (membersArray.GetMemberNumber() == membershipNumber) {
				break;
			}
			y++;
		}
		membersArrayList.remove(y);
		System.out.println("\nArrayList of remove Member in position: " + y);		
	}
	
	public void addFacility(String name, String description) {		
		facilitiesArrayList.add(new Facility(name, description));
		facilityHashMap.put(name, new Facility(name,description));
		
		numFacilities += 1;

	}
	
	public void showFacility() {
		
		System.out.println("\nArrayList of GetFacility:");
		
		for (Facility facilityArray:facilitiesArrayList){
			facilityArray.show();
			
		}
		
		System.out.println("Print Hashmap");
		Set set = facilityHashMap.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			
			System.out.println(me.getKey() + "||" + me.getValue());		
			
			//facilityHashMap.put("Main Hall", new Facility("MainHall2", "New Hall"));
			Facility f = (Facility) me.getValue();
			f.show();
		}
		
	}
	
	public void show(){
		showFacility();
		showMember();
	}
	
	public Facility getFacility(String facilityName){
		//Set set = facilityHashMap.entrySet();
		//Iterator i = set.iterator();
		
		return facilityHashMap.get(facilityName);
		
		//return me.getValue();
	}
	
	public HashMap<String, Facility> getFacilities(){
		
		return (HashMap<String, Facility>) facilityHashMap.clone();
	}
	
	public void removeFacility(String facilityName){
		facilityHashMap.remove(facilityName);
	}
	
	public void AddBooking(int memberID, String facilityName, String startDateInString, String endDateInString)
	{
		//Member bookMember = membersArrayList.get(memberID);
		Member bookMember = getMember(memberID);
		
		//Facility bookFacility = facilityHashMap.get(facilityName);
		Facility bookFacility = getFacility(facilityName);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm");
		
		Date curDate = null;
		try {
			curDate = dateFormat.parse(startDateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date endDate = null;
		try {
			endDate = dateFormat.parse(endDateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		bookingArrayList.add(new Booking(bookMember, bookFacility, curDate, endDate));
	}
	
}
