package com.ablack

class BookReview {

Book bookTitle

Date dateCreated

Student studentName

String review

    static constraints = {

	bookTitle blank:false, nullable:false

	dateCreated blank:false, nullable:false

	studentName null:false, blankable:false

	review null:false, blankable:false, maxSize:5000, widget: 'textarea'
    }
}
