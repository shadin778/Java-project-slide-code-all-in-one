package Source;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;


public class Form2 extends JFrame implements ActionListener{



	Panel panel;
	JPanel toolBarPanel;
	JButton toolbtn,cart,profile,signoutBtn,exitBtn,btnBook1,btnBook2,btnb3,btnb4,btnb5,btnb6,btnb7,btnb8,btnb9,btnb10,btnb11,btnb12;
	String username;
	
	public Form2(String username) {
		super("Home-2");
		this.setBounds(100, 100, 1100, 685);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(0, 0));
		this.setVisible(true);
		this.setResizable(false);
		this.username=username;
		
		panel = new Panel();
		panel.setBackground(new Color(102, 153, 153));
		this.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		titleBar();
		
		toolBarPanel = new JPanel();
		toolBarPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		toolBarPanel.setBackground(new Color(110, 100, 168,240));
		toolBarPanel.setBounds(0, 0, 200, 650);
		panel.add(toolBarPanel);
		toolBarPanel.setLayout(null);
		
		exitBtn = new MyButton();
		exitBtn.setText("Exit");
		exitBtn.setFocusPainted(false);
		exitBtn.setBounds(53, 590, 83, 21);
		exitBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		exitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		((MyButton) exitBtn).setRedius(10);
		exitBtn.setBorder(null);;
		toolBarPanel.add(exitBtn);
		exitBtn.addActionListener(this);
		exitBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                exitBtn.setBackground(new Color(25, 118, 211));
                exitBtn.setForeground(new Color(255, 255, 255));
            }
            public void mouseExited(MouseEvent e) {
                exitBtn.setForeground(new Color(25, 118, 211));
                exitBtn.setBackground(new Color(255, 255, 255));
            }
        });

signoutBtn = new MyButton();
		signoutBtn.setText("Sign out");;
		signoutBtn.setFocusPainted(false);
		signoutBtn.setBounds(53, 559, 83, 21);
		signoutBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		signoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		((MyButton) signoutBtn).setRedius(10);
		signoutBtn.setBorder(null);
		toolBarPanel.add(signoutBtn);
		signoutBtn.addActionListener(this);
		signoutBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                signoutBtn.setBackground(new Color(25, 118, 211));
                signoutBtn.setForeground(new Color(255, 255, 255));
            }
            public void mouseExited(MouseEvent e) {
                signoutBtn.setForeground(new Color(25, 118, 211));
                signoutBtn.setBackground(new Color(255, 255, 255));
            }
        });
		
		JPanel bk1 = new JPanel();
		bk1.setBounds(67, 150, 129, 168);
		panel.add(bk1);
		bk1.setLayout(null);
		
		JLabel bp1 = new JLabel("New label");
		bp1.setIcon(new ImageIcon("image/F1.jpg"));
		bp1.setBounds(0, 0, 129, 168);
		bk1.add(bp1);
		
		JPanel bk2 = new JPanel();
		bk2.setBounds(226, 150, 129, 168);
		panel.add(bk2);
		bk2.setLayout(null);
		
		btnBook2 = new JButton("");
		btnBook2.setFocusPainted(false);
		btnBook2.setContentAreaFilled(false);
		btnBook2.setBounds(0, 0, 129, 168);
		bk2.add(btnBook2);
		btnBook2.addActionListener(this);
		
		JLabel bp2 = new JLabel("New label");
		bp2.setIcon(new ImageIcon("image/F2.jpg"));
		bp2.setBounds(0, 0, 129, 168);
		bk2.add(bp2);
		
		JPanel bk3 = new JPanel();
		bk3.setBounds(392, 150, 129, 168);
		panel.add(bk3);
		bk3.setLayout(null);
		
		btnb3 = new JButton("");
		btnb3.setFocusPainted(false);
		btnb3.setContentAreaFilled(false);
		btnb3.setBounds(0, 0, 129, 168);
		bk3.add(btnb3);
		btnb3.addActionListener(this);
		
		JLabel bp3 = new JLabel("New label");
		bp3.setIcon(new ImageIcon("image/F3.jpg"));
		bp3.setBounds(0, 0, 129, 168);
		bk3.add(bp3);
		
		JPanel bk4 = new JPanel();
		bk4.setBounds(560, 150, 129, 168);
		panel.add(bk4);
		bk4.setLayout(null);
		
		btnb4 = new JButton("");
		btnb4.setFocusPainted(false);
		btnb4.setContentAreaFilled(false);
		btnb4.setBounds(0, 0, 129, 168);
		bk4.add(btnb4);
		btnb4.addActionListener(this);
		
		JLabel bp4 = new JLabel("New label");
		bp4.setIcon(new ImageIcon("image/F4.jpg"));
		bp4.setBounds(0, 0, 129, 168);
		bk4.add(bp4);
		
		JPanel b5 = new JPanel();
		b5.setBounds(732, 150, 129, 168);
		panel.add(b5);
		b5.setLayout(null);
		
		btnb5 = new JButton("");
		btnb5.setFocusPainted(false);
		btnb5.setContentAreaFilled(false);
		btnb5.setBounds(0, 0, 129, 168);
		b5.add(btnb5);
		btnb5.addActionListener(this);
		
		JLabel bp5 = new JLabel("New label");
		bp5.setIcon(new ImageIcon("image/F5.jpg"));
		bp5.setBounds(0, 0, 129, 168);
		b5.add(bp5);
		
		JPanel bk6 = new JPanel();
		bk6.setBounds(902, 150, 129, 168);
		panel.add(bk6);
		bk6.setLayout(null);
		
		btnb6 = new JButton("");
		btnb6.setFocusPainted(false);
		btnb6.setContentAreaFilled(false);
		btnb6.setBounds(0, 0, 129, 168);
		bk6.add(btnb6);
		btnb6.addActionListener(this);
		JLabel bp6 = new JLabel("New label");
		bp6.setIcon(new ImageIcon("image/F6.jpg"));
		bp6.setBounds(0, 0, 129, 168);
		bk6.add(bp6);
		
		JPanel bk7 = new JPanel();
		bk7.setBounds(67, 367, 129, 168);
		panel.add(bk7);
		bk7.setLayout(null);
		
		JLabel bp7 = new JLabel("New label");
		bp7.setIcon(new ImageIcon("image/F7.jpg"));
		bp7.setBounds(0, 0, 129, 168);
		bk7.add(bp7);
		
		JPanel bk8 = new JPanel();
		bk8.setBounds(226, 367, 129, 168);
		panel.add(bk8);
		bk8.setLayout(null);
		
		btnb8 = new JButton("");
		btnb8.setFocusPainted(false);
		btnb8.setContentAreaFilled(false);
		btnb8.setBounds(0, 0, 129, 168);
		bk8.add(btnb8);
		btnb8.addActionListener(this);
		
		JLabel bp8 = new JLabel("New label");
		bp8.setIcon(new ImageIcon("image/F8.jpg"));
		bp8.setBounds(0, 0, 129, 168);
		bk8.add(bp8);
		
		JPanel bk9 = new JPanel();
		bk9.setBounds(392, 367, 129, 168);
		panel.add(bk9);
		bk9.setLayout(null);
		
		btnb9 = new JButton("");
		btnb9.setFocusPainted(false);
		btnb9.setContentAreaFilled(false);
		btnb9.setBounds(0, 0, 129, 168);
		bk9.add(btnb9);
		btnb9.addActionListener(this);
		
		JLabel bp9 = new JLabel("New label");
		bp9.setIcon(new ImageIcon("image/F9.jpg"));
		bp9.setBounds(0, 0, 129, 168);
		bk9.add(bp9);
		
		JPanel bk10 = new JPanel();
		bk10.setBounds(560, 367, 129, 168);
		panel.add(bk10);
		bk10.setLayout(null);
		
		btnb10 = new JButton("");
		btnb10.setFocusPainted(false);
		btnb10.setContentAreaFilled(false);
		btnb10.setBounds(0, 0, 129, 168);
		bk10.add(btnb10);
		btnb10.addActionListener(this);
		
		JLabel bp10 = new JLabel("New label");
		bp10.setIcon(new ImageIcon("image/F10.jpg"));
		bp10.setBounds(0, 0, 129, 168);
		bk10.add(bp10);
		
		JPanel bk11 = new JPanel();
		bk11.setBounds(732, 367, 129, 168);
		panel.add(bk11);
		bk11.setLayout(null);
		
		btnb11 = new JButton("");
		btnb11.setFocusPainted(false);
		btnb11.setContentAreaFilled(false);
		btnb11.setBounds(0, 0, 129, 168);
		bk11.add(btnb11);
		btnb11.addActionListener(this);
		
		JLabel bp11 = new JLabel("New label");
		bp11.setIcon(new ImageIcon("image/F11.jpg"));
		bp11.setBounds(0, 0, 129, 168);
		bk11.add(bp11);
		
		JPanel bk12 = new JPanel();
		bk12.setBounds(902, 367, 129, 168);
		panel.add(bk12);
		bk12.setLayout(null);
		
		btnb12 = new JButton("Details");
		btnb12.setFocusPainted(false);
		btnb12.setContentAreaFilled(false);
		btnb12.setBounds(0, 0, 129, 168);
		bk12.add(btnb12);
		btnb12.addActionListener(this);
		
		JLabel bp12 = new JLabel("New label");
		bp12.setIcon(new ImageIcon("image/F12.jpg"));
		bp12.setBounds(0, 0, 129, 168);
		bk12.add(bp12);
	}

	public void actionPerformed(ActionEvent e) {
		if(toolbtn==e.getSource()) {
			this.setVisible(false);
			new Form1(username);
		}
		if(signoutBtn==e.getSource()) {
			new LogIn();
		}
		if(exitBtn==e.getSource()) {
			System.exit(0);
		}
		if(btnBook2==e.getSource()) {
			this.setVisible(false);
			new Form4(username);
		}
		if(btnb3==e.getSource()) {
			this.setVisible(false);
			new Form5(username);
		}
		if(btnb4==e.getSource()) {
			this.setVisible(false);
			new Form6(username);
		}
		if(btnb5==e.getSource()) {
			this.setVisible(false);
			new Form7(username);
		}
		if(btnb6==e.getSource()) {
			this.setVisible(false);
			new Form8(username);
		}
		if(btnb8==e.getSource()) {
			this.setVisible(false);
			new Form10(username);
		}
		if(btnb9==e.getSource()) {
			this.setVisible(false);
			new Form11(username);
		}
		if(btnb10==e.getSource()) {
			this.setVisible(false);
			new Form12(username);
		}
		if(btnb11==e.getSource()) {
			this.setVisible(false);
			new Form13(username);
		}
		if(btnb12==e.getSource()) {
			this.setVisible(false);
			new Form14(username);
		}
	}
	
	public void titleBar(){
		
		JPanel titleBarPanel = new JPanel();
		titleBarPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		titleBarPanel.setBackground(new Color(102, 153, 204));
		titleBarPanel.setBounds(0, 0, 1647, 77);
		panel.add(titleBarPanel);
		titleBarPanel.setLayout(null);
		
		toolbtn = new JButton("");
		toolbtn.setContentAreaFilled(false);
		toolbtn.setFocusPainted(false);
		toolbtn.setBorder(null);
		toolbtn.setIcon(new ImageIcon("image/menu.png"));
		toolbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		toolbtn.setBounds(65, 22, 43, 31);
		titleBarPanel.add(toolbtn);
		toolbtn.addActionListener(this);
		
		cart = new JButton("");
		cart.setContentAreaFilled(false);
		cart.setFocusPainted(false);
		cart.setBorder(null);
		cart.setIcon(new ImageIcon("image/cart.png"));
		cart.setCursor(new Cursor(Cursor.HAND_CURSOR));
		cart.setBounds(981, 22, 43, 31);
		titleBarPanel.add(cart);
		cart.addActionListener(this);
		
		profile = new JButton(username);
		profile.setContentAreaFilled(false);
		profile.setFocusPainted(false);
		profile.setBorder(null);
		profile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		profile.setCursor(new Cursor(Cursor.HAND_CURSOR));
		profile.setBounds(880, 22, 98, 31);
		titleBarPanel.add(profile);
		profile.addActionListener(this);
		
		JLabel Boijatra = new JLabel("AIUB Boi Bitan");
		Boijatra.setFont(new Font("Tahoma", Font.BOLD, 24));
		Boijatra.setBounds(492, 22, 153, 31);
		titleBarPanel.add(Boijatra);
	}




}