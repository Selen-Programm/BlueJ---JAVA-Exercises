
public class Automovil extends Transporte
{
    private boolean direccionales;
    private int gasolina;

    public boolean getDireccionales(){ 
        return direccionales;  
    }
    
    public boolean setDireccionales(boolean direccionales){
        return true;
    }
    
    public int getGasolina(){ 
        return gasolina;  
    }
    
    public void setGasolina(int gasolina){ 
         gasolina = gasolina;
    }
    
    //METODOS
    
    //Intermitentes
    public boolean Intermitentes(){
        setDireccionales(true);
        return true;
    }
    
    public void MiVehiculo() {
        // Capacidad
        System.out.println("Capacidad del vehiculo es: " + getCapacidad());
        // Estado ON - OFF
        if (getEstado() == true) {
            System.out.println("El estado del vehículo está Activo. Estado: "+ getEstado());
            if (Intermitentes() == true) { 
                System.out.println("Direccionales...... Girando.......");
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
        // AUTOMOVIL !!
        System.out.println("El vehiculo es un ATOMOVIL |  Gasolina: " + getGasolina());
    }
}
