/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.dailychallenge.dailychallenge;

/**
 *
 * @author SORO
 */
public class DailyChallenge {

    public static void main(String[] args) {
        Person person1 = new Person();
        
        Person person2 = new Person("SORO WONGNIGA SEYDOU", 27, 1000000);
        
        person1.DisplayInfo();
        
        person2.DisplayInfo();
        
        Person person3 = new Person("SAYD SORO", 38);
        
        person3.DisplayInfo();
    }
}
