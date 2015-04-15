package me.belardinelli.lodPotions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;

import javax.swing.ImageIcon;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Hats extends JPanel {
	
	private JPanel Page_1;
	private JPanel Page_2;
	private JPanel buttons;
	
	public Hats() {
		JFrame hats = new JFrame("Special Hats");
        hats.setResizable(false);
        hats.setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/resources/favicon.png")));
        hats.setBounds(100, 100, 357, 373);
        Border b_name = BorderFactory.createTitledBorder("Hat Name");
        Border b_desc = BorderFactory.createTitledBorder("Hat Description");
        Border b_image = BorderFactory.createTitledBorder("Hat Image");
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{75, 0};
        gridBagLayout.rowHeights = new int[]{342, 0, 0};
        gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
        hats.getContentPane().setLayout(gridBagLayout);
        
        Page_1 = new JPanel();
        GridBagConstraints gbc_Page_1 = new GridBagConstraints();
        gbc_Page_1.insets = new Insets(0, 0, 5, 0);
        gbc_Page_1.fill = GridBagConstraints.BOTH;
        gbc_Page_1.gridx = 0;
        gbc_Page_1.gridy = 0;
        hats.getContentPane().add(Page_1, gbc_Page_1);
        Page_1.setLayout(new GridLayout(0, 3, 0, 0));
        
        JPanel khat_n = new JPanel();
        Page_1.add(khat_n);
        khat_n.setBorder(b_name);
        khat_n.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JLabel lblKhat_N = new JLabel("Pharaoh's Khat");
        khat_n.add(lblKhat_N);
        
        JPanel khat_d = new JPanel();
        Page_1.add(khat_d);
        khat_d.setBorder(b_desc);
        
        JLabel lblKhat_D = new JLabel("Can be used to tame a Mummy.");
        khat_d.add(lblKhat_D);
        
        JPanel khat_i = new JPanel();
        Page_1.add(khat_i);
        khat_i.setBorder(b_image);
        
        JLabel lblKhat_I = new JLabel("");
        khat_i.add(lblKhat_I);
        lblKhat_I.setIcon(new ImageIcon(Hats.class.getResource("/resources/Pharaohs_Khat.png")));
        
        JPanel wolf_n = new JPanel();
        Page_1.add(wolf_n);
        wolf_n.setBorder(b_name);
        
        JLabel lblWolf_N = new JLabel("Wolf Mask");
        wolf_n.add(lblWolf_N);
        
        JPanel wolf_d = new JPanel();
        Page_1.add(wolf_d);
        wolf_d.setBorder(b_desc);
        
        JLabel lblWolf_D = new JLabel("<html><div>So, you like to howl at the moon?<br>"
        		+ "now you can do it properly<br>"
        		+ "with the wolf mask,<br>"
        		+ "since it will cover your face<br>"
        		+ "people will not know it is you.<br>"
        		+ "Also you can tame wolfs<br>"
        		+ "without being attacked.</dvi></html>");
        wolf_d.add(lblWolf_D);
        
        JPanel wolf_i = new JPanel();
        Page_1.add(wolf_i);
        wolf_i.setBorder(b_image);
        
        JLabel lblWolf_I = new JLabel("");
        lblWolf_I.setIcon(new ImageIcon(Hats.class.getResource("/resources/Wolf_Mask.png")));
        wolf_i.add(lblWolf_I);
        
        Page_2 = new JPanel();
        GridBagConstraints gbc_Page_2 = new GridBagConstraints();
        gbc_Page_2.insets = new Insets(0, 0, 5, 0);
        gbc_Page_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_Page_2.gridx = 0;
        gbc_Page_2.gridy = 0;
        hats.getContentPane().add(Page_2, gbc_Page_2);
        Page_2.setLayout(new GridLayout(0, 3, 0, 0));
        
        JPanel magnet_n = new JPanel();
        Page_2.add(magnet_n);
        magnet_n.setBorder(b_name);
        magnet_n.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JLabel lblMagnet_N = new JLabel("Magnet Hat");
        magnet_n.add(lblMagnet_N);
        
        JPanel magnet_d = new JPanel();
        Page_2.add(magnet_d);
        magnet_d.setBorder(b_desc);
        
        JLabel lblMagnet_D = new JLabel("<html><div>"
        		+ "It's a large and powerful magnet,<br>"
        		+ "and can draw all items in the room towards you.<br>"
        		+ "Beware: items may fall in lava<br>"
        		+ "thus becoming hard to pickup.<br>"
        		+ "Look out before using the Magnet,<br>"
        		+ "or use the Magnet in your hand upon need.</div></html>");
        magnet_d.add(lblMagnet_D);
        
        JPanel magnet_i = new JPanel();
        Page_2.add(magnet_i);
        magnet_i.setBorder(b_image);
        
        JLabel lblMagnet_I = new JLabel("");
        lblMagnet_I.setIcon(new ImageIcon(Hats.class.getResource("/resources/Magnet_Hat.png")));
        magnet_i.add(lblMagnet_I);
        
        JPanel party_n = new JPanel();
        Page_2.add(party_n);
        party_n.setBorder(b_name);
        
        JLabel lblParty_N = new JLabel("Party Hat");
        party_n.add(lblParty_N);
        
        JPanel party_d = new JPanel();
        Page_2.add(party_d);
        party_d.setBorder(b_desc);
        
        JLabel lblParty_D = new JLabel("<html><div>"
        		+ "Celebrate the fun with this party hat.<br>"
        		+ "Confetti swirls out of it,<br>"
        		+ "surrounding you with sparkle.<br>"
        		+ "Can even brighten up a dark room!</div></html>");
        party_d.add(lblParty_D);
        
        JPanel party_i = new JPanel();
        Page_2.add(party_i);
        party_i.setBorder(b_image);
        
        JLabel lblParty_I = new JLabel("");
        lblParty_I.setIcon(new ImageIcon(Hats.class.getResource("/resources/Party_Hat.png")));
        party_i.add(lblParty_I);
        
        buttons = new JPanel();
        GridBagConstraints gbc_buttons = new GridBagConstraints();
        gbc_buttons.fill = GridBagConstraints.BOTH;
        gbc_buttons.gridx = 0;
        gbc_buttons.gridy = 1;
        hats.getContentPane().add(buttons, gbc_buttons);
        buttons.setLayout(new BorderLayout(0, 0));
        
        JLabel lblNewLabel = new JLabel("Page METTIMI DINAMICO :DD");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        buttons.add(lblNewLabel, BorderLayout.CENTER);
        
        JButton btnNewButton = new JButton("Previous Page");
        buttons.add(btnNewButton, BorderLayout.WEST);
        btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Page_1.setVisible(true);
				Page_2.setVisible(false);
			}
		});
        
        JButton btnNewButton_1 = new JButton("Next page");
        buttons.add(btnNewButton_1, BorderLayout.EAST);
        btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Page_1.setVisible(false);
				Page_2.setVisible(true);
			}
		});
        
        hats.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        hats.pack();
        hats.setLocationRelativeTo(null);
        hats.setVisible(true);
	}
}
