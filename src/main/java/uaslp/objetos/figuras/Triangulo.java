package uaslp.objetos.figuras;

public class Triangulo implements Figura{
    public double base;
    public double altura;
    protected String description;
    protected String name = "Triangulo";

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.description = "Cualquier triangulo";
    }

    public Triangulo() {
        this.description = "Cualquier triangulo";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return base * altura / 2;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }
}
