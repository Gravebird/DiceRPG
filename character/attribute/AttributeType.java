/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character.attribute;

/**
 * An enum to represent the type of an attribute. This will be used for main
 * as well as sub attributes.
 * 
 * @author Bryan Rainbow
 */
public enum AttributeType 
{
    MIGHT, AGILITY, FOCUS,
    STRENGTH, CONSTITUTION, FORTITUDE,
    DEXTERITY, PRECISION, REFLEX,
    INTELLIGENCE, WISDOM, WILL;
    
    /**
     * Checks to see if this attribute is a main attribute or not.
     * 
     * @return true if this is a main attribute, false otherwise.
     */
    public final boolean isMainAttribute()
    {
        return this == MIGHT || this == AGILITY || this == FOCUS;
    }
    
    /**
     * Checks this attribute to see if it is a might type attribute and returns the
     * answer.
     * 
     * @return true if this attribute is might, strength, constitution, or fortitude.
     * false otherwise.
     */
    public final boolean isMightTypeAttribute()
    {
        return this == MIGHT || this == STRENGTH || this == CONSTITUTION || this == FORTITUDE;
    }
    
    /**
     * Checks this attribute to see if it is an agility type attribute and returns the answer.
     * 
     * @return true if this attribute is agility, dexterity, precision, or reflex.
     * false otherwise.
     */
    public final boolean isAgilityTypeAttribute()
    {
        return this == AGILITY || this == DEXTERITY || this == PRECISION || this == REFLEX;
    }
    
    /**
     * Checks to see if the given attribute is in the same category as this attribute
     * and returns the answer. Example: Might and Strength are the same but Dexterity
     * and Wisdom are not.
     * 
     * @param type the type of attribute to compare this to.
     * @return whether the two types are in the same category.
     */
    public final boolean isSameCategory(final AttributeType type)
    {
        return ((isMightTypeAttribute() && type.isMightTypeAttribute()) ||
                (isAgilityTypeAttribute() && type.isAgilityTypeAttribute()) ||
                (isFocusTypeAttribute() && type.isFocusTypeAttribute()));
    }
    
    /**
     * Checks this attribute to see if it is a focus type attribute and returns the answer.
     * 
     * @return true if this attribute is focus, intelligence, wisdom, or will. 
     * false otherwise.
     */
    public final boolean isFocusTypeAttribute()
    {
        return this == FOCUS || this == INTELLIGENCE || this == WISDOM || this == WILL;
    }
    
    /**
     * Retrieves a description of what this attribute does for a character.
     * This description is displayed on the display panel when the mouse is
     * hovering over the panel which shows this attribute.
     * 
     * @return A string description
     */
    public final String getDescription()
    {
        return "TEMP: " + toString();
    }
    
    /**
     * Creates a string representation of this attribute type.
     * 
     * @return a string of this attribute type.
     */
    @Override
    public final String toString()
    {
        String output = "ERROR: UNABLE TO CREATE STRING";
        
        if (null == this)
        {
            output = "Null";
        }
        else switch (this) {
            case MIGHT:
                output = "Might";
                break;
            case AGILITY:
                output = "Agility";
                break;
            case FOCUS:
                output = "Focus";
                break;
            case STRENGTH:
                output = "Strength";
                break;
            case CONSTITUTION:
                output = "Constitution";
                break;
            case FORTITUDE:
                output = "Fortitude";
                break;
            case DEXTERITY:
                output = "Dexterity";
                break;
            case PRECISION:
                output = "Precision";
                break;
            case REFLEX:
                output = "Reflex";
                break;
            case INTELLIGENCE:
                output = "Intelligence";
                break;
            case WISDOM:
                output = "Wisdom";
                break;
            case WILL:
                output = "Will";
                break;
            default:
                break;
        }
        return output;
    }
}
