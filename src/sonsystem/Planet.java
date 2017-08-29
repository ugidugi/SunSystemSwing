
package sonsystem;

import java.awt.Color;


public class Planet{
    private String name;
    private double sizeX;
    private double sizeY;
    private Color color;
    private double baisX;
    private double baisY;
    private double radius;
    private double way;
    private double t = 0;

    public Planet(String name,double sizeX, double sizeY, Color color,double radius,double way) {
        this.name = name;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.color = color;
        this.radius = radius;
        this.baisX = radius;
        this.baisY = radius;
        this.way = way;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getBaisX() {
        return baisX;
    }

    public void setBaisX(double baisX) {
        this.baisX = baisX;
    }

    public double getBaisY() {
        return baisY;
    }

    public void setBaisY(double baisY) {
        this.baisY = baisY;
    }
    
    public double getWay() {
        return way;
    }

    public void setWay(double way) {
        this.way = way;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getSizeX() {
        return sizeX;
    }

    public void setSizeX(double sizeX) {
        this.sizeX = sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }

    public void setSizeY(double sizeY) {
        this.sizeY = sizeY;
    }
    
    
    
}
