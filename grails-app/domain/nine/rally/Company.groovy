package nine.rally

@gorm.AuditStamp
class Company implements Serializable {
	String  num
	String  name
	String  description

	Long    clientId
	
	Org            org
	
	CompanyFlex    flex
}
