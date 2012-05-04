package nine.rally

@gorm.AuditStamp @nine.CompanyClientStamp
class Customer implements Serializable {
	String  num
	String  name
	
	String  name2
	
	Contact  billingContact 
	Location billingAddress
	String   billingEmail
	
	Org     org

	CustomerExt    ext
	CustomerFamily family
	CustomerFlex   flex
	CustomerSetup  setup
}
