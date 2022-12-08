package ru.vsu.cs.trunova_a_m.Math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Matrix3Test {

    @Test
    void addition() {
        Matrix3 matrix1 = new Matrix3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Matrix3 matrix2 = new Matrix3(9, 8, 7, 6, 5, 4, 3, 2, 1);
        Matrix3 result = new Matrix3(10, 10, 10, 10, 10, 10, 10, 10, 10);
        Assertions.assertEquals(matrix1.addition(matrix2), result);
    }

    @Test
    void subtraction() {
        Matrix3 matrix1 = new Matrix3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Matrix3 matrix2 = new Matrix3(9, 8, 7, 6, 5, 4, 3, 2, 1);
        Matrix3 result = new Matrix3(-8, -6, -4, -2, 0, 2, 4, 6, 8);
        Assertions.assertEquals(matrix1.subtraction(matrix2), result);
    }

    @Test
    void multiplicationByVector() {
        Matrix3 matrix = new Matrix3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Vector3 vector = new Vector3(0, 1, 2);
        Vector3 result = new Vector3(8, 17, 26);
        Assertions.assertEquals(matrix.multiplicationByVector(vector), result);
    }

    @Test
    void transposition() {
        Matrix3 matrix = new Matrix3(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Matrix3 result = new Matrix3(1, 4, 7, 2, 5, 8, 3, 6, 9);
        matrix.transposition();
        Assertions.assertEquals(matrix, result);
    }

    @Test
    void nullMatrix() {
        Matrix3 result = new Matrix3(0, 0, 0, 0, 0, 0, 0, 0, 0);
        Matrix3 matrix = Matrix3.nullMatrix();
        Assertions.assertEquals(matrix, result);
    }

    @Test
    void identityMatrix() {
        Matrix3 result = new Matrix3(1, 0, 0, 0, 1, 0, 0, 0, 1);
        Matrix3 matrix = Matrix3.identityMatrix();
        Assertions.assertEquals(matrix, result);
    }
    @Test
    void determinant() {
        Matrix3 matrix = new Matrix3(1, 5, 3, 4, 5, 6, 7, 8, 9);
        int det = 18;
        Assertions.assertEquals(matrix.determinant(), det);
    }
    @Test
    void inverseMatrix() {
        Matrix3 matrix = new Matrix3(2, 5, 7, 6, 3, 4, 5, -2, -3);
        Matrix3 result = new Matrix3(1, -1, 1, -38, 41, -34, 27, -29, 24);
        Assertions.assertEquals(matrix.inverseMatrix(), result);
    }
}