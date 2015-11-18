import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 5;
    private final int COLS = 5;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid1 = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid1)
        {
            public void step(){
                createNextGeneration();
            }
        };
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int column1 = 2, row1 = 2;
        final int column2 = 2, row2 = 3;
        final int column3 = 2, row3 = 4;
        final int column4 = 3, row4 = 2;
        final int column5 = 4, row5 = 2;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid1 = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(row1, column1);
        grid1.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(row2, column2);
        grid1.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(row3, column3);
        grid1.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(row4, column4);
        grid1.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(row5, column5);
        grid1.put(loc5, rock5);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    protected void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid1 = world.getGrid();
        BoundedGrid<Actor> grid2 = new BoundedGrid<Actor>(ROWS, COLS);
        
        // insert magic here...
        for (int x = 0; x < ROWS; x++) {
            for (int y = 0; y < COLS; y++){
                Location location = new Location(x,y);
                int neighborSize = grid1.getOccupiedAdjacentLocations(location).size();
                if(grid1.get(location) != null)
                {
                    if (neighborSize == 2 || neighborSize == 3)
                    {
                        grid2.put(location, new Rock());
                    }
                }
                else
                {
                    if (neighborSize == 3)
                    {
                        grid2.put(location, new Rock());
                    }
                }
            }
        }
        world.setGrid(grid2);
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
    }

}
