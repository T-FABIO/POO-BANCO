package bytebank.heredado;

public class Gerente extends Funcionario implements Autenticable {

    
    @Override
    public double getBonificacion(){       
        System.out.println("ejecutandose desde gerente");
        return 2000;
    }

    @Override
    public void setClave(String clave) {
        
    }

    @Override
    public boolean IniciarSesion(String Clave) {
        return false;
    }
    
}
