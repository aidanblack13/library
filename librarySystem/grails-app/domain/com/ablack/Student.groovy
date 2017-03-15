package com.ablack

class Student {

String studentName

String studentEmail

String username

String password

String studentID

Course courseTitle

static hasMany=[nameOfBuilding:Library]
    static constraints = {

	studentName null:false, blankable:false

	studentEmail null:false, blankable:false, email:true

	username null:false, blankable:false, unique:true

	password null:false, blankable:false, password:true

	studentID null:false, blankable:false, unique:true, maxSize: 5
	
	courseTitle blank:false, nullable:false
    }
}
