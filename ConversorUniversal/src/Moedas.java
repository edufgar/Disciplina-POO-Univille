import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Moedas extends JPanel {

    private JTextField txtorigem;
    private JTextField txtdestino;
    private JComboBox<String> comboBoxOrigem;
    private JComboBox<String> comboBoxDestino;
    private JLabel lblorigem;
    private JLabel lbldestino;
    private JButton bttninverter;
    private JButton bttnconverter;
    // private String nomemoedasorigem;
    // private String nomemoedasdestino;

    public Moedas() {

        setLayout();

    }

    private void setLayout() {

        // Início Bloco JComboBox Moeda Origem
        setLayout(null);
        String nomemoedasorigem [] = {"Reais","Dolares","Euros"};

        comboBoxOrigem = new JComboBox<String>(nomemoedasorigem);
        comboBoxOrigem.setBounds(80, 65, 100, 30);
        // comboBoxOrigem.setSelectedIndex(-1);

        // Fim Bloco JComboBox Moeda Origem

        // Início Bloco JComboBox Moeda Destino

        String nomemoedasdestino [] = {"Reais","Dolares","Euros"};

        comboBoxDestino = new JComboBox<String>(nomemoedasdestino);
        comboBoxDestino.setBounds(320, 65, 100, 30);
        // comboBoxDestino.setSelectedIndex(-1);

        // Fim Bloco JComboBox Moeda Destino

        lblorigem = new JLabel("De: ");
        lblorigem.setForeground(Color.BLACK);
        lblorigem.setBounds(35, 65, 80, 30);

        txtorigem = new JTextField(200);
        txtorigem.setBounds(80, 125, 100, 30);

        lbldestino = new JLabel("Para: ");
        lbldestino.setForeground(Color.BLACK);
        lbldestino.setBounds(265, 65, 80, 30);

        txtdestino = new JTextField(200);
        txtdestino.setBounds(320, 125, 100, 30);
        txtdestino.setEditable(false);

        bttninverter = new JButton("<->");
        bttninverter.setBounds(195, 65, 55, 30);

        // Ação do Botão Inverter

        bttninverter.addActionListener(e -> inverterOpcoes());

        // Fim Ação Botão Inverter

        bttnconverter = new JButton("Converter!!");
        bttnconverter.setBounds(320, 185, 100, 30);

        // Ação do Botão Converter

        bttnconverter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String moedade = (String) comboBoxOrigem.getSelectedItem();
                String moedapara = (String) comboBoxDestino.getSelectedItem();

                double valorde = Double.parseDouble(txtorigem.getText());
                double valorpara = 0;

                if(moedade.equals("Reais")&& moedapara.equals("Dolares")) {
                    valorpara = valorde / 3.99;
                }

                if(moedade.equals("Dolares")&& moedapara.equals("Reais")) {
                    valorpara = valorde * 3.99;
                }

                if(moedade.equals("Reais")&& moedapara.equals("Euros")) {
                    valorpara = valorde / 4.47;
                }

                if(moedade.equals("Euros")&& moedapara.equals("Reais")) {
                    valorpara = valorde * 4.47;
                }

                if(moedade.equals("Dolares")&& moedapara.equals("Euros")) {
                    valorpara = valorde / 1.12;
                }

                if(moedade.equals("Euros")&& moedapara.equals("Dolares")) {
                    valorpara = valorde * 1.12;
                }

                txtdestino.setText(String.format("%.2f", valorpara));

            }
        });

        // Fim Ação Botão Converter

        // Adiciona os itens no frame
        add(lblorigem);
        add(lbldestino);
        add(comboBoxOrigem);
        add(comboBoxDestino);
        add(txtorigem);
        add(txtdestino);
        add(bttninverter);
        add(bttnconverter);

    }

    private void inverterOpcoes() {

        int de = comboBoxOrigem.getSelectedIndex();
        comboBoxOrigem.setSelectedIndex(comboBoxDestino.getSelectedIndex());
        comboBoxDestino.setSelectedIndex(de);

    }

    public void LimparCampos() {
        txtorigem.setText("");
        txtdestino.setText("");
    }

}
