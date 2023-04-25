<header>
  <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid ">
      <a class="navbar-brand" href="${pageContext.request.contextPath}/">M6-ABPRO4</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
        <ul class="navbar-nav">
        					<li class="nav-item"><a class="nav-link text-light"
							href="${pageContext.request.contextPath}/">Inicio</a></li>
          <li class="nav-item dropdown"><a class="nav-link dropdown-toggle text-light" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Capacitación </a>
            <ul class="dropdown-menu bg-primary">
              <li class="nav-item"><a class="nav-link text-light" href="${pageContext.request.contextPath}/crearCapacitacion">Crear Capacitación</a></li>
              <li class="nav-item"><a class="nav-link text-light" href="${pageContext.request.contextPath}/listarCapacitaciones">Listar Capacitaciones</a></li>
            </ul>
          </li>
          <li class="nav-item"><a class="nav-link text-light" href="${pageContext.request.contextPath}/contacto">Contacto</a></li>
        </ul>
      </div>
    </div>
  </nav>
</header>