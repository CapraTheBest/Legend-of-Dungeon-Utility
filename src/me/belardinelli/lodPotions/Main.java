package me.belardinelli.lodPotions;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {

	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JComboBox<String> comboBox_4;
	private JComboBox<String> comboBox_5;
	private JComboBox<String> comboBox_6;
	private JComboBox<String> comboBox_7;
	private JComboBox<String> comboBox_8;
	private JComboBox<String> comboBox_9;
	private JComboBox<String> comboBox_10;
	private JComboBox<String> comboBox_11;
	private JComboBox<String> comboBox_12;
	private JComboBox<String> comboBox_13;
	private JComboBox<String> comboBox_14;
	private JFrame frmLegendOfDungeon;
	private int contents[] = new int[15];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmLegendOfDungeon.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public Main() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
 	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		initialize_file();
		String[] content = {"Unkown", "Level Up", "Heal", "Heal More", "Restore Strength", "Strength of the Minotaur",
				"Stone Skin", "Speed Up", "Jump Up", "Illuminate", "Poison", "Brittle Bones", "Slow", "Darken",
				"Confusion", "Sleep", "Fart"};
		frmLegendOfDungeon = new JFrame();
        frmLegendOfDungeon.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/resources/favicon.png")));
		frmLegendOfDungeon.setResizable(false);
		frmLegendOfDungeon.setTitle("Legend Of Dungeon Potion Keeper");
		frmLegendOfDungeon.setBounds(100, 100, 374, 488);
		frmLegendOfDungeon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (InstantiationException e) {
	        e.printStackTrace();
	    } catch (IllegalAccessException e) {
	        e.printStackTrace();
	    } catch (UnsupportedLookAndFeelException e) {
	        e.printStackTrace();
	    }
		frmLegendOfDungeon.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("30px"),
				ColumnSpec.decode("98px"),
				ColumnSpec.decode("65px"),
				ColumnSpec.decode("140px"),
				ColumnSpec.decode("30px"),},
			new RowSpec[] {
				RowSpec.decode("20px"),
				RowSpec.decode("20px"),
				RowSpec.decode("20px"),
				RowSpec.decode("20px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),}));
		
		JLabel lblPotionsColor = new JLabel("Potion's Color");
		lblPotionsColor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmLegendOfDungeon.getContentPane().add(lblPotionsColor, "2, 2, center, center");
		
		JLabel lblNewLabel_14 = new JLabel("Effect");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_14, "4, 2, center, center");
		
		JLabel lblNewLabel = new JLabel("Aqua");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel, "2, 4, center, center");
		
		comboBox = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox, "4, 4, fill, center");
		
		JLabel lblAzure = new JLabel("Azure");
		frmLegendOfDungeon.getContentPane().add(lblAzure, "2, 6, center, center");
		
		comboBox_1 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_1, "4, 6, fill, center");
		
		JLabel lblNewLabel_1 = new JLabel("Blood Red");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_1, "2, 8, center, center");
		
		comboBox_2 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_2, "4, 8, fill, center");
		
		JLabel lblNewLabel_2 = new JLabel("Brown Muddy");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_2, "2, 10, center, center");
		
		comboBox_3 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_3, "4, 10, fill, center");
		
		JLabel lblNewLabel_3 = new JLabel("Dark Violet");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_3, "2, 12, center, center");
		
		comboBox_4 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_4, "4, 12, fill, center");
		
		JLabel lblNewLabel_4 = new JLabel("Fuchsia");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_4, "2, 14, center, center");
		
		comboBox_5 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_5, "4, 14, fill, center");
		
		JLabel lblNewLabel_5 = new JLabel("Hot Pink");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_5, "2, 16, center, center");
		
		comboBox_6 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_6, "4, 16, fill, center");
		
		JLabel lblNewLabel_6 = new JLabel("Inky Black");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_6, "2, 18, center, center");
		
		comboBox_7 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_7, "4, 18, fill, center");
		
		JLabel lblNewLabel_7 = new JLabel("Lime Green");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_7, "2, 20, center, center");
		
		comboBox_8 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_8, "4, 20, fill, center");
		
		JLabel lblNewLabel_8 = new JLabel("Milky White");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_8, "2, 22, center, center");
		
		comboBox_9 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_9, "4, 22, fill, center");
		
		JLabel lblNewLabel_9 = new JLabel("Murky Green");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_9, "2, 24, center, center");
		
		comboBox_10 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_10, "4, 24, fill, center");
		
		JLabel lblNewLabel_10 = new JLabel("Questionable Yellow");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_10, "2, 26, center, center");
		
		comboBox_11 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_11, "4, 26, fill, center");
		
		JLabel lblNewLabel_11 = new JLabel("Rusty Orange");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_11, "2, 28, center, center");
		
		comboBox_12 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_12, "4, 28, fill, center");
		
		JLabel lblNewLabel_12 = new JLabel("Sickly Green");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_12, "2, 30, center, center");
		
		comboBox_13 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_13, "4, 30, fill, center");
		
		JLabel lblNewLabel_13 = new JLabel("Sparkling Gold");
		frmLegendOfDungeon.getContentPane().add(lblNewLabel_13, "2, 32, center, center");
		
		comboBox_14 = new JComboBox<String>();
		frmLegendOfDungeon.getContentPane().add(comboBox_14, "4, 32, fill, center");
		
		JMenuBar menuBar = new JMenuBar();
		frmLegendOfDungeon.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setToolTipText("Save the current configuration");
		mnFile.add(mntmSave);
		mntmSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					writeFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mntmLoad.setToolTipText("Load a file with the previous configuration");
		mnFile.add(mntmLoad);
		mntmLoad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					readFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mnFile.add(mntmReset);
		mntmReset.setToolTipText("Reset the current potions");
		mntmReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				comboBox_4.setSelectedIndex(0);
				comboBox_5.setSelectedIndex(0);
				comboBox_6.setSelectedIndex(0);
				comboBox_7.setSelectedIndex(0);
				comboBox_8.setSelectedIndex(0);
				comboBox_9.setSelectedIndex(0);
				comboBox_10.setSelectedIndex(0);
				comboBox_11.setSelectedIndex(0);
				comboBox_12.setSelectedIndex(0);
				comboBox_13.setSelectedIndex(0);
				comboBox_14.setSelectedIndex(0);
			}
        });
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setToolTipText("Exit the program");
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmSpecialHats = new JMenuItem("Special Hats");
		mnHelp.add(mntmSpecialHats);
		mntmSpecialHats.setToolTipText("Some hats with special behavior");
		mntmSpecialHats.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				initialize_hats();
			}
        });
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		mntmAbout.setToolTipText("About the Program");
		mntmAbout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				initialize_about();
			}
        });
		
		
		for(int i = 0; i < 17; i++){
			comboBox.addItem(content[i]);
			comboBox_1.addItem(content[i]);
			comboBox_2.addItem(content[i]);
			comboBox_3.addItem(content[i]);
			comboBox_4.addItem(content[i]);
			comboBox_5.addItem(content[i]);
			comboBox_6.addItem(content[i]);
			comboBox_7.addItem(content[i]);
			comboBox_8.addItem(content[i]);
			comboBox_9.addItem(content[i]);
			comboBox_10.addItem(content[i]);
			comboBox_11.addItem(content[i]);
			comboBox_12.addItem(content[i]);
			comboBox_13.addItem(content[i]);
			comboBox_14.addItem(content[i]);
		}
	}
	
	private void initialize_about(){
		new About();
	}
	
	private void initialize_hats(){
		new Hats();
	}
	
	private void readFile() throws IOException {
		// Construct BufferedReader from FileReader
		File fout = new File("save.txt");
		BufferedReader br = new BufferedReader(new FileReader(fout));
	 
		String line;
		int i = 0;
		while ((line = br.readLine()) != null) {
			//System.out.println(line);
			contents[i] = Integer.parseInt(line);
			i++;
		}
	 
		comboBox.setSelectedIndex(contents[0]);
		comboBox_1.setSelectedIndex(contents[1]);
		comboBox_2.setSelectedIndex(contents[2]);
		comboBox_3.setSelectedIndex(contents[3]);
		comboBox_4.setSelectedIndex(contents[4]);
		comboBox_5.setSelectedIndex(contents[5]);
		comboBox_6.setSelectedIndex(contents[6]);
		comboBox_7.setSelectedIndex(contents[7]);
		comboBox_8.setSelectedIndex(contents[8]);
		comboBox_9.setSelectedIndex(contents[9]);
		comboBox_10.setSelectedIndex(contents[10]);
		comboBox_11.setSelectedIndex(contents[11]);
		comboBox_12.setSelectedIndex(contents[12]);
		comboBox_13.setSelectedIndex(contents[13]);
		comboBox_14.setSelectedIndex(contents[14]);
		
		br.close();
	}
	
	public void writeFile() throws IOException {
		PrintWriter bw = new PrintWriter(new FileWriter("save.txt"));

		System.out.println(comboBox.getSelectedIndex());
		bw.write(String.valueOf(comboBox.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_1.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_2.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_3.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_4.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_5.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_6.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_7.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_8.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_9.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_10.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_11.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_12.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_13.getSelectedIndex())+ System.getProperty("line.separator"));
		bw.write(String.valueOf(comboBox_14.getSelectedIndex()));
		bw.close();
	}
	
	private void initialize_file() throws IOException{
		File fout = new File("save.txt");
		boolean b = false;
		if (!fout.exists()){
			b = fout.createNewFile();
		}
		if (b)
			System.out.println("Created File!");
		else
			System.out.println("Failed to create or file already exists!");
	}
}
