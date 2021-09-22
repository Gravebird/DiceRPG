/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JPanel;

/**
 * An abstract class to contain all traits shared by all panels in this game.
 * This ensures that all panels created have been assigned the same mouse listener.
 * 
 * @author Bryan
 */
public abstract class AbstractMouseOverPanel extends JPanel
{
    public AbstractMouseOverPanel()
    {
        addMouseListener(MasterPanel.MOUSE_LISTENER);
    }
}
