package UnitTest;

public class NotificadorEmail {
    @SuppressWarnings("unused")
    private UnitTest.emailCliente emailCliente;

    public NotificadorEmail(UnitTest.emailCliente emailCliente) {
        this.emailCliente = emailCliente;
    }

    public NotificadorEmail(emailCliente notificadoremail) {
        //TODO Auto-generated constructor stub
    }

    public void notificar(String direccion, String mensaje) {
        // Lógica para enviar una notificación por correo
        UnitTest.emailCliente.enviarCorreo(direccion, mensaje);
    }
}
