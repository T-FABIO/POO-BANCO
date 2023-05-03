package bytebank.heredado;

public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    
    private static int total = 0;
    
    public Cuenta(){
    }
    
    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estoy creando una agencia");
        Cuenta.total++;
    }
    
    public abstract void depositar(double valor);

    public static int getTotal() {
        return Cuenta.total;
    }

    public static void setTotal(int total) {
        Cuenta.total = total;
    }
    
 
    

    
    
    //Retorna valor 
    public boolean retirar(double valor){
        
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        
        return false;
    
    }
    
    public boolean transferir(double valor, Cuenta cuenta){
        
        if(this.saldo >= valor){
            this.retirar(valor);
            cuenta.depositar(valor);        
            return true;
        }else{
            return false;
        }
        
    }
    
    
    
    public double getSaldo(){
        return this.saldo;
    }
    
//    public void setAgencia(int agencia){
//        
//        if(agencia > 0){
//            this.agencia = agencia;
//        }else{
//            System.out.println("No esta permitido valores negativos");
//        }
//             
//    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    

    public Cliente getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
