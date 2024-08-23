package x;

public class Forma {
	private double base;
    private double largura;
    private double altura;
    

    public Forma(double base, double largura, double altura, String forma) {
        this.base = base;
        this.largura = largura;
        this.altura = altura;
      
    }
    

    public double getBase() {
        return base;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea() {
        return 0; // This method should be overridden in subclasses
    }
    
    
    public double mostrarInfo() {
    	return calcularArea();
    }


    public String mostarInfo2() {
		return "Base: " + base + "\nAltura: " + altura;
	}


	public double calcularArea2() {
		// TODO Auto-generated method stub
		return 0;
	}
}