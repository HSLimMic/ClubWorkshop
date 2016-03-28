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
		
		if(bookFacility == null)
			error = "No facility specified";
		
		if (dateInString == null)
			error = "No start date specified";
		
		if (endDateInString == null)
			error = "No end date specified";
		
		
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
		this.endDate = endDate;
		//return true;
	}
	
	Booking(Member bookMember, Facility bookFacility, Date curDate, Date endDate) throws BadBookingException{
		String error = null;
		
		//bookMember = null;
		if(bookMember == null)
			error = "No member specified";
		
		if(bookFacility == null)
			error = "No facility specified";
		
		if (curDate == null)
			error = "No start date specified";
		
		if (endDate == null)
			error = "No end date specified";
		
		
		if (error != null)
			throw new BadBookingException(error);		
		
		member = bookMember;
		facility = bookFacility;
		startDate = curDate;
		this.endDate = endDate;
		//return true;
	}
	
	public Member GetMember(){
		return member;
	}
	
	public boolean Overlap(Booking checkBooking){
		
        boolean status = true;
        if (this.facility != checkBooking.getFacility ()) {
            status = false;
        } else if (startDate.getTime() >= checkBooking.getEndDate().getTime()) {
            status = false;
        } else if (checkBooking.getStartDate().getTime() >= endDate.getTime()) {
            status = false;
        }
        return (status);

	}
	
    public Member getMember () {
        return member;
    }

    public Facility getFacility () {
        return facility;
    }

    public Date getStartDate () {
        return startDate;
    }

    public Date getEndDate () {
        return endDate;
    }

	@Override
	public String toString() {
		return "Booking [member=" + member + ", facility=" + facility + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}

}
