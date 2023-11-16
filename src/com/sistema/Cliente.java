package com.sistema;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

import com.sistema.paginas.Tela_ConfirmacaoCadastro;
import com.sistema.paginas.Tela_UsuarioDuplicado;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String celular;
    private String senha;
    private Date dataNascimento;
    private ArrayList<String> tiposPlantio = new ArrayList<String>();
    private ArrayList<Higrometro> higrometroList = new ArrayList<Higrometro>();

    public Cliente() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<String> getTiposPlantio() {
        return this.tiposPlantio;
    }

    public ArrayList<Higrometro> getHigrometroList() {
        return this.higrometroList;
    }

    public void adicionarTipoPlanta(String tipoPlanta) {
        tiposPlantio.add(tipoPlanta);
    }

    public boolean removerTipoPlanta(String tipoPlanta) {
        return tiposPlantio.remove(tipoPlanta);
    }

    public Higrometro getHigrometro(String nomeCultivo) {
        for (Higrometro higrometro : higrometroList) {
            if (higrometro.getNomeCultivo().equals(nomeCultivo)) {
                return higrometro;
            }
        }
        return null;
    }

    public void adicionarHigrometro(Higrometro higrometro) {
        higrometroList.add(higrometro);
    }

    public void cadastrarCliente() {
    	if(isDuplicado(cpf)) {
    		new Tela_UsuarioDuplicado().setVisible(true);
    		return;
    	}
		if (this.validarCadastro()) {
			Core.addUsuarioLista(this);
			new Tela_ConfirmacaoCadastro().setVisible(true);
		} else {
			Main.getCore().abrirPagina(Core.PAGINA_CADASTRO_INVALIDO);
		}
    }

    private boolean isEmailValid(String email) {
        return email.matches(".+@.+\\..+");
    }

    private boolean isCelularValid(String celular) {
        return celular.matches("^\\((?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\) (?:[2-8]|9[0-9])[0-9]{3}\\-[0-9]{4}$");
    }

    public boolean validarCadastro() {
    	
        return isEmailValid(email) && isCelularValid(celular) && !cpf.isEmpty() && !senha.isEmpty();
    }
    
    public boolean isDuplicado(String cpf) {
    	return Core.procurarClienteByCPF(cpf) == null ? false: true;
    }

    public void mostrarInformacoesCultivo() {
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYY");
        String mensagem = "Informações do cliente:\n";
        mensagem += "Nome: " + nome + "\n";
        mensagem += "CPF: " + cpf + "\n";
        mensagem += "Email: " + email + "\n";
        mensagem += "Celular: " + celular + "\n";
        mensagem += "Data de Nascimento: " + (dataNascimento != null ? sdf.format(dataNascimento) : "Não informada") + "\n";
        mensagem += "Cultivos:\n";
        for (String tipoPlanta : tiposPlantio) {
            mensagem += "- " + tipoPlanta + "\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }
}
