package com.ablack

class BookReview {

String reviewTitle

Book bookTitle

Date dateReviewed

Student studentName

String review

    static constraints = {

	reviewTitle blank:false, nullable:false, maxSize: 50, widget: 'textarea'

	bookTitle blank:false, nullable:false

	dateReviewed blank:false, nullable:false

	studentName nullable:false, blank:false

	review nullable:false, blank:false, maxSize:5000, widget: 'textarea'
    }

String toString() {

return reviewTitle

} 

}
