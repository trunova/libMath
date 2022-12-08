package ru.vsu.cs.trunova_a_m.Math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Matrix4Test {

    @Test
    void addition() {
        Matrix4 matrix1 = new Matrix4(1, 2, 3, 4, 5, 6, 7, 8,
                                            9, 8, 7, 6, 5, 4, 3, 2);
        Matrix4 matrix2 = new Matrix4(9, 8, 7, 6, 5, 4, 3, 2,
                                            1, 2, 3, 4, 5, 6, 7, 8);
        Matrix4 result = new Matrix4(10, 10, 10, 10, 10, 10, 10, 10,
                                         10, 10, 10, 10, 10, 10, 10, 10);
        Assertions.assertEquals(matrix1.addition(matrix2), result);
    }

    @Test
    void subtraction() {
        Matrix4 matrix1 = new Matrix4(1, 2, 3, 4, 5, 6, 7, 8,
                                            9, 8, 7, 6, 5, 4, 3, 2);
        Matrix4 matrix2 = new Matrix4(9, 8, 7, 6, 5, 4, 3, 2,
                                            1, 2, 3, 4, 5, 6, 7, 8);
        Matrix4 result = new Matrix4(-8, -6, -4, -2, 0, 2, 4, 6,
                                         8, 6, 4, 2, 0, -2, -4, -6);
        Assertions.assertEquals(matrix1.subtraction(matrix2), result);
    }

    @Test
    void multiplicationByVector() {
        Matrix4 matrix = new Matrix4(1, 2, 3, 4, 5, 4, 3, 2,
                                           1, 2, 3, 4, 5, 4, 3, 2);
        Vector4 vector = new Vector4(0, 1, 2, 3);
        Vector4 result = new Vector4(20, 16, 20, 16);
        Assertions.assertEquals(matrix.multiplicationByVector(vector), result);
    }

    @Test
    void transposition() {
        Matrix4 matrix = new Matrix4(1, 2, 3, 4, 5, 6, 7, 8,
                                           9, 8, 7, 6, 5, 4, 3, 2);
        Matrix4 result = new Matrix4(1, 5, 9, 5, 2, 6, 8, 4,
                                         3, 7, 7, 3, 4, 8, 6, 2);
        matrix.transposition();
        Assertions.assertEquals(matrix, result);
    }

    @Test
    void nullMatrix() {
        Matrix4 result = new Matrix4(0, 0, 0, 0, 0, 0, 0,
                                         0, 0, 0, 0, 0, 0, 0, 0, 0);
        Matrix4 matrix = Matrix4.nullMatrix();
        Assertions.assertEquals(matrix, result);
    }

    @Test
    void identityMatrix() {
        Matrix4 result = new Matrix4(1, 0, 0, 0, 0, 1, 0,
                                         0, 0, 0, 1, 0, 0, 0, 0, 1);
        Matrix4 matrix = Matrix4.identityMatrix();
        Assertions.assertEquals(matrix, result);
    }

    @Test
    void determinant() {
        Matrix4 matrix = new Matrix4(1, 4, 3, 0, 7, 6, 54, 3, 2, 34, 4, 4, 4, 5, 5, 6);
        float det = -7564;
        Assertions.assertEquals(matrix.determinant(), det);
    }

    @Test
    void inverseMatrix() {
        Matrix4 matrix = new Matrix4(2, 1, 0, 0, 3, 2, 0, 0, 1, 1, 3, 4, 2, -1, 2, 3);
        Matrix4 result = new Matrix4(2, -1, 0, -0, -3, 2, 0, 0, 31, -19, 3, -4, -23, 14, -2, 3);
        Assertions.assertEquals(matrix.inverseMatrix(), result);
    }

}