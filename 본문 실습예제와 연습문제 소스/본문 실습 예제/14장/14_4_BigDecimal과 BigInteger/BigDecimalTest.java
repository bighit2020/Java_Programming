package ch14.ex3;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        System.out.println(3.00 - 2.10); // 0.9나와야 하는데 0.899999999 나옴
        BigDecimal b1 = new BigDecimal("3.00");
        BigDecimal b2 = new BigDecimal("2.10");
        System.out.println(b1.subtract(b2)); // 제대로 나옴
    }
}

