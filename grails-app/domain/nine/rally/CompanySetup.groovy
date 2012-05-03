package nine.rally

@gorm.AuditStamp
class CompanySetup implements Serializable {
	Long   arTermsId
	String currency
	String glAcct
	String website
}
