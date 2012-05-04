package nine.rally

@gorm.AuditStamp 
@nine.ClientStamp
class Contact {
    String num
	String name
    
    boolean inactive
	ContactType type	// billing, shipping, etc
	
	Boolean       isLocationDifferent
    Location      location
    PhoneNumber   phone
    EmailAddress  email

	String  firstName
	String  middleName
	String  lastName
	String  nickName
	String  salutation
	String  jobTitle
	String  department
	String  comments
	
	Boolean tagForReminders = false
    
	// References back to parent
	Org         org
	Long        orgType
	
	
	ContactExt  ext //extra shit for DCS and big custs
	ContactFlex flex //user fields

    static hasMany = [phones: PhoneNumber]
	static hasMany = [emails: EmailAddress]
	static hasMany = [locations: Location]
	
	//This is questionalble
	static hasOne =  [user:User]
	
    def isUserEnabled(){
		return (user && user.enabled)?true:false
	}

	def beforeInsert(){
		concatName()
	}
	def beforeUpdate(){
		concatName()
	}
	def concatName(){
		def fullName =(firstName?:"") + ' ' + (lastName?:"")
		name=fullName.size() > 50 ? fullName[0..49] : fullName
	}
}

