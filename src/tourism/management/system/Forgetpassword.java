
package tourism.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;;
import java.awt.event.*;
import java.sql.*;
    
public class Forgetpassword extends JFrame implements ActionListener{
    
    JTextField tfusername,tfname,tfsecurity,tfanswer,tfpassword;
    JButton search ,retrieve, back;
    Forgetpassword(){
        setBounds(350 , 200, 850, 380);
         getContentPane().setBackground(Color.white);
         setLayout(null);
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200 ,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 70,200,200);
        add(image);
      
         JPanel p1 = new JPanel();
         p1.setLayout(null);
         p1.setBounds(30,30,500,280); 
         add(p1);
         
      JLabel lblusername = new JLabel("Username :");
      lblusername.setBounds(60, 20,100,25);
      lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
      p1.add(lblusername);
        
      tfusername= new JTextField();
      tfusername.setBounds(190,20,150, 25);
      tfusername.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfusername);
      
      search = new JButton("Search");
      search.setBounds(350, 20, 100, 25);
      search.setBackground( Color.GRAY);
      search.setForeground(Color.WHITE);
      search.addActionListener(this);
      p1.add(search);
      
      JLabel lblname = new JLabel("Name :");
      lblname.setBounds(60, 60,100,25);
      lblname.setFont(new Font("Tahoma",Font.BOLD,14));
      p1.add(lblname);
      
      tfname= new JTextField();
      tfname.setBounds(190, 60, 150, 25);
      tfname.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfname);
      
      JLabel lblsecurity = new JLabel("Security Question :");
      lblsecurity.setBounds(60, 100,100,25);
      lblsecurity.setFont(new Font("Tahoma",Font.BOLD,14));
      p1.add(lblsecurity);
      
      tfsecurity= new JTextField();
      tfsecurity.setBounds(190, 100, 150, 25);
      tfsecurity.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfsecurity);
      
       JLabel lblAnswer = new JLabel("Answer :");
      lblAnswer.setBounds(60, 140,100,25);
      lblAnswer.setFont(new Font("Tahoma",Font.BOLD,14));
      p1.add(lblAnswer);
      
          
      tfanswer= new JTextField();
      tfanswer.setBounds(190, 140, 150, 25);
      tfanswer.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfanswer);
      
      retrieve= new JButton("Retrieve");
      retrieve.setBounds(350, 140, 100, 25);
      retrieve.setBackground( Color.GRAY);
      retrieve.setForeground(Color.WHITE);
      retrieve.addActionListener(this);
      p1.add(retrieve);
      
       JLabel lblpassword = new JLabel("password :");
      lblpassword.setBounds(60, 180,100,25);
      lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
      p1.add(lblpassword);
      
      tfpassword= new JTextField();
      tfpassword.setBounds(190, 180, 150, 25);
      tfpassword.setBorder(BorderFactory.createEmptyBorder());
      p1.add(tfpassword);
      
            
      back= new JButton("Back");
      back.setBounds(170, 210, 100, 25);
      back.setBackground( Color.GRAY);
      back.setForeground(Color.WHITE);
      back.addActionListener(this);
      p1.add(back);
      
      
      
      
         setVisible(true);
         
       
    
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
            try{
                String query= "select * from account where  username = '"+tfusername.getText()+"'" ;
                Conn c = new Conn();
               ResultSet rs= c.s.executeQuery(query);
               while(rs.next()){
               tfname.setText(rs.getString("name"));
               tfsecurity.setText(rs.getString("security"));
               }
                
            
            }catch(Exception e){
             e.printStackTrace();
            }
            
        
        }else if (ae.getSource()==retrieve ){
           try{
                String query= "select * from account where  answer = '"+tfanswer.getText()+"'AND username = '"+tfusername.getText()+"'" ;
                Conn c = new Conn();
               ResultSet rs= c.s.executeQuery(query);
               while(rs.next()){
               tfpassword.setText(rs.getString("password"));
               
               }
                
            
            }catch(Exception e){
             e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Login();
            
        
        }
    }
   
    
    public static void main (String[] args){
        new Forgetpassword();
    
    }

    
    
}
