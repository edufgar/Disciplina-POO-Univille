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

		CarroDAO carrodao = new CarroDAO();

		CarroModel c1 = new CarroModel();
		c1.setMarca("Alfa Romeo");
		c1.setModelo("Stelvio");
		c1.setCor("Vermelha");
		c1.setAnomodelo(2019);

		carrodao.insert(c1);

		System.out.println(carrodao.getByMarca(4));

		for(CarroModel carro : carrodao.getAll()) {
			System.out.println(carro);
		}

	}

}
