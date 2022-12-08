package ru.vsu.cs.trunova_a_m.Math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Vector2Test {

    @Test
    void vectorsSum() {
        Vector2 vector1 = new Vector2(3, -1);
        Vector2 vector2 = new Vector2(2, 2);
        Vector2 vectorSum = new Vector2(5,1);
        Assertions.assertEquals(vector1.vectorsSum(vector2), vectorSum);
    }

    @Test
    void vectorsDifference() {
        Vector2 vector1 = new Vector2(3, -1);
        Vector2 vector2 = new Vector2(2, 2);
        Vector2 vectorsDifference = new Vector2(1,-3);
        Assertions.assertEquals(vector1.vectorsDifference(vector2), vectorsDifference);
    }

    @Test
    void scalarMultiplication() {
        Vector2 vector1 = new Vector2(3, -1);
        int n = 7;
        Vector2 scalarMultiplication = new Vector2(21,-7);
        Assertions.assertEquals(vector1.scalarMultiplication(n), scalarMultiplication);
    }

    @Test
    void scalarDivision() throws Exception {
        Vector2 vector = new Vector2(21,-7);
        int n = 7;
        Vector2 scalarDivision = new Vector2(3, -1);
        Assertions.assertEquals(vector.scalarDivision(n), scalarDivision);
    }

    @Test
    void length() {
        Vector2 vector = new Vector2(2, 2);
        float len = (float) Math.sqrt(8);
        Assertions.assertEquals(vector.length(), len);
    }

    @Test
    void normalization() throws Exception {
        Vector2 vector = new Vector2((float) (2 / Math.sqrt(8)), (float) (2 / Math.sqrt(8)));
        Assertions.assertEquals(new Vector2(2, 2).normalization(), vector);
    }

    @Test
    void scalarProduct() {
        Vector2 vector1 = new Vector2(3, -1);
        Vector2 vector2 = new Vector2(2, 2);
        double result = 6 - 2;
        Assertions.assertEquals(vector1.dotProduct(vector2), result);
    }
}