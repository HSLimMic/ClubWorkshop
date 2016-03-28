package sg.edu.nus.iss.club;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class BookingRegister {
	
	private HashMap<Facility, ArrayList<Booking>> bookingRegister;
	
	BookingRegister(){
		bookingRegister = new HashMap<Facility, ArrayList<Booking>>();
	}
	
	//BookingRegister(Facility facility, Member member, Date startDate, Date endDate) throws BadBookingException{
	public void AddBookingRegister(Facility facility, Member member, String startDate, String endDate) throws BadBookingException{
		Booking startBooking = new Booking(member, facility, startDate, endDate);
		
		List<Booking> compareBooking = bookingRegister.get(facility);
		
		if (compareBooking == null)
		{

			compareBooking = new ArrayList<Booking>();
			compareBooking.add(startBooking);
			bookingRegister.put(facility, (ArrayList<Booking>) compareBooking);			
		}
		else
		{
			boolean overlap = false;
			for(Booking booking:compareBooking)
			{
				System.out.println("\n"+startBooking.toString());
				System.out.println("\n"+booking.toString());
				if(booking.Overlap(startBooking))
					overlap = true;
			}
			
			if (overlap == true)
				throw new BadBookingException("Overlap booking");			
			
		}
	

		
	}

}
