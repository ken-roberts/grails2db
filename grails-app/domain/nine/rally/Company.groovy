package nine.rally

@gorm.AuditStamp
class Company implements Serializable {
	String  num
	String  name

	String  description

	Contact contact

	Long    clientId
	
	Org            org
	CompanyFlex    flex
	CompanySetup   setup
}
