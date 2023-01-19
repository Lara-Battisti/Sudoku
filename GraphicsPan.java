/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vhscs3.capstoneproject;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author battisti_877628
 */
public class GraphicsPan extends JPanel{
    
    public void setLines(){
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.BLACK);
        g.drawLine(205, 10, 205, 600);
        g.drawLine(405, 10, 405, 600);
        g.drawLine(10, 205, 600, 205);
        g.drawLine(10, 405, 600, 405);
        
    }
    
}
