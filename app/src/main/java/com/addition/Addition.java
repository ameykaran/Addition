package com.addition;


public class Addition {
    public static float add(float num1, float num2, float num3, float num4, float num5) {
        return num1 + num2 + num3 + num4 + num5;
    }

    public static float addx(float... values) {
        float total = 0.0f;

        for (float v : values) {
            total += v;
        }

        return total;
    }
}
