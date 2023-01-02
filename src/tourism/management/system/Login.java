package tourism.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
    JButton login,signup,Password;
    JTextField tfusername,tfpassword;
    Login(){
        setSize(900,400);
        setLocation(350, 200);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0, 0,400,400);
        p1.setLayout(null);
        add(p1);   
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200 ,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 120,200,200);
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 60, 300, 30);
        lblusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lblusername);
        
        tfusername= new JTextField();
        tfusername.setBounds(60, 100, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 140, 300, 30);
        lblpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lblpassword);
        
        tfpassword= new JTextField();
        tfpassword.setBounds(60, 180, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        login = new JButton("Login");
        login.setBounds(60, 230, 130, 30);
        login.setBackground(new Color(131,193,233));
        login.setForeground(Color.white);
        login.setBorder(new LineBorder(new Color(131,193,233)));
        login.addActionListener(this);
        p2.add(login);
        
          signup = new JButton("Signup");
        signup.setBounds(200, 230, 130, 30);
        signup.setBackground(new Color(131,193,233));
        signup.setForeground(Color.white);
        signup.setBorder(new LineBorder(new Color(131,193,233)));
        signup.addActionListener(this);
        p2.add(signup);
       
          Password = new JButton("Forget Password");
        Password.setBounds(140, 270, 130, 30);
        Password.setBackground(new Color(131,193,233));
        Password.setForeground(Color.white);
        Password.setBorder(new LineBorder(new Color(131,193,233)));
        Password.addActionListener(this);
        p2.add(Password);
       
        JLabel text = new JLabel("login trouble.....");
        text.setBounds(300, 270, 130,30 );
        text.setForeground(Color.red);
        p2.add(text);
        
        
        
         setVisible(true);
            
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()== login){
          try{
          String username = tfusername.getText();
          String pass = tfpassword.getText();
            
          
          String query = "SELECT* FROM ACCOUNT WHERE USERNAME ='"+username+"' AND PASSWORD = '"+pass+"'";
          Conn c = new Conn();
          ResultSet rs =c.s.executeQuery(query);
          if(rs.next()){
              setVisible(false);
              new Loading(username);
          }else{
          JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
          }   
         
          }catch(Exception e){
              e.printStackTrace();
          
          }
          
      }else if(ae.getSource()== signup){
          setVisible(false);
          new Signup();
          
      }else{
         setVisible(false);
         new Forgetpassword();
      }
    }
        
           public static void main(String[]args){       
                     new Login();
}
}
