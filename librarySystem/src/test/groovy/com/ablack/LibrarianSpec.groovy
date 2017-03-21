package com.ablack

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void nullLibrarianName() {
        
	when:"the librarianName to be null"
        
	def noData=new Librarian(librarianName:null)

	then: "data is null"

	noData.librarianName==null
   }

   void intData() {

	when: "int data should be allowed into telephone"

	def intTest=new Librarian(LibrarianName: 'Tim Power', telephone: 0122656)

	then: "data should be allowed "

	intTest.telephone==0122656

}

}
