package Modelo;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;


        
public class ConsultaCalcular extends Conexion {


    public boolean registrar(Calcular ss) {
        
        PreparedStatement ps= null;
//        PreparedStatementent ps =null;
        Connection con = getConnection();

        String sql = "INSERT INTO control (codigo, sueldo, agip, monotributo, alquiler, celular, transporte, tarjeta_naranja, tarjeta_banco_ciudad, total_impuesto, total_tarjetas, total_servicios, total_pagar, fecha_ingreso, Total_sueldo, estado_cuenta) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, ss.getCodigo());
            ps.setDouble(2, ss.getSueldo());
            ps.setDouble(3, ss.getAgip());
            ps.setDouble(4, ss.getMonotributo());
            ps.setDouble(5, ss.getAlquiler());
            ps.setDouble(6, ss.getCelular());
            ps.setDouble(7, ss.getTransporte());
            ps.setDouble(8, ss.getT_naranja());
            ps.setDouble(9, ss.getT_Banco_Ciudad());
            ps.setDate(10, ss.getFecha_ingreso());
            ps.setDouble(11, ss.getTotal_impuesto());
            ps.setDouble(12, ss.getTotal_tarjetas());
            ps.setDouble(13, ss.getTotal_servicios());
            ps.setDouble(14, ss.getTotal_pagar());
            ps.setDouble(15, ss.getTotal_sueldo());
            ps.setString(16, ss.getEstado_cuenta());

            ps.execute();
            return true;

        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();

                
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
        public boolean ingresarNuevo(Calcular ss) {
        
        PreparedStatement ps= null;
//        PreparedStatementent ps =null;
         
     Connection con = getConnection();

    String sql = "INSERT INTO control (codigo, sueldo, agip, monotributo, alquiler, celular, transporte, tarjeta_naranja, tarjeta_banco_ciudad, fecha_ingreso, estado_cuenta) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

    try {
        ps = con.prepareStatement(sql);

        ps.setString(1, ss.getCodigo());
        ps.setDouble(2, ss.getSueldo());
        ps.setDouble(3, ss.getAgip());
        ps.setDouble(4, ss.getMonotributo());
        ps.setDouble(5, ss.getAlquiler());
        ps.setDouble(6, ss.getCelular());
        ps.setDouble(7, ss.getTransporte());
        ps.setDouble(8, ss.getT_naranja());
        ps.setDouble(9, ss.getT_Banco_Ciudad());
        ps.setDate(10, ss.getFecha_ingreso());
        
        ps.setString(11, ss.getEstado_cuenta());

        ps.execute();
        return true;
    } catch (SQLException e) {
        System.err.println(e);
        return false;
    } finally {
        try {
            con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}

    public boolean modificar(Calcular ss) {

        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "UPDATE control SET codigo=?, sueldo=?, agip=?, monotributo=?, alquiler=?, celular=?, transporte=?, tarjeta_naranja=?, tarjeta_banco_ciudad=?, fecha_ingreso=?, total_impuesto=?, total_tarjetas=?, total_servicios=?, total_pagar=?, Total_sueldo=?, estado_cuenta=? WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, ss.getCodigo());
            ps.setDouble(2, ss.getSueldo());
            ps.setDouble(3, ss.getAgip());
            ps.setDouble(4, ss.getMonotributo());
            ps.setDouble(5, ss.getAlquiler());
            ps.setDouble(6, ss.getCelular());
            ps.setDouble(7, ss.getTransporte());
            ps.setDouble(8, ss.getT_naranja());
            ps.setDouble(9, ss.getT_Banco_Ciudad());
            ps.setDate(10, ss.getFecha_ingreso());
            ps.setDouble(11, ss.getTotal_impuesto());
            ps.setDouble(12, ss.getTotal_tarjetas());
            ps.setDouble(13, ss.getTotal_servicios());
            ps.setDouble(14, ss.getTotal_pagar());
            ps.setDouble(15, ss.getTotal_sueldo());
            ps.setString(16, ss.getEstado_cuenta());
            ps.setInt(17, ss.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }

    public boolean eliminar(Calcular ss) {

        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "DELETE FROM control WHERE id=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setInt(1, ss.getId());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;

        } finally {
            try {
                con.close();

            } catch (SQLException e) {
                System.err.println(e);
            }
        }

    }

    public boolean buscar(Calcular ss) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String sql = "SELECT * FROM control WHERE codigo=?";
        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, ss.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {

                ss.setId(Integer.parseInt(rs.getString("id")));
                ss.setCodigo(rs.getString("codigo"));
                ss.setSueldo(Double.parseDouble(rs.getString("sueldo")));
                ss.setAgip(Double.parseDouble(rs.getString("agip")));
                ss.setMonotributo(Double.parseDouble(rs.getString("monotributo")));
                ss.setAlquiler(Double.parseDouble(rs.getString("alquiler")));
                ss.setCelular(Double.parseDouble(rs.getString("celular")));
                ss.setTransporte(Double.parseDouble(rs.getString("transporte")));
                ss.setT_naranja(Double.parseDouble(rs.getString("tarjeta_naranja")));
                ss.setT_Banco_Ciudad(Double.parseDouble(rs.getString("tarjeta_banco_ciudad")));
                ss.setFecha_ingreso(rs.getDate("fecha_ingreso"));
                ss.setTotal_sueldo(Double.parseDouble(rs.getString("Total_sueldo")));
                ss.setEstado_cuenta(rs.getString("estado_cuenta"));
                
                
                return true;
            }
              return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        
        }
    }
}



        