/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character.attribute;

/**
 * A sub attribute is one of Strength, Constitution, Fortitude, Dexterity,
 * Precision, Reflex, Intelligence, Wisdom, or Will. These attributes can be
 * increased as the player levels up.
 * 
 * @author Bryan Rainbow
 */
public class SubAttribute extends AbstractAttribute
{
    
    /**
     * The base value of this sub-attribute
     */
    private int baseScore;
    
    /**
     * Creates a sub-attribute from the specified data.
     * 
     * @param type the type of attribute this will represent.
     * @param startingValue the starting value of this attribute. This number
     * can be changed during gameplay.
     */
    public SubAttribute(final AttributeType type, final int startingValue)
    {
        super(type);
        if (type.isMainAttribute())
        {
            System.out.println("ERROR: Tried to create a sub-attribute from"
                    + " main attribute - " + type.toString());
            System.exit(1);
        }
        baseScore = startingValue;
    }
    
    /**
     * Returns the base score of this attribute.
     * 
     * @return the base score of this attribute.
     */
    public final int getBaseScore()
    {
        return baseScore;
    }
    
    /**
     * Creates a string representation of this attribute. example: Strength: 3
     * @return a string representation of this attribute.
     */
    @Override
    public final String toString()
    {
        return attributeType + ": " + baseScore;
    }
}
