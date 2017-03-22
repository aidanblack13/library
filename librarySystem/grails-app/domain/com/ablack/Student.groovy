package com.ablack

class Student {

String studentName

String studentEmail

String username

String password

String studentID

Course courseTitle

Library nameOfBuilding

static hasMany=[bookTitle:Book, reviewTitle:BookReview]
    static constraints = {

	studentName nullable:false, blank:false

	studentEmail nullable:false, blank:false, email:true

	username nullable:false, blank:false, unique:true

	password nullable:false, blank:false, password:true

	studentID nullable:false, blank:false, unique:true, maxSize: 5
	
	courseTitle blank:false, nullable:false

	nameOfBuilding blank:false, nullable:false
    }

String toString() {

return studentName

} 

}
