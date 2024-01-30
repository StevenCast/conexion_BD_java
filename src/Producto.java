import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Producto extends JFrame {
    private JPanel panel1;
    private JTextField nomProducto;
    private JButton guardarButton;
    private JButton salirButton;
    private JTextField codProducto;
    private JTextField categoria;
    private JTextField precio;
    private JTextField descrip;
    private JSpinner cantidad;
    private JComboBox color;
    private JTextField total;
    private JButton limpiarButton;

    public Producto(){
        super("Ingresar Producto");
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreP = nomProducto.getText();
                int codigoP = Integer.parseInt(codProducto.getText());
                String cate = categoria.getText();
                double pre = Integer.parseInt(precio.getText());
                String des = descrip.getText();
                int canti = (int) cantidad.getValue();
                String col = (String) color.getSelectedItem();

                double totalP = pre * canti;
                total.setText(String.valueOf(totalP));

                System.out.println("Productos guardados");
                System.out.println("Nombre del producto: "+nombreP);
                System.out.println("Codigo del producto: "+codigoP);
                System.out.println("Categoria del producto: "+cate);
                System.out.println("Descripcion del producto: "+des);
                System.out.println("Color del producto: "+col);
                System.out.println("Precio del producto: "+pre);
                System.out.println("Cantidad de unidades"+canti);
                System.out.println("Total a pagar: "+totalP);
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nomProducto.setText("");
                codProducto.setText("");
                categoria.setText("");
                descrip.setText("");
                color.setSelectedIndex(0);
                precio.setText("");
                cantidad.setValue(0);
                total.setText("");
            }
        });
    }
    public void iniciar(){
        setLocationRelativeTo(null);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(panel1);
    }
}
