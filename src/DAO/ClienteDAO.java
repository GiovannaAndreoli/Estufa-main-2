package DAO;

import controle.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public void inserirCliente(Cliente cliente) {
        Connection connection = connectionfactory.getConnection();
        try {
            String sql = "INSERT INTO cliente (nome, cpf, email, celular, senha, data_nasc) VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, cliente.getNome());
                statement.setString(2, cliente.getCpf());
                statement.setString(3, cliente.getEmail());
                statement.setString(4, cliente.getCelular());
                statement.setString(5, cliente.getSenha());
                statement.setDate(6, new java.sql.Date(cliente.getDataNascimento().getTime()));

                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Cliente obterClienteByCPF(String cpf) {
        Connection connection = connectionfactory.getConnection();
        Cliente cliente = null;

        try {
            String sql = "SELECT * FROM cliente WHERE cpf=?";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, cpf);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        cliente = new Cliente();
                        cliente.setCpf(resultSet.getString("cpf"));
                        cliente.setNome(resultSet.getString("nome"));
                        cliente.setEmail(resultSet.getString("email"));
                        cliente.setCelular(resultSet.getString("celular"));
                        cliente.setSenha(resultSet.getString("senha"));
                        cliente.setDataNascimento(resultSet.getDate("data_nasc"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return cliente;
    }

    public void alterarCliente(Cliente cliente) {
        Connection connection = connectionfactory.getConnection();
        try {
            String sql = "UPDATE cliente SET nome=?, email=?, celular=?, senha=?, data_nasc=? WHERE cpf=?";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, cliente.getNome());
                statement.setString(2, cliente.getEmail());
                statement.setString(3, cliente.getCelular());
                statement.setString(4, cliente.getSenha());
                statement.setDate(5, new java.sql.Date(cliente.getDataNascimento().getTime()));
                statement.setString(6, cliente.getCpf());

                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void removerCliente(String cpf) {
        Connection connection = connectionfactory.getConnection();
        try {
            String sql = "DELETE FROM cliente WHERE cpf = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, cpf);
                statement.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Cliente> obterTodosClientes() {
        List<Cliente> clientes = new ArrayList<>();
        Connection connection = connectionfactory.getConnection();

        try {
            String sql = "SELECT * FROM cliente";
            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setCpf(resultSet.getString("cpf"));
                    cliente.setNome(resultSet.getString("nome"));
                    cliente.setEmail(resultSet.getString("email"));
                    cliente.setCelular(resultSet.getString("celular"));
                    cliente.setSenha(resultSet.getString("senha"));
                    cliente.setDataNascimento(resultSet.getDate("data_nasc"));
                    clientes.add(cliente);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return clientes;
    }
}
