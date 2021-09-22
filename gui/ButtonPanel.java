/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dicerpg.DiceRPG;
import gui.buttonPanels.*;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 */
public class ButtonPanel extends AbstractMouseOverPanel
{
    /**
     * The main screen panel that holds the buttons. These buttons will include
     * new game, load game, save location, etc.
     */
    private MainScreenButtonPanel mainScreenButtonPanel = new MainScreenButtonPanel();
    
    public ButtonPanel()
    {
        setPreferredSize(new Dimension(DiceRPG.GAME_WIDTH, MasterPanel.BUTTON_PANEL_HEIGHT));
        
        add(mainScreenButtonPanel);
        setBackground(new Color(0,0,255));
    }
}
