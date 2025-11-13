package factoryMethod;

public class VIP extends TarjetaDeCredito{
    
    public VIP(double costoAnual, int limiteCredito) {
        super(costoAnual, limiteCredito);
    }
    @Override
    public void imprimirDatos(){
        System.out.println("Tarjeta VIP");
        System.out.println("Costo Anual: "+costoAnual);
        System.out.println("Límite de Credito: "+limiteCredito);
    }
}