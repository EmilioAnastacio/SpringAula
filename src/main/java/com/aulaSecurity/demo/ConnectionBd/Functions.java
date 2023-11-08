package com.aulaSecurity.demo.ConnectionBd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Functions {

    public static void cadastro_usert(Connection connection) throws SQLException {
        String query = "INSERT INTO users(username, passworde) VALUES (?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, "emilio");
            stmt.setString(2, "1234");

            int linha_afetada = stmt.executeUpdate();
            if (linha_afetada > 0) {
                System.out.println("User cadastrado");
            } else {
                System.out.println("User Nao Cadastrado");
            }
        }
    }

    public static void list_user(Connection connection) throws SQLException {
        String query = "SELECT * FROM users";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String username = rs.getString("username");
                String passworde = rs.getString("1234");
                System.out.println(username + "" + passworde);
            }
        }
    }
}
