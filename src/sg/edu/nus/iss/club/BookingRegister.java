package sg.edu.nus.iss.club;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class BookingRegister {
	
	private HashMap<Facility, ArrayList> bookingRegister = new HashMap<Facility, ArrayList>();
	
	BookingRegister(Facility facility, Member member, Date startDate, Date endDate){
		
		Booking startBooking = new Booking(member, facility, startDate, endDate);
		
	}

}
