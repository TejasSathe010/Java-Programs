import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class menu1 extends Frame  implements MouseListener
{
	Label head,addr,date,mess,file,help,ext,choice,vis,men;
	String dt="";
	Image img1,img2;
	menu1()
	{

		super("MAIN MENU");
		try
		{
			setSize(800,575);
			setVisible(true);
			//setBackground(new Color(145,146,185));
			setBackground(Color.white);
			setLayout(null);
			setForeground(Color.blue);
			Date d=new Date();
			StringTokenizer str=new StringTokenizer(d.toLocaleString()," ");
			for(int i=0;i<3;i++)
				dt=dt+str.nextToken()+" ";
			System.out.println("osn");
			addr=new Label("ShareFile");
			addr.setFont(new Font("",Font.BOLD,60));
			addr.setBounds(250,100,440,60);
			addr.setForeground(Color.black);
			date=new Label("Date : "+dt);
			date.setFont(new Font("",Font.BOLD+Font.ITALIC,15));
			date.setBounds(650,100,170,30);
			date.setForeground(Color.black);
//			vis=new Label("Pune");
//			vis.setFont(new Font("",Font.BOLD,18));
//			vis.setBounds(300,130,150,25);
//			vis.setForeground(Color.black);
//			men=new Label("MAIN MENU");
//			men.setBounds(310,180,140,30);
//			men.setFont(new Font("",Font.BOLD,20));
//			men.setForeground(Color.red);
			mess=new Label("SENDING A MESSAGE");
			mess.setBounds(0,250,800,60);
			mess.setFont(new Font("",Font.BOLD,16));
			file=new Label("SENDING A FILE");
			file.setBounds(0,300,800,60);
			file.setFont(new Font("",Font.BOLD,16));
			help=new Label("HELP");
			help.setBounds(340,350,60,30);
			help.setFont(new Font("",Font.BOLD,16));
			ext=new Label("EXIT");
			ext.setBounds(340,400,60,30);
			ext.setFont(new Font("",Font.BOLD,16));
			Toolkit tool=Toolkit.getDefaultToolkit();
			img1=tool.getImage("d:\\ismaster\\osn\\recent\\abc1.gif");
			img2=tool.getImage("d:\\ismaster\\osn\\recent\\abc.gif");
			addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});
			mess.addMouseListener(this);
			help.addMouseListener(this);
			file.addMouseListener(this);
			ext.addMouseListener(this);
			add(mess);
			//add(men);
			add(file);
			add(addr);
			add(ext);
			add(help);
			//add(vis);
			add(date);
			show();
		}catch(Exception e){}
	}

	//public void mouseEntered(MouseEvent me){setCursor(Cursor.HAND_CURSOR);}
	//public void mouseExited(MouseEvent me){setCursor(Cursor.DEFAULT_CURSOR);}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){
		if(me.getSource()==mess)
		{
			new chat();setVisible(false);
			System.out.println(mess);
		}
		if(me.getSource()==file)
		{
			//new chatform();setVisible(false);
			System.out.println(file);

		}
		if(me.getSource()==ext)
			System.exit(0);
	}
	public void mouseReleased(MouseEvent me){}
	public void paint(Graphics g)
	{
		g.drawImage(img1,120,35,null);
		g.drawImage(img2,60,500,null);
		//g.drawLine(0,170,800,170);
		g.drawLine(0,230,800,230);
		g.drawLine(0,290,800,290);
		g.drawLine(0,340,800,340);
		g.drawLine(0,390,800,390);
		g.drawLine(0,440,800,440);
	}
	public static void main(String ds[])
	{
		new menu1();
	}
}

