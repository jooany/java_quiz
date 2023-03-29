package org.example;

import org.example.practice.DiscountSale;
import org.example.practice.NumToArray01;
import org.example.practice.StringtoInt;

public class Main {
    public static void main(String[] args) {
//        NumToArray01.NumToArray01Solution(12345);
//        System.out.println(StringtoInt.stringToInTsolution(18));

        // 할인 행사
        DiscountSale.DiscountSaleSolution(new String[]{"banana", "apple", "rice", "pork", "pot"},
                                            new int[]{3, 2, 2, 2, 1},
                                        new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"});
    }
}