
package sonsystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.Spring.height;
import static javax.swing.Spring.width;



public class SonSystem {
    private static int width = 1000;
    private static int height = 1000;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show(true);
        frame.setSize(width, height);
        JPanel panel = new JPanel();
        panel.setSize(width-50, height-600);
        frame.setBackground(Color.BLACK);
        
        panel.setVisible(true);
        Planet sun = new Planet("Sun", 40, 40, Color.yellow, 0,1);
        Planet mer = new Planet("Mercury", 5, 5, Color.orange, 57, 87.97);
        Planet ven = new Planet("Venera", 9, 9, Color.orange, 108, 224.322);
        Planet ear = new Planet("Earht", 11, 11, Color.blue, 149, 365.2564);
        Planet mar = new Planet("Mars", 7, 7, Color.orange, 227,686.682);
        Planet jup = new Planet("Jupiter", 14, 14, Color.gray, 380,4380);
        Planet sat = new Planet("Saturn", 13, 13, Color.gray, 420,10584);
        DrowPlanet dp = new DrowPlanet(width, height,sun, mer,ven,ear,mar,jup,sat);
        frame.add(dp);
    }
}
