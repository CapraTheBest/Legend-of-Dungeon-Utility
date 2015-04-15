package me.belardinelli.lodPotions;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import java.awt.Color;
import java.awt.Toolkit;

public class About extends JPanel {
	
	public About() {
        JFrame f = new JFrame("About");
        f.setResizable(false);
        f.setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/resources/favicon.png")));
        JLabel label = new JLabel(new ImageIcon(About.class.getResource("/resources/rainbow_sheep.gif")));
        f.setBounds(100, 100, 593, 313);
        f.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
        		ColumnSpec.decode("200px"),
        		FormFactory.DEFAULT_COLSPEC,
        		ColumnSpec.decode("20px"),},
        	new RowSpec[] {
        		RowSpec.decode("200px"),
        		FormFactory.RELATED_GAP_ROWSPEC,
        		FormFactory.DEFAULT_ROWSPEC,
        		FormFactory.RELATED_GAP_ROWSPEC,
        		FormFactory.DEFAULT_ROWSPEC,
        		FormFactory.RELATED_GAP_ROWSPEC,
        		FormFactory.DEFAULT_ROWSPEC,
        		FormFactory.DEFAULT_ROWSPEC,}));
        f.getContentPane().add(label, "1, 1, left, center");
        
        JLabel lblProgramCreatedBy = new JLabel("<html><body>Program created by CapraTheBest <br>"
        		+ " Useful tool to remember the potions effects on Legend Of Dungeon<br>"
        		+ "Slowly adding more stuff to it<br>"
        		+ "Also cute sheep gif for your entertainment<br><br>"
        		+ "Version 0.3b (far from complete)</body></html>");
        f.getContentPane().add(lblProgramCreatedBy, "2, 1, left, center");
        
        JLabel website = new JLabel("<html><body>My Website (it's ready, but pretty ugly)</body></html>");
        website.setForeground(new Color(255, 0, 0));
        website.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try {
                            Desktop.getDesktop().browse(new URI("http://bringvictory.com/"));
                    } catch (IOException | URISyntaxException ex) {
                            //It looks like there's a problem
                    	ex.printStackTrace();
                    }
            }
        });
        
        f.getContentPane().add(website, "2, 3, left, center");
        
        JLabel wiki = new JLabel("Legend Of Dungeon Wiki");
        wiki.setForeground(new Color(255, 0, 0));
        wiki.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try {
                            Desktop.getDesktop().browse(new URI("http://legend-of-dungeon.wikia.com/wiki/Legend_of_Dungeon_Wiki"));
                    } catch (IOException | URISyntaxException ex) {
                            //It looks like there's a problem
                    	ex.printStackTrace();
                    }
            }
        });
        
        f.getContentPane().add(wiki, "2, 5");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
	}
}
