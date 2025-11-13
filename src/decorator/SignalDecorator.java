package decorator;

public class SignalDecorator extends EnviableDecorator {
    public SignalDecorator(Enviable wrapper) {
        super(wrapper);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando mensaje por Signal: " + mensaje);
    }
}