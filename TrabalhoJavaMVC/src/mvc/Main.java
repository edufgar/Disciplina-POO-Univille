 package mvc;

import jdbc.CarroDAO;
import mvc.control.CadastroCarroControl;
import mvc.model.CarroModel;
import mvc.view.CadastroCarroView;

public class Main {

	public static void main(String[] args) {
		CarroModel p = new CarroModel();
		p.setMarca("Alfa Romeo");
		p.setModelo("Stelvio");
		p.setCor("Vermelha");
		p.setAnomodelo(2020);;
		
		CadastroCarroControl control = new CadastroCarroControl(new CadastroCarroView(),p);
		control.exibirTela();

	}

}
