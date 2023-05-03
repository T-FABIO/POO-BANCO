package bytebank.heredado;

public class ControlBonificacion {
    
    private double suma;
    
    public double registrarSalario(Funcionario funcionario){       
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("calculo: " + this.suma);
        return this.suma;
    }
       
}
