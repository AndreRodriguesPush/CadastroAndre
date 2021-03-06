package br.com.projeto.teste;

import br.com.projeto.db.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            System.out.println("Conexão aberta!");
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}