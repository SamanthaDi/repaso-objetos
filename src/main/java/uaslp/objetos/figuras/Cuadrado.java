package uaslp.objetos.figuras;

public class Cuadrado implements Figura{

    private double lado;
    private String name = "Cuadrado";


    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {

    }

    @Override
    public String getName() {
        return name;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        if(lado == 0)
            throw new LadoNoProvistoException();
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }
}
