<!doctype html>
<html>
<head>

	
    <meta name="layout" content="main"/>
    <title>Search for student</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

<div class = "row">

	<h1>Student Search Results</h1>

<h3>Student Results</h3>

<p>Searched

for students matching <em>${term}</em>.

Found <strong>${students.size()}</strong>students.

</p>

<ul>

	<g:each var="student" in="${students}">

	<li><g:link controller="student" action="show"
id="${student.id}">${student.studentName}</g:link></li>

	</g:each>

	</ul>

	<g:link action='studentSearch'>Search Again</g:link>

		</div>

	</body>

	</html>
