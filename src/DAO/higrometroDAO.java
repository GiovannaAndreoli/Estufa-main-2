package DAO;

import com.sistema.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class higrometroDAO extends Higrometro {

    public void inserirHigrometro() {
        
        Connection connection = connectionfactory.getConnection();
        
        try {
            String sql = "INSERT INTO higrometro (temp_interna, "
                    + "temp_externa, umid_ar, umid_solo) "
                    + "VALUES (?, ?, ?, ?)";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement = connection.prepareStatement(sql);
            //statement.setString(1, this.getNomeCultivo());
            statement.setDouble(1, this.getTemperaturaInterna());
            statement.setDouble(2, this.getTemperaturaExterna());
            statement.setDouble(3, this.getUmidadeAr());
            statement.setDouble(4, this.getUmidadeSolo());
            
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Higrometro UltimoRegistro() {
        Connection connection = connectionfactory.getConnection();
        Higrometro higrometro = null;

        try {
            String sql = "SELECT * FROM Higrometro ORDER BY  id_higrometro DESC LIMIT 1";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        higrometro = new Higrometro();
                        higrometro.setTemperaturaInterna(resultSet.getDouble("temp_interna"));
                        higrometro.setTemperaturaExterna(resultSet.getDouble("temp_externa"));
                        higrometro.setUmidadeAr(resultSet.getDouble("umid_ar"));
                        higrometro.setUmidadeSolo(resultSet.getDouble("umid_solo"));
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

        return higrometro;
    }
 
}