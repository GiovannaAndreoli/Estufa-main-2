package DAO;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.sistema.paginas.Tela_Inicial;
import controle.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class mainDAO {
    private static ClienteDAO clienteDAO = new ClienteDAO();
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

        Cliente clienteObtido = clienteDAO.obterClienteByCPF("12345678901");
        if (clienteObtido != null) {
            System.out.println("Cliente obtido: " + clienteObtido.getNome());

            // Verifique se o cliente não é nulo antes de realizar operações
            clienteObtido.setNome("Novo Nome");
            clienteDAO.alterarCliente(clienteObtido);
        } else {
            System.out.println("Cliente não encontrado.");
        }

        // Verifique se o cliente não é nulo antes de remover
        if (clienteObtido != null) {
            clienteDAO.removerCliente("12345678901");
        }

        System.out.println("Clientes após remoção:");
        ArrayList<Cliente> clientes = clienteDAO.obterTodosClientes();
    }

    public static Core getCore() {
        return core;
    }

    private static class Core {

        public Core() {
        }

        private void iniciar() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}