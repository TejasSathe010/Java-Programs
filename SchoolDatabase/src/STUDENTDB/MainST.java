package STUDENTDB;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class MainST extends Frame implements ActionListener,ItemListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static studentawt stu;
	static MainST stu1;
	 Connection conn = null;
	 Statement stmt = null;

	String msg;
	int s_age; 
	String gender_male,gender_female="";
	String s_sex,s_b1,s_b2,s_address,s_course,s_sem,s_campus;


	TextArea t3=new TextArea("");

	MenuBar mb=new MenuBar();  
	Menu menu=new Menu("DataBase");  
	Menu submenu=new Menu("DB");  
	MenuItem i1=new MenuItem("Connect");  
	MenuItem i2=new MenuItem("Create");  
	MenuItem i3=new MenuItem("Add");  
	MenuItem i4=new MenuItem("Item 4");  
	MenuItem i5=new MenuItem("Item 5");  


	Button b1=new Button("Connect");
	Button b2=new Button("Create");
	Button b3=new Button("Add");
	Button b4=new Button("View");


	//Label l1 = new Label(); 
	//Label l2 = new Label(); 

	public MainST()
	{
		addWindowListener(new myWindowAdapter1());
		setForeground(Color.black);
		setBackground(Color.ORANGE);
		setLayout(null);


		add(b1);
		//b1.setBackground(Color.);
		b1.setForeground(Color.BLUE);
		add(b2);
		//b2.setBackground(Color.RED);
		b2.setForeground(Color.BLUE);
		add(b3);
		//b3.setBackground(Color.RED);
		b3.setForeground(Color.BLUE);
		add(b4);
		//b4.setBackground(Color.RED);
		b4.setForeground(Color.BLUE);



		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);


		add(t3);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.BLUE);
		//add(l1);
		//add(l2);
		//l1.setBounds(600, 150, 150, 50);
		//l1.setForeground(Color.BLUE);
		//l2.setBounds(600, 200, 150, 50);
		//l2.setForeground(Color.BLUE);



		b1.setBounds(160,150,275,50);
		b2.setBounds(160,200,275,50);
		b3.setBounds(160,250,275,50);
		b4.setBounds(160,300,275,50);

		t3.setBounds(459,135,390,460);





		menu.add(i1);  
		menu.add(i2);  
		menu.add(i3);  
		submenu.add(i4);  
		submenu.add(i5);  
		menu.add(submenu);  
		mb.add(menu);  
		setMenuBar(mb); 

	}
	
	static void add(Statement stmt,String name,int age,String s_sex,String s_b1,String s_address,String s_course,String s_sem,String s_campus) {
	     // String sqlIn = "INSERT INTO StudentDBMS(name,age,sex,benifits,address,course,semester,campus) " +
	       //            "VALUES ("+name+","+age+","+s_sex+","+s_b1+","+s_address+","+s_course+","+s_sem+","+s_campus+")";
   String sqlIn = "INSERT INTO StudentDBMS VALUES('Tejas',19,'male','add','chopda','bsc','3rdsem','coep')";
  // String sMakeInsert = "INSERT INTO dummy VALUES(1,'Hello from the database')";

	try {
			stmt.execute(sqlIn);
		    System.out.println("Inserted records into the table...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	public void paint(Graphics g)
	{ 
		g.setFont(new Font("Calibari",Font.BOLD,18));
		g.setColor(Color.blue);
		
		g.drawString("Student Profile Database",320,80);
		g.drawRect(160,115,365,500);
		g.drawRect(435,115,440,500);

	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			conn = Connect.connect();
			if(conn != null) {
				t3.setText("DataBase Connected...");
			}
		}
		if(ae.getSource()==b2)
		{
			stmt = Create.create(conn);
			if(stmt != null) {
				t3.setText("DataBase Connected...\nTable Created...");
			}
		}
		if(ae.getSource()==b3)
		{
			//this.setVisible(false);
			
			stu=new studentawt(stmt,conn);
			stu.setSize(new Dimension(930,660));
			stu.setTitle("Students Profile");
			stu.setVisible(true);
			this.dispose();
		}
		if(ae.getSource()==b4)
		{
			//this.setVisible(false);

			//View V=new View();
			//V.setSize(new Dimension(930,660));
			//V.setTitle("Students Profile");
			//V.setVisible(true);
			//this.dispose();
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{

	}
	public static void main(String args[])
	{
		stu1=new MainST();
		stu1.setSize(new Dimension(930,660));
		stu1.setTitle("Students Profile Database");
		stu1.setVisible(true);
	}
}
class myWindowAdapter1 extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}