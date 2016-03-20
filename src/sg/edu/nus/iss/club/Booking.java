package sg.edu.nus.iss.club;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
	
	private Member member;
	private Facility facility;
	private Date startDate = new Date();
	private Date endDate = new Date();
	
	Booking(Member bookMember, Facility bookFacility, Date bookStartDate, Date bookEndDate){
		
		member = bookMember;
		facility = bookFacility;
		startDate = bookStartDate;
		endDate = bookEndDate;
		//return true;
	}
	
	public Member GetMember(){
		return member;
	}
	
	public boolean Overlap(Booking checkBooking){
		
		//if (checkBooking.GetMember() == member);
		if (checkBooking == this)		
			return true;
		else
			return false;
	}

}
