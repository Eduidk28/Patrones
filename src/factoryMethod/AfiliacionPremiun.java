package factoryMethod;

public class AfiliacionPremiun extends Afiliaciones{
    @Override
    public TarjetaDeCredito emitirTarjeta(){
        return new Premiun(500,5000);
    }
}