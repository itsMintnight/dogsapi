<!DOCTYPE html>
<#include "nav.html">
<title>About ${dog.name}</title>

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

		</div>
		<h1>${dog.name}</h1>
		<hr style="margin-top: 20px">	

		<div class="description">
			<p>${dog.description}</p>
		</div>
	</main>
</body>
</html>