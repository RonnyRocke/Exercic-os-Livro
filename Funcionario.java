public class Funcionario {

    private String[] nome;
    private int[] idade;
    private double[] valores;

    public Funcionario(String[] nome, int[] idade, double[] valores){
        this.nome = nome;
        this.idade = idade;
        this.valores = valores;
    }

    public void ImprimirDados(){
        for(int i = 0; i < nome.length; i++){
            System.out.println("Nome: " + nome[i]);
            System.out.println("Idade: " + idade[i]);
            System.out.println();
        }
    }

    public void ListarSalario(){
        double soma = 0;
        for(double valor : valores){
            System.out.println("Salário: R$" + valor);
            soma += valor;
        }
        double media = soma / valores.length;
        System.out.println();
        System.out.println("A MÉDIA DOS SALÁRIOS É R$" + media);
    }
}
