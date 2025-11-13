package decorator;

public class SistemaTiendaMinorista {
    public static void main(String[] args) {
            
        Enviable notificador = new EnviableBase();
    
        notificador = new WhatsappDecorator(notificador);
        notificador = new SignalDecorator(notificador);
        notificador = new WireDecorator(notificador);
        notificador = new TelegramDecorator(notificador);
        notificador.enviar("Su pago está próximo a vencer. Por favor, no olvide realizarlo.");
        
        }
    

}