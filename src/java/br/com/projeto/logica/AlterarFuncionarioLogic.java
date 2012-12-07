/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.logica;

import br.com.projeto.dao.FuncionarioDAO;
import br.com.projeto.model.Funcionario;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luiz
 */
public class AlterarFuncionarioLogic implements Logica{

    @Override
    public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Funcionario funcionario = new Funcionario();
        funcionario.setId(Integer.parseInt(request.getParameter("id")));
        funcionario.setNome(request.getParameter("nome"));
        funcionario.setCargo(request.getParameter("cargo"));
        funcionario.setCpf(request.getParameter("cpf"));
        funcionario.setEmail(request.getParameter("email"));
        funcionario.setPerfil(request.getParameter("perfil"));
        
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.atualizar(funcionario);
        
        RequestDispatcher rd = request.getRequestDispatcher("principal.jsp");
        rd.forward(request, response);
    }
}