package com.ablack

class Book {

String bookTitle

String subject

String author

String isbn

Date dateBorrowed

Date returnDate

Student studentName

Boolean overdue

Double daysLate 

Library nameOfBuilding

Double calculateDaysLate(){

2*daysLate

}

static hasMany=[reviewTitle:BookReview]

    static constraints = {

	bookTitle blank:false, nullable:false

	subject blank:false, nullable:false

	author blank:false, nullable:false

	isbn blank:false,nullable:false, minSize:5, maxSize:13

	dateBorrowed blank:false, nullable:false

	returnDate blank:false, nullable:false

	student blank:false, nullable:false

	overdue blank:false, nullable:false

	nameOfBuilding blank:false, nullable:false
    }
}
