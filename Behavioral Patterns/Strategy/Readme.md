# Strategy Pattern

## Intent
*"Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it." ~ Gamma et al.*

## Structure
![strategy_pattern](https://raw.githubusercontent.com/Code2Bits/Design-Patterns-Java/master/Behavioral%20Patterns/Strategy/Images/strategy_pattern.png)


## Example: Pac-Man Ghost Chase, Scatter & Frightened Movement


| Ghost Name | Chase | Scatter | Frightened |
| --- | --- | --- | --- |
| Blinky (Red) | Agressive | Top Right Corner | Wandering |
| Pinky (Pink) | Ambush | Top Left Corner | Wandering |
| Inky (Cyan) | Patrol | Bottom Right Corner | Wandering |
| Clyde (Orange) | Random | Bottom Left Corner | Wandering |



### Chase Behaviour


* [Chase](https://github.com/Code2Bits/Design-Patterns-Java/blob/master/Behavioral%20Patterns/Strategy/Source/src/main/java/com/code2bits/designpatterns/behavioral/strategy/ChaseBehavior.java)


### Scatter Behaviour
The ScatterBehaviour interface is used to define different ghostly behaviours during the scatter mode of the Pac-Man game. In scatter mode, the ghosts give up the chase and head for their respective home corners.
* [ScatterBehavior](https://github.com/Code2Bits/Design-Patterns-Java/blob/master/Behavioral%20Patterns/Strategy/Source/src/main/java/com/code2bits/designpatterns/behavioral/strategy/ScatterBehavior.java)

The ScatterBottomLeftCorner class contains the behavior of a ghost in the Pac-Man game. In scatter mode, the ghost will give up the chase and head for the bottom left corner of the board using its regular path-finding methods. 
* [ScatterBottomLeftCorner](https://github.com/Code2Bits/Design-Patterns-Java/blob/master/Behavioral%20Patterns/Strategy/Source/src/main/java/com/code2bits/designpatterns/behavioral/strategy/ScatterBottomLeftCorner.java)

The ScatterBottomRightCorner class contains the behavior of a ghost in the Pac-Man game. In scatter mode, the ghost will give up the chase and head for the bottom right corner of the board using its regular path-finding methods. 
* [ScatterBottomRightCorner](https://github.com/Code2Bits/Design-Patterns-Java/blob/master/Behavioral%20Patterns/Strategy/Source/src/main/java/com/code2bits/designpatterns/behavioral/strategy/ScatterBottomRightCorner.java)

The ScatterTopLeftCorner class contains the behavior of a ghost in the Pac-Man game. In scatter mode, the ghost will give up the chase and head for the top left corner of the board using its regular path-finding methods. 
* [ScatterTopLeftCorner](https://github.com/Code2Bits/Design-Patterns-Java/blob/master/Behavioral%20Patterns/Strategy/Source/src/main/java/com/code2bits/designpatterns/behavioral/strategy/ScatterTopLeftCorner.java)

The ScatterTopRightCorner class contains the behavior of a ghost in the Pac-Man game. In scatter mode, the ghost will give up the chase and head for the top right corner of the board using its regular path-finding methods. 
* [ScatterTopRightCorner](https://github.com/Code2Bits/Design-Patterns-Java/blob/master/Behavioral%20Patterns/Strategy/Source/src/main/java/com/code2bits/designpatterns/behavioral/strategy/ScatterTopRightCorner.java)


### Frightened Behaviour
The FrightenedBehavior interface is used to define different ghostly behaviors during the frightened mode of the Pac-Man game. In frightened mode, the ghosts will all turn dark blue.
* [FrightenedBehavior](https://github.com/Code2Bits/Design-Patterns-Java/blob/master/Behavioral%20Patterns/Strategy/Source/src/main/java/com/code2bits/designpatterns/behavioral/strategy/FrightenedBehavior.java)

The FrightenedWandering class contains the behavior of a ghost in the Pac-Man game. In frightened mode, the ghosts will all turn dark blue and aimlessly wander around in the maze for a few seconds.
* [FrightenedWandering](https://github.com/Code2Bits/Design-Patterns-Java/blob/master/Behavioral%20Patterns/Strategy/Source/src/main/java/com/code2bits/designpatterns/behavioral/strategy/FrightenedWandering.java)


## Reference
* Freeman, Eric, and Elisabeth Robson. Head First Design Patterns: a Brain-Friendly Guide. O'Reilly, Edition: 10th Anniversary Ed., 2014.
* Gamma, Erich, et al. Design Patterns: Elements of Reusable Object-Oriented Software. Addison-Wesley Professional, 1994.