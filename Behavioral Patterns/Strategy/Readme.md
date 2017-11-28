# Strategy Pattern

## Intent
*"Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it." ~ Gamma et al.*

## Structure
![strategy_pattern](https://raw.githubusercontent.com/Code2Bits/Design-Patterns-Java/master/Behavioral%20Patterns/Strategy/Images/strategy_pattern.png)


## Example: Pac-Man Ghost Movement
### Introduction
The ghosts in Pac-Man have three different types of movement during play: chase, scatter and frightened.

**Chase**
The goal of the ghosts in Pac-Man while in "Chase" mode is to find and capture Pac-Man within the maze. Each of the four ghosts has a unique behaviour while chasing Pac-Man. The red ghost, Blinky, is very aggressive in its approach while chasing Pac-Man. The pink ghost, Pinky, will attempt to ambush Pac-Man by trying to get in front of him and cut him off. The light blue/cyan ghost, Inky, will patrol an area and is not very predictable in this mode. The orange ghost, Clyde, is moving in a random fashion and seems to stay out of the way of Pac-Man.

**Scatter**


**Frightened**


So to sum up the movement requirements of the ghosts, the following table illustrate the types of movement and also how the individual ghosts behave during those types of movement.

| Ghost Name | Chase | Scatter | Frightened |
| --- | --- | --- | --- |
| Blinky (Red) | Agressive | Top Right Corner | Wandering |
| Pinky (Pink) | Ambush | Top Left Corner | Wandering |
| Inky (Cyan) | Patrol | Bottom Right Corner | Wandering |
| Clyde (Orange) | Random | Bottom Left Corner | Wandering |


### Chase Behaviour: Strategy Pattern
The Strategy Pattern can be used to design the objects that represent

![strategy_pattern_chase_behaviour](https://raw.githubusercontent.com/Code2Bits/Design-Patterns-Java/master/Behavioral%20Patterns/Strategy/Images/strategy_pattern_chase_behaviour.png)



### Scatter Behaviour: Strategy Pattern

![strategy_pattern_scatter_behaviour](https://raw.githubusercontent.com/Code2Bits/Design-Patterns-Java/master/Behavioral%20Patterns/Strategy/Images/strategy_pattern_scatter_behaviour.png)

### Frightened Behaviour: Strategy Pattern

![strategy_pattern_frightened_behaviour](https://raw.githubusercontent.com/Code2Bits/Design-Patterns-Java/master/Behavioral%20Patterns/Strategy/Images/strategy_pattern_frightened_behaviour.png)


## Reference
* Freeman, Eric, and Elisabeth Robson. Head First Design Patterns: a Brain-Friendly Guide. O'Reilly, Edition: 10th Anniversary Ed., 2014.
* Gamma, Erich, et al. Design Patterns: Elements of Reusable Object-Oriented Software. Addison-Wesley Professional, 1994.