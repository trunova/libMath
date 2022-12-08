package ru.vsu.cs.trunova_a_m.Math;

public class Vector2 {
    private float x;
    private float y;
    private final float EPS = 1e-7f;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    protected Vector2 vectorsSum(final Vector2 vector) {
        Vector2 vector2 = new Vector2(x + vector.getX(), y + vector.getY());
        return vector2;
    }

    protected Vector2 vectorsDifference(final Vector2 vector) {
        return new Vector2(x - vector.getX(), y - vector.getY());
    }

    protected Vector2 scalarMultiplication(final float n) {
        return new Vector2(x * n, y * n);
    }

    protected Vector2 scalarDivision(final float n) throws Exception {
        if(Math.abs(n) > EPS)
            return new Vector2(x / n, y / n);
        else
            throw new Exception();
    }

    protected float length() {
        return (float) Math.sqrt(x * x + y * y);
    }

    protected Vector2 normalization() throws Exception {
        return this.scalarDivision(this.length());
    }

    protected float dotProduct(final Vector2 vector) {
        return x * vector.getX() + y * vector.getY();
    }

    @Override
    public boolean equals(Object obj){
        if (obj.getClass() != this.getClass()){
            return false;
        } else{
            Vector2 vector = (Vector2) obj;
            return Math.abs(x - vector.getX()) < EPS && Math.abs(y - vector.getY()) < EPS;
        }
    }
}
