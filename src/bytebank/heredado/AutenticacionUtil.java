package bytebank.heredado;

public class AutenticacionUtil {
    private String Clave;

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public boolean iniciarSesion(String clave){
        return this.Clave.equals(clave);
    }
}
