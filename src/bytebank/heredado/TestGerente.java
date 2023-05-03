package bytebank.heredado;


public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        
        gerente.setNombre("juan");
        gerente.setDocumento("30405060");
        gerente.setSalario(5000);
   
        //Funcionario gerente = new Funcionario();
        
        gerente.setSalario(6000);
        gerente.setTipo(1);
        gerente.setClave("AluraCursosOnline");
        
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.IniciarSesion("AluraCursosOnline"));
    }
}
