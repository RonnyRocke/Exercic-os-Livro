public class Funcionarioteste {

    public static void main(String[] args) {
        String[] nomes = {"Edu", "Rebeca", "Gustavo"};
        int[] idades = {19, 22, 38};
        double[] salarios = {1500, 1500, 1500};

        Funcionario f = new Funcionario(nomes, idades, salarios);

        f.ImprimirDados();
        System.out.println("--------------");
        f.ListarSalario();
    }
}
