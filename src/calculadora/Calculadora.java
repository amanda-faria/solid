package calculadora;

public class Calculadora {
    public void calcule(Operacao operacao) throws Exception {

        if (operacao == null) {
            throw new Exception("Não é possível realizar a operação\n");
        }

        operacao.calcula();
    }

    public static void main(String[] args) throws Exception {
        Calculadora obj = new Calculadora();

        Adicao adicao = new Adicao(10, 5);
        obj.calcule(adicao);

        System.out.println("Resultado da adição: " + adicao.resultado);

        Subtracao subtracao = new Subtracao(10,  5);
        obj.calcule(subtracao);
        System.out.println("Resultado da subtração: " + subtracao.resultado);

        Multiplicacao multiplicacao = new Multiplicacao(10,  5);
        obj.calcule(multiplicacao);
        System.out.println("Resultado da multiplicação:: " + multiplicacao.resultado);

        Divisao  divisao = new Divisao(10,  5);
        obj.calcule(divisao);
        System.out.println("Resultado da divisão:: " + divisao.resultado);
    }
}
