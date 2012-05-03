package nine.rally

@gorm.AuditStamp
class Org implements Serializable {
	String  num
	String  name

	Long    orgType
	String  description

	Long    clientId
	Long    companyId
	
	OrgFlex flex
}
