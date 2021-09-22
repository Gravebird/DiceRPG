/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character.attribute;

/**
 *
 * @author Bryan
 */
public abstract class AbstractAttribute 
{
    /**
     * The type of attribute represented by this class.
     */
    protected final AttributeType attributeType;
    
    /**
     * Constructs an AbstractAttribute with the specified type.
     * @param type the type of attribute to create.
     */
    public AbstractAttribute(final AttributeType type)
    {
        attributeType = type;
    }
    
    /**
     * Returns the type of attribute represented by this class.
     * @return the type of this attribute.
     */
    public final AttributeType getAttributeType()
    {
        return attributeType;
    }
    
    @Override
    public abstract String toString();
}
