<head>

    <meta name="layout" content="main"/>
    <title>Search for student</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

<div class="row">


	<h1>Book information</h1>

<formset>

	<legend>Advanced search on book information</legend>

<table>


	<g:form action="bookResults"> 

		<tr>

			<td>Book Title</td>

			<td><g:textField name="bookTitle"/></td>

		</tr>

		<tr>

			<td>Subject</td>

			<td><g:textField name="subject"/></td>

		</tr> 

	
		<tr>

			<td>Author</td>

			<td><g:textField name="author"/></td>

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
