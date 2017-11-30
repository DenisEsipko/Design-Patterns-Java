# Strategy Pattern

## Intent
*"Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it." ~ Gamma et al.*

## Structure
![strategy_pattern](https://raw.githubusercontent.com/Code2Bits/Design-Patterns-Java/master/Behavioral%20Patterns/Strategy/Images/strategy_pattern.png)


## Notes
* The strategy pattern takes the behaviour that varies and encapsulates it into a seperate class. This enables you to make changes to the parts that vary without impacting the parts that stays the same.
* The parts of a class that varies should be pulled from the class and placed into seperate classes that represent that specific behaviour.
* This pattern align with the design principle of "Program to an interface, not an implementation".
* An interface can be used to represent each behaviour and the different implementations of that specifc behaviour should then implement the interface.
* An abstract class can be used to represent each behaviour and the different implementation of that specific behaviour should then extend from the abstract class.
* The HAS-A relationship between classes forms part of composition.
* Favour composition over inheritance.

## Reference
* Freeman, Eric, and Elisabeth Robson. Head First Design Patterns: a Brain-Friendly Guide. O'Reilly, Edition: 10th Anniversary Ed., 2014.
* Gamma, Erich, et al. Design Patterns: Elements of Reusable Object-Oriented Software. Addison-Wesley Professional, 1994.