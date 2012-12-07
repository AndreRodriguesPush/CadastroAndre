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
public class RemoveFuncionarioLogic implements Logica{

    @Override
    public void executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Funcionario funcionario = new Funcionario();
        funcionario.setId(Integer.parseInt(request.getParameter("id")));
        
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.remover(funcionario);
        
        RequestDispatcher rd = request.getRequestDispatcher("/principal.jsp");
        rd.forward(request, response);
        System.out.println("Funcionario removido"+funcionario.getId());
    }
    
}
