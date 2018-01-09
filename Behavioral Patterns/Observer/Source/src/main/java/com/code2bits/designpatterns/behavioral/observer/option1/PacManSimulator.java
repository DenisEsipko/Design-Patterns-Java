package com.code2bits.designpatterns.behavioral.observer.option1;


public class PacManSimulator {

	
	/**
	 * The createGhostBlinky method creates a Ghost object with the properties of Blinky the red ghost.
	 * 
	 * @return 	Ghost object representing Blinky the red ghost.
	 */
	public Ghost createGhostBlinky() {
		Ghost ghost1 = new Ghost();
		ghost1.setGhostName("Blinky");
		ghost1.setGhostColour("red");
		
		return ghost1;
	} 
	
	
	/**
	 * The createGhostPinky method creates a Ghost object with the properties of Pinky the pink ghost.
	 * 
	 * @return 	Ghost object representing Pinky the red ghost.
	 */
	public Ghost createGhostPinky() {
		Ghost ghost2 = new Ghost();
		ghost2.setGhostName("Pinky");
		ghost2.setGhostColour("pink");
		
		return ghost2;
	} 
	
	
	/**
	 * The createGhostInky method creates a Ghost object with the properties of Inky the cyan.
	 * 
	 * @return 	Ghost object representing Inky the cyan ghost.
	 */
	public Ghost createGhostInky() {
		Ghost ghost3 = new Ghost();
		ghost3.setGhostName("Inky");
		ghost3.setGhostColour("cyan");
		
		return ghost3;
	}
	
	
	/**
	 * The createGhostClyde method creates a Ghost object with the properties of Clyde the orange.
	 * 
	 * @return 	Ghost object representing Clyde the orange ghost.
	 */
	public Ghost createGhostClyde() {
		Ghost ghost4 = new Ghost();
		ghost4.setGhostName("Clyde");
		ghost4.setGhostColour("orange");
		
		return ghost4;
	} 
	
	
	public static void clearScreen() {  
		for (int i = 0; i < 50; ++i) System.out.println(); 
	   } 
	
	
	public static void main(String[] args) throws Exception {
		PacManSimulator simulator = new PacManSimulator();
		GhostMovementSignals signals = new GhostMovementSignals();
		
		Ghost blinky = simulator.createGhostBlinky();
		Ghost pinky = simulator.createGhostPinky();
		Ghost inky = simulator.createGhostInky();
		Ghost clyde = simulator.createGhostClyde();
		
		signals.registerObserver(blinky);
		signals.registerObserver(pinky);
		signals.registerObserver(inky);
		signals.registerObserver(clyde);
		
		
		signals.setGhostMode(GhostMode.SCATTER);
		Thread.sleep(7000);
		clearScreen();		

		signals.setGhostMode(GhostMode.CHASE);
		Thread.sleep(20000);
		clearScreen();
		
		signals.setGhostMode(GhostMode.SCATTER);
		Thread.sleep(7000);
		clearScreen();
		
		signals.setGhostMode(GhostMode.CHASE);
		Thread.sleep(20000);
		clearScreen();
		
		signals.setGhostMode(GhostMode.FRIGHTENED);
		Thread.sleep(5000);
		clearScreen();
		
	}
	
}
