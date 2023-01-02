package tourism.management.system;

import javax.swing.*;
import java.awt.*;

public class Destinations extends JFrame implements Runnable {
    Thread t1;
    JLabel[] label;

    public void run() {
        String[] text = new String[]{"JW Marriott Hotel","Mandarin Oriental Hotel","Four Seasons Hotel","Radisson Hotel","Classio Hotel","The Bay Club Hotel","Breeze Blows Hotel","Quick Stop Hotel","Quick Stop Hotel","Moss View Hotel"};
        try {
            for (int i = 0; i < 9; i++) {
                label[i].setVisible(true);
                Thread.sleep(2500);
                label[i].setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Destinations() {
        setBounds(500, 200, 800, 600);

        ImageIcon[] image = new ImageIcon[9];
        Image[] jimage = new Image[9];
        ImageIcon[] kimage = new ImageIcon[9];
        label = new JLabel[9]; // Initialize the label array with length 9

        for (int i = 0; i < 9; i++) {
            image[i] = new ImageIcon(ClassLoader.getSystemResource("Icons/hotel" + (i + 1) + ".jpg"));
            jimage[i] = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            kimage[i] = new ImageIcon(jimage[i]);
            label[i] = new JLabel(kimage[i]);
            label[i].setBounds(0, 0, 800, 600);
            add(label[i]);
        }

        setVisible(true);

        t1 = new Thread(this);
        t1.start();
    }

    public static void main(String[] args) {
        new Destinations();
    }
}
