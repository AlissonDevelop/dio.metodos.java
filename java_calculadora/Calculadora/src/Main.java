public class Main {    
    public static void main(String[] args) {

        //Calculadora

        System.out.println("Exercicio Calculadora");
        calculadora.soma(3, 6);
        calculadora.subtracao(9, 1.8);
        calculadora.multiplicacao(7, 8);
        calculadora.divisao(5, 2.5);

        System.out.println(" ");


        //Mensagem

        System.out.println("Exercicio Mensagem");
        Menssagem.obterMensagem(9);
        Menssagem.obterMensagem(14);
        Menssagem.obterMensagem(1);

        System.out.println(" ");


        //Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
