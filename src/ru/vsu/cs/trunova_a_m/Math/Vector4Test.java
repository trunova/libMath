package ru.vsu.cs.trunova_a_m.Math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Vector4Test {

    @Test
    void vectorsSum() {
        Vector4 vector1 = new Vector4(3, -1, 0, 4);
        Vector4 vector2 = new Vector4(2, 2, 6, 3);
        Vector4 vectorSum = new Vector4(5,1, 6, 7);
        Assertions.assertEquals(vector1.vectorsSum(vector2), vectorSum);
    }

    @Test
    void vectorsDifference() {
        Vector4 vector1 = new Vector4(3, -1, 0, 4);
        Vector4 vector2 = new Vector4(2, 2, 6, 3);
        Vector4 vectorsDifference = new Vector4(1,-3, -6, 1);
        Assertions.assertEquals(vector1.vectorsDifference(vector2), vectorsDifference);
    }

    @Test
    void scalarMultiplication() {
        Vector4 vector1 = new Vector4(3, -1, 0, 7);
        int n = 7;
        Vector4 scalarMultiplication = new Vector4(21,-7, 0, 49);
        Assertions.assertEquals(vector1.scalarMultiplication(n), scalarMultiplication);
    }

    @Test
    void scalarDivision() throws Exception {
        Vector4 vector1 = new Vector4(21,-7, 0, 49);
        int n = 7;
        Vector4 scalarDivision = new Vector4(3, -1, 0, 7);
        Assertions.assertEquals(vector1.scalarDivision(n), scalarDivision);
    }

    @Test
    void length() {
        Vector4 vector = new Vector4(2, 2, 3, 0);
        float len = (float) Math.sqrt(17);
        Assertions.assertEquals(vector.length(), len);
    }

    @Test
    void normalization() throws Exception {
        Vector4 vector = new Vector4((float) (2 / Math.sqrt(17)), (float) (2 / Math.sqrt(17)), (float) (3 / Math.sqrt(17)), 0);
        Assertions.assertEquals(new Vector4(2, 2, 3, 0).normalization(), vector);
    }

    @Test
    void scalarProduct() {
        Vector4 vector1 = new Vector4(3, -1, 0, 1);
        Vector4 vector2 = new Vector4(2, 2, 9, 1);
        int result = 5;
        Assertions.assertEquals(vector1.scalarProduct(vector2), result);
    }
}