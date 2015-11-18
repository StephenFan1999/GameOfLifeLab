Introduction

The goal of this lab is to apply your understanding of decision and loop
	structures to implement a complex algorithm within the context of an
	unfamiliar and significant software framework (GridWorld). In addition,
	you will implement a unit test for your program using the JUnit framework
	and create documentation for your program using JavaDoc.


Requirements

Write a program that plays Conway’s Game of Life. Conway’s Game of Life is a
	cellular automaton. From Wikipedia:

The universe of the Game of Life is an infinite two-dimensional orthogonal
	grid of square cells, each of which is in one of two possible states,
	alive or dead. Every cell interacts with its eight neighbours, which are
	the cells that are horizontally, vertically, or diagonally adjacent. At
	each step in time, the following transitions occur:

* Any live cell with fewer than two live neighbours dies, as if caused by
	underpopulation.
* Any live cell with two or three live neighbours lives on to the next generation.
* Any live cell with more than three live neighbours dies, as if by overcrowding.
* Any dead cell with exactly three live neighbours becomes a live cell, as if
	by reproduction.
* The initial pattern constitutes the seed of the system. The first
	generation is created by applying the above rules simultaneously to every
	cell in the seed—births and deaths occur simultaneously, and the discrete
	moment at which this happens is sometimes called a tick (in other words,
	each generation is a pure function of the preceding one). The rules
	continue to be applied repeatedly to create further generations.


Nonfunctional Requirements:

* the program must be implemented in Java and utilize the GridWorld platform
* I recommend not use GridWorld’s execution engine to produce subsequent
	generations. It will be easier to implement the unit test if you directly
	produce and display subsequent generations.

Additional Requirements:

* The grid must be a 5x5 grid
* Live cells look like gray rocks
* Dead cells are not shown
* The initial pattern displayed is a half of a square shape, or a sideways L kind of shape
* There is only one pattern available (the one coded in)
* The game runs forever, until it is closed by the user
* The pattern is chosen in the code
* There is no time interval between generations
* The code programmed in does not go past the edge of the grid, so it should not wrap around


Artifacts to Produce:

* Requirements Document: Many functional and nonfunctional requirements needs
	to be defined. You must define additional requirements that are
	reasonable and document them in a requirements document. I must review
	your requirements document before you start the design document or test
	plan. You may change the requirements document throughout development.
* Design Document: You must do some design activity before starting
	implementation. This may consist of a flow cart, pseudocode, or other
	design artifact. I must review your design document before you start
	implementing code. You may change your design document throughout
	development.
* Test Plan: You must create a test plan with specific test cases (at least
	two) before starting implementation. I must review your test plan before
	you start implementing your test class. You may change your test plan
	throughout development. The provided code in GitHub is an example of
	implementing an initial test case.
* GameOfLifeTest Test Class: JUnit-compatible test class that implements the
	test plan.
* GameOfLife class: You must produce a working class the meets the
	requirements and is verified and validated by your test plan.
* Reflection Document: This is a significant and challenging lab. Please
	reflect on this experience and share your feedback with me. What did you
	like or dislike and why? What was surprising or unexpected? What did you
	learn? What questions do you still have? What advice would you offer next
	year's students?

Design:

* Iterate through nested for loops to produce the 5x5 grid (one for loop produces rows, one columns)
* Turn grid coordinates into locations (grid cannot accept ints)
* Find the number of adjacent neighbors using method getOccupiedAdjacentLocations().size()
* Implement Rules of Game of Life (add rocks to second grid, replace first grid)
	*Is the location alive?
		*Yes: Continue to next block
		*No: Does this dead location have 3 neighbors?
			*Yes: place rock onto second grid
			*No: do nothing
	*Does the location have exactly 2 or 3 neigbors?
		*Yes: place rock onto second grid
		*No: do nothing

Reflection: I liked that we were making a game, because I think making things that are fun is much more
cool than simply making a calculation program or something of the sort. I disliked that we
had to use an unfamiliar platform (although that was sort of the point of this lab) because
I don't like having to research stuff by myself. I learned how to use gridworld and implement
its objects and methods in a java program. I was able to meet the requirements for this lab,
but I am still curious as to how I could make my program better and have more features
I would tell next year's students to get an early start on this lab, so that they don't fall behind,
and to map out each generation of their test generation so that it is easy to see why they have an error
if they get one.
Submission:

* Ensure the following artifacts have been committed to GitHub in addition to your code:
    * requirements document
    * design document (pseudocode, flow charts, etc.)
    * test plan (with specific test cases)
    * HTML documentation generated by JavaDoc
    * reflection document
* Submit a pull request in GitHub and submit a link to the request with this assignment.