package mvc.control;

import mvc.model.CarroModel;
import mvc.view.CadastroCarroView;

public class CadastroCarroControl {
	
	private CadastroCarroView view;
	private CarroModel model;
	
	public CadastroCarroControl(CadastroCarroView view, CarroModel model) {
		this.view = view;
		this.model = model;
		model.attach(view);
		view.setModel(model);
		view.setControl(this);
	}
	
	public void exibirTela() {
		view.show();
		model.notifyObservers();
	}

	public void deletar() {
		model.deletar();
		view.setMensagemStatusBar("Registro deletado.");
		view.getBotaoDeletar().setEnabled(false);
	}

	public void novo() {
		model.novoRegistro();
		view.getBotaoDeletar().setEnabled(false);
		view.setMensagemStatusBar("Registro novo.");
	}
	
	public void salvar() {
		model.setEmail(view.getEmail());
		model.setCpf(view.getCpf());
		model.setNome(view.getNome());
		try {
			model.salvar();
			view.setMensagemStatusBar("Registro salvo com sucesso.");
			view.getBotaoDeletar().setEnabled(true);
		}catch(Exception e) {
			e.printStackTrace();
			view.setMensagemStatusBar("Erro: "+e.getMessage());
		}
	}

}
