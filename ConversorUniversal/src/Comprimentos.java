import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Comprimentos extends JPanel {
	
	private JTextField txtorigem;
	private JTextField txtdestino;
	
	public Comprimentos() {
		
		setLayout();
		
	}
	
	private void setLayout() {
		
		// Início Bloco JComboBox Comprimento Origem
		setLayout(null);
				String nomecomprimentosorigem [] = {"quilômetro","metro","centímetro","milímetro"};
						
				JComboBox<String> comboBoxOrigem = new JComboBox<String>(nomecomprimentosorigem);
				comboBoxOrigem.setBounds(80, 65, 100, 30);
				// comboBoxOrigem.setSelectedIndex(-1);
								
				// Fim Bloco JComboBox Comprimento Origem  
				
				// Início Bloco JComboBox Comprimento Destino
						
				String nomecomprimentosdestino [] = {"quilômetro","metro","centímetro","milímetro"};
						
				JComboBox<String> comboBoxDestino = new JComboBox<String>(nomecomprimentosdestino);
				comboBoxDestino.setBounds(300, 65, 100, 30);
				// comboBoxDestino.setSelectedIndex(-1);
									
				// Fim Bloco JComboBox Comprimento Destino 
				
				JLabel lblorigem = new JLabel("De: ");
				lblorigem.setForeground(Color.BLACK);
				lblorigem.setBounds(35, 65, 80, 30);
				
				txtorigem = new JTextField(200);
				txtorigem.setBounds(80, 125, 100, 30);
				  
				JLabel lbldestino = new JLabel("Para: ");
				lbldestino.setForeground(Color.BLACK);
				lbldestino.setBounds(245, 65, 80, 30);
				
				txtdestino = new JTextField(200);
				txtdestino.setBounds(300, 125, 100, 30);
				txtdestino.setEditable(false);
							
				JButton bttnconverter = new JButton("Converter!!");
				bttnconverter.setBounds(300, 185, 100, 30);
				
				// Ação do Botão Converter
				
				bttnconverter.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String comprimentode = (String) comboBoxOrigem.getSelectedItem();
						String comprimentopara = (String) comboBoxDestino.getSelectedItem();
						
						double valorde = Double.parseDouble(txtorigem.getText());
						double valorpara = 0;
							
						if(comprimentode.equals("quilômetro")&& comprimentopara.equals("metro")) {
							valorpara = valorde * 1000;
						}
						
						if(comprimentode.equals("metro")&& comprimentopara.equals("quilômetro")) {
							valorpara = valorde / 1000;
						}
						
						if(comprimentode.equals("quilômetro")&& comprimentopara.equals("centímetro")) {
							valorpara = valorde * 100000;
						}
						
						if(comprimentode.equals("centímetro")&& comprimentopara.equals("quilômetro")) {
							valorpara = valorde / 100000;
						}
						
						if(comprimentode.equals("quilômetro")&& comprimentopara.equals("milímetro")) {
							valorpara = valorde * 1000000;
						}
						
						if(comprimentode.equals("milímetro")&& comprimentopara.equals("quilômetro")) {
							valorpara = valorde / 1000000;
						}
						
						if(comprimentode.equals("metro")&& comprimentopara.equals("centímetro")) {
							valorpara = valorde * 100;
						}
						
						if(comprimentode.equals("centímetro")&& comprimentopara.equals("metro")) {
							valorpara = valorde / 100;
						}
						
						if(comprimentode.equals("metro")&& comprimentopara.equals("milímetro")) {
							valorpara = valorde * 1000;
						}
						
						if(comprimentode.equals("milímetro")&& comprimentopara.equals("metro")) {
							valorpara = valorde / 1000;
						}
						
						if(comprimentode.equals("centímetro")&& comprimentopara.equals("milímetro")) {
							valorpara = valorde * 10;
						}
						
						if(comprimentode.equals("milímetro")&& comprimentopara.equals("centímetro")) {
							valorpara = valorde / 10;
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
				add(bttnconverter);
		
	}
	
	public void LimparCampos() {
		txtorigem.setText("");
		txtdestino.setText("");
	}

}
