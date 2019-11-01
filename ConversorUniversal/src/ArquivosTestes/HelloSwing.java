package ArquivosTestes;

import java.awt.Color;

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
		
		// Início Bloco JComboBox Moeda Origem
		
		String nomemoedasorigem [] = {"Reais","Dolares","Euros"};
				
		JComboBox<String> comboBoxOrigem = new JComboBox<String>(nomemoedasorigem);
		comboBoxOrigem.setBounds(80, 65, 100, 30);
		// comboBoxOrigem.setSelectedIndex(-1);
						
		// Fim Bloco JComboBox Moeda Origem  
		
		// Início Bloco JComboBox Moeda Destino
				
		String nomemoedasdestino [] = {"Reais","Dolares","Euros"};
				
		JComboBox<String> comboBoxDestino = new JComboBox<String>(nomemoedasdestino);
		comboBoxDestino.setBounds(300, 65, 100, 30);
		// comboBoxDestino.setSelectedIndex(-1);
							
		// Fim Bloco JComboBox Moeda Destino 
		
		JLabel lblorigem = new JLabel("De: ");
		lblorigem.setForeground(Color.BLACK);
		lblorigem.setBounds(35, 65, 80, 30);
		
		JTextField txtorigem = new JTextField(200);
		txtorigem.setBounds(80, 125, 100, 30);
		  
		JLabel lbldestino = new JLabel("Para: ");
		lbldestino.setForeground(Color.BLACK);
		lbldestino.setBounds(245, 65, 80, 30);
		
		JTextField txtdestino = new JTextField(200);
		txtdestino.setBounds(300, 125, 100, 30);
		txtdestino.setEditable(false);
					
		JButton bttnconverter = new JButton("Converter!!");
		bttnconverter.setBounds(300, 185, 100, 30);
		
		// Adiciona os itens no frame
		abamoedas.add(lblorigem);
		abamoedas.add(lbldestino);
		abamoedas.add(comboBoxOrigem);
		abamoedas.add(comboBoxDestino);
		abamoedas.add(txtorigem);
		abamoedas.add(txtdestino);
		abamoedas.add(bttnconverter);
		
		// Adiciona o painel no frame
		add(abamoedas);	
		
		
	}
			


}