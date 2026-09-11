public class Main {
        public static void main(String[] args) {

            CentroMensajeria centro = new CentroMensajeria();


            SistemaSeguridad sistema = new SistemaSeguridad(centro);

            System.out.println("Iniciando simulación del sistema de seguridad...\n");

            sistema.enviarAlerta("Movimiento no autorizado en el perímetro norte.", 1);
            sistema.enviarAlerta("Batería de la cámara 4 al 15%.", 3);
        }
    }