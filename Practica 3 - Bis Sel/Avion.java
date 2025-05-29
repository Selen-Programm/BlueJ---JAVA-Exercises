public class Avion extends Transporte
{
    private String motor;
    private int altura;
    private String empresa;
    
    /* Nombre del motor */
     public String getMotor(){
        return motor;  
    }
    
    public void setMotor(String motor){ 
        this.motor = motor;
    }
    
    public int getAltura(){
        return altura;  
    }
    
    public void setAltura(int altura){ 
        this.altura = altura;
    }
    
    /* Nombre de la Empresa */
     public String getEmpresa(){
        return empresa;  
    }
    
    public void setEmpresa(String empresa){ 
        this.empresa = empresa;
    }
    
    public Avion()
    {
       //Iniciallizar vavariables
       
    }
    
    //METODOS
    
    //Aterrizar
    public boolean Aterrizar(){
        setAltura(0);
        return true;
    }
    //Despegar
    public boolean Despegar(){
        setAltura(1);
        return true;
    }
    //Ascender
    public boolean Ascender(){
        if (altura >= 1) {
            System.out.println("Ascendiendo Altura.......");
        }
        return true;
    }
    //Descender
    public boolean Descender(){
        if (altura <= 0) {
            System.out.println("Ascendiendo Altura.......");
        }
        return true;
    }
    
    // LLAMADA IMPRIMIR 
    
    public void MiVehiculo() {
        // Capacidad
        System.out.println("Capacidad del vehiculo es: " + getCapacidad());
        // Estado ON - OFF
        if (getEstado() == true) {
            System.out.println("El estado del vehículo está Activo. Estado: "+ getEstado());
            if (Aterrizar() == true) { 
                System.out.println("Aterrizando vehiculo...... ");
            }
            if (Despegar() == true) { 
                System.out.println("Despegando vehiculo...... ");
            }
        } else {
            System.out.println("El estado del vehículo está Inactivo. Estado: "+ getEstado());
        }
        // Velocidad 
        if (getVelocidad() >= 1) {
            System.out.println("El vehículo está en movimiento. Velocidad: "+ getVelocidad());
        } else {
            System.out.println("El vehículo no está en movimiento");
        }
        // Marca 
        System.out.println("Marca: " + getMarca());
        // AVION !!
        System.out.println("El vehiculo es un AVION | Motor: " + getMotor() +" Altura: " + getAltura() + " Empresa: " + getEmpresa());
    }
    
}
