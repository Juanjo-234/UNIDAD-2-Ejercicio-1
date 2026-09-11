 class Mensaje {
    private String remitente;
    private String texto;
    private int prioridad; // Ejemplo: 1 (Alta), 2 (Media), 3 (Baja)

    public Mensaje(String remitente, String texto, int prioridad) {
        this.remitente = remitente;
        this.texto = texto;
        this.prioridad = prioridad;
    }

    // Getters
    public String getRemitente() { return remitente; }
    public String getTexto() { return texto; }
    public int getPrioridad() { return prioridad; }
}