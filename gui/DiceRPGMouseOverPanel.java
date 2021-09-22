/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JPanel;

/**
 * An abstract class to represent any panel that should cause the description
 * panel to update when the mouse is over it. Example: Most elements on the
 * character sheet should have a description explaining how they work.
 * 
 * @author Bryan Rainbow
 */
public abstract class DiceRPGMouseOverPanel extends AbstractMouseOverPanel
{
    
    /**
     * Gets the description explaining what the element in this panel is/does.
     * 
     * @return a String (description)
     */
    public abstract String getDescription();
}
