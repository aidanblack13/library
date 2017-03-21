package com.ablack

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void tuitionFees() {
        when: "the fee of the course is stated"
	def maths=new Course(courseTitle: 'Maths', courseFee:9000)

	then: "the totalFee will calculate the entire cost of the degree"

	maths.totalFee()== 27000
    }

    void enoughCharacters() {

	when: "the description will validate because it has the correct amount of characters"
	def characterTest=new Course(title:'English', description:'testing')

	then: "enough characters data will be authorised"
	characterTest.description=='testing'

} 

}
