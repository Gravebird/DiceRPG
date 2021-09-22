/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.character;

import dicerpg.DiceRPG;
import character.attribute.AttributeBundle;
import character.attribute.AttributeType;
import gui.MasterPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 */
public class CharacterSheet extends JPanel
{
    /**
     * The width of the character sheet portion of the gui.
     */
    public static final int CHARACTER_SHEET_WIDTH = MasterPanel.TABBED_SHEET_WIDTH;
    
    /**
     * The height of the character sheet portion of the gui.
     */
    public static final int CHARACTER_SHEET_HEIGHT = MasterPanel.TABBED_SHEET_HEIGHT;
    
    /**
     * The left half of the character sheet, which contains the attributes of the
     * player character.
     */
    private final AttributeDisplayPanel attributePanel = new AttributeDisplayPanel();
    
    /**
     * The right half of the character sheet, which contains non-attribute information
     * about the character.
     */
    private final CharacterDisplayPanel characterPanel = new CharacterDisplayPanel();
    
    /**
     * Constructs the character sheet area with a height and width based on the
     * game height and width.
     */
    public CharacterSheet()
    {
        setPreferredSize(new Dimension(CHARACTER_SHEET_WIDTH,CHARACTER_SHEET_HEIGHT));
        setLayout(new BorderLayout());
        
        add(attributePanel, BorderLayout.WEST);
        add(characterPanel, BorderLayout.EAST);
    }
    
    /**
     * Causes each element on the character sheet to update to the most current
     * information.
     * @param temp DELETE THIS EVENTUALLY
     */
    public final void update(AttributeBundle temp)
    {
        attributePanel.update(temp);
    }
}
