package com.ablack

class Library {

String nameOfBuilding

String address

String openingHours

String location

String studySpaces

static hasMany=[librarianName:Librarian, bookTitle:Book, studentName:Student]
    static constraints = {

	nameOfBuilding blank:false, nullable:false

	address blank:false, nullable:false, widget:'textarea'

	openingHours blank:false, nullable:false, widget:'textarea'

	location blank:false, nullable:false

	studySpaces blank:false, nulllable:false, widger:'textarea'
    }
}
