package testeabas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HelloSwing extends JFrame{

	public HelloSwing() {
		// Titulo Janela
		setTitle("Moedas");
		// Tamanho Janela
		setSize(450,275);
		// Configura local inicial
		setLocation(1366/2 - 450/2,768/2 - 275/2);
		// Não permite modificar o tamanho dsa Tela
		setResizable(false);
		// Configura a tela
		setLayout();
			
    }
	
	// Configura a tela
	private void setLayout() {
		
		JPanel abamoedas = new JPanel();
		abamoedas.setLayout(null);
						
		JLabel laborigem = new JLabel("De: ");
		laborigem.setForeground(Color.BLACK);
		laborigem.setBounds(35, 65, 80, 30);
		
		JTextField txtorigem = new JTextField(200);
		txtorigem.setBounds(80, 125, 100, 30);
		
		// Início Bloco JComboBox Moeda Origem
			
		JComboBox<String> moedaorigem = new JComboBox<String>();
		// moedaorigem.setPreferredSize(tamanhoPreferido);
		moedaorigem.setBounds(80, 65, 100, 30);
		moedaorigem.addItem("Real");
		moedaorigem.addItem("Dólar");
		moedaorigem.addItem("Euro");
		moedaorigem.setSelectedIndex(-1);
		
		JLabel lblNISo = new JLabel("Nenhum Item selecionado");
						
			moedaorigem.addActionListener(new ActionListener() {
		  
				@Override public void actionPerformed(ActionEvent e) {
					lblNISo.setText("Selecionou : "+ moedaorigem.getSelectedItem()); } });
		
				
		// Fim Bloco JComboBox Moeda Origem  
		  
		JLabel labdestino = new JLabel("Para: ");
		labdestino.setForeground(Color.BLACK);
		labdestino.setBounds(245, 65, 80, 30);
		
		JTextField txtdestino = new JTextField(200);
		txtdestino.setBounds(300, 125, 100, 30);
		txtdestino.setEditable(false);
		
		// Início Bloco JComboBox Moeda Destino
		
		JComboBox<String> moedadestino = new JComboBox<String>();
		// moedaorigem.setPreferredSize(tamanhoPreferido);
		moedadestino.setBounds(300, 65, 100, 30);
		moedadestino.addItem("Real");
		moedadestino.addItem("Dólar");
		moedadestino.addItem("Euro");
		moedadestino.setSelectedIndex(-1);
				
		JLabel lblNISd = new JLabel("Nenhum Item selecionado");
								
			moedadestino.addActionListener(new ActionListener() {
				  
				  @Override public void actionPerformed(ActionEvent e) {
				  lblNISd.setText("Selecionou : "+ moedadestino.getSelectedItem()); } });
				
						
		// Fim Bloco JComboBox Moeda Destino  
		
		JButton bttnconverter = new JButton("Converter!!");
		bttnconverter.setBounds(300, 185, 100, 30);
		
		// Adiciona os itens no frame
		abamoedas.add(laborigem);
		abamoedas.add(labdestino);
		abamoedas.add(moedaorigem);
		abamoedas.add(moedadestino);
		abamoedas.add(lblNISo);
		abamoedas.add(lblNISd);
		abamoedas.add(txtorigem);
		abamoedas.add(txtdestino);
		abamoedas.add(bttnconverter);
		
		// Adiciona o painel no frame
		add(abamoedas);	
		
		
	}

}
