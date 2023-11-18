package com.sistema;

import DAO.ClienteDAO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.sistema.paginas.Tela_Cadastro;
import com.sistema.paginas.Tela_CadastroInvalido;
import com.sistema.paginas.Tela_ConfirmacaoCadastro;
import com.sistema.paginas.Tela_DadosCultivo;
import com.sistema.paginas.Tela_Historico;
import com.sistema.paginas.Tela_Inicial;
import com.sistema.paginas.Tela_Login;
import com.sistema.paginas.Tela_Principal;
import com.sistema.paginas.Tela_Remocao;
import com.sistema.paginas.Tela_UsarioSenhaInvalido;
import com.sistema.paginas.Tela_UsuarioDuplicado;

public class Core {

	public static final String PAGINA_PRINCIPAL = "PRINCIPAL";
	public static final String PAGINA_LOGIN = "LOGIN";
	public static final String PAGINA_CADASTRO = "CADASTRO";
	public static final String PAGINA_CONFIRMA_CADASTRO = "CONFIRMA_CADASTRO";
	public static final String PAGINA_HISTORICO = "HISTORICO";
	public static final String PAGINA_INICIAL = "INICIAL";
	public static final String PAGINA_CADASTRO_INVALIDO = "CADASTRO_INVALIDO";
	public static final String PAGINA_REMOVE_PLANTIO = "REMOVE_PLANTIO";
	public static final String PAGINA_ADICIONAR_CULTIVO = "ADICIONAR_CULTIVO";
	public static final String PAGINA_DADOS_CULTIVO = "DADOS_CUTILVO";

	private static HashMap<String, JFrame> paginas = new HashMap<>();
	private static ArrayList<Cliente> clienteList = new ArrayList<>();
	private Cliente sessao;

	public void iniciar() {
		paginaCadastroBuilder();
		paginaConfirmaCadastroBuilder();
		paginaInicialBuilder();
		paginaLoginBuilder();
		paginaCadastroInvalidoBuilder();

		abrirPagina(PAGINA_INICIAL);
	}

	public Core criarSessao(Cliente cliente) {
		paginaPrincipalBuilder(cliente);
		paginaHistoricoBuilder(cliente);
		paginaRemovePlantioBuilder(cliente);
		sessao = cliente;
		return this;
	}

	public Cliente getSessao() {
		return this.sessao;
	}

	public void paginaPrincipalBuilder(Cliente cliente) {
		Tela_Principal green = new Tela_Principal(cliente);
		green.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		green.setSize(1000, 500);
		green.pack();
		green.setVisible(false);

		paginas.put(PAGINA_PRINCIPAL, green);
	}
	
	public void paginaDadosCultivoBuilder(Cliente cliente) {
		Tela_DadosCultivo green = new Tela_DadosCultivo(cliente,null);
		green.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		green.setSize(1000, 500);
		green.pack();
		green.setVisible(false);

		paginas.put(PAGINA_LOGIN, green);
	}

	public void paginaLoginBuilder() {
		Tela_Login green = new Tela_Login();
		green.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		green.setSize(1000, 500);
		green.pack();
		green.setVisible(false);

		paginas.put(PAGINA_LOGIN, green);
	}
	
	public void paginaCadastroInvalidoBuilder() {
		Tela_CadastroInvalido green = new Tela_CadastroInvalido();
		green.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		green.setSize(1000, 500);
		green.pack();
		green.setVisible(false);

		paginas.put(PAGINA_CADASTRO_INVALIDO, green);
	}

	public void paginaCadastroBuilder() {
		Tela_Cadastro green = new Tela_Cadastro();
		green.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		green.setSize(1000, 500);
		green.pack();
		green.setVisible(false);

		paginas.put(PAGINA_CADASTRO, green);
	}

	public void paginaConfirmaCadastroBuilder() {
		Tela_ConfirmacaoCadastro green = new Tela_ConfirmacaoCadastro();
		green.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		green.setSize(1000, 500);
		green.pack();
		green.setVisible(false);

		paginas.put(PAGINA_CONFIRMA_CADASTRO, green);
	}

	public void paginaHistoricoBuilder(Cliente cliente) {
		Tela_Historico green = new Tela_Historico(cliente);
		green.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		green.setSize(1000, 500);
		green.pack();
		green.setVisible(false);

		paginas.put(PAGINA_HISTORICO, green);
	}
	
	public void paginaRemovePlantioBuilder(Cliente cliente) {
		try {
			Tela_Remocao green = new Tela_Remocao(cliente);
			green.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			green.setSize(1000, 500);
			green.pack();
			green.setVisible(false);

			paginas.put(PAGINA_REMOVE_PLANTIO, green);
		}catch (Exception e) {
			System.err.println("");
		}
	}

	public void paginaInicialBuilder() {
		Tela_Inicial green = new Tela_Inicial();
		green.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		green.setSize(1000, 500);
		green.pack();
		green.setVisible(false);

		paginas.put(PAGINA_INICIAL, green);
	}

	public void fecharPaginas() {
		for (Entry<String, JFrame> janela : paginas.entrySet()) {
			if (janela.getValue().isVisible()) {
				janela.getValue().setVisible(false);
			}
		}
	}

	public void mudarDePagina(String pagina) {
		fecharPaginas();	
		getPagina(pagina).setVisible(true);
		refreshPaginas(sessao);
	}

	public JFrame getPagina(String pagina) {
		for (Entry<String, JFrame> janela : paginas.entrySet()) {
			if (janela.getKey().equals(pagina)) {
				return janela.getValue();
			}
		}

		try {
			throw new NullPointerException("Nenhuma página ativa");
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		return null;
	}

	public JFrame getPaginaAtual() {

		for (Entry<String, JFrame> janela : paginas.entrySet()) {
			if (janela.getValue().isVisible()) {
				return janela.getValue();
			}
		}

		try {
			throw new NullPointerException("Nenhuma página ativa");
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean abrirPagina(String pagina) {

		getPagina(pagina).setVisible(true);

		return paginas.containsKey(pagina);
	}

	public void addPage(String page, JFrame frame) {
		paginas.put(page, frame);
	}

	public static Cliente fazerLogin(String cpf, String senha) {
            
            
		Cliente clienteEncontrado = new Cliente();
                ClienteDAO clienteDao = new ClienteDAO();
                clienteDao.setCpf(cpf);
                clienteDao.setSenha(senha);
                clienteEncontrado = clienteDao.Autenticar();
		if (clienteEncontrado != null) {
			Main.getCore().criarSessao(clienteEncontrado).mudarDePagina(PAGINA_PRINCIPAL);
			return clienteEncontrado;
		} else {
			new Tela_UsarioSenhaInvalido().setVisible(true);
		}
		return null;
	}

	public Core fazerLogin() {

		return this;
	}

	public static Cliente procurarClienteByCPF(String cpf) {
		for (Cliente cliente : clienteList) {
			if (cliente.getCpf().equals(cpf)) {
				return cliente;
			}
		}
		return null;
	}

	public static void addUsuarioLista(Cliente client) {
		clienteList.add(client);
	}

	public static void refreshPaginas(Cliente clienteLogado) {
		Tela_Principal telaPrincipal = new Tela_Principal(clienteLogado);
		telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaPrincipal.setSize(1000, 500);
		telaPrincipal.pack();
		telaPrincipal.setVisible(Main.getCore().getPagina(PAGINA_PRINCIPAL).isVisible());
		Main.getCore().getPagina(PAGINA_PRINCIPAL).setVisible(false);
		paginas.put(PAGINA_PRINCIPAL, telaPrincipal);

		Tela_Inicial telaInicial = new Tela_Inicial();
		telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaInicial.setSize(1000, 500);
		telaInicial.pack();
		telaInicial.setVisible(Main.getCore().getPagina(PAGINA_INICIAL).isVisible());
		Main.getCore().getPagina(PAGINA_INICIAL).setVisible(false);
		paginas.put(PAGINA_INICIAL, telaInicial);

		Tela_Login telaLogin = new Tela_Login();
		telaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaLogin.setSize(1000, 500);
		telaLogin.pack();
		telaLogin.setVisible(Main.getCore().getPagina(PAGINA_LOGIN).isVisible());
		Main.getCore().getPagina(PAGINA_LOGIN).setVisible(false);
		paginas.put(PAGINA_LOGIN, telaLogin);

		Tela_Cadastro telaCadastro = new Tela_Cadastro();
		telaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCadastro.setSize(1000, 500);
		telaCadastro.pack();
		telaCadastro.setVisible(Main.getCore().getPagina(PAGINA_CADASTRO).isVisible());
		Main.getCore().getPagina(PAGINA_CADASTRO).setVisible(false);
		paginas.put(PAGINA_CADASTRO, telaCadastro);

		Tela_ConfirmacaoCadastro telaConfirmacao = new Tela_ConfirmacaoCadastro();
		telaConfirmacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaConfirmacao.setSize(1000, 500);
		telaConfirmacao.pack();
		telaConfirmacao.setVisible(Main.getCore().getPagina(PAGINA_CONFIRMA_CADASTRO).isVisible());
		Main.getCore().getPagina(PAGINA_CONFIRMA_CADASTRO).setVisible(false);
		paginas.put(PAGINA_CONFIRMA_CADASTRO, telaConfirmacao);

		Tela_Historico telaHistorico = new Tela_Historico(clienteLogado);
		telaHistorico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaHistorico.setSize(1000, 500);
		telaHistorico.pack();
		telaHistorico.setVisible(Main.getCore().getPagina(PAGINA_HISTORICO).isVisible());
		Main.getCore().getPagina(PAGINA_HISTORICO).setVisible(false);
		paginas.put(PAGINA_HISTORICO, telaHistorico);

		Tela_CadastroInvalido telaCadastroInvalido = new Tela_CadastroInvalido();
		telaCadastroInvalido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaCadastroInvalido.setSize(1000, 500);
		telaCadastroInvalido.pack();
		telaCadastroInvalido.setVisible(Main.getCore().getPagina(PAGINA_CADASTRO_INVALIDO).isVisible());
		Main.getCore().getPagina(PAGINA_CADASTRO_INVALIDO).setVisible(false);
		paginas.put(PAGINA_CADASTRO_INVALIDO, telaHistorico);
		
		Tela_DadosCultivo tela_DadosCultivo = new Tela_DadosCultivo(clienteLogado,null);
		tela_DadosCultivo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela_DadosCultivo.setSize(1000, 500);
		tela_DadosCultivo.pack();
		tela_DadosCultivo.setVisible(false);

		paginas.put(PAGINA_DADOS_CULTIVO, tela_DadosCultivo);

	}

	public static void criarUsuario(Cliente cliente) {
		cliente.cadastrarCliente();

	}

	public static void adicionarCultivo(Cliente clienteLogado,String tipoPlanta) {
		clienteLogado.adicionarTipoPlanta(tipoPlanta);
		Core.refreshPaginas(clienteLogado);

	}

	public ArrayList<String> mostrarDadosEstufa() {

		return sessao.getTiposPlantio();

	}

	public static void getPlantioInfo(Cliente cliente, String plantio) {
		Higrometro higrometro = cliente.getHigrometro(plantio);

		if (higrometro != null) {
			higrometro.imprimir();
		} else {
			int dialogResult = JOptionPane.showConfirmDialog(null,
					"Não foi encontrado nenhum higrômetro para o plantio, deseja adicionar ?", "Warning",
					JOptionPane.YES_NO_OPTION);
			if (dialogResult == JOptionPane.YES_OPTION) {
				Core.adicionarOuAlterarDadosPlantio(cliente, plantio);
			}
		}
	}

	public static Higrometro getHigrometro(Cliente cliente, String tipoPlantio) {
		return cliente.getHigrometro(tipoPlantio);
	}

	public static void adicionarOuAlterarDadosPlantio(Cliente clienteLogado, String tipoPlanta) {
		Higrometro higrometro = clienteLogado.getHigrometro(tipoPlanta);

		if (higrometro == null) {
			higrometro = new Higrometro(tipoPlanta);
			clienteLogado.adicionarHigrometro(higrometro);
		}

		higrometro.cadastrarHigrometro();
	}

	public static void removerCultivo(Cliente clienteLogado,List<String> tipoPlantas) {
		boolean cultivoRemovido = false;
		for (String tipoplanta : tipoPlantas) {
			cultivoRemovido = clienteLogado.removerTipoPlanta(tipoplanta);
		}
		if (cultivoRemovido) {
			JOptionPane.showMessageDialog(null, "Cultivo removido com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Cultivo não encontrado para o cliente.");
		}
		
		refreshPaginas(clienteLogado);
	}
}
