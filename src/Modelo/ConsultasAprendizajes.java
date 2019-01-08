/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConsultasAprendizajes extends Conexion{
    public boolean registrar(AprendizajesEsperados ap) throws ClassNotFoundException{
        PreparedStatement pre = null;
        Connection con = getConnection();
        String sql = "INSERT INTO aprendizajes (Asignatura, Aprendizaje) VALUES(?,?)";
        try{
            pre = con.prepareStatement(sql);
            pre.setString(1, ap.getAsignatura());
            pre.setString(2, ap.getAprendizaje());
            pre.execute();
            return true;
        }catch(SQLException e){
            System.err.print(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.print(e);
            }
        }
    }
    public boolean modificar(AprendizajesEsperados ap) throws ClassNotFoundException{
        PreparedStatement pre = null;
        Connection con = this.getConnection();
        String sql = "UPDATE aprendizajes SET Asignatura=?, Aprendizaje=? WHERE Id=?";
        try{
            pre = con.prepareStatement(sql);
            pre.setString(1, ap.getAsignatura());
            pre.setString(2, ap.getAprendizaje());
            pre.setInt(3, ap.getId());
            pre.execute();
            return true;
        }catch(SQLException e){
            System.err.print(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.print(e);
            }
        }
    }
    public boolean eliminar(AprendizajesEsperados ap) throws ClassNotFoundException{
        PreparedStatement pre = null;
        Connection con = this.getConnection();
        String sql = "DELETE FROM aprendizaje Where Id=?";
        try{
            pre = con.prepareStatement(sql);
            pre.setInt(1, ap.getId());
            pre.execute();
            return true;
        }catch(SQLException e){
            System.err.print(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.print(e);
            }
        }
    }
    public boolean buscar(AprendizajesEsperados ap) throws ClassNotFoundException{
        PreparedStatement pre = null;
        Connection con = this.getConnection();
        ResultSet rs = null;
        String sql = "SELECT * FROM aprendizaje WHERE Asignatura=?";
        try{
            pre = con.prepareStatement(sql);
            pre.setString(1, ap.getAsignatura());
            rs = pre.executeQuery();
            if(rs.next()){
                ap.setAprendizaje(rs.getString("Aprendizaje"));
                ap.setAsignatura(rs.getString("Asignatura"));
                ap.setId(rs.getInt("Id"));
            }
            pre.execute();
            return true;
        }catch(SQLException e){
            System.err.print(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.print(e);
            }
        }
    }
}
