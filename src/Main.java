import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(()->{
            login usuario = new login();
            usuario.iniciar();
        });
    }
}