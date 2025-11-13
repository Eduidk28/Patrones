package factoryMethod;

public class Basica extends TarjetaDeCredito{
    
    public Basica(double costoAnual, int limiteCredito) {
        super(costoAnual, limiteCredito);
    }
    @Override
    public void imprimirDatos(){
        System.out.println("Tarjeta Basica");
        System.out.println("Costo Anual: "+costoAnual);
        System.out.println("Límite de Credito: "+limiteCredito);
    }
}