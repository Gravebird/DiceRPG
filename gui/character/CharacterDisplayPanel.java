/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.character;

import gui.AbstractMouseOverPanel;
import static gui.character.CharacterSheet.CHARACTER_SHEET_HEIGHT;
import static gui.character.CharacterSheet.CHARACTER_SHEET_WIDTH;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 * The right half of a character sheet which displays the non-attribute traits
 * of the character. Examples include defenses, hit points, etc.
 * @author Bryan
 */
public class CharacterDisplayPanel extends AbstractMouseOverPanel
{
    /**
     * The width required for this panel.
     */
    public static final int CHARACTER_DISPLAY_WIDTH = CHARACTER_SHEET_WIDTH / 2;
    
    public CharacterDisplayPanel()
    {
        setPreferredSize(new Dimension(CHARACTER_DISPLAY_WIDTH, CHARACTER_SHEET_HEIGHT));
        
        setBackground(new Color(150, 0, 150));
    }
}
