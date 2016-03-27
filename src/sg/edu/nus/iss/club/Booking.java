package sg.edu.nus.iss.club;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
	
	private Member member;
	private Facility facility;
	private Date startDate = new Date();
	private Date endDate = new Date();
	
	Booking(Member bookMember, Facility bookFacility, String dateInString, String endDateInString) throws BadBookingException{
		String error = null;
		
		//bookMember = null;
		if(bookMember == null)
			error = "No member specified";
		
		
		if (error != null)
			throw new BadBookingException(error);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm");
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
			
		member = bookMember;
		facility = bookFacility;
		startDate = curDate;
		endDate = endDate;
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
