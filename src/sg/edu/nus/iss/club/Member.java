package sg.edu.nus.iss.club;

public class Member extends Person{
	private int membershipNumber;
	
	public Member(String surname, String firstName, String secondName, int initMembershipNumber) {
		super(surname, firstName, secondName);
		membershipNumber = initMembershipNumber;
		// TODO Auto-generated constructor stub
	}
	
	public int GetMemberNumber(){
		return membershipNumber;
		//System.out.println("Membership Number: " + membershipNumber);
	}

	 public void show() {
	        //String fullName = firstName;
	        //if (secondName != null) {
	        //   fullName += " " + secondName;
	        //}
	        //fullName += " " + surname;
		 	super.show(membershipNumber);
	    }

}
