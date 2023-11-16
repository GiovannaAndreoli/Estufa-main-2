package DAO;

import controle.Cliente;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class clienteDAO {
    private Connection conn;

    public clienteDAO() {
        conn = connectionfactory.getConnection();
    }

    public void inserir(Cliente cliente) {
        try {

            String sql = "insert into cliente(id_cliente, nome, cpf, email, celular, data_nasc) values (?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getEmail());
            stmt.setDate(6,new java.sql.Date(cliente.getDataNascimento().getTime())); ;
        } catch (SQLException ex) {
            Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
