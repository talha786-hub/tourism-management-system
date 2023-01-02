
package tourism.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public  class Loading extends JFrame implements Runnable {
    Thread t;
     JProgressBar bar;
     String username;
     
      public void run(){
      try{
          for(int i =1 ; i<= 101; i++){
          int max = bar.getMaximum();//100
          int Value = bar.getValue();
          
          if (Value <max){ // 101<100
                  bar.setValue(bar.getValue() + 1);
          }else{
              setVisible(false);
              new Dashboard(username);
        
        }
          Thread.sleep(50);
      }
      }catch(Exception e){
      e.printStackTrace();
      }
      
      }
     
     
     
    Loading(String username){
        this. username= username;
        t = new Thread(this);
    setBounds(500,200,650,400);
    getContentPane().setBackground(Color.white);
     setLayout(null);
     
     JLabel text = new JLabel("Tourism Management System :");
     text.setBounds(50, 20,640,40);
     text.setForeground(Color.BLUE);
     text.setFont(new Font("Raleway",Font.BOLD,34));
     add(text);
      
      
      bar = new JProgressBar();
      bar.setBounds(150,80,300,35);
      bar.setStringPainted(true);
      add(bar);
      
     JLabel loading = new JLabel("Loading Wait.... :");
     loading.setBounds(220, 120,220,40);
     loading.setForeground(Color.RED);
     loading.setFont(new Font("Raleway",Font.BOLD,15));
     add(loading);
     
     JLabel lblusername = new JLabel("Welcome" + username);
     lblusername.setBounds(20, 320,640,40);
     lblusername.setForeground(Color.RED);
     lblusername.setFont(new Font("Raleway",Font.BOLD,25));
     add(lblusername);
     
  
     t.start();
     setVisible(true);
    
    
    
    }



public static void main (String [] args){
         new Loading("");
}
}

