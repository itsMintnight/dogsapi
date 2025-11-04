<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/css/styles.css">
    <title>Update ${dog.name}</title>
</head>

<#include "header.html">

<body>
	<main>
        <h1>Update ${dog.name}</h1>

		<form id="update-dog" action="/dogs/updateForm/${dog.dogID}" method="post">
            <input type="hidden" id="dogID" name="dogID" placeholder="dogID" value="${dog.dogID}" required>

            <label for="name">Name</label><br>
			<input type="text" id="name" name="name" placeholder="name" value="${dog.name}" required><br>
            <br>

            <label for="breed">Breed    </label><br>
			<input type="text" id="breed" name="breed" placeholder="breed" value="${dog.breed}" required><br>
            <br>

            <p>Sex</p>
            <input type="radio" id="male" name="sex" value="Male" required>
            <label for="sex">Male</label><br>
            <input type="radio" id="female" name="sex" value="Female" required>
            <label for="sex">Female</label><br>
            <br>

            <label for="weight">Weight (lbs)</label><br>
			<input type="number" step="any" id="weight" name="weight" placeholder="weight" value="${dog.weight}" required><br>
            <br>

            <label for="age">Age (yrs)</label><br>
			<input type="number" step="any" id="age" name="age" placeholder="age" value="${dog.age}" required><br>
            <br>

            <label for="location">Location</label><br>
			<input type="text" id="location" name="location" placeholder="location" maxlength="255" value="${dog.location}" required><br>
            <br>

            <label for="intakeDate">Intake Date</label><br>
			<input type="date" id="intakeDate" name="intakeDate" placeholder="intake date" value="${intakeDate}" required><br>
            <br>

            <label for="image">Image Link</label><br>
			<input type="text" id="image" name="image" placeholder="image link" maxlength="255" value="${dog.image}" required><br>
            <br>

            <label for="description">Description</label><br>
			<textarea rows="5" cols="50" id="description" name="description" required>${dog.description}</textarea><br>
            <br>
            
			<button type="submit">Save</button><br>
			<a href="/dogs/${dog.dogID}"><input type="button" value="Cancel"></a><br>
		</form>
	</main>

    
</body>
</html>