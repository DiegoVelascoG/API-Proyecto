package inventario.utez.edu.mx.Integradora.mx.utez.edu.tipoPlatillo.model;

import inventario.utez.edu.mx.Conexion.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class TipoPlatilloDao {

    public TipoPlatillo getTipoPlatilloById(int id) throws SQLException {
        TipoPlatillo tipoPlatillo = new TipoPlatillo();

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try{
            con = ConnectionDB.getConnection();
            ps = con.prepareStatement("SELECT * FROM tipoPlatillo WHERE idTipoPlatillo = ?;");
            ps.setInt(1,id);
            rs = ps.executeQuery();

            while(rs.next()){
                tipoPlatillo.setIdTipoPlatillo(rs.getInt(1));
                tipoPlatillo.setNombreTipo(rs.getString(2));
            }
            if(con!=null) con.close();
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }finally{
            if(con!=null) con.close();
            if(rs!=null)rs.close();
            if(ps!=null)ps.close();
        }

        return tipoPlatillo;
    }

}
