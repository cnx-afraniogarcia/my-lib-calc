package org.example;

public class CalculadoraImpl implements Calculadora{
    @Override
    public double soma(double x, double y) {
        return x + y;
    }

    @Override
    public double soma(double x, double y, double z) {
        return x + y + z;
    }

    @Override
    public double soma(double[] valores) {
        if(valores.length == 0) throw new RuntimeException("Lista vazia");
        double resul = 0;
        for(double v: valores){
            resul += v;
        }
        return resul;
    }

    @Override
    public double sub(double x, double y) {
        return x - y;
    }

    @Override
    public double sub(double x, double y, double z) {
        return x - y - z;
    }

    @Override
    public double sub(double[] valores) {
        if(valores.length == 0) throw new RuntimeException("Lista vazia");
        double x = valores[0];
        for(int i = 1; i < valores.length; i++) {
            x -= valores[i];
        }
      return x;
    }

    @Override
    public double mult(double x, double y) {
        return x * y;
    }

    @Override
    public double mult(double x, double y, double z) {
        return x * y * z;
    }

    @Override
    public double mult(double[] valores) {
        if(valores.length == 0) throw new RuntimeException("Lista vazia");
        double resul = 1;
        for(double v: valores){
            resul *= v;
        }
        return resul;
    }

    @Override
    public double div(double x, double y) {
        if(y == 0) throw new ArithmeticException("Não pode dividir por zero");
        return x / y;
    }
}
