package nine.rally

@gorm.AuditStamp @nine.CompanyClientStamp
class Prospect implements Serializable {
	String  name
	
	String  description
	boolean inactive

    //this is the denormalized org contact until changed. changing it here will not change the Org 
	Contact contact
	
	Org            org
	
	ProspectExt    ext
	ProspectFlex   flex
}
