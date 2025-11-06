<!DOCTYPE html>
<html lang="en-us"> 
    
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/css/styles.css">
    <title>Home</title>
</head>

<#include "header.html">
<#include "search.html">

<body>
	<main>
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