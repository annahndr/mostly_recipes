# Mostly Recipes
A copy of allrecipies.com
Created to:
- try out Typescript and React, building on an old project from 2019
- try out a different kind of backend, using Python and FastAPI
- Improve understanding of Redux and Context
- Managing bigger data sets
- Ultimate goal is to deploy this app, perhaps on AWS. Expecting it to be tricky as I'll have a database to consider.


BACKEND
Started with Spring Boot, as this is familiar to me and I needed to get the FE up and working.

Lots of interesting things that are new(to me):

- password validation. Checking for length, whether it contains numbers, uppercase, symbol, etc. Hashing the password for storage in the database.
- I've used @ElementCollection before, but I needed a reminder of how it works. I had initally (erroneously) annotated the `ingredients` and `methodSteps` properties in the `Recipe` class with `@ManyToOne` forgetting it was just an array of strings.
