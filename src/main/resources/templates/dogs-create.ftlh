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
			<hr>
		
		<form id="new-dog" action="/dogs" method="post">
			<input type="text" id="name" name="name" placeholder="name"><br><br	>
			<input type="text" id="breed" name="breed" placeholder="breed"><br><br>
			<input type="text" id="sex" name="sex" placeholder="sex"><br><br>
			<input type="number" id="weight" name="weight" placeholder="weight"><br><br>
			<input type="number" id="age" name="age" placeholder="age"><br><br>
			<input type="text" id="location" name="location" placeholder="location"><br><br>
			<input type="text" id="intakeDate" name="intakeDate" placeholder="intake date"><br><br>
			<input type="text" id="image" name="image" placeholder="image link"><br><br>
			<input type="text" id="description" name="description" placeholder="description"><br><br>
			<button type="submit">Save</button>
			<a href="/dogs">Cancel</a>
		</form>
	</main>
</body>
</html>