package nine.rally

@gorm.AuditStamp
class ProspectExt implements Serializable {
	String     competition
	Long       dso
	String     duns
	String     erp
	String     industry
	Long       numUsers
	Long       openDeductions
	Long       openItems
	String     platform
	String     productInterest
	Long       prospectId
	String     prospectType
	BigDecimal revenue
	String     sic
	String     source
}
