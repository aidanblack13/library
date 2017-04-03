<!doctype html>
<html>
<head>

    <meta name="layout" content="main"/>
    <title>Search for student</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

<div class="row">


	<h1>Student information</h1>

<formset>

	<legend>Advanced search on student information</legend>

<table>


	<g:form action="studentResults"> 

		<tr>

			<td>Student Name</td>

			<td><g:textField name="studentName"/></td>

		</tr>

		<tr>

			<td>Student ID</td>

			<td><g:textField name="studentID"/></td>

		</tr> 

	
		<tr>

			<td>Student Username</td>

			<td><g:textField name="userName"/></td>

		</tr>

		<tr>

			<td>Query Type:</td>

			<td><g:radioGroup name="queryType" labels="['And','Or','Not']"
		values="['and','or','not']" value="and">

		${it.radio}${it.label}

				</g:radioGroup>

				</td>

				</tr>

		<tr>

		<td/>

		<g:submitButton name="search" value="Search"/></td>

		</tr>

		</g:form>

		</table>

		</formset>

		</div>

		</body>

		</html>
