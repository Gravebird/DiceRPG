/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.character.attributePanels;

import character.attribute.AttributeType;
import gui.DiceRPGMouseOverPanel;
import gui.character.AttributeDisplayPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Bryan
 */
public abstract class AbstractAttributeDisplayPanel extends DiceRPGMouseOverPanel
{    
    /*
     * The next four integers are used to create the background color of each display
     * panel. Ex. 200,100,100 for a primary red background.
     */
    public static final int MAJOR_ATTRIBUTE_PRIMARY_COLOR = 225;
    public static final int MAJOR_ATTRIBUTE_SECONDARY_COLOR = 125;
    public static final int MINOR_ATTRIBUTE_PRIMARY_COLOR = 255;
    public static final int MINOR_ATTRIBUTE_SECONDARY_COLOR = 180;
    
    /**
     * The attribute that is displayed on this panel.
     */
    protected final AttributeType attributeType;
    
    /**
     * A label for the name of the attribute on this panel.
     */
    protected final JLabel attributeLabel = new JLabel("", SwingConstants.CENTER);
    
    public AbstractAttributeDisplayPanel(final AttributeType type)
    {
        attributeType = type;
        
        int height;
        int width = AttributeDisplayPanel.ATTRIBUTE_DISPLAY_WIDTH;
        
        if (type.isMainAttribute())
        {
            height = AbstractAttributePanel.MAJOR_ATTRIBUTE_DISPLAY_HEIGHT;
            attributeLabel.setFont(AbstractAttributePanel.MAJOR_ATTRIBUTE_DISPLAY_FONT);
        }
        else
        {
            height = AbstractAttributePanel.MINOR_ATTRIBUTE_DISPLAY_HEIGHT;
            attributeLabel.setFont(AbstractAttributePanel.MINOR_ATTRIBUTE_DISPLAY_FONT);
        }
        
        if (this instanceof AttributeNumberDisplayPanel)
        {
            width = width / 4;
        }
        else
        {
            width = width * 3 / 4;
        }
        
        setPreferredSize(new Dimension(width, height));
        setBackgroundColour();
        add(attributeLabel);
    }
    
    /**
     * Sets the background colour of this panel based on whether it is a major or
     * minor attribute, as well as if it is might, agility, or focus type.
     */
    private void setBackgroundColour()
    {
        if (attributeType.isMainAttribute())
        {
            if (attributeType.isMightTypeAttribute())
            {
                setBackground(new Color(MAJOR_ATTRIBUTE_PRIMARY_COLOR, MAJOR_ATTRIBUTE_SECONDARY_COLOR, MAJOR_ATTRIBUTE_SECONDARY_COLOR));
            }
            else if (attributeType.isAgilityTypeAttribute())
            {
                setBackground(new Color(MAJOR_ATTRIBUTE_SECONDARY_COLOR, MAJOR_ATTRIBUTE_PRIMARY_COLOR, MAJOR_ATTRIBUTE_SECONDARY_COLOR));
            }
            else if (attributeType.isFocusTypeAttribute())
            {
                setBackground(new Color(MAJOR_ATTRIBUTE_SECONDARY_COLOR, MAJOR_ATTRIBUTE_SECONDARY_COLOR, MAJOR_ATTRIBUTE_PRIMARY_COLOR));
            }
            else
            {
                /* This code should never be reached */
                setBackground(new Color(255,0,255));
                System.out.println("ERROR: ATTRIBUTE TYPE IS NULL");
            }
        }
        else
        {
            if (attributeType.isMightTypeAttribute())
            {
                setBackground(new Color(MINOR_ATTRIBUTE_PRIMARY_COLOR, MINOR_ATTRIBUTE_SECONDARY_COLOR, MINOR_ATTRIBUTE_SECONDARY_COLOR));
            }
            else if (attributeType.isAgilityTypeAttribute())
            {
                setBackground(new Color(MINOR_ATTRIBUTE_SECONDARY_COLOR, MINOR_ATTRIBUTE_PRIMARY_COLOR, MINOR_ATTRIBUTE_SECONDARY_COLOR));
            }
            else if (attributeType.isFocusTypeAttribute())
            {
                setBackground(new Color(MINOR_ATTRIBUTE_SECONDARY_COLOR, MINOR_ATTRIBUTE_SECONDARY_COLOR, MINOR_ATTRIBUTE_PRIMARY_COLOR));
            }
            else
            {
                /* This code should never be reached */
                setBackground(new Color(255,0,255));
                System.out.println("ERROR: ATTRIBUTE TYPE IS NULL");
            }
        }
    }
}
