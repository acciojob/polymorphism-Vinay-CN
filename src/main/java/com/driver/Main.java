package com.driver;

public class Main {
 public static void main(String[] args){
     product p = new product();
     p.product(5,10);
     p.product(5,10,15);
     p.product(1.0,2.0);


 }
    public static class product{
        public int product(int x , int y){
            return x+y;
        }

        public int product(int x , int y ,int z){
            return x+y+z;
        }

        public double product(double x ,double y ){
            return x*y;
        }
    }
}