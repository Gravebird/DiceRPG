/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.character.AttributeDisplayPanel;
import gui.character.CharacterDisplayPanel;
import gui.character.CharacterSheet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 */
public class DiceRPGMouseListener implements MouseListener
{
    @Override
    public void mouseExited(MouseEvent e) 
    {
        MasterPanel.descriptionPanel.clearDescription();
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        Object source = e.getSource();
        
        if (source instanceof DiceRPGMouseOverPanel)
        {
            MasterPanel.descriptionPanel.updateDescription(((DiceRPGMouseOverPanel) source).getDescription());
        }
    }
    
}
