package decorator;

public class TelegramDecorator extends EnviableDecorator {
    public TelegramDecorator(Enviable wrapper) {
        super(wrapper);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando mensaje por Telegram: " + mensaje);
    }
}