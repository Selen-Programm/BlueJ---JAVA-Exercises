public class AvionPasajero extends Avion 
{ 
    private int cantidadDeAsientosDelAvion;
    private int cantidadTripulantes;
    private int pasajerosPrimeraClase;
    private int pasajerosClaseTurista;
    
    //   cantidadDeAsientosDelAvion
    public int getCantidadDeAsientosDelAvion(){ 
        return cantidadDeAsientosDelAvion;  
    }
    
    public void setCantidadDeAsientosDelAvion(int cantidadDeAsientosDelAvion){ 
        this.cantidadDeAsientosDelAvion = cantidadDeAsientosDelAvion;
    }
    
    //  cantidadTripulantes
     public int getCantidadTripulantes(){
        return cantidadTripulantes;  
    }
    
    public void setCantidadTripulantes(int cantidadTripulantes){ 
        this.cantidadTripulantes = cantidadTripulantes;
    }
    
    //  pasajerosPrimeraClase
     public int getPasajerosPrimeraClase(){
        return pasajerosPrimeraClase;  
    }
    
    public void setPasajerosPrimeraClase(int pasajerosPrimeraClase){ 
        this.pasajerosPrimeraClase = pasajerosPrimeraClase;
    }
    
    //  pasajerosClaseTurista
     public int getPasajerosClaseTurista(){
        return pasajerosClaseTurista;  
    }
    
    public void setPasajerosClaseTurista(int pasajerosClaseTurista){ 
        this.pasajerosClaseTurista = pasajerosClaseTurista;
    }
    
    public boolean hayLugar() { // Compara y determina si tiene capacidad para mas pasajeros.
        if ((pasajerosClaseTurista + pasajerosPrimeraClase) <= cantidadDeAsientosDelAvion) {
            System.out.println("Hay asientos disponibles en el avion.");
            return true;
        } else {
            System.out.println("No hay asientos disponibles en el avion.");
            return false;
        }
    }
    public boolean vueloHabilitado() {
        if (cantidadTripulantes >= (pasajerosPrimeraClase + pasajerosClaseTurista) / 10  && cantidadTripulantes != 0 && pasajerosPrimeraClase != 0 && pasajerosClaseTurista != 0) //Si ninguno de estos valores es 0 
        {  System.out.println("Hay "+ cantidadTripulantes + " tripulantes en el avion.");
            return true;
        } else {
            System.out.println("No hay suficientes tripulantes en el avion.");
            return false;
        }
    }

    public boolean Despegar() {  
        if (vueloHabilitado()) { 
            // Lógica original de despegue (si la hay en la clase padre)  
            // Llamar al método despegar de la clase padre  
            arrancar();
            acelerar();
            System.out.println("Vuelo habilitado");
            return true;
        } else {  
            System.out.println("Vuelo NO habilitado");
            return false;
        }  
    }      
    
    public void MiVehiculo() {
        // Capacidad
        System.out.println("Capacidad del vehiculo es: " + getCantidadDeAsientosDelAvion());
        // Estado ON - OFF
        if (getEstado() == true) {
            System.out.println("El estado del vehículo está Activo. Estado: "+ getEstado());
        } else {
            System.out.println("El avión no puede despegar. No hay suficiente tripulación.");
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
    
    
