package com.ablack

class Librarian {

String librarianName

String librarianEmail
 
String office

String userName

String password

int telephone

Library nameOfBuilding

    static constraints = {
	librarianName blank:false, nullable:false

	librarianEmail blank:false, nullable:false, email:true

	office blank:false, nullable:false
	
	userName blank:false, nullable:false, unique:true

	password blank:false, nullable:false, password:true

	telephone blank:false, nullable:false, minSize: 4, maxSize: 25

	nameOfBuilding blank:false, nullable:false
    }

String toString(){
return librarianName

}

}
