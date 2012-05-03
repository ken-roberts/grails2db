package nine.rally

class ContactAddress {
	boolean tagForReminders	// greenbill

	// mail merge
	String firstName
	String middleName
	String lastName
	String title
	String salutation
	
	// Geographical location fields
	String address1
	String address2
	String address3
	String address4
	String city
	String state
	String zipCode
	String country
	String territory
	String timeZone
	
	// TODO do we need these?
	boolean inactive
	//boolean isAdmin   // acl role check
	//boolean isOwner   // move to user
	//boolean isUser    // User.exists(this.id) or Long userId

    static constraints = {
    }
}
