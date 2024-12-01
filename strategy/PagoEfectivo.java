package strategy;

public class PagoEfectivo implements MedioDePago{
    private static final double DESCUENTO = 0.10;

    @Override
    public double calcularMontoFinal(double montoBase) {
        return montoBase * (1 - DESCUENTO);  // Aplica un descuento del 10%
    }
}
