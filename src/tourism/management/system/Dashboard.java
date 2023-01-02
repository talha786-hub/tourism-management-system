
package tourism.management.system;
 import javax.swing.*;
 import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addpersonalDetails,ViewpersonalDetails,updatepersonalDetails,checkpackages,Viewpackage,bookpackage,Viewhotels,destination;
    Dashboard(String username){
        this.username= username;
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setLayout(null);
    
    JPanel p1 = new JPanel();
    p1.setLayout(null);
    p1.setBackground(new Color(0,0,102));
    p1.setBounds(0, 0, 1600, 65);
    add(p1);
    
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/dashboard.png"));
    Image i2 = i1.getImage().getScaledInstance(70 ,70,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(30, 0,70,70);
    p1.add(image);
    
    JLabel heading = new JLabel(" DashBoard ");
    heading.setBounds(100, 10,300,40);
    heading.setForeground(Color.WHITE);
    heading.setFont(new Font("Tahoma",Font.BOLD,20));
    p1.add(heading); 
    
    JPanel p2 = new JPanel();
    p2.setLayout(null);
    p2.setBackground(new Color(0,0,102));
    p2.setBounds(0, 65, 300, 900);
    add(p2);
    
    
     addpersonalDetails= new JButton("Add Personel Details");
    addpersonalDetails.setBounds(0,20,300,40);
    addpersonalDetails.setBackground(new Color(0,0,102));
    addpersonalDetails.setForeground(Color.WHITE);
    addpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,18));
    addpersonalDetails.setMargin(new Insets(0,0,0,30) );
    addpersonalDetails.addActionListener(this);
    p2.add(addpersonalDetails);
    
    updatepersonalDetails= new JButton(" Update Personel Details");
    updatepersonalDetails.setBounds(0,60,300,40);
    updatepersonalDetails.setBackground(new Color(0,0,102));
    updatepersonalDetails.setForeground(Color.WHITE);
    updatepersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,18));
    updatepersonalDetails.setMargin(new Insets(0,0,0,20) );
    updatepersonalDetails.addActionListener(this);
    p2.add(updatepersonalDetails);
    
     
    ViewpersonalDetails= new JButton("View Personel Details");
    ViewpersonalDetails.setBounds(0,100,300,40);
    ViewpersonalDetails.setBackground(new Color(0,0,102));
    ViewpersonalDetails.setForeground(Color.WHITE);
    ViewpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,18));
    ViewpersonalDetails.setMargin(new Insets(0,0,0,30) );
    ViewpersonalDetails.addActionListener(this);
    p2.add(ViewpersonalDetails);
    
    JButton DeletepersonalDetails= new JButton("Delete Personel Details");
    DeletepersonalDetails.setBounds(0,140,300,40);
    DeletepersonalDetails.setBackground(new Color(0,0,102));
    DeletepersonalDetails.setForeground(Color.WHITE);
    DeletepersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,18));
    DeletepersonalDetails.setMargin(new Insets(0,0,0,20) );
    p2.add(DeletepersonalDetails);
    
    checkpackages= new JButton("Check Packages");
    checkpackages.setBounds(0,180,300,40);
    checkpackages.setBackground(new Color(0,0,102));
    checkpackages.setForeground(Color.WHITE);
    checkpackages.setFont(new Font("Tahoma",Font.PLAIN,18));
    checkpackages.setMargin(new Insets(0,0,0,70) );
    checkpackages.addActionListener(this);
    p2.add(checkpackages);
    
     bookpackage= new JButton("Book Package");
    bookpackage.setBounds(0,221,300,40);
    bookpackage.setBackground(new Color(0,0,102));
    bookpackage.setForeground(Color.WHITE);
    bookpackage.setFont(new Font("Tahoma",Font.PLAIN,18));
    bookpackage.setMargin(new Insets(0,0,0,80) );
    bookpackage.addActionListener(this);
    p2.add(bookpackage);
    
     Viewpackage= new JButton("View Package");
    Viewpackage.setBounds(0,260,300,40);
    Viewpackage.setBackground(new Color(0,0,102));
    Viewpackage.setForeground(Color.WHITE);
    Viewpackage.setFont(new Font("Tahoma",Font.PLAIN,18));
    Viewpackage.setMargin(new Insets(0,0,0,80) );
    Viewpackage.addActionListener(this);
    p2.add(Viewpackage);
    
     Viewhotels= new JButton("View Hotels");
    Viewhotels.setBounds(0,300,300,40);
    Viewhotels.setBackground(new Color(0,0,102));
    Viewhotels.setForeground(Color.WHITE);
    Viewhotels.setFont(new Font("Tahoma",Font.PLAIN,18));
    Viewhotels.setMargin(new Insets(0,0,0,90) );
    Viewhotels.addActionListener(this);
    p2.add(Viewhotels);
    
    
    JButton bookhotel= new JButton(" Book Hotel");
    bookhotel.setBounds(0,342,300,40);
    bookhotel.setBackground(new Color(0,0,102));
    bookhotel.setForeground(Color.WHITE);
    bookhotel.setFont(new Font("Tahoma",Font.PLAIN,18));
    bookhotel.setMargin(new Insets(0,0,0,90) );
    p2.add(bookhotel);
    
    JButton Viewbookhotels= new JButton("View Booked Hotel");
    Viewbookhotels.setBounds(0,384,300,40);
    Viewbookhotels.setBackground(new Color(0,0,102));
    Viewbookhotels.setForeground(Color.WHITE);
    Viewbookhotels.setFont(new Font("Tahoma",Font.PLAIN,18));
    Viewbookhotels.setMargin(new Insets(0,0,0,60) );
    p2.add(Viewbookhotels);
    
     destination= new JButton("Destinaton");
    destination.setBounds(0,428,300,40);
    destination.setBackground(new Color(0,0,102));
    destination.setForeground(Color.WHITE);
    destination.setFont(new Font("Tahoma",Font.PLAIN,18));
    destination.setMargin(new Insets(0,0,0,100) );
    destination.addActionListener(this);
    p2.add(destination);
    
    JButton payments= new JButton("Payments");
    payments.setBounds(0,468,300,40);
    payments.setBackground(new Color(0,0,102));
    payments.setForeground(Color.WHITE);
    payments.setFont(new Font("Tahoma",Font.PLAIN,18));
    payments.setMargin(new Insets(0,0,0,100) );
    p2.add(payments);
    
    JButton calculater= new JButton("Calculater");
    calculater.setBounds(0,508,300,40);
    calculater.setBackground(new Color(0,0,102));
    calculater.setForeground(Color.WHITE);
    calculater.setFont(new Font("Tahoma",Font.PLAIN,18));
    calculater.setMargin(new Insets(0,0,0,100) );
    p2.add(calculater);
    
    JButton notepad= new JButton("Notepad");
    notepad.setBounds(0,550,300 ,40);
    notepad.setBackground(new Color(0,0,102));
    notepad.setForeground(Color.WHITE);
    notepad.setFont(new Font("Tahoma",Font.PLAIN,18));
    notepad.setMargin(new Insets(0,0,0,100) );
    p2.add(notepad);
    
    JButton about= new JButton("About");
    about.setBounds(0,593,300 ,40);
    about.setBackground(new Color(0,0,102));
    about.setForeground(Color.WHITE);
    about.setFont(new Font("Tahoma",Font.PLAIN,18));
    about.setMargin(new Insets(0,0,0,100) );
    p2.add(about);
    
    ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Icons/home.jpg"));
    Image i5 = i4.getImage().getScaledInstance(1365 ,703,Image.SCALE_DEFAULT);
    ImageIcon i6 = new ImageIcon(i5);
    JLabel img = new JLabel(i6);
    img.setBounds(0, 0,1365,703);
    add(img);
    
    JLabel  text = new  JLabel("Tourism Management System");
    text.setBounds(400,90,1200,40);
    text.setBackground(Color.WHITE);
    text.setFont(new Font("raleway",Font.BOLD,35));
    img.add(text);
  
    setVisible(true);
    }  
      public void actionPerformed(ActionEvent ae){
        
     if(ae.getSource()== addpersonalDetails){
         new Addcustomer(username);
     }else if(ae.getSource()==ViewpersonalDetails){
         new Viewcustomer(username);
     }else if(ae.getSource()==updatepersonalDetails){
         new Viewcustomer(username);
      }else if(ae.getSource()==checkpackages){
         new Checkpackage(); 
      }else if(ae.getSource()== bookpackage){
         new Bookpackage(username);
      
      }else if(ae.getSource()==Viewpackage){
         new viewpackage(username);
      }else if(ae.getSource()==Viewhotels){
         new CheckHotels();
      }else if(ae.getSource()==destination){
         new Destinations();
      } 
         

     
      }
    public static void main(String [] args){
     new Dashboard("");
    
    }
}
