GOF Design Patterns
===============

Basic Factory
---------------------
* Factory is static; it's within the encapsulated component; 
* Client only deals with Factory therefore the logic within Implementation classes is hidden from Client. 
* Changing in Implementation class will only lead to change the Factory class.
* How the factory class knows which Implementation of the api to initilized? by input parameter, by configuration, by cache. 
** Client to some extends knows about the implementation of the Factory class and the component.
