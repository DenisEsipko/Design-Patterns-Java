# Strategy Pattern

## Intent
*"Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it." ~ Gamma et al.*

## Structure
![strategy_pattern](https://raw.githubusercontent.com/Code2Bits/Design-Patterns-Java/master/Behavioral%20Patterns/Strategy/Images/strategy_pattern.png)


## Example: Pac-Man Ghost Movement
### Introduction
The objective of the ghosts in Pac-Man is to chase Pac-Man down and capture him within the maze. For this the ghosts has to move around in the maze trying to locate Pac-Man. The ghosts have three different types of movement during play: chase, scatter and frightened.

**Chase**

In "Chase" mode, the ghosts are trying to find and capture Pac-Man. Each of the four ghosts has a unique behaviour while chasing Pac-Man. Blinky the red ghost is very aggressive in its approach while chasing Pac-Man and will follow Pac-Man once located. Pinky the pink ghost will attempt to ambush Pac-Man by trying to get in front of him and cut him off. Inky the cyan ghost will patrol an area and is not very predictable in this mode. Clyde the orange ghost is moving in a random fashion and seems to stay out of the way of Pac-Man.

**Scatter**

In "Scatter" mode, the ghosts will stop chasing Pac-Man and each will move into its respective corners for a few seconds. Blinky the red ghost moves towards the top right corner, while Pink the pink ghost moves towards the top left corner. Inky the cyan ghost moves towards the bottom left corner and Clyde the orange ghost moves towards the bottom left corner. This mode lasts only for a few seconds and then changes back to the "Chase" mode.

**Frightened**

The "Frightened" mode occurs when Pac-Man eats an energizer within the maze. There are four energizers located in the maze and all four ghosts changes mode. The ghosts turn dark blue and wander around in the maze being vulnerable. They will flash moments before they return to either the Scatter or Chase mode. 

So to sum up the movement requirements of the ghosts, the following table illustrates the types of movement and also how the individual ghosts behave during those types of movement.

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