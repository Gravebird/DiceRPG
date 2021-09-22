/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.character;

import gui.AbstractMouseOverPanel;
import gui.MasterPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 */
public class EquipmentPanel extends AbstractMouseOverPanel
{
    public EquipmentPanel()
    {
        setBackground(new Color(125,125,0));
        
        setPreferredSize(new Dimension(MasterPanel.TABBED_SHEET_WIDTH, MasterPanel.TABBED_SHEET_HEIGHT));
    }
}
