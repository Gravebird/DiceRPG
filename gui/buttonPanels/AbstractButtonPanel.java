/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.buttonPanels;

import dicerpg.DiceRPG;
import gui.AbstractMouseOverPanel;
import gui.MasterPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 */
public abstract class AbstractButtonPanel extends AbstractMouseOverPanel
{
    /**
     * Construct an AbstractButtonPanel with a specific size and color.
     */
    protected AbstractButtonPanel()
    {
        setPreferredSize(new Dimension(MasterPanel.DISPLAY_PANEL_WIDTH, MasterPanel.BUTTON_PANEL_HEIGHT));
        setBackground(new Color(0,0,255));
        setLayout(new FlowLayout(FlowLayout.LEFT));
    }
}
