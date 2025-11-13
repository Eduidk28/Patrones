package facade;

public class Cliente {
    
    public static void main(String[] args) {
        TiendaFacade cliente = new TiendaFacade();
        cliente.realizarPedido();
    }
}