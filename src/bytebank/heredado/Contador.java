package bytebank.heredado;

public class Contador extends Funcionario{
    
    @Override
    public double getBonificacion(){
        System.out.println("ejecutandose desde contador");
        return 200;
        
    }
}
