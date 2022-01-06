package StudentDBMS;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MainList extends JFrame implements ActionListener,ItemListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static ResultSet rs; 

	static Statement stmt;
	static Connection conn;
	static String name;
	JList<String> l1;
	Button b3;

	DefaultListModel<String> listModel;
	JList<String> l2;

	DefaultListModel<String> listModel2;


	MainList(Statement stmt,Connection conn){


		addWindowListener(new myWindowAdapter4());
		setForeground(new Color(50,50,50));
		setBackground(new Color(255, 102, 102));
		
		listModel = new DefaultListModel<>();
		listModel2 = new DefaultListModel<>();
		b3=new Button("<<");
		add(b3);
		b3.addActionListener(this);
		b3.setBounds(850,30,50,30);


		TextArea t3=new TextArea("");
		add(t3);
		t3.setBackground(new Color(204, 255, 255));
		t3.setForeground(new Color(255, 102, 102));
		t3.setBounds(459,135,390,460);


		//String queryL1="SELECT * FROM Student";
		String queryL1 = "SELECT name from Student";


		try {
			rs = stmt.executeQuery(queryL1);
			while (rs.next()) 
			{
				String nm = rs.getString("name");

				listModel.addElement(nm);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l1 = new JList<>(listModel);

		l1.setCellRenderer( new WhiteYellowCellRenderer() );


		DefaultListCellRenderer renderer =  (DefaultListCellRenderer)l1.getCellRenderer();  
		renderer.setHorizontalAlignment(JLabel.LEFT); 

		l1.setFixedCellWidth(80);
		l1.setFixedCellHeight(40);
		add(l1);
		l1.setBounds(160,115,300,300); 
		l1.setVisible(true);
		l1.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent event) {
				if (!event.getValueIsAdjusting()){
					@SuppressWarnings("rawtypes")
					JList source = (JList)event.getSource();
					String selected = source.getSelectedValue().toString();
					String sMakeSelect1 = "SELECT name,age,s_sec,s_b1,s_address,s_course,s_sem,s_campus from Student where name = ? ";

					ResultSet rs;
					try {
						PreparedStatement ps = conn.prepareStatement(sMakeSelect1);
						ps.setString(1, selected);

						rs = ps.executeQuery();

						while(rs.next())
						{
							String name = rs.getString("name");
							int s_age = rs.getInt("age");
							String s_sex = rs.getString("s_sec");
							String s_b1 = rs.getString("s_b1");
							String s_address = rs.getString("s_address");
							String s_course = rs.getString("s_course");
							String s_sem = rs.getString("s_sem");
							String s_campus = rs.getString("s_campus");

							t3.setFont(new Font("Calibari",Font.ITALIC,14));
							t3.setText("\n "+" Name\t :\t"+name+"\n\n"+" Age\t :\t"+s_age+"\n\n"+" Sex\t :\t"+s_sex+
									"\n\n Benefits\t :\t"+s_b1+" and "+"\n\n Address\t :\t"+s_address+
									"\n\n Course\t :\t"+s_course+"\n\n Semester\t :\t"+s_sem+"\n\n Campus\t :\t"+s_campus+"\n\n\n\n\n\n\tDone by Tejas Sathe."+"\n\n\n\t\tRecord ADDED..  " );
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

	}

	/*public void paint(Graphics g)
	{ 
		g.setFont(new Font("Calibari",Font.BOLD,18));
		g.setColor(new Color(35,35,35));

		g.drawString("Student Profile Database",320,80);
		g.drawRect(160,115,365,500);
		g.drawRect(435,115,440,500);
	}*/

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource()==b3)
		{
			Login.stu1.setVisible(true);
			this.setVisible(false);
		}

	}



	private static class WhiteYellowCellRenderer extends DefaultListCellRenderer {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Component getListCellRendererComponent( @SuppressWarnings("rawtypes") JList list, Object value, int index, boolean isSelected, boolean cellHasFocus ) {
			Component c = super.getListCellRendererComponent( list, value, index, isSelected, cellHasFocus );
			if ( index % 2 == 0 ) {
				c.setBackground(new Color(255, 102, 102));
				c.setForeground(Color.WHITE);
			}
			else {
				c.setBackground(new Color(204, 255, 255));
				c.setForeground(Color.BLACK);
			}
			return c;
		}
	}


}
class myWindowAdapter4 extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}



