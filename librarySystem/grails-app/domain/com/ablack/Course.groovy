package com.ablack

class Course {

String courseTitle

String code

String leader

String department

Double courseFee

String description

String studyMode

Double totalFee () {

3*courseFee

}

static hasMany=[studentName:Student]
    static constraints = {

	courseTitle blank:false, nullable:false

	code blank:false, nullable:false, maxSize:8

	leader blank:false, nullable:false 

	department blank:false, nullable:false

	description blank:false, nullable:false,minSize:5, maxSize:2000, widget:'textarea'

	studyMode blank:false, nullable:false
    }
String toString() {

return courseTitle

} 

}
