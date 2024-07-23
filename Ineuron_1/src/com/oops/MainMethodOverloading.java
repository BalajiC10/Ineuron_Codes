package com.oops;

class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("This is the standard main method.");
    }

    public static void main(int x) {
        System.out.println("This is an overloaded main method.");
    }
    
   //In Java, you cannot directly override the main method. 
   //This is because the main method is a static method, and static methods cannot be overridden.
   
    
    
}