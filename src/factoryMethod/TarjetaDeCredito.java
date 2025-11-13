package factoryMethod;

public abstract class TarjetaDeCredito {
    public double costoAnual;
    public int limiteCredito;

    public TarjetaDeCredito(double costoAnual, int limiteCredito) {
        this.costoAnual = costoAnual;
        this.limiteCredito = limiteCredito;
    }

    public abstract void imprimirDatos();
}