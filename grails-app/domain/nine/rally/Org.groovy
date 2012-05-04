package nine.rally

@gorm.AuditStamp @nine.CompanyClientStamp
class Organization implements Serializable {
	String  num
	String  name

    Contact  contact
    Location mainLocation
    String   mainPhoneNum //switchboard
    
    String   description
	OrgType  type
	
	OrgFlex flex
	
	static hasMany = [contacts: Contact]
	static hasMany = [locations: Location]
}

//num,name,description

