<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Funcionário</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="css/bootstrap-responsive.css" rel="stylesheet" type="text/css">
        <link href="css/style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <form name="alterar" id="alterar" method="post" action="mvc" class="form-horizontal">
                    <div class="control-group">
                        <label class="control-label" for="nome">Nome</label>
                        <div class="controls">
                            <input type="text" name="nome" id="nome" value="${param.nome}">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="cargo">Cargo</label>
                        <div class="controls">
                            <input type="text" name="cargo" id="cargo" value="${param.cargo}">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="email">Email</label>
                        <div class="controls">
                            <input type="email" name="email" id="email" value="${param.email}">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="cpf">CPF</label>
                        <div class="controls">
                            <input type="text" name="cpf" id="cpf" value="${param.cpf}">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="senha">Senha</label>
                        <div class="controls">
                            <input type="password" name="senha" id="senha">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="confsenha">Repita a senha</label>
                        <div class="controls">
                            <input type="password" name="confsenha" id="confsenha">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label">Perfil</label>
                        <div class="controls">
                            <select>
                                <option name="perfil" value="${param.perfil}">Administrador</option>
                                <option name="perfil" value="${param.perfil}">Usuario</option>
                            </select>
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <input type="submit" id="salvar" value="Salvar" class="btn btn-success">
                        </div>
                    </div>
                    <input type="hidden" name="id" value="${param.id}">
                    <input type="hidden" name="logica" value="AlterarFuncionarioLogic">
                </form>
            </div>
        </div>
    </body>
</html>