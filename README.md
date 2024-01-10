# Snakes and Ladders Game

## Overview
This Snakes and Ladders game is a simple, text-based Java application. It simulates the classic board game where players move their pieces based on dice rolls, climbing ladders, and sliding down snakes.

## How to Play
The game is played on a 10x10 board with specific positions marked as the base of ladders or the head of snakes.
Each player rolls a dice in turn and moves forward by the number shown on the dice.
If a player lands at the base of a ladder, they move up to the top of the ladder.
If a player lands on the head of a snake, they slide down to the tail of the snake.
The first player to reach the 100th position on the board wins the game.

## Features
- Supports multiple players.
- Randomized dice rolls.
- Simple command-line interface.
- Ladders and snakes that change player positions.

## Requirements
Java 8 or higher.

## Setup and Execution
Clone the repository or download the source code.
Compile the Java files:

```bash
javac LadderAndSnake.java
javac Main.java
