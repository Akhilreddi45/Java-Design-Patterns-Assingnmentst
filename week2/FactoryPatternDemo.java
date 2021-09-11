package com.factory.designpatters.assignment.week2;

/**
 *
 * This is the factory Demo of Bubble.
 * 
 *
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {

		BubbleFactory factory = new BubbleFactory();

		Bubble smallCircleBubble = factory.createBubble("small", "circle");

		smallCircleBubble.blow();

		smallCircleBubble.pop();

		Bubble smallSquareBubble = factory.createBubble("small", "square");

		smallSquareBubble.blow();

		smallSquareBubble.pop();

		Bubble largeCircleBubble = factory.createBubble("large", "circle");

		largeCircleBubble.blow();

		largeCircleBubble.pop();

		Bubble largeSquareBubble = factory.createBubble("large", "square");

		largeSquareBubble.blow();

		largeSquareBubble.pop();

	}

}
