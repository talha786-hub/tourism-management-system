package tourism.management.system;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class Updatecustomer extends JFrame implements ActionListener {
    
    JLabel labelusername,labelname ;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfadress,tfPhone,tfemail,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add,back;
    Updatecustomer(String username){
    setBounds(500,200,850,550);
    setLayout(null);
    getContentPane().setBackground(Color.WHITE);
    
    JLabel text = new JLabel("UPDATE CUSTOMER DETAILS");
    text.setBounds(50, 0, 300, 25);
    text.setFont(new Font("Tahoma", Font.PLAIN,20));
    add(text);
    
    JLabel lblusername = new JLabel("Username");
    lblusername.setBounds(30, 50, 150, 25);
    add(lblusername);
     
    labelusername = new JLabel("");
    labelusername.setBounds(220, 50, 150, 25);
    add(labelusername);
    
    JLabel lblid = new JLabel("ID");
    lblid.setBounds(30, 90, 150, 25);
    add(lblid);
    
        tfid= new JTextField();
    tfid.setBounds(220, 90, 150, 25);
    add(tfid);
    
    JLabel lblnumber = new JLabel("Number");
    lblnumber.setBounds(30, 130, 150, 25);
    add(lblnumber);
    
    tfnumber= new JTextField();
    tfnumber.setBounds(220, 130, 150, 25);
    add(tfnumber);
    
     JLabel lblname = new JLabel("Name");
    lblname.setBounds(30, 170, 150, 25);
    add(lblname);
     
    labelname = new JLabel("");
    labelname.setBounds(220, 170, 150, 25);
    add(labelname);
    
    JLabel lblgender = new JLabel("Gender");
    lblgender.setBounds(30, 210, 150, 25);
    add(lblgender);
    
    tfgender = new JTextField();
    tfgender .setBounds(220, 210, 150, 25);
    add(tfgender);
    
    JLabel lblCountry = new JLabel("Country");
    lblCountry.setBounds(30, 250, 150, 25);
    add(lblCountry);
     
    tfcountry = new JTextField();
    tfcountry.setBounds(220, 250, 150, 25);
    add(tfcountry);
    
    JLabel lblAddres = new JLabel("Adress");
    lblAddres.setBounds(30, 290, 150, 25);
    add(lblAddres);
     
    tfadress = new JTextField();
    tfadress.setBounds(220, 290, 150, 25);
    add(tfadress);
    
    JLabel lblphone = new JLabel("Phone Number");
    lblphone.setBounds(30, 330, 150, 25);
    add(lblphone);
     
    tfPhone= new JTextField();
    tfPhone.setBounds(220, 330, 150, 25);
    add(tfPhone);
    
    JLabel lblEmail = new JLabel("Email");
    lblEmail.setBounds(30, 370, 150, 25);
    add(lblEmail);
     
    tfemail= new JTextField();
    tfemail.setBounds(220, 370, 150, 25);
    add(tfemail);
    
     add = new JButton("Update");
     add.setBackground(Color.BLACK);
     add.setForeground(Color.WHITE);
     add.setBounds(70, 430, 100, 25);
     add.addActionListener(this);
     add(add);
     
     back= new JButton("Back");
     back.setBackground(Color.BLACK);
     back.setForeground(Color.WHITE);
     back.setBounds(220, 430, 100, 25);
     back.addActionListener(this);
     add(back);
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
     Image i2 = i1.getImage().getScaledInstance(370 ,370,Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel image = new JLabel(i3);
     image.setBounds(400, 40,370,370);
     add(image);
     
     try{
     Conn c = new Conn();
     ResultSet rs=c.s.executeQuery("SELECT* FROM CUSTOMER WHERE USERNAME= '"+username+"'");
     while(rs.next()){
     labelusername.setText(rs.getString("username"));
     labelname.setText(rs.getString("name"));
     tfid.setText(rs.getString("id"));
     tfnumber.setText(rs.getString("number"));
     tfgender.setText(rs.getString("gender"));
     tfcountry.setText(rs.getString("country"));
     tfadress.setText(rs.getString("adress"));
     tfPhone.setText(rs.getString("phone"));
     tfemail.setText(rs.getString("email"));
     
     
     
     }
     }catch(Exception e){
       e.printStackTrace();
     }

     
    
    setVisible(true);
    
    }
      public void actionPerformed(ActionEvent ae){
     if(ae.getSource()==add){
         String username= labelusername.getText();
         String id = tfid.getText();
         String number = tfnumber.getText();
         String name = labelname.getText();
         String gender = tfgender.getText();
         
         String country = tfcountry.getText();
         String adress = tfadress.getText();
         String phone  = tfPhone.getText();
         String email = tfemail.getText();
         
         try{
          Conn c = new Conn();
         String query = "UPDATE customer SET username = '"+username+"', id = '"+id+"', number = '"+number+"', name = '"+name+"', gender = '"+gender+"', country = '"+country+"', adress = '"+adress+"', phone = '"+phone+"', email = '"+email+"'";

          c.s.executeUpdate(query);
          
          JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
          setVisible(false);
         }catch(Exception e){
         e.printStackTrace();
         }
            }else{
    setVisible(false);
}
  }
    
    
    
    public static void main (String[]args){
       new Updatecustomer("Mian");
    }
    
}
         