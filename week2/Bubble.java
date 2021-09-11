package com.factory.designpatters.assignment.week2;

/**
 *
 * Bubble class
 *
 */
public abstract class Bubble {

	String shape;
	String size;

	/**
	 * This method is used to set by concrete classes which are extending the
	 * Bubble.
	 */
	abstract void setSizeAndShapeofBubble();

	public void pop() {
		System.out.println(" bubble Pops " + this.size + " : " + this.shape);
	}

	public void blow() {
		setSizeAndShapeofBubble();
		System.out.println(" Blowing :" + this.size + " : " + this.shape);
	}

}
