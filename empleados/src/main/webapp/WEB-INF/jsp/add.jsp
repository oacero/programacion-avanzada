<%@include file="commons/header.jsp"%>
<%@include file="commons/navbar.jsp"%>

<div class="container">
    <div class="text-center" style="margin: 40px">
        <h2>Agregar Empleado</h2>
    </div>
    <!-- Formulario -->
    <form>
        <div class="mb-3">
            <label for="nombre" class="form-label">Nombre</label>
            <input type="text" class="form-control" id="nombre" required="true">
        </div>
        <div class="mb-3">
            <label for="departamento" class="form-label">Departamento</label>
            <input type="text" class="form-control" id="departamento">
        </div>
        <div class="mb-3">
            <label for="sueldo" class="form-label">Sueldo</label>
            <input type="number" step="any" class="form-control" id="sueldo">
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-primary">Agregar</button>
            <a href="/empleados" class="btn btn-danger">Regresar</a>
        </div>
    </form>


</div>

<%@include file="commons/footer.jsp"%>
