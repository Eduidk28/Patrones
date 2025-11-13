package decorator;

public class WireDecorator extends EnviableDecorator {
    public WireDecorator(Enviable wrapper) {
        super(wrapper);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando mensaje por Wire: " + mensaje);
    }
}