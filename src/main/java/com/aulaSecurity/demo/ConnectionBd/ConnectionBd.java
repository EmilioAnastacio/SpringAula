package com.aulaSecurity.demo.ConnectionBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBd {

    public static void main(String[] args){
        String host = "jdbc:postgresql://localhost:5432/SecurityBanco";
        String user = "postgres";
        String password = "1712";

        //Testa conexão com o BD
        try {
            Connection connection = DriverManager.getConnection(host, user, password);
            System.out.println("Conexão Feita!\n");

            Functions.cadastro_usert(connection);
            Functions.list_user(connection);

            connection.close();
            System.out.println("\nConexão encerrada!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }
}
