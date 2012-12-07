package br.com.projeto.dao;

import br.com.projeto.db.ConnectionFactory;
import br.com.projeto.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    Connection connection = null;

    public FuncionarioDAO() {
        try {
            connection = new ConnectionFactory().getConnection();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public void inserir(Funcionario funcionario) {
        try {
            String sql = "insert into funcionario (nome, cpf, cargo, senha, email, perfil) values (?,?,?,?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getCargo());
            stmt.setString(4, funcionario.getSenha());
            stmt.setString(5, funcionario.getEmail());
            stmt.setString(6, funcionario.getPerfil());
            
            stmt.execute();
            stmt.close();
            System.out.println("Gravado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Boolean atualizar(Funcionario funcionario) {
        try {
            String sql = "update funcionario set nome = ?, cpf = ?, cargo = ?, senha = ? where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getCargo());
            stmt.setString(4, funcionario.getSenha());
            stmt.setInt(5, funcionario.getId());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Boolean remover(Funcionario funcionario) {
        try {
            String sql = "delete from funcionario where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, funcionario.getId());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List getFuncionarios() {
        try {
            List<Funcionario> funcionarios = new ArrayList();
            String sql = "select * from funcionario";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setSenha(rs.getString("senha"));
                funcionarios.add(funcionario);
            }
            rs.close();
            stmt.close();
            return funcionarios;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List getFuncionario(Funcionario funcionario) {
        try {
            List<Funcionario> funcionarios = new ArrayList();
            String sql = "select * from funcionarios where like ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario func = new Funcionario();
                func.setId(rs.getInt("id"));
                func.setNome(rs.getString("nome"));
                func.setCargo(rs.getString("cargo"));
                func.setCpf(rs.getString("cpf"));
                func.setSenha(rs.getString("senha"));
                funcionarios.add(func);
            }
            rs.close();
            stmt.close();
            return funcionarios;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Funcionario Login(Funcionario funcionario) {
        try {
            String sql = "select * from funcionario where email = ? and senha = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getEmail());
            stmt.setString(2, funcionario.getSenha());
            ResultSet rs = stmt.executeQuery();
            Funcionario func = new Funcionario();
            while (rs.next()) {
                func.setId(rs.getInt("id"));
                func.setNome(rs.getString("nome"));
                func.setCargo(rs.getString("cargo"));
                func.setCpf(rs.getString("cpf"));
                func.setSenha(rs.getString("senha"));
            }
            rs.close();
            stmt.close();
            return func;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}