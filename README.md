# JAVA Console app | Marvel Search

MarvelSearch allows you to search Marvels developer database, 
for either characters or comics. The user will be presented with the choice to search 
for either characters or comics, after they have made that selection [character or comic]. 
They then have the choice of searching specifically for a character or comic by either name or title. 
If those options are too narrow the user will also have the ability to search by 
name starts or title starts with. After receiving user input the program will make a HTTP 
request to get the information requested, once the data is received back from the server 
we can then present this to the user.


## Character name Search

————————————————————————————
Returns a specific character with associated properties

//-->Search term Thor

Name: Thor

Desc: As the Norse God of thunder and lightning, Thor wields one of the greatest weapons ever made, 
the enchanted hammer Mjolnir. While others have described Thor as an over-muscled, oafish imbecile,
he's quite smart and compassionate.  He's self-assured, and he would never, ever stop fighting for 
a worthwhile cause.

Comics: Age of Heroes (2010) #1, 
Age of Heroes (2010) #2, 
Age of Heroes (2010) #3, 
Age of Heroes (2010) #4,
A+X (2012) #7


## Character name starts with search

————————————————————————————
Returns a comma separated list of characters

//--> Search term Spider

Characters ->
Spider-dok, 
Spider-Girl (Anya Corazon),  
Spider-Girl (May Parker), 
Spider-Gwen (Gwen Stacy), 
Spider-Ham (Larval Earth)


## Comic Title search

————————————————————————————
Returns issues in the series

//-->Search term Agents of Atlas

//TODO Need to implement table from notes





## Comic title starts with search

————————————————————————————
Return issues that start with search

//-->Search term Age

Comics ->
Age of Conan: Valeria (Trade Paperback), 
Agents of Atlas: Pandemonium (Trade Paperback), 
Agents of Atlas: The Complete Collection vol. 2 (Trade Paperback), 
Agents of Atlas (2019) #5
