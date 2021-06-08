package uaslp.objetos.figuras;

public class PoligonoRegular {
    private int numeroDeLados;
    private double lado;

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public PoligonoRegular(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }


    public double getArea() {
        double AnguloCentral = 360/numeroDeLados;
        double tangente = Math.tan(Math.toRadians(AnguloCentral/2));
        return ((numeroDeLados * Math.pow(lado, 2))/4)/ tangente;
    }
}

