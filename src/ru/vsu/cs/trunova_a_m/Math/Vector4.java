package ru.vsu.cs.trunova_a_m.Math;

public class Vector4{
    private float x;
    private float y;
    private float z;
    private float l;
    private final float EPS = 1e-7f;

    public Vector4(float x, float y, float z, float l) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.l = l;
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
    public float getL() {
        return l;
    }

    protected Vector4 vectorsSum(final Vector4 vector) {
        return new Vector4(x + vector.getX(), y + vector.getY(), z + vector.getZ(), l + vector.getL());
    }

    protected Vector4 vectorsDifference(final Vector4 vector) {
        return new Vector4(x - vector.getX(), y - vector.getY(), z - vector.getZ(), l - vector.getL());
    }

    protected Vector4 scalarMultiplication(final float n) {
        return new Vector4(x * n, y * n, z * n, l * n);
    }

    protected Vector4 scalarDivision(final float n) throws Exception {
        if(n > EPS)
            return new Vector4(x / n, y / n, z / n, l / n);
        else
            throw new Exception();
    }

    protected float length() {
        return (float) Math.sqrt(x*x + y*y + z*z + l*l);
    }

    protected Vector4 normalization() throws Exception {
        return this.scalarDivision(this.length());
    }

    protected float scalarProduct(final Vector4 vector) {
        return x * vector.getX() + y * vector.getY() + z * vector.getZ() + l * vector.getL();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        } else {
            Vector4 vector = (Vector4) obj;
            return Math.abs(x - vector.getX()) < EPS && Math.abs(y - vector.getY()) < EPS &&
                    Math.abs(z - vector.getZ()) < EPS && Math.abs(l - vector.getL()) < EPS;
        }
    }

}
