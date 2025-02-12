import javax.swing.*;
import java.awt.*;


class VentanaInicio extends JFrame{

    public VentanaInicio(){
        getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Layaout");
		setSize(400,400);
		setLocationRelativeTo(null);
		setVisible(true);

        JLabel Titulo = new JLabel("The Classic Form includes all visible fields for this list.");
        Titulo.setBounds(10, 10, 400, 10);
        add(Titulo);

        JLabel subTittle = new JLabel("Form opcions");
        subTittle.setBounds(10, 30, 100, 10);
        add(subTittle);

        JCheckBox check1 = new JCheckBox("a title for your form");
        check1.setBounds(10, 50,150, 20);
        add(check1);

        JTextField textField1 = new JTextField("Subcribe to our maling list");
        textField1.setBounds(10, 70, 250, 30);
        add(textField1);



    }

}

public class Layout_Nulo {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaInicio();
				
			}
		});
    }
}
