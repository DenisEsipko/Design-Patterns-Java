# Observer Pattern

## Intent
*"Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically." ~ Gamma et al.*

## Structure
![observer_pattern](https://raw.githubusercontent.com/Code2Bits/Design-Patterns-Java/master/Behavioral%20Patterns/Observer/Images/observer_pattern.png)

## Notes
* The key concepts in the Observer Pattern is the Subject and the Observer.
* A subject can have any number of Observers. (One-to-Many relationship).
* All of the Observers will be notified by the Subject once a change in state happens within the Subject. In response, each observer will query the subject to synchronize its state with the subject’s state.
* The interaction between the Subject and the Observer is also known al publish-subscribe. 
* The subject publish the notification to all the observers who has registered with it. The subject is not tightly coupled to Observers as it uses loosely coupled techniques like coding to an interface.
* Objects can at runtime decide if they want to be notief.
* The Oberser Pattern is used often within the Java Development Kit (JDK) source.
* An example of the Observer pattern is a newspaper subscription following the publisher and subscriber model.
* The Observer Pattern defines a one-to-many relationship between the subjet(1) and the observers(many).
* The Subject will notify all the observers about the change in state.
* There are a number of different ways to implement the Obser Pattern.
* The Oberser Pattern promotes loose coupling, as changes to the Subject or Observers will not affect the other.
* Always strive for loose coupled designs between objects that interact.


## Example
The Pac-Man Patterns: Ghost Mode is an example of the Observer Pattern. For the full article, please follow the link:
* [Pac-Man Patterns: Ghost Mode](Pac-Man_Patterns-Ghost_Mode.md)

## Reference
* Freeman, Eric, and Elisabeth Robson. Head First Design Patterns: a Brain-Friendly Guide. O'Reilly, Edition: 10th Anniversary Ed., 2014.
* Gamma, Erich, et al. Design Patterns: Elements of Reusable Object-Oriented Software. Addison-Wesley Professional, 1994.