public class Bicicleta  extends Transporte
{
    private int cambios;

    public int getCambios(){ 
        return cambios;  
    }
    
    public void setCambios(int cambios){
        setVelocidad(getVelocidad()+1);
    }
    
    // METODOS
    
    //Pedalear
    public void Pedalear(){
        setEstado(true);
    }
    //Cambiar Macrcha
    public void CambiarMarcha(){
        setCambios(getCambios()+1);
    }
    
    public void MiVehiculo() {
        // Capacidad
        System.out.println("Capacidad del vehiculo es: " + getCapacidad());
        // Estado ON - OFF
        if (getEstado() == true) {
            System.out.println("El estado del vehículo está Activo. Estado: Pedaleando "+ getEstado() + "| Cambio: " + getCambios());
        } else {
            System.out.println("El estado del vehículo está Inactivo. Estado: "+ getEstado() + "| Cambio: " + getCambios());
        }
        // Velocidad 
        if (getVelocidad() >= 1) {
            System.out.println("El vehículo está en movimiento. Velocidad: "+ getVelocidad());
        } else {
            System.out.println("El vehículo no está en movimiento");
        }
        // Marca 
        System.out.println("Marca: " + getMarca());
        // BICICLETA !!
        System.out.println("El vehiculo es una BICICLETA");
    }
}
