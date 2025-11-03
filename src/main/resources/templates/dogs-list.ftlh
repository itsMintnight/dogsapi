<!DOCTYPE html>
<#include "nav.html">
<title>Home</title>

<body>
	<main>
		<div class="search_container">
			<input type="input" id="search" name="search" size="50" placeholder="Search">
		</div>

		<div class="dog_pictures_container">
            <#list allDogs as dog>
                <div>
                    <a href="/dogs/${dog.dogID}"><img src=${dog.image} alt="${dog.name}"></a>
                    <p><strong>${dog.name}</strong></p>
                    <p>${dog.description}</p>
                </div>
            </#list>
		</div>
	</main>	
</body>
</html>

<!-- https://www.guilfordcountync.gov/government/departments-and-agencies/animal-services/adopt-pet/dog-adoption-gallery -->