/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicerpg;
import gui.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Bryan
 */
public class DiceRPG 
{
    /**
     * The maximum height of the frame that contains the gui. 1200
     */
    public static final int GAME_HEIGHT = 1000;
    
    /**
     * The maximum width of the frame that contains the gui. 1400
     */
    public static final int GAME_WIDTH = 1400;
    
    /**
     * The frame that holds all the other elements of the gui.
     */
    public static final JFrame gameGUI = new JFrame("DiceRPG");
    
    /**
     * The panel containing all other gui elements.
     */
    public static final MasterPanel masterPanel = new MasterPanel();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        gameGUI.setResizable(false);
        gameGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameGUI.setPreferredSize(new Dimension(GAME_WIDTH,GAME_HEIGHT));
        gameGUI.setLayout(new BorderLayout());
        
        gameGUI.add(masterPanel);
        
        gameGUI.pack();
        gameGUI.setVisible(true);
    }
    
}
