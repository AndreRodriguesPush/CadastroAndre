/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.servlet;

import br.com.projeto.dao.FuncionarioDAO;
import br.com.projeto.model.Funcionario;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luiz
 */
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(request.getParameter("email"));
            funcionario.setSenha(request.getParameter("senha"));
            
            FuncionarioDAO dao = new FuncionarioDAO();
            Funcionario login = dao.Login(funcionario);
            
            if(login != null){
                RequestDispatcher rd = request.getRequestDispatcher("principal.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
