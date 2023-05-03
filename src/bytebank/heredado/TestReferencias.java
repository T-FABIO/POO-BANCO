package bytebank.heredado;

public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario =new Contador();
        funcionario.setNombre("fabian");
        
        Gerente gerente = new Gerente();
        gerente.setNombre("luisa");
        
        
        funcionario.setSalario(2000);
        gerente.setSalario(10000);
                
    }
}
