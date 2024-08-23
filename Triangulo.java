package x;

public class Triangulo extends Forma {

    public Triangulo(double base, double altura) {
        super(base, base, altura, "Triangulo");
    }

    @Override
    public double calcularArea2() {
        return (getBase() * getAltura()) / 2;
    }
    
}