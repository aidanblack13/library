package com.ablack

class BookReview {

String reviewTitle

Book bookTitle

Date dateCreated

Student studentName

String review

    static constraints = {

	reviewTitle blank:false, nullable:false, maxSize: 50, widget: 'textarea'

	bookTitle blank:false, nullable:false

	dateCreated blank:false, nullable:false

	studentName null:false, blankable:false

	review null:false, blankable:false, maxSize:5000, widget: 'textarea'
    }
}
