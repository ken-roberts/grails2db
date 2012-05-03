package nine.rally

@gorm.AuditStamp
class Prospect implements Serializable {
	String  name
	
	String  description
	boolean inactive

	Contact contact

	Long    clientId
	Long    companyId
	
	Org            org
	ProspectExt    ext
	ProspectFlex   flex
}
