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
 * The Ghost class contains the different behavior that the different ghosts have in the Pac-Man
 * game. There are three distinct modes a ghost can be in: chase, scatter and frightened.
 * 
 * @author	André Maré
 */
public class Ghost {

	
	public Ghost() {
	} // no-arguments constructor
	
	
	protected String ghostName = "";
	protected String ghostColour = "";
	protected ChaseBehavior chaseBehavior;
	protected ScatterBehavior scatterBehavior;
	protected FrightenedBehavior frightenedBehavior;
	
	
	public void display() {
		StringBuilder display = new StringBuilder();
		display.append(ghostName);
		display.append(" the ");
		display.append(ghostColour);
		display.append(" ghost.");
		
		System.out.println(display.toString());
	} // method display
	
	
	public void executeChaseMode() {
		chaseBehavior.chase();
	} // method executeChaseMode
	
	
	public void executeScatterMode() {
		scatterBehavior.scatter();
	} // method executeScatterMode
	
	
	public void executeFrightenedMode() {
		frightenedBehavior.frightened();
	} // method executeFrightenedMode


	public String getGhostName() {
		return ghostName;
	}


	public void setGhostName(String ghostName) {
		this.ghostName = ghostName;
	}


	public String getGhostColour() {
		return ghostColour;
	}


	public void setGhostColour(String ghostColour) {
		this.ghostColour = ghostColour;
	}


	public ChaseBehavior getChaseBehavior() {
		return chaseBehavior;
	}


	public void setChaseBehavior(ChaseBehavior chaseBehavior) {
		this.chaseBehavior = chaseBehavior;
	}


	public ScatterBehavior getScatterBehavior() {
		return scatterBehavior;
	}


	public void setScatterBehavior(ScatterBehavior scatterBehavior) {
		this.scatterBehavior = scatterBehavior;
	}


	public FrightenedBehavior getFrightenedBehavior() {
		return frightenedBehavior;
	}


	public void setFrightenedBehavior(FrightenedBehavior frightenedBehavior) {
		this.frightenedBehavior = frightenedBehavior;
	}
	
	
} // class Ghost
