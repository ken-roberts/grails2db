package nine.rally

class Contact {
	String name
	String email

	Long contactTypeId	// billing, shipping, etc
	
	// phone numbers
	String mainPhone
	String cellPhone
	String officePhone
	String fax
	
	String comments
	String source
	String sourceId

	// References back to parent
	ContactExt  ext
	ContactFlex flex
	Org         org
	Long        orgType

    static constraints = {
    }
}
