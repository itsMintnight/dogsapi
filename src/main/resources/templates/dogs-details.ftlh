<!DOCTYPE html>
<html lang="en-us"> 
	
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/css/styles.css">
	<title>About ${dog.name}</title>
</head>

<#include "header.html">

<body>
	<main>
		<div class="details_container">
			<img src=${dog.image} alt="${dog.name}">
			
			<ul>
				<li>Breed: ${dog.breed}</li>
				<li>Sex: ${dog.sex}</li>
				<li>Weight: ${dog.weight}</li>
				<li>Age: ${dog.age}</li>
				<li>Location: ${dog.location}</li>
				<li>Intake Date: ${dog.intakeDate}</li>
			</ul>
			
			<a href="/dogs/updateForm/${dog.dogID}"><input type="button" value="Edit Dog Profile"></a>
			<button onclick="confirmDelete()" style="color: red">Delete</button>
		</div>

		<h1>${dog.name}</h1>
		<hr style="margin-top: 20px">	

		<div class="description">
			<p>${dog.description}</p>
		</div>
	</main>

	<script>
		function confirmDelete() {
			if (confirm("This will delete ${dog.name}.") == true) {
				window.location.href = "http://localhost:8080/dogs/delete/${dog.dogID}";	
			} else {
				alert("Cancelled.");
			}
		}
	</script>
</body>
</html>