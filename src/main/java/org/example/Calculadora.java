package org.example;

public interface Calculadora {
    double soma(double x, double y);

    double soma(double x, double y, double z);

    double soma(double[] valores);

    double sub(double x, double y);

    double sub(double x, double y, double z);

    double sub(double[] valores);

    double mult(double x, double y);

    double mult(double x, double y, double z);

    double mult(double[] valores);

    double div(double x, double y);
}
