/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yearlysales;

/**
 *
 * @author TOKELO
 */
public class YearlySales {

    public static void main(String[] args) {
        
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        
        int[][] sales = { {1000, 2000, 3000},//Cape Town
                          {2000, 3000, 4000},//Port elizabeth
                          {1500, 1100, 1200} };//Pretoria
        
        int[] total = new int[3];
                
        int highestCity = 0;
        //Display report
        System.out.println("Gaming console report");
        System.out.println();
        System.out.println("           PSS      XBOX     SWITCH");
        
        for(int i = 0; i < cities.length; i++){
            System.out.println(cities[i]+ "         " +sales[i][0]+ "   " +sales[i][1]+ "   " +sales[i][2]);

        }
        
        //Calculate total sales 
        for(int i = 0; i < cities.length; i++){
            total[i] =  sales[i][0] + sales[i][1] + sales[i][2];
           
        }
        
        //calculate most sales
        for (int i = 1; i < total.length; i++) {

            if (total[i] > total[highestCity]) {
                highestCity = i;
            }
        }
        
        
        //Display total sales
        System.out.println();
        System.out.println("Console sales totals for each city");
        
        for(int i = 0; i< cities.length; i++){
            System.out.println(cities[i]+ "      " +total[i]);
        }
        
        //Display most sales
        System.out.println();
        System.out.println("City with the most aales: " +cities[highestCity]);
    }
}
