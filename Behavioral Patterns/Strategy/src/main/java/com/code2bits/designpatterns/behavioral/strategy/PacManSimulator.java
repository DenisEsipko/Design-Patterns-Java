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
	 * and behavior of Blinky the red ghost.
	 * 
	 * @return 	Ghost object representing Blinky the red ghost.
	 */
	public Ghost createGhostBlinky() {
		Ghost blinky = new Ghost();
		blinky.setGhostName("Blinky");
		blinky.setGhostColour("red");
		
		blinky.setChaseBehavior(new ChaseAggresive());
		blinky.setScatterBehavior(new ScatterTopRightCorner());
		blinky.setFrightenedBehavior(new FrightenedWandering());
		
		return blinky;
	} // method createGhostBlinky

	
	/**
	 * The createGhostPinky method creates a Ghost object with the properties 
	 * and behavior of Pinky the pink ghost.
	 * 
	 * @return 	Ghost object representing Pinky the red ghost.
	 */
	public Ghost createGhostPinky() {
		Ghost blinky = new Ghost();
		blinky.setGhostName("Pinky");
		blinky.setGhostColour("pink");
		
		blinky.setChaseBehavior(new ChaseAmbush());
		blinky.setScatterBehavior(new ScatterTopLeftCorner());
		blinky.setFrightenedBehavior(new FrightenedWandering());
		
		return blinky;
	} // method createGhostPinky
	
	
	/**
	 * The createGhostInky method creates a Ghost object with the properties 
	 * and behavior of Inky the cyan.
	 * 
	 * @return 	Ghost object representing Inky the cyan ghost.
	 */
	public Ghost createGhostInky() {
		Ghost blinky = new Ghost();
		blinky.setGhostName("Inky");
		blinky.setGhostColour("cyan");
		
		blinky.setChaseBehavior(new ChasePatrol());
		blinky.setScatterBehavior(new ScatterBottomRightCorner());
		blinky.setFrightenedBehavior(new FrightenedWandering());
		
		return blinky;
	} // method createGhostInky
	
	
	/**
	 * The createGhostClyde method creates a Ghost object with the properties 
	 * and behavior of Clyde the orange.
	 * 
	 * @return 	Ghost object representing Clyde the orange ghost.
	 */
	public Ghost createGhostClyde() {
		Ghost blinky = new Ghost();
		blinky.setGhostName("Clyde");
		blinky.setGhostColour("orange");
		
		blinky.setChaseBehavior(new ChaseRandom());
		blinky.setScatterBehavior(new ScatterBottomLeftCorner());
		blinky.setFrightenedBehavior(new FrightenedWandering());
		
		return blinky;
	} // method createGhostClyde
	
	
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
	} // main method
	
	
} // class PacManSimulator
