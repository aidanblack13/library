package com.ablack

class StudentController {

    def scaffold=Student


def login(){

}

def validate(){

def user = Student.findByUserName(params.username)

if(user && user.password == params.password){

	session.user = user

	render view:'studentHome'

}

else{

	flash.message = "invalid username and password"

	render view:'login'

}

}

def logout={

	session.user=null

	redirect(uri:'/')

}

def studentSearch(){

}

def studentResults(){

def studentProps = Student.metaClass.properties*.name

def students = 	Student.withCriteria{

	"${params.queryType}"{

	params.each { field, value ->

	
	if (studentProps.grep(field) && value) {

	ilike(field,value)

	}

	}


	}
		
	}

	[students:students]

}


}
