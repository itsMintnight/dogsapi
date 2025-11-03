<!DOCTYPE html>
<#include "nav.html">
<title>Add New Dog Form</title>

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
			<input type="date" id="intakeDate" name="intakeDate" placeholder="intake date"><br><br>
			<input type="text" id="image" name="image" placeholder="image link"><br><br>
			<input type="text" id="description" name="description" placeholder="description"><br><br>
			<button type="submit">Save</button>
			<a href="/dogs">Cancel</a>
		</form>
	</main>
</body>
</html>