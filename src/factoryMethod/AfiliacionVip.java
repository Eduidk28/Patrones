package factoryMethod;

public class AfiliacionVip extends Afiliaciones{
    @Override
    public TarjetaDeCredito emitirTarjeta(){
        return new VIP(1000,20000);
    }
}