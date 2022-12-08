package ru.vsu.cs.trunova_a_m.Math;

public class Vector3 {
    private float x;
    private float y;
    private float z;
    private final float EPS = 1e-7f;


    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    protected Vector3 vectorsSum(final Vector3 vector) {
        return new Vector3(x + vector.getX(), y + vector.getY(), z + vector.getZ());
    }

    protected Vector3 vectorsDifference(final Vector3 vector) {
        return new Vector3(x - vector.getX(), y - vector.getY(), z - vector.getZ());
    }

    protected Vector3 scalarMultiplication(final float n) {
        return new Vector3(x * n, y * n, z * n);
    }

    protected Vector3 scalarDivision(final float n) throws Exception {
        if(n > EPS)
            return new Vector3(x / n, y / n, z / n);
        else
            throw new Exception();
    }

    protected float length() {
        return (float) Math.sqrt(x*x + y*y + z*z);
    }

    protected Vector3 normalization() throws Exception {
        return this.scalarDivision(this.length());
    }

    protected float scalarProduct(final Vector3 vector) {
        return x * vector.getX() + y * vector.getY() + z * vector.getZ();
    }

    protected Vector3 crossProduct(final Vector3 vector) {
        return new Vector3(y * vector.getZ() - z * vector.getY(),
                z * vector.getX() - x * vector.getZ(), - y * vector.getX() + x * vector.getY());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        } else {
            Vector3 vector = (Vector3) obj;
            return Math.abs(x - vector.getX()) < EPS && Math.abs(y - vector.getY()) < EPS &&
                    Math.abs(z - vector.getZ()) < EPS;
        }
    }
}
