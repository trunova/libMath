package ru.vsu.cs.trunova_a_m.Math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Vector3Test {

    @Test
    void vectorsSum() {
        Vector3 vector1 = new Vector3(3, -1, 0);
        Vector3 vector2 = new Vector3(2, 2, 6);
        Vector3 vectorSum = new Vector3(5,1, 6);
        Assertions.assertEquals(vector1.vectorsSum(vector2), vectorSum);
    }

    @Test
    void vectorsDifference() {
        Vector3 vector1 = new Vector3(3, -1, 0);
        Vector3 vector2 = new Vector3(2, 2, 6);
        Vector3 vectorsDifference = new Vector3(1,-3, -6);
        Assertions.assertEquals(vector1.vectorsDifference(vector2), vectorsDifference);
    }

    @Test
    void scalarMultiplication() {
        Vector3 vector1 = new Vector3(3, -1, 0);
        int n = 7;
        Vector3 scalarMultiplication = new Vector3(21,-7, 0);
        Assertions.assertEquals(vector1.scalarMultiplication(n), scalarMultiplication);
    }

    @Test
    void scalarDivision() throws Exception {
        Vector3 vector1 = new Vector3(21,-7, 0);
        int n = 7;
        Vector3 scalarDivision = new Vector3(3, -1, 0);
        Assertions.assertEquals(vector1.scalarDivision(n), scalarDivision);
    }

    @Test
    void length() {
        Vector3 vector = new Vector3(2, 2, 3);
        float len = (float) Math.sqrt(17);
        Assertions.assertEquals(vector.length(), len);
    }

    @Test
    void normalization() throws Exception {
        Vector3 vector = new Vector3((float) (2 / Math.sqrt(17)), (float) (2 / Math.sqrt(17)), (float) (3 / Math.sqrt(17)));
        Assertions.assertEquals(new Vector3(2, 2, 3).normalization(), vector);
    }

    @Test
    void scalarProduct() {
        Vector3 vector1 = new Vector3(3, -1, 0);
        Vector3 vector2 = new Vector3(2, 2, 9);
        double result = 4;
        Assertions.assertEquals(vector1.scalarProduct(vector2), result);
    }

    @Test
    void testCrossProduct() {
        Vector3 vector1 = new Vector3(3, -1, 0);
        Vector3 vector2 = new Vector3(2, 2, 9);
        Vector3 result = new Vector3(-9, -27, 8);
        Assertions.assertEquals(vector1.crossProduct(vector2), result);
    }
}