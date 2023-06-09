package com.driver;
import java.util.*;
public class Main {
    static class Product{
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(5 , 6);
        p.product(5 , 6 ,2);
        p.product(2.0,3.0);
    }

}