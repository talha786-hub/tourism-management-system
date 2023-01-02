package tourism.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public  class Signup extends JFrame implements ActionListener {
   JButton back,create;
   JTextField tfname, tfusername,tfpassword,tfAnswer;
   Choice security;
  Signup(){ 
      setBounds(350,200,900,360);
      getContentPane().setBackground(Color.white);
      setLayout(null);
      
      JPanel p1 = new JPanel();
      p1.setBackground(new Color(133,193,233));
      p1.setLayout(null);
      p1.setBounds(0,0,500,400);
      add(p1);
      
      JLabel lblusername = new JLabel("Username :");
      lblusername.setBounds(50, 0,120,120);
      lblusername.setFont(new Font("Tahoma",Font.BOLD,15));
      p1.add(lblusername);
      
      tfusername= new JTextField();
      tfusername.setBounds(190, 45, 180, 25);
      tfusername.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfusername);
      
      JLabel lblname = new JLabel("Name :");
      lblname.setBounds(50, 40,120,120);
      lblname.setFont(new Font("Tahoma",Font.BOLD,15));
      p1.add(lblname);
      
      tfname= new JTextField();
      tfname.setBounds(190, 85, 180, 25);
      tfname.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfname);
      
      JLabel lblpassword = new JLabel("Password :");
      lblpassword.setBounds(50, 75, 120, 120);
      lblpassword.setFont(new Font("tahoma",Font.BOLD,15));
      p1.add(lblpassword);
      
      tfpassword= new JTextField();
      tfpassword.setBounds(190, 120, 180, 25);
      tfpassword.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfpassword);
      
      JLabel lblsecurity = new JLabel("Security Questi..:");
      lblsecurity.setBounds(50, 115, 120, 120);
      lblsecurity.setFont(new Font("tahoma",Font.BOLD,15));
      p1.add(lblsecurity);
      
       security = new Choice();
       security.add("Fav Character From The Boys");
       security.add("Fav Marvel Superhero");
       security.add("your Lucky Number");
       security.add("Your Childhood Superhero");
      security.setBounds(190, 165, 180, 25);
      p1.add(security);
      
      JLabel lblanswer = new JLabel("Answer :");
      lblanswer.setBounds(50, 155, 120, 120);
      lblanswer.setFont(new Font("tahoma",Font.BOLD,15));
      p1.add(lblanswer);
      
      tfAnswer= new JTextField();
      tfAnswer.setBounds(190, 205, 180, 25);
      tfAnswer.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfAnswer);
      
        create = new JButton("Create");
        create.setBounds(135, 250, 80, 30);
        create.setBackground( Color.white);
        create.setFont(new Font("tahoma",Font.BOLD,14));
        create.addActionListener(this);
        create.setForeground(new Color(131,193,233));
        p1.add(create);
        
          back = new JButton("Back");
        back.setBounds(270, 250, 80, 30);
        back.setBackground( Color.white);
        back.setFont(new Font("tahoma",Font.BOLD,14));
        back.addActionListener(this);
        back.setForeground(new Color(131,193,233));
        
        p1.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(200 ,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 50,200,200);
        add(image);
    
      setVisible(true);
      
  }  
  public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==create){
      String username = tfusername.getText();
      String name = tfname.getText();
      String password = tfpassword.getText();
      String question = security.getSelectedItem();
      String Answer = tfAnswer.getText();
      String query = "INSERT INTO account VALUES ('" + username + "', '" + name + "', '" + password + "', '" + question + "', '" + Answer + "')";
      try{
      Conn c = new Conn();
      c.s.executeUpdate(query);
      
      JOptionPane.showMessageDialog(null,"Acount Created Successfully");
      setVisible(false);
      new Login();
      
      }catch(Exception e){
          e.printStackTrace();
      
      }
     
     }else if (ae.getSource()==back){
         setVisible(false);
         new Login();
     
     }
      
    }
  
  
     public static void main (String[]args){
             new Signup();
 }
    
}


