import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
            ContaCorrente c = new ContaCorrente(1, 1000, 1000);

            
            c.aumentaLimite(-100);
            System.out.println(c.toString());
            
    }
}
