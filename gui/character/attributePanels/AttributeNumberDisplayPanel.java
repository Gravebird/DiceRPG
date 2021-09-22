/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.character.attributePanels;

import character.attribute.AttributeBundle;
import character.attribute.AttributeType;

/**
 * The small panel to the right of each attribute display panel which
 * displays the value of the attribute. Mousing over the number will show a 
 * description that explains why the attribute shows what it does.
 * Ex: 14 (base) + 2 (spell) - 1 (ability damage) = 15
 * @author Bryan
 */
public class AttributeNumberDisplayPanel extends AbstractAttributeDisplayPanel
{
    
    public AttributeNumberDisplayPanel(final AttributeType type)
    {
        super(type);
        
        attributeLabel.setText("0");
    }
    
    public void update(AttributeBundle temp)
    {
        attributeLabel.setText(Integer.toString(temp.getAbilityScore(attributeType)));
    }
    
    /**
     * Returns a description which explains why the attribute shows what it does.
     * Ex: 14 (base) + 2 (spell) - 1 (ability damage) = 15
     * @return a string description of why the attribute shows the number it does.
     */
    @Override
    public String getDescription()
    {
        return "NOT IMPLEMENTED YET";
    }
}
