import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class newframe extends JFrame implements MouseListener
{
	
	JPanel panel;
	JLabel user,pass;
	JTextField text;
	JPasswordField passfield;
	JButton login,signup;
	Color mycolor;
	
	public newframe()
	{
		super("My firs Gui");
		this.setSize(800,450);
		
		mycolor=new Color(215,200,180);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		
		user=new JLabel("Name");
		user.setBounds(280,115,100,30);
		user.setBackground(Color.RED);
		user.setOpaque(true);
		user.setForeground(Color.WHITE);
		panel.add(user);
		
		text=new JTextField();
		text.setBounds(380,115,200,30);
		panel.add(text);
		
		pass=new JLabel("Pass");
		pass.setBounds(280,165,100,30);
		panel.add(pass);
		
		
		passfield=new JPasswordField();
		passfield.setBounds(380,165,200,30);
		panel.add(passfield);
		
		login=new JButton("Sign In");
		login.setBounds(330,215,100,40);
		login.setBackground(Color.BLUE);
		login.addMouseListener(this);
		panel.add(login);
		
		signup=new JButton("Sign Up");
		signup.setBounds(460,215,100,40);
		signup.setBackground(Color.BLUE);
		signup.addMouseListener(this);
		panel.add(signup);
		
		this.add(panel);
	}
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==login)
		{
			login.setBackground(Color.RED);
		}
		else if(me.getSource()==signup)
		{
			signup.setBackground(Color.RED);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==login)
		{
			login.setBackground(Color.BLUE);
		}
		else if(me.getSource()==signup)
		{
			signup.setBackground(Color.BLUE);
		}
	}
	
	
	
	
	
	

}