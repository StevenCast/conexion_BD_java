import javax.swing.*;

public class register extends JFrame{
    private JTextField val1Register;
    private JTextField val2Register;
    private JTextField val3Register;
    private JTextField val4Register;
    private JButton enviarButton;
    private JPanel panel_principal;

    public register(){
        super("Registro");
        setContentPane(panel_principal);
    }

    public void iniciar(){
        setLocationRelativeTo(null);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
