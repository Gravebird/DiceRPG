/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.buttonPanels;

import character.attribute.AttributeBundle;
import character.attribute.AttributeFactory;
import dicerpg.DiceRPG;
import gui.DisplayPanel;
import gui.MasterPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Bryan
 */
public class MainScreenButtonPanel extends AbstractButtonPanel
{
    /**
     * A button that will start a new game when clicked. This will take the player
     * through character creation.
     */
    private final JButton startNewGameButton = new JButton("New Game");
    
    /**
     * A button that will prompt the player for the name of their character, and
     * will then recreate it from a file.
     */
    private final JButton loadGameButton = new JButton("Continue Game");
    
    /**
     * A button that will allow the player to choose where it will be saving and
     * loading characters. This will allow entirely separate save-worlds to
     * exist since characters that have been saved but not picked can appear
     * in another characters game.
     */
    private final JButton saveLocationButton = new JButton("Change save location");
    
    /**
     * The listener that will react if a button is clicked on this screen.
     */
    private final ButtonListener buttonListener = new ButtonListener();
    
    /**
     * Construct the main screen button panel
     */
    public MainScreenButtonPanel()
    {
        startNewGameButton.addActionListener(buttonListener);
        loadGameButton.addActionListener(buttonListener);
        saveLocationButton.addActionListener(buttonListener);
        
        add(startNewGameButton);
        add(loadGameButton);
        add(saveLocationButton);
    }
    
    /**
     * A listener to handle the buttons on this panel.
     */
    private class ButtonListener implements ActionListener
    {
        /**
         * Either starts a new game, loads a game, or triggers another feature of
         * this panel.
         * 
         * @param e the event that triggered this method to be called.
         */
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if (e.getSource().equals(startNewGameButton))
            {
                AttributeBundle test = AttributeFactory.createAttributeBundleForPlayer();
                System.out.println();
                MasterPanel.update(test);
            }
            else if (e.getSource().equals(loadGameButton))
            {
                MasterPanel.displayPanel.print("Load Game");
            }
            else if (e.getSource().equals(saveLocationButton))
            {
                MasterPanel.displayPanel.print("Change save location");
            }
        }
        
    }
}
