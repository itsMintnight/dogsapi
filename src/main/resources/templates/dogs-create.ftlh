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
			<input type="text" id="name" name="name" placeholder="ex: Max" required><br>
            <br>

            <label for="breed">Breed</label><br>
			<input type="text" id="breed" name="breed" placeholder="ex: Jack Russel Terrier" required><br>
            <br>

            <p>Sex</p>
			<input type="radio" id="male" name="sex" value="Male" required>
            <label for="sex">Male</label><br>
            <input type="radio" id="female" name="sex" value="Female" required>
            <label for="sex">Female</label><br>
            <br>

            <label for="weight">Weight (lbs)</label><br>
			<input type="number" id="weight" name="weight" placeholder="ex: 15" required><br>
            <br>

            <label for="age">Age (yrs)</label><br>
			<input type="number" id="age" name="age" placeholder="ex: 17" required><br>
            <br>

            <label for="location">Location</label><br>
			<input type="text" id="location" name="location" placeholder="ex: Happy Farm" required><br>
            <br>

            <label for="intakeDate">Intake Date</label><br>
			<input type="date" id="intakeDate" name="intakeDate" required><br>
            <br>

            <label for="image">Image Link</label><br>
			<input type="text" id="image" name="image" placeholder="ex: /images/max.jpg" required><br>
            <br>

            <label for="description">Description</label><br>
			<textarea rows="5" cols="50" id="description" name="description" placeholder="ex: Elderly black and white dog" required></textarea><br>
            <br>

			<button type="submit">Save</button>
			<a href="/dogs">Cancel</a>
		</form>
	</main>
</body>
</html>