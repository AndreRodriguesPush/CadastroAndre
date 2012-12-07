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
                <form name="cadastro" id="cadastro" method="post" action="funcionarios" class="form-horizontal">
                    <div class="control-group">
                        <label class="control-label" for="nome">Nome</label>
                        <div class="controls">
                            <input type="text" name="nome" id="nome">
                        </div>
                    </div>
                    
                    <div class="control-group">
                        <label class="control-label" for="email">Email</label>
                        <div class="controls">
                            <input type="email" name="email" id="email">
                        </div>
                    </div>
                    
                    <div class="control-group">
                        <label class="control-label" for="cargo">Cargo</label>
                        <div class="controls">
                            <input type="text" name="cargo" id="cargo">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="cpf">CPF</label>
                        <div class="controls">
                            <input type="text" name="cpf" id="cpf">
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
                                <option name="perfil" value="administrador">Administrador</option>
                                <option name="perfil" value="usuario">Usuario</option>
                            </select>
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <input type="submit" id="salvar" value="Salvar" class="btn btn-success">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>