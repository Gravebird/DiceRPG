/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.character.SpellbookPanel;
import gui.character.InventoryPanel;
import gui.character.EquipmentPanel;
import gui.character.CharacterSheet;
import character.attribute.AttributeBundle;
import static dicerpg.DiceRPG.GAME_HEIGHT;
import static dicerpg.DiceRPG.GAME_WIDTH;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * A container to hold all panels in the gui and have access to each of them.
 * 
 * @author Bryan Rainbow
 */
public class MasterPanel extends JPanel
{
    /**
     * The height of the display panel (and also the entire character sheet
     * section).
     */
    public static final int DISPLAY_PANEL_HEIGHT = 760; //GAME_HEIGHT * 4 / 5;
    
    /**
     * The width of the display panel.
     */
    public static final int DISPLAY_PANEL_WIDTH = 933; //GAME_WIDTH * 2 / 3;
    
    /**
     * The height of the button panel (and also the description panel).
     */
    public static final int BUTTON_PANEL_HEIGHT = 200;//GAME_HEIGHT / 5;
    
    /**
     * The width of the tabbed panel.
     */
    public static final int TABBED_SHEET_WIDTH = 453;//GAME_WIDTH / 3;
    
    /**
     * The height of the tabbed panel.
     */
    public static final int TABBED_SHEET_HEIGHT = GAME_HEIGHT * 2 / 5;
    
    /**
     * The mouse listener for when the user is hovering over anything that
     * should update the description panel.
     */
    public static DiceRPGMouseListener MOUSE_LISTENER = new DiceRPGMouseListener();
    
    /**
     * The panel that shows all the basic information of the character.
     */
    public static final CharacterSheet characterSheet = new CharacterSheet();
    
    /**
     * The panel that shows the inventory of the character.
     */
    public static final InventoryPanel inventoryPanel = new InventoryPanel();
    
    /**
     * The panel that shows the equipped items of the character.
     */
    public static final EquipmentPanel equipmentPanel = new EquipmentPanel();
    
    /**
     * The panel that shows the spells of the character.
     */
    public static final SpellbookPanel spellbookPanel = new SpellbookPanel();
    
    /**
     * This panel displays text that describes items, monsters, or anything else
     * that needs describing.
     */
    public static final DescriptionPanel descriptionPanel = new DescriptionPanel();
    
    /**
     * This panel contains all the buttons that are used to interact with
     * the game.
     */
    public static final ButtonPanel buttonPanel = new ButtonPanel();
    
    /**
     * This panel displays, in text, all the output of the game. This is where
     * combat will take place, as well as shopping, or anything else in town,
     * etc.
     */
    public static final DisplayPanel displayPanel = new DisplayPanel();
    
    /**
     * A panel to hold other panels in an arrangement. This one controls
     * the part of the gui that shows character information and inventory, etc.
     */
    public static final JPanel characterSheetPanel = new JPanel();
    
    /**
     * A panel to hold other panels in an arrangement. This one controls
     * the elements that appear on the bottom section of the screen.
     */
    public static final JPanel bottomPanel = new JPanel();
    
    /**
     * A panel to hold other panels in an arrangement. This one controls the
     * elements that appear on the top section of the screen.
     */
    public static final JPanel topPanel = new JPanel();
    
    /**
     * This panel holds multiple other panels in a tabbed interface.
     * It holds the inventory, spellbook, and equipped items.
     */
    public static final JTabbedPane tabbedPanel = new JTabbedPane();
    
    /**
     * Constructs a MasterPanel with the default layout.
     */
    public MasterPanel()
    {
        tabbedPanel.setPreferredSize(new Dimension(TABBED_SHEET_WIDTH,TABBED_SHEET_HEIGHT));
        tabbedPanel.addTab("Inventory", inventoryPanel);
        tabbedPanel.addTab("Equipment", equipmentPanel);
        tabbedPanel.addTab("Spellbook", spellbookPanel);
        
        characterSheetPanel.setPreferredSize(new Dimension(TABBED_SHEET_WIDTH,DISPLAY_PANEL_HEIGHT));
        characterSheetPanel.setLayout(new BorderLayout());
        characterSheetPanel.add(characterSheet, BorderLayout.NORTH);
        characterSheetPanel.add(tabbedPanel, BorderLayout.EAST);
        
        bottomPanel.setPreferredSize(new Dimension(GAME_WIDTH, BUTTON_PANEL_HEIGHT));
        bottomPanel.setLayout(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(GAME_WIDTH, DISPLAY_PANEL_HEIGHT));
        topPanel.setLayout(new BorderLayout());
        
        bottomPanel.add(descriptionPanel, BorderLayout.EAST);
        bottomPanel.add(buttonPanel, BorderLayout.WEST);
        
        topPanel.add(displayPanel, BorderLayout.WEST);
        topPanel.add(characterSheetPanel, BorderLayout. EAST);
        
        displayPanel.print("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.");
        displayPanel.print("Because cats were venerated in ancient Egypt, they were commonly believed to have been domesticated there,[12] but there may have been instances of domestication as early as the Neolithic from around 9,500 years ago (7500 BC).[13] A genetic study in 2007[14] concluded that all domestic cats are descended from Near Eastern wildcats, having diverged around 8000 BC in the Middle East.[12][15] A 2016 study found that leopard cats were undergoing domestication independently in China around 5500 BC, though this line of partially domesticated cats leaves no trace in the domesticated populations of today.[16][17] A 2017 study confirmed that domestic cats are descendants of those first domesticated by farmers in the Near East around 9,000 years ago.");
    
        
        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.SOUTH);
        addMouseListener(MOUSE_LISTENER);
    }
    
    public static final void update(final AttributeBundle temp)
    {
        characterSheet.update(temp);
    }
}
