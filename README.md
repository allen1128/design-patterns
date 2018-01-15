GOF Design Patterns
===============



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


Singleton
----------------------
* implementation basic logic: no public constructor + public static method to get instance
* 4 ways to achieve them
* hungry load via volatile static keyword is sufficient most of time: static variable is initialized during class loading and only once.
* use enum: easy to do and clean code; enum can be viewed as generic singleton class
* lazy initialization holder class: by inner static class. inner so that it will be not loaded by default. static so that the initialization is done during class loading and only once.
* double check lock method: relatively poor performance but use very common


Factory Pattern
----------------------
* standard factory patterns:  the factory class delays the decision of which API class to instantiate to its subfactory classes. The FactoryMethod that uses to make decision is usually protected, which means it is not exposed to external components; it returns the instance of the api class, and this instance could be returned to the client or used internally in the public method of the factory class.
* parameterized factory pattern: the client calls the factory method with a parameter, which is used to decide which api class to use. basic Factory is a small type of parameterized factory pattern.


Basic Factory
---------------------
* Factory is static; it's within the encapsulated component.
* Client only deals with Factory therefore the logic within Implementation classes is hidden from Client, which leads to lower coupling.
* Changing in Implementation class will only lead to changes in Factory class.
* How Factory class knows which Implementation of the api to initilize: by input parameter, by configuration file, by cache.
* when by input parameter, Client would need to know something about the component.
* when by configuration file (ie. application.properties) or by cache, Client would know little about the component.


Strategy Pattern
---------------------
* the purpose of strategy pattern is to separate the algorithms from the business logics and form separate classes, and make these class interchangable (via the same interface).
* the core of the pattern is not how to realize algorithms but how to organize them.
* the client or the context class decides on which strategy to use; this means inheriting the context class or single class but with lots of member variables.


Builder Pattern
---------------------
* director contains the algorithm to build; algorithm is separated from the builder class; director doesn't know in details how to build the parts.
* builder contains the logic to build the details parts and the final products being built. 


Chain of Responsibility
---------------------
* client doesn't need to know which handler will handle its request; there will be one or none handler
* chain can be built with data from property files or db entries; or it will be realized using inheritance where the child object would have parent class as it's successor; or it can be built by the client


Flyweight
---------------------
* move repeated properties of large number of instances to a seperate flyweight object, in order to decrease memory usage.
* unsharedflyweight is composed of sharedflyweight; note that it doesn't need to buffer in memory because sharedflyweight is buffered.

Decorator
---------------------
* enhance the functions of object dynamically and with transparancy
* avoid using inheritance which will lead to explosion of sub-classes

Observer / Subscriber + Publisher
---------------------
* decouple the object and related objects.
* one to many relationships or many to many
* unidirectional dependency (Observer is dependent on Observable); there should be not sequential difference for the observers.
* there are push model and push model where in push model, the required data is pushed to the observer (this has limitions if the observer needs more data in the future) vs. in the pull model, the observable instance is passed and the observer pulls whatever data it needs.
* the timing for notifying the observers has to be after the Observable's internal states have been successfully changed.


