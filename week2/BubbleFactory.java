package com.factory.designpatters.assignment.week2;

/**
 * 
 * This is the Bubble Factory where we are instantiating the Bubble based on
 * size and shape.
 * 
 *
 */
public class BubbleFactory {

	public Bubble createBubble(String size, String shape) {
		Bubble bubble = null;
		if (size.equalsIgnoreCase("small") && shape.equalsIgnoreCase("circle")) {
			bubble = new SmallCircleBubble();
		} else if (size.equalsIgnoreCase("small") && shape.equalsIgnoreCase("square")) {
			bubble = new SmallSquareBubble();
		} else if (size.equalsIgnoreCase("large") && shape.equalsIgnoreCase("circle")) {
			bubble = new LargeCircleBubble();
		} else if (size.equalsIgnoreCase("large") && shape.equalsIgnoreCase("square")) {
			bubble = new LargeSquareBubble();
		}

		return bubble;
	}

}
