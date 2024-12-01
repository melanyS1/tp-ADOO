package strategy;

public class PagoCredito implements MedioDePago {
	private int numeroCuotas;

    public PagoCredito(int numeroCuotas) {
        if (numeroCuotas != 2 && numeroCuotas != 3 && numeroCuotas != 6) {
            throw new IllegalArgumentException("Las cuotas deben ser 2, 3 o 6");
        }
        this.numeroCuotas = numeroCuotas;
    }

    @Override
    public double calcularMontoFinal(double montoBase) {
        double recargo = 0;
        switch (numeroCuotas) {
            case 2:
                recargo = 0.06;
                break;
            case 3:
                recargo = 0.12;
                break;
            case 6:
                recargo = 0.20;
                break;
        }
        return montoBase * (1 + recargo);  // Aplica el recargo correspondiente
    }
}
