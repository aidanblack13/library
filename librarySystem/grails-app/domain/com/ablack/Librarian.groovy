package com.ablack

class Librarian {

String librarianName

String librarianEmail

String office

String username

String password

int telephone

String library

    static constraints = {
	librarianName blank:false, nullable:false

	librarianEmail blank:false, nullable:false, email:true

	office blank:false, nullable:false
	
	username blank:false, nullable:false, unique:true

	password blank:false, nullable:false, password:true

	telephone blank:false, nullable:false, minSize: 4, maxSize: 25

	library blank:false, nullable:false
    }
}
