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
        int first = p.product(5 , 6);
        System.out.println(first);
        int second = p.product(5 , 6 ,2);
        double third = p.product(2,3);
        System.out.println(second);
        System.out.println(third);
    }

}