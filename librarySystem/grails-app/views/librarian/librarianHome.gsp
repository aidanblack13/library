<!doctype html>
<html>
<head>

	<asset:stylesheet src="home.css"/>
    <meta name="layout" content="main"/>
    <title>Welcome to SHU Library (Librarian account)</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    
    <div id="content" role="main">

	<div class = "row">

	<div class ="first">

		<h3>Student Information</h3>

		<p> View information on Students and edit, delete and add records </p>

		<button type="button" class="btn-btn-success">

			<g:link controller="student" action="create">Student</g:link>

		</button>

	</div>


	<div class ="second">

		<h3>Book Information</h3>

		<p> View information on books, assign them to a library and add, edit and delete records </p>

		<button type="button" class="btn-btn-success">

			<g:link controller="book" action="create">Book</g:link>

		</button>

		</div>



	<div class ="first"

		<h3>Course Details</h3>

		<p> View Course details and edit, add and delete where needed </p>

		<button type="button" class="btn-btn-success">

			<g:link controller="course" action="create">Course</g:link>

		</button>

		</div>


	<div class ="second">

		<h3>Librarian Details</h3>

		<p> View the details on librarians and edit, add and delete where neccssary </p>

		<button type ="button" class="btn-btn-success">

			<g:link controller="librarian" action="create">Librarian</g:link>

		</button>

		</div> 

	
	<div class ="first">

		<h3>Library Information</h3>

		<p> View the information on library's and edit details where need be </p>

		<button type ="button" class="btn-btn-success">

			<g:link controller="library" action="create">Library</g:link>

		</button>

		</div>


</div>

</div>

</body>

</html>
