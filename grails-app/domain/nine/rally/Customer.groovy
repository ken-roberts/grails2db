package nine.rally

@gorm.AuditStamp
class Customer implements Serializable {
	String  num
	String  name
	String  name2
	String  description

	Contact billTo
	Contact shipTo

	Long    clientId
	Long    companyId
	
	Org            org
	CustomerCalc   calc
	CustomerExt    ext
	CustomerFamily family
	CustomerFlex   flex
	CustomerSetup  setup
}
