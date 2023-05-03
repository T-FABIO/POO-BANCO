package bytebank.heredado;

public class CuentaCorriente extends Cuenta {
   
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        double comision = 0.2;
        this.saldo = this.saldo + (valor + comision);
    }
   
    
}
