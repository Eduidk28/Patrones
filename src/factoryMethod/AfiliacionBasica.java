package factoryMethod;

public class AfiliacionBasica extends Afiliaciones {
    @Override
    public TarjetaDeCredito emitirTarjeta(){
        return new Basica(10,500);
    }
}