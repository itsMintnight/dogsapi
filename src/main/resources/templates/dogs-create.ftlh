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
			<input type="text" id="name" name="name" placeholder="ex: Max"><br>
            <br>

            <label for="breed">Breed</label><br>
			<input type="text" id="breed" name="breed" placeholder="ex: Jack Russel Terrier"><br>
            <br>

            <label for="sex">Sex</label><br>
			<input type="text" id="sex" name="sex" placeholder="ex: Male"><br>
            <br>

            <label for="weight">Weight</label><br>
			<input type="number" id="weight" name="weight" placeholder="ex: 15"><br>
            <br>

            <label for="age">Age</label><br>
			<input type="number" id="age" name="age" placeholder="ex: 17"><br>
            <br>

            <label for="location">Location</label><br>
			<input type="text" id="location" name="location" placeholder="ex: Happy Farm"><br>
            <br>

            <label for="intakeDate">Intake Date</label><br>
			<input type="date" id="intakeDate" name="intakeDate"><br>
            <br>

            <label for="image">Image Link</label><br>
			<input type="text" id="image" name="image" placeholder="ex: /images/max.jpg"><br>
            <br>

            <label for="description">Description</label><br>
			<textarea rows="5" cols="50" id="description" name="description" placeholder="ex: Elderly black and white dog"></textarea><br>
            <br>

			<button type="submit">Save</button>
			<a href="/dogs">Cancel</a>
		</form>
	</main>
</body>
</html>