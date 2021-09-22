/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character.attribute;

import utilities.Dice;

/**
 * This class handles all random generation of Attribute Bundles. This is true
 * for NPCs, monsters, as well as the player character.
 * 
 * @author Bryan Rainbow
 */
public class AttributeFactory 
{
    /**
     * Creates an attribute bundle for a player character to use. Each sub-attribute
     * will be generated between 1 and 4. This method should be used when the player
     * wants to create a new character.
     * 
     * @return An attribute bundle for a player character.
     */
    public static final AttributeBundle createAttributeBundleForPlayer()
    {
        AttributeBundle finishedBundle;
        
        do
        {
            SubAttribute mightSubStats[] = new SubAttribute[3];
            mightSubStats[0] = new SubAttribute(AttributeType.STRENGTH, Dice.d4());
            mightSubStats[1] = new SubAttribute(AttributeType.CONSTITUTION, Dice.d4());
            mightSubStats[2] = new SubAttribute(AttributeType.FORTITUDE, Dice.d4());
        
            SubAttribute agilitySubStats[] = new SubAttribute[3];
            agilitySubStats[0] = new SubAttribute(AttributeType.DEXTERITY, Dice.d4());
            agilitySubStats[1] = new SubAttribute(AttributeType.PRECISION, Dice.d4());
            agilitySubStats[2] = new SubAttribute(AttributeType.REFLEX, Dice.d4());
        
            SubAttribute focusSubStats[] = new SubAttribute[3];
            focusSubStats[0] = new SubAttribute(AttributeType.INTELLIGENCE, Dice.d4());
            focusSubStats[1] = new SubAttribute(AttributeType.WISDOM, Dice.d4());
            focusSubStats[2] = new SubAttribute(AttributeType.WILL, Dice.d4());
        
            MainAttribute bundle[] = new MainAttribute[3];
            bundle[0] = new MainAttribute(AttributeType.MIGHT, mightSubStats);
            bundle[1] = new MainAttribute(AttributeType.AGILITY, agilitySubStats);
            bundle[2] = new MainAttribute(AttributeType.FOCUS, focusSubStats);
            
            finishedBundle = new AttributeBundle(bundle);
        }
        while (finishedBundle.getAbilityScore(AttributeType.MIGHT) < 1 &&
                finishedBundle.getAbilityScore(AttributeType.AGILITY) < 1 &&
                finishedBundle.getAbilityScore(AttributeType.FOCUS) < 1);
        
        return finishedBundle;
    }
}
