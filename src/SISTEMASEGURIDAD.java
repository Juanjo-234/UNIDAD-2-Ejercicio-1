class SistemaSeguridad {
    private CentroMensajeria centro;

    public SistemaSeguridad(CentroMensajeria centro) {
        this.centro = centro;
    }

    public void enviarAlerta(String texto, int prioridad) {

        Mensaje nuevaAlerta = new Mensaje("Sistema de Seguridad Local", texto, prioridad);

        centro.recibirMensaje(nuevaAlerta);
    }
}