/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication1;

import java.util.Scanner;

/**
 *
 * @author TOKELO
 */
public class RunApplication1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String consoleType;
        String store;
        int totalSales;
        
        //Menu
        System.out.println("Select the console type");
        System.out.print("1. PSS");
        System.out.print("2. XBOX");
        System.out.print("SWITCH");
        
        //user input
        System.out.println();
        System.out.print("Enter the store: ");
        store = scan.nextLine();
        
        System.out.print("Enter the total sales of PSS consoles for Number 1 Electronics store:R ");
        totalSales = scan.nextInt();
        
        //Instantiate object
        ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);
        sales.printReport();
    }
}
