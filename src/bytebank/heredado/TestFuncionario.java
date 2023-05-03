package bytebank.heredado;

public class TestFuncionario {
    
    public static void main(String[] args) {
        Funcionario fabio = new Contador();
        fabio.setNombre("fabio");
        fabio.setDocumento("1043640428");
        fabio.setSalario(2000);
        fabio.setTipo(0);
        
        System.out.println(fabio.getSalario());
        System.out.println(fabio.getBonificacion());
    }
    
}
