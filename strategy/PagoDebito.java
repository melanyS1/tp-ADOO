package strategy;

public class PagoDebito implements MedioDePago{
    @Override
public double calcularMontoFinal(double montoBase) {
    return montoBase;  // No hay descuentos ni recargos
}
}