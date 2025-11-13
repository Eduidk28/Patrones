package decorator;

public class EnviableBase implements Enviable {
    
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje por SMS y correo: " + mensaje);
    }

}