/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character.attribute;

/**
 * A main attribute contains 3 sub-attributes and calculates its own value
 * based off of these sub-attributes.
 * 
 * @author Bryan Rainbow
 */
public class MainAttribute extends AbstractAttribute
{
    
    /**
     * An array of 3 sub-attributes that will be "part of" the main attribute.
     * The 3 slots should all be instantiated during construction.
     */
    private SubAttribute[] subAttributes = new SubAttribute[3];
    
    /**
     * Creates a MainAttribute with the specified information.
     * 
     * @param type the type of attribute that this represents. Should be one of Might,
     * Agility, or Focus.
     * @param subStats The 3 subAttributes that this main attribute is based off of.
     * Will cause an error if there are not enough or too many.
     */
    public MainAttribute(final AttributeType type, final SubAttribute[] subStats)
    {
        super(type);
        if (subStats.length != 3)
        {
            System.out.println("ERROR: Tried to create a MainAttribute by supplying"
                    + " an incorrect amount of substats. Needed: 3, Given: " + subStats.length);
            System.exit(1);
        }
        for (int i = 0; i < subStats.length; i++)
        {
            if (subStats[i] == null)
            {
                System.out.println("ERROR: Tried to create a MainAttribute by supplying"
                        + " a null subStat. Index of null subStat: " + i);
                System.exit(1);
            }
        }
        subAttributes = subStats;
    }
    
    /**
     * Adds up the base scores of each of the 3 subAttributes of this mainAttribute,
     * then divides it by 10 and returns the result.
     * 
     * @return the score of this mainAttribute.
     */
    public final int calculateMainAttributeValue()
    {
        int total = 0;
        
        for (int i = 0; i < subAttributes.length; i++)
        {
            total += subAttributes[i].getBaseScore();
        }
        
        return total / 10;
    }
    
    /**
     * Finds the ability score corresponding to the given type and returns it.
     * 
     * @param type the attribute type for the score being searched for.
     * @return the base score of the given attribute type. Returns -1 if it cannot
     * find the given attribute type among this attributes sub-attributes.
     */
    public final int getAbilityScore(final AttributeType type)
    {
        if (attributeType == type)
        {
            return calculateMainAttributeValue();
        }
        else
        {
            for (int i = 0; i < subAttributes.length; i++)
            {
                if (subAttributes[i].getAttributeType() == type)
                {
                    return subAttributes[i].getBaseScore();
                }
            }
        }
        return -1;
    }
    
    /**
     * Finds the attribute corresponding to the given type and returns it.
     * 
     * @param type the attribute type to search for.
     * @return the attribute corresponding to the given type.
     */
    public final AbstractAttribute getAttribute(final AttributeType type)
    {
        if (attributeType == type)
        {
            return this;
        }
        else
        {
            for (int i = 0; i < subAttributes.length; i++)
            {
                if (subAttributes[i].getAttributeType() == type)
                {
                    return subAttributes[i];
                }
            }
        }
        System.out.println("ERROR: Unable to find attribute of type: " + type + " in category: " + attributeType);
        System.exit(1);
        
        return null;
    }
    
    /**
     * Creates a string representation of this attribute. Example Might: 1
     * @return a string representation of this attribute.
     */
    @Override
    public final String toString()
    {
        return attributeType + ": " + calculateMainAttributeValue();
    }
}
