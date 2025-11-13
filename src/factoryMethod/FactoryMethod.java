package factoryMethod;

public class FactoryMethod {

    public static void main(String[] args) {
        Afiliaciones afilBasica=new AfiliacionBasica();
        Afiliaciones afilPremium=new AfiliacionPremiun();
        Afiliaciones afilVIP=new AfiliacionVip();
        
        
        //Emite una tarjeta basica si el cliente obtiene una tarjeta basica
        TarjetaDeCredito creditoBasico=afilBasica.emitirTarjeta();
        //Emite una tarjeta premium si el cliente obtiene una tarjeta premium
        TarjetaDeCredito creditoPremium=afilPremium.emitirTarjeta();
        //Emite una tarjeta VIP si el cliente obtiene una tarjeta VIP
        TarjetaDeCredito creditoVIP=afilVIP.emitirTarjeta();
        //Todas solo usan emitirTarjeta
        
        
        creditoBasico.imprimirDatos();
        creditoPremium.imprimirDatos();
        creditoVIP.imprimirDatos();
    }
}