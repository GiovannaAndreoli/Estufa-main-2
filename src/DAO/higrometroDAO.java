package DAO;

import com.sistema.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
 
}