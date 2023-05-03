package bytebank.heredado;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario fabian = new Contador();        
        fabian.setSalario(2000);
        
        Gerente luisa = new Gerente();
        luisa.setSalario(10000);
        
        Contador alex = new Contador();
        alex.setSalario(5000);
        
        ControlBonificacion controlbonificacion = new ControlBonificacion();
        
        controlbonificacion.registrarSalario(fabian);
        controlbonificacion.registrarSalario(luisa);
        controlbonificacion.registrarSalario(alex);
        
    }
}
