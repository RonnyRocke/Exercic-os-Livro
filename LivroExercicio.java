/*   UM LIVRO POSSUI 931 PÁGINAS, SE EU LER 20 PÁGINAS POR DIA 
 * EM QUANTOS DIAS EU TERMINO ?
 */

 public class LivroExercicio{

    public int Paginas;
    public int LerPorDia;
    public int TerminarLivro;

    public LivroExercicio(int Paginas, int LerPorDia){
        this.Paginas = Paginas;
        this.LerPorDia = LerPorDia;
    }

    public void Calcular(){
        
        TerminarLivro = Paginas/LerPorDia;
        System.out.println("\nO LIVRO POSSUI " + Paginas + " PÁGINAS NO TOTAL.");
        System.out.println("\nVOCÊ IRÁ LER " + LerPorDia + " PÁGINAS POR DIA.");
        System.out.println("\nVOCÊ TERMINARÁ DE LER O LIVROS EM " + TerminarLivro + " DIAS.");
        
    }
 }