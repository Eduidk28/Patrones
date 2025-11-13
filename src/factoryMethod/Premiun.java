package factoryMethod;

public class Premiun extends TarjetaDeCredito{
    
    public Premiun(double costoAnual, int limiteCredito) {
        super(costoAnual, limiteCredito);
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Tarjeta Premium");
        System.out.println("Costo Anual: "+costoAnual);
        System.out.println("Límite de Credito: "+limiteCredito);
    }
    
}