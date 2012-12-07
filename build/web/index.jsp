<%-- 
    Document   : index
    Created on : 06/12/2012, 23:18:06
    Author     : luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de Login</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="css/bootstrap-responsive.css" rel="stylesheet" type="text/css">
        <link href="css/style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h2>Página de Login</h2>
                <form method="post" action="Login" class="form-horizontal">
                    <div class="control-group">
                        <label class="control-label" for="email">Email</label>
                        <div class="controls">
                            <input type="email" name="email" id="email" required>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="senha">Senha</label>
                        <div class="controls">
                            <input type="password" name="senha" id="senha" required>
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <input type="submit" id="login" value="Login" class="btn btn-primary">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>