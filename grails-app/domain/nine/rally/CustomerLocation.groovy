package nine.rally

/**
 * This is the ship to 
 */
@gorm.AuditStamp @nine.CompanyClientStamp
class CustomerLocation implements Serializable {
	String name
    String description
    String type
    
    //FIXME can we just denormalize this?
	Location location 
	// denormalized location fields????
	String line1
	String line2
	String line3
	String line4
	String city
	String state
	String zipCode
	String country
	String county
	
	Customer customer

	CustomerLocationFlex   flex
	
}
