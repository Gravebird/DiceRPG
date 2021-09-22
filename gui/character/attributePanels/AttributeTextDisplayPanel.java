/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.character.attributePanels;

import character.attribute.AttributeType;
import gui.DiceRPGMouseOverPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;

/**
 * The panel that displays the name of attributes. Example: Strength, Might,
 * Agility, etc.
 * 
 * @author Bryan
 */
public class AttributeTextDisplayPanel extends AbstractAttributeDisplayPanel
{
    /**
     * 
     * @param type 
     */
    public AttributeTextDisplayPanel(final AttributeType type)
    {
        super(type);
        
        attributeLabel.setText(type.toString());
    }
    
    @Override
    public String getDescription()
    {
        return attributeType.getDescription();
    }
}
