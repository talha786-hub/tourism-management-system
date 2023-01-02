
package tourism.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Viewcustomer extends JFrame implements ActionListener   {
    JButton back;
    Viewcustomer(String username){
        setBounds(450,180,870,626);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
         JLabel text = new JLabel("View Customer Details");
        text.setBounds(60,0,300,30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
         add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
         add(lblusername);
         
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
         
         JLabel lblid = new JLabel("ID");
        lblid.setBounds(30,110,150,25);
        add(lblid);
         
        JLabel labelid = new JLabel();
        labelid.setBounds(220,110,150,25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,170,150,25);
        add(lblnumber);
         
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,170,150,25);
        add(labelnumber);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,220,150,25);
        add(lblname);
         
        JLabel labelname = new JLabel();
        labelname.setBounds(220,230,150,25);
        add(labelname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        add(lblgender);
         
        JLabel labelgender = new JLabel();
        labelgender.setBounds(220,290,150,25);
        add(labelgender);
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(500,50,150,25);
        add(lblcountry);
         
        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(690,50,150,25);
        add(labelcountry);
        
        JLabel lbladress = new JLabel("Adress");
        lbladress.setBounds(500,110,150,25);
        add(lbladress);
         
        JLabel labeladress = new JLabel();
        labeladress.setBounds(690,110,150,25);
        add(labeladress);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(500,170,150,25);
        add(lblphone);
         
        JLabel labelphone = new JLabel();
        labelphone.setBounds(690,170,150,25);
        add(labelphone);
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(500,230,150,25);
        add(lblemail);
         
        JLabel labelemail = new JLabel();
        labelemail.setBounds(690,230,150,25);
        add(labelemail);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
        add(back);
        
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/viewall.jpg"));
    Image i2 = i1.getImage().getScaledInstance(600 ,200,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(20, 400,600,200);
    add(image);
    
    ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Icons/viewall.jpg"));
    Image i5 = i4.getImage().getScaledInstance(600 ,200,Image.SCALE_DEFAULT);
    ImageIcon i6 = new ImageIcon(i5);
    JLabel image2 = new JLabel(i3);
    image2.setBounds(600, 400,600,200);
    add(image2);
    try{
       Conn conn = new Conn();
       String query = "Select* from customer where username = '"+username+"'";
      ResultSet rs= conn.s.executeQuery(query);
      while(rs.next()){
      
      labelusername.setText(rs.getString("username"));
      labelid.setText(rs.getString("ID"));
      labelnumber.setText(rs.getString("Number"));
      labelname.setText(rs.getString("Name"));
      labelgender.setText(rs.getString("Gender"));
      labelcountry.setText(rs.getString("Country"));
      labelemail.setText(rs.getString("Email"));
      labeladress.setText(rs.getString("Adress"));
      labelphone.setText(rs.getString("Phone"));
      
      
      
      
      
      
      
      
      }
    
    }catch(Exception e){
    
    
    }
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
           setVisible(false);
    }
    
    
    
    
     public static void main (String[]args){
       new Viewcustomer("mian");
    }
    
}
