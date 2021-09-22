/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dicerpg.DiceRPG;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Bryan
 */
public class DisplayPanel extends AbstractMouseOverPanel
{
    /**
     * A scanner to read a string and then split it into multiple strings if
     * necessary. This needs to be instantiated each time it is needed.
     */
    private static Scanner scan;
    
    /**
     * Constant that remembers how many lines of output text we can put on the
     * gui at the most. This is based on the height of the game.
     */
    private static final int MAXIMUM_OUTPUT_LINES = MasterPanel.DISPLAY_PANEL_HEIGHT / 40;
    
    /**
     * Constant that stores how many characters can be displayed in a single line
     * of the output display.
     */
    private static final int TEXT_AREA_CHARACTER_LIMIT = MasterPanel.DISPLAY_PANEL_WIDTH / 11;
    
    /**
     * The size of the font that will be displayed in the main output display
     * panel.
     */
    private static final int FONT_SIZE = 24;
    
    /**
     * An array of panels that will each show a line of text, output from the
     * game. This could be combat logs, text in town, etc.
     */
    private static JPanel[] outputLog = new JPanel[MAXIMUM_OUTPUT_LINES];
    
    /**
     * An array of labels that will contain a line of text to be displayed on
     * one of the panels of the gui. Some information will require multiple
     * labels to fully get across.
     */
    private static JLabel[] outputText = new JLabel[MAXIMUM_OUTPUT_LINES];
    
    /**
     * Construct a DisplayPanel with a number of lines available based on the size
     * of the game window at construction
     */
    public DisplayPanel()
    {
        setPreferredSize(new Dimension(MasterPanel.DISPLAY_PANEL_WIDTH, MasterPanel.DISPLAY_PANEL_HEIGHT));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        for (int i = 0; i < outputLog.length; i++)
        {
            outputLog[i] = new JPanel();
            outputLog[i].setPreferredSize(new Dimension(MasterPanel.DISPLAY_PANEL_WIDTH, MAXIMUM_OUTPUT_LINES));
            outputLog[i].setLayout(new FlowLayout(FlowLayout.LEFT));
            outputLog[i].setBackground(new Color(0,0,0));
            
            outputText[i] = new JLabel("");
            outputText[i].setForeground(new Color(255,255,255));
            outputText[i].setFont(new Font(outputText[i].getName(), Font.PLAIN, FONT_SIZE));
            
            outputLog[i].add(outputText[i]);
            add(outputLog[i]);
        }
    }
    
    /**
     * This method will add a string to the output display, checking to make
     * sure there is enough room to display it. If there is not enough room, it
     * will break the string into several strings and recursively add them all to
     * the display area.
     * 
     * @param text the string to be displayed
     */
    public static void print(final String text)
    {
        shuffleUp();
        String textNotScanned = "";
        String textToPrint = "";
        scan = new Scanner(text);
        
        
        while(scan.hasNext()) // While there is something to scan
        {
            textNotScanned = scan.next();
            
            if ((textToPrint.length() + textNotScanned.length()) < TEXT_AREA_CHARACTER_LIMIT)
            {
                textToPrint += (textNotScanned + " ");
                textNotScanned = "";
            }
            else
            {
                if(scan.hasNext())
                {
                    textNotScanned += " " + scan.nextLine();
                }
                break;
            }
        }
        
        outputText[outputText.length - 1].setText(textToPrint);
        
        if (textNotScanned.length() > 0)
        {
            print(textNotScanned);
        }
    }
    
    /**
     * This will shuffle all the text entries up one position, deleting the
     * contents of the highest up entry. The lowest entry will be set to be
     * blank.
     */
    private static void shuffleUp()
    {
        for (int i = 0; i < outputText.length; i++)
        {
            if (i == outputText.length - 1)
            {
                outputText[i].setText("");
            }
            else
            {
                outputText[i].setText(outputText[i+1].getText());
            }
        }
    }
    
    /**
     * Clears all text from the display output section of the screen. This
     * will be used in combat to make sure there is not too much on screen, and
     * can also be used in town, etc.
     */
    public void clear()
    {
        for (int i = 0; i < outputText.length; i++)
        {
            outputText[i].setText("");
        }
    }
}
