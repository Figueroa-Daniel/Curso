package org.example;

public class B {
    double d;

    public B(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "B{" +
                "d=" + d +
                '}';
    }
}
