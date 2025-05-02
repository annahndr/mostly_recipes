# Mostly Recipes
A copy of allrecipies.com
Created to:
- try out Typescript and React, building on an old project from 201
- Improve understanding of Redux and Context
- Managing bigger data sets
- Working on some new-to-me features in the backend
- Ultimate goal is to deploy this app, perhaps on AWS as I'm currently studying for my Solutions Architect Associate cert

BACKEND
Started with Spring Boot in the set up, as this is familiar to me. 

Trying out:
- password validation. Checking for length, whether it contains numbers, uppercase, symbol, etc. Hashing the password for storage in the database.
- I've used @ElementCollection before, but I needed a reminder of how it works. I had initally (erroneously) annotated the `ingredients` and `methodSteps` properties in the `Recipe` class with `@ManyToOne` forgetting it was just an array of strings.
