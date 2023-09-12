public class App {
    public static void main(String[] args) throws Exception {
            Emprestimo e = new Emprestimo("10/10/2023", 1000, 10);

            System.out.println("Taxa: " + e.calculaTaxa());
    }
}
