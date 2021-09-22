/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.character;


import character.attribute.AttributeBundle;
import gui.AbstractMouseOverPanel;
import static gui.character.CharacterSheet.CHARACTER_SHEET_HEIGHT;
import static gui.character.CharacterSheet.CHARACTER_SHEET_WIDTH;
import gui.character.attributePanels.*;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;

/**
 * The left half of the character sheet panel, which displays the attributes of
 * the player character.
 * 
 * @author Bryan Rainbow
 */
public class AttributeDisplayPanel extends AbstractMouseOverPanel
{
    /**
     * The width required for this panel.
     */
    public static final int ATTRIBUTE_DISPLAY_WIDTH = CHARACTER_SHEET_WIDTH / 2;
    
    private final AbstractAttributePanel attributePanels[] = new AbstractAttributePanel[12];
    
    public AttributeDisplayPanel()
    {
        setPreferredSize(new Dimension(ATTRIBUTE_DISPLAY_WIDTH,CHARACTER_SHEET_HEIGHT));
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        
        attributePanels[0] = new AttributeMightPanel();
        attributePanels[1] = new AttributeStrengthPanel();
        attributePanels[2] = new AttributeConstitutionPanel();
        attributePanels[3] = new AttributeFortitudePanel();
        
        attributePanels[4] = new AttributeAgilityPanel();
        attributePanels[5] = new AttributeDexterityPanel();
        attributePanels[6] = new AttributePrecisionPanel();
        attributePanels[7] = new AttributeReflexPanel();
        
        attributePanels[8] = new AttributeFocusPanel();
        attributePanels[9] = new AttributeIntelligencePanel();
        attributePanels[10] = new AttributeWisdomPanel();
        attributePanels[11] = new AttributeWillPanel();
        
        for (AbstractAttributePanel attributePanel : attributePanels) 
        {
            add(attributePanel);
        }
    }
    
    public void update(AttributeBundle temp)
    {
        for (AbstractAttributePanel attributePanel : attributePanels) 
        {
            attributePanel.update(temp);
        }
    }
}
