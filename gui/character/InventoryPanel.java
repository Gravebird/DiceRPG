/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.character;

import static dicerpg.DiceRPG.GAME_HEIGHT;
import static dicerpg.DiceRPG.GAME_WIDTH;
import gui.AbstractMouseOverPanel;
import gui.MasterPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Bryan
 */
public class InventoryPanel extends AbstractMouseOverPanel
{
    /**
     * A scrollable display that will show the contents of the player's
     * inventory.
     */
    private final JScrollPane inventoryDisplay = new JScrollPane();
    
    /**
     * A small section of the inventory that is dedicated to displaying how
     * much gold the player has.
     */
    private final JPanel goldDisplay = new JPanel();
    
    public InventoryPanel()
    {
        setBackground(new Color(0,255,0));
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(MasterPanel.TABBED_SHEET_WIDTH, MasterPanel.TABBED_SHEET_HEIGHT));
        
        inventoryDisplay.setPreferredSize(new Dimension(GAME_WIDTH / 3,GAME_HEIGHT / 4));
        inventoryDisplay.setBackground(new Color(255,255,0));
        
        goldDisplay.setPreferredSize(new Dimension(GAME_WIDTH / 3,GAME_HEIGHT / 16));
        goldDisplay.setBackground(new Color(255,0,255));
        
        add(inventoryDisplay, BorderLayout.NORTH);
        add(goldDisplay, BorderLayout.SOUTH);
    }
}
