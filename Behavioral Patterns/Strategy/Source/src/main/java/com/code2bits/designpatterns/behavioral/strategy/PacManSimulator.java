/**
 * MIT License
 * 
 * Copyright (c) 2017 André Maré
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.code2bits.designpatterns.behavioral.strategy;


/**
 * The PacManSimulator class is used to illustrate the Strategy Pattern using the 
 * Pac-Man game as an example.
 * 
 * @author	André Maré
 */
public class PacManSimulator {
	
	
	/**
	 * The createGhostBlinky method creates a Ghost object with the properties 
	 * and behaviour of Blinky the red ghost.
	 * 
	 * @return 	Ghost object representing Blinky the red ghost.
	 */
	public Ghost createGhostBlinky() {
		Ghost ghost1 = new Ghost();
		ghost1.setGhostName("Blinky");
		ghost1.setGhostColour("red");
		
		ghost1.setChaseBehaviour(new ChaseAggressive());
		ghost1.setScatterBehaviour(new ScatterTopRightCorner());
		ghost1.setFrightenedBehaviour(new FrightenedWandering());
		
		return ghost1;
	} 

	
	/**
	 * The createGhostPinky method creates a Ghost object with the properties 
	 * and behaviour of Pinky the pink ghost.
	 * 
	 * @return 	Ghost object representing Pinky the red ghost.
	 */
	public Ghost createGhostPinky() {
		Ghost ghost2 = new Ghost();
		ghost2.setGhostName("Pinky");
		ghost2.setGhostColour("pink");
		
		ghost2.setChaseBehaviour(new ChaseAmbush());
		ghost2.setScatterBehaviour(new ScatterTopLeftCorner());
		ghost2.setFrightenedBehaviour(new FrightenedWandering());
		
		return ghost2;
	} 
	
	
	/**
	 * The createGhostInky method creates a Ghost object with the properties 
	 * and behaviour of Inky the cyan.
	 * 
	 * @return 	Ghost object representing Inky the cyan ghost.
	 */
	public Ghost createGhostInky() {
		Ghost ghost3 = new Ghost();
		ghost3.setGhostName("Inky");
		ghost3.setGhostColour("cyan");
		
		ghost3.setChaseBehaviour(new ChasePatrol());
		ghost3.setScatterBehaviour(new ScatterBottomRightCorner());
		ghost3.setFrightenedBehaviour(new FrightenedWandering());
		
		return ghost3;
	}
	
	
	/**
	 * The createGhostClyde method creates a Ghost object with the properties 
	 * and behaviour of Clyde the orange.
	 * 
	 * @return 	Ghost object representing Clyde the orange ghost.
	 */
	public Ghost createGhostClyde() {
		Ghost ghost4 = new Ghost();
		ghost4.setGhostName("Clyde");
		ghost4.setGhostColour("orange");
		
		ghost4.setChaseBehaviour(new ChaseRandom());
		ghost4.setScatterBehaviour(new ScatterBottomLeftCorner());
		ghost4.setFrightenedBehaviour(new FrightenedWandering());
		
		return ghost4;
	} 
	
	
	public static void main(String[] args) {
		PacManSimulator simulator = new PacManSimulator();
		Ghost blinky = simulator.createGhostBlinky();
		Ghost pinky = simulator.createGhostPinky();
		Ghost inky = simulator.createGhostInky();
		Ghost clyde = simulator.createGhostClyde();
		
		blinky.display();
		blinky.executeChaseMode();
		blinky.executeScatterMode();
		blinky.executeFrightenedMode();
		System.out.println("\n");
		
		pinky.display();
		pinky.executeChaseMode();
		pinky.executeScatterMode();
		pinky.executeFrightenedMode();
		System.out.println("\n");
		
		inky.display();
		inky.executeChaseMode();
		inky.executeScatterMode();
		inky.executeFrightenedMode();
		System.out.println("\n");
		
		clyde.display();
		clyde.executeChaseMode();
		clyde.executeScatterMode();
		clyde.executeFrightenedMode();
		System.out.println("\n");
	}
	
	
} 
