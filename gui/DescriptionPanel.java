/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dicerpg.DiceRPG;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * A panel which contains a text description of various things the mouse might
 * hover over.
 * 
 * @author Bryan Rainbow
 */
public class DescriptionPanel extends AbstractMouseOverPanel
{
    
    /**
     * The label on the gui, which is the description.
     */
    private final JLabel description;
    
    /**
     * Construct a new DescriptionPanel with the default settings.
     */
    public DescriptionPanel()
    {
        setPreferredSize(new Dimension(MasterPanel.TABBED_SHEET_WIDTH, MasterPanel.BUTTON_PANEL_HEIGHT));
        
        setBackground(new Color(255,255,255));
        
        description = new JLabel("test");
        add(description);
    }
    
    /**
     * Updates the description that is being displayed in the description panel.
     * @param content the new description
     */
    public void updateDescription(final String content)
    {
        description.setText(content);
    }
    
    /**
     * Clears any description from the description panel so that no text is
     * showing.
     */
    public void clearDescription()
    {
        description.setText("");
    }
}
