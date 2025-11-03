<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/css/styles.css">
	<title>Add New Dog Form</title>
</head>

<#include "header.html">

<body>
	<main>
			<h1>Add New Dog</h1>
		
		<form id="new-dog" action="/dogs" method="post">
			<label for="name">Name</label><br>
			<input type="text" id="name" name="name" placeholder="name"><br>
            <br>

            <label for="breed">Breed</label><br>
			<input type="text" id="breed" name="breed" placeholder="breed"><br>
            <br>

            <label for="sex">Sex</label><br>
			<input type="text" id="sex" name="sex" placeholder="sex"><br>
            <br>

            <label for="weight">Weight</label><br>
			<input type="number" id="weight" name="weight" placeholder="weight"><br>
            <br>

            <label for="age">Age</label><br>
			<input type="number" id="age" name="age" placeholder="age"><br>
            <br>

            <label for="location">Location</label><br>
			<input type="text" id="location" name="location" placeholder="location"><br>
            <br>

            <label for="intakeDate">Intake Date</label><br>
			<input type="text" id="intakeDate" name="intakeDate" placeholder="intake date"><br>
            <br>

            <label for="image">Image Link</label><br>
			<input type="text" id="image" name="image" placeholder="image link"><br>
            <br>

            <label for="description">Description</label><br>
			<textarea rows="5" cols="50" id="description" name="description" placeholder="description"></textarea><br>
            <br>

			<button type="submit">Save</button>
			<a href="/dogs">Cancel</a>
		</form>
	</main>
</body>
</html>