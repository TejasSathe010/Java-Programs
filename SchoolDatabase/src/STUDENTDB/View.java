/*package STUDENTDB;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
public class View extends Frame implements ActionListener,ItemListener
{
	String msg;
	//int s_age; 
	//String gender_male,gender_female="";
	//String s_sex,s_b1,s_b2,s_address,s_course,s_sem,s_campus;


	MenuBar mb=new MenuBar();  
	Menu menu=new Menu("DataBase");  
	Menu submenu=new Menu("DB");  
	MenuItem i1=new MenuItem("Connect");  
	MenuItem i2=new MenuItem("Create");  
	MenuItem i3=new MenuItem("Item 3");  
	MenuItem i4=new MenuItem("Item 4");  
	MenuItem i5=new MenuItem("Item 5");  



	Button b1=new Button("VIEW");
	Button b2=new Button("Clear");
	Button b3=new Button("<<");

	TextArea t3=new TextArea("");

	public View()
	{
		addWindowListener(new myWindowAdapter());
		setForeground(Color.black);
		setBackground(Color.ORANGE);

		setLayout(null);


		add(b1);
		add(b2);
		add(b3);
		add(t3);

		b1.addActionListener(this);
		b3.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);


		t3.setBounds(459,135,390,460);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.BLUE);
		b1.setBounds(160,565,70,30);
		b2.setBounds(250,565,70,30);
		b3.setBounds(50,50,50,30);



		menu.add(i1);  
		menu.add(i2);  
		menu.add(i3);  
		submenu.add(i4);  
		submenu.add(i5);  
		menu.add(submenu);  
		mb.add(menu);  
		setMenuBar(mb); 

	}
	public void paint(Graphics g)
	{ 
		g.setFont(new Font("Calibari",Font.BOLD,18));
		g.setColor(Color.blue);
		g.drawString("Student Profile using Java AWT Controls",320,80);
		g.drawRect(60,115,365,500);
		g.drawRect(435,115,440,500);

	}
	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()==b1)
		{
			t3.setText("Fetching Data......");
			String sql2 = "select name,age,sex,benifits,address,course,semester,campus from StudentDB";
			try {
				ResultSet rs = MainST.stmt.executeQuery(sql2);

				while(rs.next()){

					//Retrieve by column name
					String name = rs.getString("name");
					String s_age = rs.getString("age");
					String s_sex = rs.getString("sex");
					String s_b1 = rs.getString("benifits");
					String s_address = rs.getString("address");
					String s_course = rs.getString("course");
					String s_sem = rs.getString("semester");
					String s_campus = rs.getString("campus");
					t3.setText("\n "+" Name\t :\t"+name+"\n\n"+" Age\t :\t"+s_age+"\n\n"+" Sex\t :\t"+s_sex+
							"\n\n Benefits\t :\t"+s_b1+" and\n\n Address\t :\t"+s_address+
							"\n\n Course\t :\t"+s_course+"\n\n Semester\t :\t"+s_sem+"\n\n Campus\t :\t"+s_campus+"\n\n\n\n\n\n\tDone by Tejas Sathe."+"\n\n\n\t\tRecord ADDED..");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	

		}
		if(ae.getSource()==b2)
		{
		}
		if(ae.getSource()==b3)
		{
			MainST.stu1.setVisible(true);
			/*studentawt stu=new studentawt();
	stu.setSize(new Dimension(930,660));
	stu.setTitle("Students Profile");
	stu.setVisible(true);
	this.dispose();*/
		/*}
	}
	public void itemStateChanged(ItemEvent ie)
	{
	}
	public static void main(String args[])
	{
		View V=new View();
		V.setSize(new Dimension(930,660));
		V.setTitle("Students Profile");
		V.setVisible(true);
	}
}
class myWindowAdapter2 extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}*/