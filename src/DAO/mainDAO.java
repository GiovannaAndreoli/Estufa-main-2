package DAO;

import controle.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class mainDAO {
    private static Core core = new Core();

    public static void main(String[] args) {
        core.iniciar();

        ClienteDAO cliente = new ClienteDAO();
        cliente.setNome("teste");
        cliente.setCpf("12345678901");
        cliente.setEmail("teste@example.com");
        cliente.setCelular("(12) 3456-7890");
        cliente.setSenha("senhateste");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dataNascimento = sdf.parse("1990-01-01");
            cliente.setDataNascimento(dataNascimento);
        } catch (ParseException e) {
            System.err.println("Erro ao converter data de nascimento: " + e.getMessage());
        }

        cliente.inserirCliente();
        ClienteDAO clienteDao = new ClienteDAO();
        Cliente clienteObtido = clienteDao.obterClienteByCPF("12345678901");
        
        if (clienteObtido != null) {
            System.out.println("Cliente obtido: " + clienteObtido.getNome());

            
            clienteObtido.setNome("Novo Nome");
            clienteDao.alterarCliente(clienteObtido);
        } else {
            System.out.println("Cliente não encontrado.");
        }

        
        if (clienteObtido != null) {
            clienteDao.removerCliente("12345678901");
        }

        
         List<Cliente> clientes = clienteDao.obterTodosClientes();
    }

    public static Core getCore() {
        return core;
    }

    private static class Core {
        public Core() {
        }

        private void iniciar() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
