package decorator;

public class WhatsappDecorator extends EnviableDecorator {
    public WhatsappDecorator(Enviable wrapper) {
        super(wrapper);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando mensaje por WhatsApp: " + mensaje);
    }
}