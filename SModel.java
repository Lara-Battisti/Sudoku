/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vhscs3.capstoneproject;

import java.io.Serializable;

/**
 *
 * @author battisti_877628
 */
public class SModel implements Serializable{
    
    private int[][] board;
    
    public SModel(int[][] board){
        this.board = board;
    }
    
    public int[][] getBoard(){
        return board;
    }
    
}
