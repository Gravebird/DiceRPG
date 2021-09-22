/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.util.Random;

/**
 * Provides a series of random number generation methods to simulate rolling
 * a dice.
 * 
 * @author Bryan Rainbow
 */
public class Dice 
{
    /**
     * The random generator that is used in this class. All dice rolling
     * will be done through it.
     */
    private static final Random DICE = new Random();
    
    /**
     * Returns a random number between 1 and 3.
     * 
     * @return a random number between 1 and 3.
     */
    public static final int d3()
    {
        return 1 + DICE.nextInt(3);
    }
    
    /**
     * Returns a random number between 1 and 4.
     * 
     * @return a random number between 1 and 4.
     */
    public static final int d4()
    {
        return 1 + DICE.nextInt(4);
    }
    
    /**
     * Returns a random number between 1 and 6.
     * 
     * @return a random number between 1 and 6. 
     */
    public static final int d6()
    {
        return 1 + DICE.nextInt(6);
    }
    
    /**
     * Returns a random number between 1 and 8.
     * 
     * @return a random number between 1 and 8.
     */
    public static final int d8()
    {
        return 1 + DICE.nextInt(8);
    }
    
    /**
     * Returns a random number between 1 and 10.
     * 
     * @return a random number between 1 and 10.
     */
    public static final int d10()
    {
        return 1 + DICE.nextInt(10);
    }
    
    /**
     * Returns a random number between 1 and 12.
     * 
     * @return a random number between 1 and 12.
     */
    public static final int d12()
    {
        return 1 + DICE.nextInt(12);
    }
    
    /**
     * Returns a random number between 1 and 20.
     * 
     * @return a random number between 1 and 20.
     */
    public static final int d20()
    {
        return 1 + DICE.nextInt(20);
    }
    
    /**
     * Returns a random number between 1 and the specified number.If the
     * specified number is less than 0 or greater than 100 it will return 0
     * instead.
     * 
     * @param X the upper limit of the number to randomly generate. It should
     * be between 1 and 100.
     * @return a random number between 1 and X, or it will return 0.
     */
    public static final int dX(final int X)
    {
        if (X < 1 || X > 100)
        {
            return 0;
        }
        return 1 + DICE.nextInt(X);
    }
}
