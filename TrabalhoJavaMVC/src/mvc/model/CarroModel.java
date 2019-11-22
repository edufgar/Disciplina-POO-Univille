package mvc.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mvc.util.Observer;
import mvc.util.Subject;

public class CarroModel implements  Subject{
	
	private long id;
	private String marca;
	private String modelo;
	private String cor;
	private int anomodelo;
	private List<Observer> list;
	
	public CarroModel() {
		list = new ArrayList<Observer>();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAnomodelo() {
		return anomodelo;
	}

	public void setAnomodelo(int anomodelo) {
		this.anomodelo = anomodelo;
	}

	public List<Observer> getList() {
		return list;
	}

	public void setList(List<Observer> list) {
		this.list = list;
	}

	public void novoRegistro() {
		id = 0;
		marca = "";
		modelo = "";
		cor = "";
		anomodelo = 0;
		notifyObservers();
	}
	
	@Override
	public String toString() {
		return "CarroModel [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + "anomodelo=" + anomodelo + "]";
	}
	
	
	@Override
	public void attach(Observer o) {
		list.add(o);
	}

	@Override
	public void detach(Observer o) {
		list.remove(o);
	}

	@Override
	public void notifyObservers() {
		// Avisa cada um dos observadores
		for(Observer o : list) {
			// Atualiza a informacao no observador
			o.update(this, this);
		}
	}

	public void salvar() throws Exception {
		
		if(marca == null || marca.isEmpty()) {
			throw new Exception("Marca � inv�lido");
		}
		if(modelo == null || modelo.isEmpty()) {
			throw new Exception("Modelo � inv�lido");
		}
		if(cor == null || cor.isEmpty()) {
			throw new Exception("Cor � inv�lido");
		}
		if(anomodelo == 0) {
			throw new Exception("AnoModelo � inv�lido");
		}
		//Novo registro
		if(id == 0) {
			// Gera um id
			id = (new Random()).nextInt(100);
			// insere no banco de dados
		}else {
			// Atualizar no banco de dados
		}
		notifyObservers();
	}
	
	public void deletar() {
		//deletar no banco de dados
		novoRegistro();
		notifyObservers();
	}
	
	

}
