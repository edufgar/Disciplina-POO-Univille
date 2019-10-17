package Interface_Pontos_Cardeais;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloSwing extends JFrame {
	
	public HelloSwing() {
		// Titulo Janela
		setTitle("Interface Java Swing Pontos Cardeais");
		// Tamanho Janela
		setSize(800,600);
		// Configura local inicial
		setLocation(1366/2 - 800/2,768/2 - 600/2);
		// Não permite modificar o tamanho dsa Tela
		setResizable(false);
		// Configura a tela
		setLayout();
	}
	
	private void setLayout() {
		JPanel panelesq = new JPanel();
		// Retira o gerenciador de Layout
		// panelesq.setLayout(null);
		panelesq.setBorder(BorderFactory.createCompoundBorder(
				// Margem
				BorderFactory.createEmptyBorder(20, 20, 20, 20)
				// Com Titulo
				,BorderFactory.createTitledBorder("Esquerdo")));
		panelesq.setBackground(Color.LIGHT_GRAY);
		panelesq.setPreferredSize(new Dimension(350,550));
		
		JPanel paneldir = new JPanel();
		// Retira o gerenciador de Layout
		//paneldir.setLayout(null);
		paneldir.setBorder(BorderFactory.createCompoundBorder(
				// Margem
				BorderFactory.createEmptyBorder(20, 20, 20, 20)
				// Com Titulo
				,BorderFactory.createTitledBorder("Direito")));
		paneldir.setPreferredSize(new Dimension(350,550));
		paneldir.setLayout(new BorderLayout());
		
	// Adiciona o painel no frame
		
	JPanel root = new JPanel(new GridLayout(1, 2));
	
	root.add(panelesq);
	root.add(paneldir);
	
	add(root);
		
	}
		
		
}
