Este programa está diseñado para modelar y gestionar el procesamiento y el flujo de comunicaciones mediante un **sistema de seguridad y centro de mensajería** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `Mensaje`:** Modela una comunicación individual conteniendo sus atributos principales: el emisor o remitente (`remitente`), el contenido del mensaje (`texto`) y el nivel de urgencia o importancia (`prioridad`).
* **Crea la clase `CentroMensajeria`:** Implementa un gestor centralizado que cuenta con un método de procesamiento (`recibirMensaje(Mensaje m)`) encargado de recibir, administrar y registrar las comunicaciones entrantes al sistema.
* **Implementa la clase `SistemaSeguridad`:** Modela un componente de protección que posee una referencia directa a un `CentroMensajeria` y dispone de un método específico para disparar y enviar alertas automáticas cuando se requiere atención.
* **Ejecuta la prueba (`main`):** Instancia el centro de mensajería y el sistema de seguridad, simula el envío de al menos dos mensajes (incluyendo eventos de alerta crítica) y muestra el estado y procesamiento de la comunicación por consola.
