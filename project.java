import javax.swing.*;
import java.awt.event.*;

class project implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1;
	ImageIcon im1,im2,im3,im4,im5;
	JButton b1,b2,b3;

	project()
	{
		f1=new JFrame("Image viewer");
		p1=new JPanel();

		im1=new ImageIcon("d:\\thor.jpg");
		im2=new ImageIcon("d:\\ironman.jpg");
		im3=new ImageIcon("d:\\hulk.jpg");
		im4=new ImageIcon("d:\\spiderman.jpg");
		im5=new ImageIcon("d:\\captainamerica.jpg");
		
		t1=new JTextField();

		l1=new JLabel(im1);
		l2=new JLabel(im2);
		l3=new JLabel(im3);
		l4=new JLabel(im4);
		l5=new JLabel(im5);
		
		b1=new JButton("Previous");
		b2=new JButton("OK");
		b3=new JButton("Next");
		
		f1.add(p1);

		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		
		p1.add(b1);
		p1.add(b2);
		
		p1.add(t1);
		
		p1.add(b3);
				
		l1.setBounds(30,50,720,379);
		l2.setBounds(30,50,721,365);
		l3.setBounds(30,25,720,405);
		l4.setBounds(30,50,720,405);
		l5.setBounds(30,50,720,405);
		
		b1.setBounds(60,500,100,30);
		b2.setBounds(200,500,100,30);
		t1.setBounds(350,500,100,30);
		b3.setBounds(500,500,150,30);

		p1.setLayout(null);
		f1.setSize(800,580);
		f1.setVisible(true);
		f1.setLocationRelativeTo(null);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		l1.setVisible(false);
		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(false);
		l5.setVisible(false);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String str=t1.getText().toString();
			int var=Integer.parseInt(str);
			
			if(str.equals("1"))
			{
				t1.setText(Integer.toString(var));
			}
			if(str.equals("2"))
			{
				
				l1.setVisible(true);
			   	l2.setVisible(false);
			   	l3.setVisible(false);
			   	l4.setVisible(false);
				l5.setVisible(false);
				var=var-1;
			        t1.setText(Integer.toString(var));
				
			}
			if(str.equals("3"))
			{
				l1.setVisible(false);
				l2.setVisible(true);
				l3.setVisible(false);
			   	l4.setVisible(false);
				l5.setVisible(false);
				var=var-1;
			        t1.setText(Integer.toString(var));	
				
			}
			if(str.equals("4"))
			{
				l1.setVisible(false);
				l2.setVisible(false);
				l3.setVisible(true);
				l4.setVisible(false);
				l5.setVisible(false);
				var=var-1;
			   	t1.setText(Integer.toString(var));		
				
			}
			if(str.equals("5"))
			{
				l1.setVisible(false);
				l2.setVisible(false);
				l3.setVisible(false);
				l4.setVisible(true);
				l5.setVisible(false);
				var=var-1;
				t1.setText(Integer.toString(var));		
			}
		}
		if(ae.getSource()==b2)
		{
			String str=t1.getText();
			if(str.equals("1"))
			{
				l1.setVisible(true);
			   	l2.setVisible(false);
			   	l3.setVisible(false);
			   	l4.setVisible(false);
				l5.setVisible(false);
			}
			if(str.equals("2"))
			{
				l1.setVisible(false);
			   	l2.setVisible(true);
			   	l3.setVisible(false);
			   	l4.setVisible(false);
				l5.setVisible(false);
			}
			if(str.equals("3"))
			{
				l1.setVisible(false);
			   	l2.setVisible(false);
			   	l3.setVisible(true);
			   	l4.setVisible(false);
				l5.setVisible(false);
			}
			if(str.equals("4"))
			{
				l1.setVisible(false);
			   	l2.setVisible(false);
			   	l3.setVisible(false);
			   	l4.setVisible(true);
				l5.setVisible(false);
			}
			if(str.equals("5"))
			{
				l1.setVisible(false);
			   	l2.setVisible(false);
			   	l3.setVisible(false);
			   	l4.setVisible(false);
				l5.setVisible(true);
			}
		}
		if(ae.getSource()==b3)
		{
			String str=t1.getText().toString();
			int var=Integer.parseInt(str);
			
			if(str.equals("1"))
			{
				l1.setVisible(false);
				l2.setVisible(true);
				l3.setVisible(false);
				l4.setVisible(false);
				l5.setVisible(false);
				var=var+1;
				t1.setText(Integer.toString(var));
					
			}
			if(str.equals("2"))
			{
				l1.setVisible(false);
				l2.setVisible(false);
				l3.setVisible(true);
				l4.setVisible(false);
				l5.setVisible(false);
				var=var+1;
				t1.setText(Integer.toString(var));
			
			}
			if(str.equals("3"))
			{
				l1.setVisible(false);
				l2.setVisible(false);
				l3.setVisible(false);
				l4.setVisible(true);
				l5.setVisible(false);
				var=var+1;
				t1.setText(Integer.toString(var));
				
			}
			if(str.equals("4"))
			{
				l1.setVisible(false);
			   	l2.setVisible(false);
			   	l3.setVisible(false);
			   	l4.setVisible(false);
				l5.setVisible(true);
				var=var+1;
				t1.setText(Integer.toString(var));
			}
			if(str.equals("5"))
			{
				JOptionPane.showMessageDialog(f1,"ONLY 5 IMAGES ARE THERE");
				t1.setText(Integer.toString(var));
			}
		}
	}
	public static void main(String args[])
	{
		project obj=new project();
	}
}