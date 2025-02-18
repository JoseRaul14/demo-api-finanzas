package pe.edu.idat.demo_api_finanzas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.demo_api_finanzas.service.ServiceDocenteCliente;

@RestController
public class GestionPagoController {

    public final ServiceDocenteCliente serviceDocenteClienteM;

    public GestionPagoController(ServiceDocenteCliente serviceDocenteClienteM) {
        this.serviceDocenteClienteM = serviceDocenteClienteM;
    }

    @GetMapping("/pago")
    public String obtenerPagos(){
        return "Respuesta del Servicio de Finanzas-Pago";
    }

    @GetMapping("/pago-docente")
    public String obtenerPagoDelDocente(){
        return serviceDocenteClienteM.obtenerDocentes();
    }

}
