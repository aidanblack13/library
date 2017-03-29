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

		<h3>Make a Review</h3>

		<p>Make your own review for a book from the library</p>
		
		<button type="button" class="btn-btn-success">

			<g:link controller="bookReview" action="create">BookReview</g:link>

		</button>

	</div>

	<div class ="second">

		<h3>Look at Reviews</h3>

		<p>View reviews of books</p>
		
		<button type="button" class="btn-btn-success">

			<g:link controller="bookReview" action="list">BookReview</g:link>

		</button>

	</div>

	<div class ="first">

		<h3>List of books</h3>

		<p>View list of books</p>
		
		<button type="button" class="btn-btn-success">

			<g:link controller="book" action="list">Book</g:link>

		</button>

	</div>

</div>

</div>

</body>

</hmtl>
	
