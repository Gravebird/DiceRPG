/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.character.attributePanels;

import character.attribute.AttributeBundle;
import character.attribute.AttributeType;
import gui.DiceRPGMouseOverPanel;
import gui.character.AttributeDisplayPanel;
import gui.character.CharacterSheet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * An abstract class to define the size of all attribute panels.
 * 
 * @author Bryan Rainbow
 */
public abstract class AbstractAttributePanel extends JPanel
{
    public static final int MAJOR_ATTRIBUTE_DISPLAY_HEIGHT = CharacterSheet.CHARACTER_SHEET_HEIGHT / 10;
    public static final int MINOR_ATTRIBUTE_DISPLAY_HEIGHT = CharacterSheet.CHARACTER_SHEET_HEIGHT / 14;
    public static final Font MAJOR_ATTRIBUTE_DISPLAY_FONT = new Font("Serif", Font.BOLD, 30);
    public static final Font MINOR_ATTRIBUTE_DISPLAY_FONT = new Font("Serif", Font.BOLD, 20);
    
    
    /**
     * The attribute type displayed on this panel.
     */
    private final AttributeType attributeType;
    
    /**
     * The left part of an individual attribute's panel that displays the name
     * of the attribute.
     */
    private final AttributeTextDisplayPanel textPanel;
    
    /**
     * The right part of an individual attribute's panel that displays the
     * current numerical value of the attribute.
     */
    private final AttributeNumberDisplayPanel numberPanel;
    
    /**
     * Constructs an AbstractAttributePanel with a width of half the width of
     * a character sheet panel.The height of this panel is based on whether it
     * is a major attribute or not.
     * 
     * @param type the attribute type displayed on this panel.
     */
    public AbstractAttributePanel(final AttributeType type)
    {        
        attributeType = type;
        textPanel = new AttributeTextDisplayPanel(type);
        numberPanel = new AttributeNumberDisplayPanel(type);
        
        int height;
        
        if (type.isMainAttribute())
        {
            height = MAJOR_ATTRIBUTE_DISPLAY_HEIGHT;
            //setBackground(Color.WHITE);
        }
        else
        {
            height = MINOR_ATTRIBUTE_DISPLAY_HEIGHT;
            //setBackground(Color.BLACK);
        }
        
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(AttributeDisplayPanel.ATTRIBUTE_DISPLAY_WIDTH, height));
        setLayout(new BorderLayout());
        add(textPanel, BorderLayout.WEST);
        add(numberPanel, BorderLayout.EAST);
    }
    
    public void update(AttributeBundle temp)
    {
        numberPanel.update(temp);
    }
    
    public AttributeType getAttributeType()
    {
        return attributeType;
    }
}
