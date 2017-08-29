/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonsystem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;

/**
 *
 * @author Сергей
 */
public class DrowPlanet extends JComponent implements Runnable{
    private ArrayList<Planet> planetList;
    private double tableX;
    private double tableY;
    private Thread thread;
    
    public DrowPlanet(int tableX,int tableY,Planet...planets){
        this.tableX =(double) tableX;
        this.tableY = (double)tableY;
        planetList = new ArrayList<>();
        planetList.addAll(Arrays.asList(planets));
        thread = new Thread(this);
        thread.start();
    }

    public DrowPlanet() {
        thread = new Thread(this);
    }
    
    
    @Override
    public void paint(Graphics g){
        g = (Graphics2D)g;
        for(Planet planet: planetList){
            g.setColor(planet.getColor());
            g.fillOval((int)( ( (tableX-100)/2 - planet.getSizeX()/2 - planet.getBaisX())), (int)(((tableY-100)/2-planet.getSizeX()/2-planet.getBaisY())),(int) planet.getSizeX(),(int) planet.getSizeY());
        }
    }

    @Override
    public void run() {
        while(true){
            movies();
            repaint();        
            try {
                thread.sleep(41);
            } catch (InterruptedException ex) {
                Logger.getLogger(DrowPlanet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void movies(){
        for(Planet planet: planetList){
            double t = planet.getT();
            planet.setBaisX( 0+planet.getRadius()*Math.cos(t) );
            planet.setBaisY( 0+planet.getRadius()*Math.sin(t) );
            if(t>359.999){
                t=0;
            }
            if(t<0){
                t=360+t;
            }
            if(planet.getName()=="Venera"){
                planet.setT(t-3.6/planet.getWay());
            }else
                planet.setT(t+3.6/planet.getWay());
        }
    }
}
