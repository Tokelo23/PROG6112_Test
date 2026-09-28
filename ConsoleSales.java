/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication1;

/**
 *
 * @author TOKELO
 */
public class ConsoleSales extends Consoles {

    //constructor
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }
    
    //method to print report
    public void printReport(){
        System.out.println();
        System.out.println("Console Sales Report");
        System.out.println("Console type: " +consoleType);
        System.out.println("Store: " +store);
        System.out.println("Total sales: " +totalSales);
    }
}
