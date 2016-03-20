package sg.edu.nus.iss.club;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ClubApplication {

    public static void main (String args[]) {


        Person member1, member2, member3;
        Facility fac1, fac2, fac3;

        member1 = new Person ("Edison", "Thomas", "Alva");
        //member2 = new Person ("Baggio", "Roberto", null);
        //member3 = new Person ("Webber", "Andrew", "Lloyd");

        fac1 = new Facility ("Main Hall", null);
        fac2 = new Facility ("Room1", "Conference Room on Level 2");
        fac3 = new Facility ("Room2", "Meeting Room on Level 3");

        System.out.println ("Members:");
        member1.show ();
        //member2.show ();
        //member3.show ();
        System.out.println ("\nFacilities:");
        fac1.show ();
        fac2.show ();
        fac3.show ();
        
        System.out.println ("\nMember:");
        Member testMember1;
        
        testMember1 = new Member("Lim", "Hean Soon", null, 123);
        testMember1.GetMemberNumber();
        testMember1.show();
        
        System.out.println ("\nClub Members:");
        Club clubMember = new Club();

        //Member memberDetail = clubMember.addMember("Baggio", "Roberto", null);
        //memberDetail.show();
        
        //Member memberDetail2 = clubMember.addMember("Webber", "Andrew", "Lloyd");
        //memberDetail2.show();
        
        clubMember.addMember("Baggio", "Roberto", null);
        clubMember.addMember("Webber", "Andrew", "Lloyd");
        
        Member[] retMembers = new Member[10];
        retMembers = clubMember.getMembers();
        retMembers[0].show();
        retMembers[1].show();
        
        System.out.println ("\nShow Members:");
        clubMember.showMember();
        
        System.out.println ("\nGet Member:");
        Member searchMember = clubMember.getMember(0);
        searchMember.show();
        
        clubMember.removeMember(0);
        clubMember.showMember();
        
        clubMember.addFacility("Main Hall", "Testing Main Hall");
        //clubMember.showFacility();
        
        clubMember.show();
        
        Facility f = clubMember.getFacility("Main Hall");
        
        System.out.println("trying HashMap get");
        f.show();
        

        
        clubMember.removeFacility("Main Hall");
        
        HashMap<String, Facility> tempFacility = new HashMap<String, Facility>();
        tempFacility = clubMember.getFacilities();
        
        System.out.print(tempFacility.containsKey("Main Hall"));
        
    	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm");
        
    	String dateInString = "25-08-1982 10:20:56";
    	String endDateInString = "31-08-1982 10:20:56";
    	
    	Date curDate = null;
		try {
			curDate = dateFormat.parse(dateInString);
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
    	
        Booking testBooking = new Booking(searchMember, f, curDate, endDate);

        System.out.println("\n"+curDate.toString());
    }

}
