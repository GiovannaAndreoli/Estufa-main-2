package DAO;

import controle.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO extends Cliente{

    public void inserirCliente() {
        Connection connection = connectionfactory.getConnection();
        try {

            String sql = "INSERT INTO cliente (nome, cpf, email, celular, senha, data_nasc) VALUES (?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, this.getNome());
                statement.setString(2, this.getCpf());
                statement.setString(3, this.getEmail());
                statement.setString(4, this.getCelular());
                statement.setString(5, this.getSenha());
                statement.setDate(6, new java.sql.Date(this.getDataNascimento().getTime()));

                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close(); // Certifique-se de fechar a conexão no final
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    Cliente obterClienteByCPF(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void alterarCliente(Cliente clienteObtido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void removerCliente(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    ArrayList<Cliente> obterTodosClientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
