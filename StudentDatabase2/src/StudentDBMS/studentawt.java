package StudentDBMS;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
public class studentawt extends Frame implements ActionListener,ItemListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String msg;
	Connection conn = null;


	int s_age; 
	String gender_male,gender_female="";
	String s_sex,s_b1,s_b2,s_address,s_course,s_sem,s_campus;


	MenuBar mb=new MenuBar();  
	Menu menu=new Menu("DataBase");  
	Menu submenu=new Menu("DB");  
	MenuItem i1=new MenuItem("Connect");  
	MenuItem i2=new MenuItem("Create");  
	MenuItem i3=new MenuItem("Item 3");  
	MenuItem i4=new MenuItem("Item 4");  
	MenuItem i5=new MenuItem("Item 5");  



	Button b1=new Button("Print");
	Button b2=new Button("Clear");
	Button b3=new Button("<<");

	Label l1=new Label("Name :",Label.LEFT);
	Label l2=new Label("Age :",Label.LEFT);
	Label l3=new Label("Sex(M/F):",Label.LEFT);
	Label l8=new Label("Benefits:",Label.LEFT);
	Label l4=new Label("Address:",Label.LEFT);
	Label l5=new Label("Course:",Label.LEFT);
	Label l6=new Label("Semester:",Label.LEFT);
	Label l9=new Label("Campus:",Label.LEFT);
	Label l10=new Label("Campus:",Label.LEFT);
	TextField t1=new TextField();
	Choice c1=new Choice();
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox ck1=new Checkbox("Male",false,cbg);
	Checkbox ck2=new Checkbox("Female",false,cbg);
	Checkbox c11=new Checkbox("Labtop",false);
	Checkbox c12=new Checkbox("Scholarship",false);
	TextArea t2=new TextArea("",200,150);
	TextArea t3=new TextArea("");
	Choice course=new Choice();
	Choice sem=new Choice();
	Choice age=new Choice();
	List list1=new List();
	public studentawt(Connection conn)
	{
		addWindowListener(new myWindowAdapter());
		this.conn = conn;
		setForeground(Color.BLACK);
		setBackground(new Color(255, 102, 102));

		setLayout(null);

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l8); 
		add(l9);
		add(l10);
		add(t1);
		add(t2);
		add(t3);

		add(ck1);
		add(ck2);
		add(course);
		add(sem);
		add(age);
		add(b1);
		add(b2);
		add(b3);

		b1.addActionListener(this);
		b3.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);

		add(c11);
		add(c12);
		add(list1);
		course.add("Select");
		course.add("BE Computer Science");
		course.add("ME Computer Science");
		course.add("BE Mechanical");
		course.add("ME Mechanical  ");
		course.add("BE E&TC");
		list1.add("SCOE");
		list1.add("SKN");
		sem.add("Select");
		sem.add("1");
		sem.add("2");
		sem.add("3");
		sem.add("4");
		sem.add("5");
		sem.add("6");
		age.add("Select");
		age.add("17");
		age.add("18");
		age.add("19");
		age.add("20");
		age.add("21");
		age.add("22");
		age.add("23");
		age.add("24");
		l1.setBounds(95,145,100,20);
		l2.setBounds(95,200,100,20);
		l3.setBounds(95,250,100,20);
		l8.setBounds(95,295,100,20);
		l4.setBounds(95,340,100,20);
		l5.setBounds(95,420,100,20);
		l6.setBounds(95,465,100,20);
		l9.setBounds(95,505,100,20);

		t1.setBounds(200,144,180,30);
		age.setBounds(200,200,180,70);
		ck1.setBounds(200,240,70,45);
		ck2.setBounds(270,240,70,45);
		c11.setBounds(200,285,70,45);
		c12.setBounds(270,285,85,45);
		course.setBounds(200,420,180,40);
		sem.setBounds(200,465,180,40);
		list1.setBounds(200,500,180,40);
		t2.setBounds(200,345,180,60);
		t3.setBounds(459,135,390,460);
		t3.setBackground(Color.BLACK);
		t3.setForeground(Color.WHITE);
		b1.setBounds(160,565,70,30);
		b2.setBounds(250,565,70,30);
		b3.setBounds(850,30,50,30);



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
		g.setColor(new Color(204, 255, 255));
		g.drawString("Student Profile using Java AWT Controls",320,80);
		g.drawRect(60,115,365,500);
		g.drawRect(435,115,440,500);

	}
	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()==b1)
		{

			name=t1.getText();
			s_address=t2.getText();
			int i=age.getSelectedIndex();
			int j=course.getSelectedIndex();
			int k=sem.getSelectedIndex();
			int l=list1.getSelectedIndex();
			switch(i)
			{
			case 1: s_age=17;
			break;
			case 2: s_age=18;
			break;
			case 3: s_age=19;
			break;
			case 4: s_age=20;
			break;
			case 5: s_age=21;
			break;
			case 6: s_age=22;
			break;
			case 7: s_age=23;
			break;
			}
			if(ck1.getState())
			{
				s_sex="Male";
			}
			if(ck2.getState())
			{
				s_sex="FeMale";
			}
			if((c11.getState())&&(c12.getState()))
			{
				s_b1="Laptop";
				s_b2="Scholarship";
			}
			if((c11.getState())&&(c12.getState()))
			{
			}
			switch(j)
			{
			case 1: s_course="B.Sc Computer Science";
			break;
			case 2: s_course="M.Sc Computer Science";
			break;
			case 3: s_course="B.Sc Astro Physics";
			break;
			case 4: s_course="M.Sc Astro Physics";
			break;
			case 5: s_course="B.Sc Mathematics ";
			break;
			}
			switch(k)
			{
			case 1: s_sem="1";
			break;
			case 2: s_sem="2";
			break;
			case 3: s_sem="3";
			break;
			case 4: s_sem="4";
			break;
			case 5: s_sem="5";
			break;
			case 6: s_sem="6";
			break;
			}
			switch(l)
			{
			case 0: s_campus="GVN Regular";
			break;
			case 1: s_campus="GVN SFC";
			break;
			}
			if(!t1.getText().isEmpty() && !t2.getText().isEmpty()) {
				Create.add( conn, name, s_age, s_sex, s_b1, s_address, s_course, s_sem, s_campus);
				Login.stu1.setVisible(true);
				this.dispose();
				t3.setText("\n "+" Name\t :\t"+name+"\n\n"+" Age\t :\t"+s_age+"\n\n"+" Sex\t :\t"+s_sex+
						"\n\n Benefits\t :\t"+s_b1+" and "+s_b2+"\n\n Address\t :\t"+s_address+
						"\n\n Course\t :\t"+s_course+"\n\n Semester\t :\t"+s_sem+"\n\n Campus\t :\t"+s_campus+"\n\n\n\n\n\n\tDone by Tejas Sathe."+"\n\n\n\t\tRecord ADDED..  " );
			}
		}
		if(ae.getSource()==b2)
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
		}
		if(ae.getSource()==b3)
		{
			Login.stu1.setVisible(true);
			this.setVisible(false);
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
	}
	public static void main(String args[])
	{
		
	}
}
class myWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}