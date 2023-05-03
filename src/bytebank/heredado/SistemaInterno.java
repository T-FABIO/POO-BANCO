package bytebank.heredado;

public class SistemaInterno {
    
    private String Clave = "AluraCursosOnline";
    
    public boolean autentica(Autenticable gerente){
        boolean puedeIniciarSesion = gerente.IniciarSesion(Clave);
        if (puedeIniciarSesion) {
            System.out.println("login exitoso");
            return true;
        }else{
            System.out.println("error e login");
            return false;
        }
        
    }
}
