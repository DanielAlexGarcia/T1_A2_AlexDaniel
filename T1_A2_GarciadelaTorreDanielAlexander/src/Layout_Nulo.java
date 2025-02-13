
import javax.swing.*;
import java.awt.*;


class VentanaInicio extends JFrame{

    public VentanaInicio(){
        getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Layaout");
		setSize(800,550);
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

        JCheckBox check2 = new JCheckBox("only requiered fields");
        check2.setBounds(10, 130, 150, 20);
        add(check2);

        JCheckBox check3 = new JCheckBox("all fields");
        check3.setBounds(10, 150, 150, 20);
        add(check3);
        
        JLabel text1 = new JLabel("(edit requiered fields in the form builder)");
        text1.setBounds(30,170,250,20);
        add(text1);

        JCheckBox check4 = new JCheckBox("interest group fields");
        check4.setBounds(10, 230, 150, 20);
        add(check4);

        JCheckBox check5 = new JCheckBox("requiered field indicators");
        check5.setBounds(10, 250, 200, 20);
        add(check5);

        JLabel text2 = new JLabel("Set form width");
        text2.setBounds(10, 330, 100, 20);
        add(text2);

        JTextField textfiels2 = new JTextField();
        textfiels2.setBounds(10, 350, 250, 30);
        add(textfiels2);

        JLabel text3 = new JLabel("Enhance your form");
        text3.setBounds(10, 390, 150, 20);
        add(text3);

        JCheckBox check6 = new JCheckBox("enable evil popup mode");
        check6.setBounds(10, 410, 200, 30);
        add(check6);

        JCheckBox check7 = new JCheckBox("disable all JavaScript");
        check7.setBounds(10, 435, 200, 30);
        add(check7);

        JCheckBox check8 = new JCheckBox("include archive link");
        check8.setBounds(10, 460, 200, 30);
        add(check8);

        JCheckBox check9 = new JCheckBox("include MonkeyRewads link");
        check9.setBounds(10, 485, 200, 30);
        add(check9);


        JLabel text4 = new JLabel("Preview");
        text4.setBounds(350, 10, 100, 20);
        add(text4);

        JPanel panel = new JPanel();
        panel.setBounds(350, 30, 380, 140);
        panel.setLayout(null);
        add(panel);

            JLabel textPanel1 = new JLabel("Email Address");
            textPanel1.setBounds(0, 0, 100, 20);
            panel.add(textPanel1);

            JTextField textfieldPanel1 = new JTextField();
            textfieldPanel1.setBounds(0, 20, 250, 30);
            panel.add(textfieldPanel1);

            JLabel textPanel2 = new JLabel("First Name");
            textPanel2.setBounds(0, 45, 100, 20);
            panel.add(textPanel2);

            JTextField textfielPanel2 = new JTextField();
            textfielPanel2.setBounds(0, 65, 250, 30);
            panel.add(textfielPanel2);

            JLabel textPanel3 = new JLabel("Last Name");
            textPanel3.setBounds(0, 90, 100, 20);
            panel.add(textPanel3);

            JTextField textfieldpanel3 = new JTextField();
            textfieldpanel3.setBounds(0, 110, 250, 30);
            panel.add(textfieldpanel3);

            JButton bt1 = new JButton("Subscribe");
            bt1.setBounds(270, 50, 100, 40);
            panel.add(bt1);

        JLabel text5 = new JLabel("Copy/paste onto your site");
        text5.setBounds(350, 190, 150, 20);
        add(text5);

        JTextArea textfields3 = new JTextArea(
			"<form>\r\n" + //
								"</div>\r\n" + //
								"<script type=\"text/javascript\" src=\"/is3.amazonaws.com/downloads.mailchimp.com/js/mc-validate.js\"></script>\r\n" + //
								"<script type=\"text/javascript\">\r\n" + //
								"    (function($) {\r\n" + //
								"        window.fnames = new Array();\r\n" + //
								"        window.ftypes = new Array();\r\n" + //
								"        fnames[0] = 'EMAIL';ftypes[0] = 'email';fnames[1] = 'FNAME'; ftypes[1] = 'text'; fnames[2] = 'LNAME';ftypes[2] = 'text';\r\n" + //
								"    }(jQuery));\r\n" + //
								"    var $mcj = jQuery.noConflict(true);\r\n" + //
								"</script>\r\n" + //
								"<!--End mc_embed_signup-->"
		);
        textfields3.setBounds(350, 215, 380, 240);
        add(textfields3);

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
