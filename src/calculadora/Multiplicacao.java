package calculadora;

public class Multiplicacao implements Operacao{
    public double a;
    public double b;
    public double resultado = 0.0;

    public Multiplicacao(double a , double b) {
        this.a = a;
        this.b = b;
    }

    public void calcula()
    {
        this.resultado = this.a * this.b;
    }

}