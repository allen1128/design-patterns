GOF Design Patterns
===============

Basic Factory
---------------------
* Factory is static; it's within the encapsulated component.
* Client only deals with Factory therefore the logic within Implementation classes is hidden from Client, which leads to lower coupling.
* Changing in Implementation class will only lead to changes in Factory class.
* How Factory class knows which Implementation of the api to initilize: by input parameter, by configuration file, by cache. 
* when by input parameter, Client would need to know something about the component.
* when by configuration file (ie. application.properties) or by cache, Client would know little about the component.

Facade
----------------------
* move the interaction logic between Client and the component to Facade class; Client only interacts with Facade.
* Facade class only delegates request; usually no extra functionalities are added in Facade.
* remove redundency otherwise the same interaction logic is repeated in Client.


Adapter
----------------------
* adapter the implementation of target api to reuse the existing functionality (adaptee)
* usually it should not introduce new functions. exception: smart adapter
* bi-directional adapter which allows the two interfaces to be interchangable.
* object adapter is preferable over class adapter, in which adapter implements the target and inherite from the adaptee. because object adapter is considered lower coupling; limited level of inheritance in java vs. multiple adatee allowed in object adapter.
* mis-use adapter will lead to mis-understanding: ApiA object is in fact calling ImplB.



