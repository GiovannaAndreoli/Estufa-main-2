package DAO;

import controle.Higrometro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class higrometroDAO {

    public static void inserirHigrometro(Higrometro higrometro) {
        PreparedStatement stmt = null;
        Connection conexao = null;

        try {
            
            
            Connection root = null;
            Connection connection = root;

            String sql = "INSERT INTO higrometros (nome_cultivo, temperatura_interna, temperatura_externa, umidade_ar, umidade_solo) VALUES (?, ?, ?, ?, ?)";

            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, higrometro.getNomeCultivo());
            stmt.setDouble(2, higrometro.getTemperaturaInterna());
            stmt.setDouble(3, higrometro.getTemperaturaExterna());
            stmt.setDouble(4, higrometro.getUmidadeAr());
            stmt.setDouble(5, higrometro.getUmidadeSolo());
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}