/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character.attribute;

/**
 * This class acts as a contained that holds 3 main attributes. Each of those
 * 3 main attributes has 3 sub-attributes.
 * 
 * @author Bryan Rainbow
 */
public class AttributeBundle 
{
    /**
     * The three main attributes that this class contains. Each of these
     * attributes have 3 sub-attributes.
     */
    private final MainAttribute[] attributes;
    
    /**
     * Creates an attribute bundle with the given attributes.
     * 
     * @param bundle an array of MainAttributes. Must be size 3, anything else will
     * cause an error.
     */
    public AttributeBundle(final MainAttribute[] bundle)
    {
        if (bundle.length != 3)
        {
            System.out.println("ERROR: Tried to create an attribute bundle with"
                    + " the wrong amount of main attributes. Needed 3 - Given " + bundle.length);
            System.exit(1);
        }
        attributes = bundle;
    }
    
    /**
     * Searches the attributes contained in this bundle for the given type and
     * returns the attribute corresponding to that type. Will return null if it
     * cannot find the given type.
     * 
     * @param type the type of attribute to search for.
     * @return the attribute in this bundle of the chosen type.
     */
    public final AbstractAttribute getAttribute(AttributeType type)
    {
        for (int i = 0; i < attributes.length; i++)
        {
            if (attributes[i].getAttributeType().isSameCategory(type))
            {
                return attributes[i].getAttribute(type);
            }
        }
        return null;
    }
    
    /**
     * Searches the Attributes contained in this bundle for the given type and
     * returns either the base score if it is a sub-attribute, or returns the
     * calculated score if it is a main attribute.
     * 
     * @param type the type of attribute to find the score of.
     * @return the ability score of the given attribute.
     */
    public final int getAbilityScore(final AttributeType type)
    {
        for (int i = 0; i < attributes.length; i++)
        {
            if (attributes[i].getAttributeType().isSameCategory(type))
            {
                return attributes[i].getAbilityScore(type);
            }
        }
        return -1;
    }
}
