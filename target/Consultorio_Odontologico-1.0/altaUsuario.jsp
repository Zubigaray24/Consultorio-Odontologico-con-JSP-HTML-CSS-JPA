<%@include file="components/header.jsp"%>
<%@include file="components/bodyPrimeraParte.jsp"%>

<h1>Alta Usuarios</h1>

<form class="user" action="SvUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombreUsuario" name="nombreUsuario"
                   placeholder="Nombre de usuario">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                   placeholder="Contraseña">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="rol"
                   placeholder="Rol">
        </div>

        <button class="btn btn-primary btn-user btn-block" type="submit">
            Crear Usuario
        </button>
        <hr>
</form>

<%@include file="components/bodySegundaParte.jsp"%>