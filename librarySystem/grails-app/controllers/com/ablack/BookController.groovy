package com.ablack

class BookController {

    def scaffold=Book

def bookSearch(){

}

def bookResults(){

def bookProps = Book.metaClass.properties*.name

def books = Book.withCriteria{

	"${params.queryType}"{

	params.each { field, value ->

	
	if (bookProps.grep(field) && value) {

	ilike(field,value)

	}

	}


	}
		
	}

	[books:books]

}

}
