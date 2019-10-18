package Interface_Pontos_Cardeais;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		panelesq.setBackground(Color.LIGHT_GRAY);
		panelesq.setPreferredSize(new Dimension(350,550));
		
		JPanel paneldir = new JPanel();
		// Retira o gerenciador de Layout
		//paneldir.setLayout(null);
		paneldir.setPreferredSize(new Dimension(350,550));
		paneldir.setLayout(new BorderLayout());
		
		JPanel norte = criarPanel(Color.RED,"Norte");
        JPanel leste = criarPanel(Color.YELLOW,"Leste");
        JPanel oeste = criarPanel(Color.BLUE,"Oeste");
        JPanel sul = criarPanel(Color.WHITE,"Sul");
        JPanel centro = criarPanel(Color.GREEN,"Centro");
		
		// Adiciona o painel no norte
		paneldir.add(norte, BorderLayout.NORTH);
        // Adiciona o painel no sul
		paneldir.add(sul, BorderLayout.SOUTH);
        // Adiciona o painel no leste
		paneldir.add(leste, BorderLayout.EAST);
        // Adiciona o painel no oeste
		paneldir.add(oeste, BorderLayout.WEST);
        // Adiciona o painel no centro
		paneldir.add(centro, BorderLayout.CENTER);
		
	// Adiciona o painel no frame
		
	JPanel root = new JPanel(new GridLayout(1, 2));
	
	root.add(panelesq);
	root.add(paneldir);
	
	add(root);
		
	}
	
	private JPanel criarPanel(Color color, String texto) {
    	JPanel panel = new JPanel();
    	panel.setBackground(color);
    	panel.add(new JLabel(texto));
    	// Configura um tamanho padrao do painel
    	return panel;
    }
		
		
}
