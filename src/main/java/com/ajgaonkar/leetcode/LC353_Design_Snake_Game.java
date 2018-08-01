package com.ajgaonkar.leetcode;

public class LC353_Design_Snake_Game {
	/** Initialize your data structure here.
	 @param width - screen width
	 @param height - screen height
	 @param food - A list of food positions
	 E.g food = [[1,1], [1,0]] means the first food is positioned at [1,1], the second is at [1,0]. */
	public LC353_Design_Snake_Game(int width, int height, int[][] food) {

	}

	/** Moves the snake.
	 @param direction - 'U' = Up, 'L' = Left, 'R' = Right, 'D' = Down
	 @return The game's score after the move. Return -1 if game over.
	 Game over when snake crosses the screen boundary or bites its body. */
	public int move(String direction) {
		return 1;

	}


	/*
	Given width = 3, height = 2, and food = [[1,2],[0,1]].

	Snake snake = new Snake(width, height, food);

	Initially the snake appears at position (0,0) and the food at (1,2).

	|S| | |
	| | |F|

	snake.move("R"); -> Returns 0

	| |S| |
	| | |F|

	snake.move("D"); -> Returns 0

	| | | |
	| |S|F|

	snake.move("R"); -> Returns 1 (Snake eats the first food and right after that, the second food appears at (0,1) )

	| |F| |
	| |S|S|

	snake.move("U"); -> Returns 1

	| |F|S|
	| | |S|

	snake.move("L"); -> Returns 2 (Snake eats the second food)

	| |S|S|
	| | |S|

	snake.move("U"); -> Returns -1 (Game over because snake collides with border)
	 */
}
