import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame{
    private JPanel panel1;
    private JButton ingresarButton;
    private JButton registrarseButton;
    private JTextField val1Login;
    private JTextField val2Login;
    

    public login() {
        super("Login");
        setContentPane(panel1);
        register usuario_register = new register();
        Producto product = new Producto();

        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario_register.iniciar();
            }
        });

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product.iniciar();

            }
        });
    }

    public void iniciar(){
        setLocationRelativeTo(null);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
