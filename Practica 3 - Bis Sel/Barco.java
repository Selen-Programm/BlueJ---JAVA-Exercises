public class Barco extends Transporte
{
    private int eslora;
    private int manga;
    private String posicion;
    
    public int getEslora(){
        return eslora;  
    }
    
    public void setEslora(int eslora){ 
        this.eslora = eslora;
    }
    
    public int getManga(){
        return manga;  
    }
    
    public void setManga(int manga){ 
        this.manga = manga;
    }  
    
    public String getPosicion(){
        return posicion;  
    }
    
    public void setPosicion(String posicion){ 
        this.posicion = posicion;
    }
    
    //METODOS
    
    //Navegar
    public void Navegar(){
        setPosicion("Nagevando");
        setEstado(true);
    }
    //Anclar
    public void Anclar(){
        setPosicion("Anclado");
        setEstado(false);
    }

    public void MiVehiculo() {
        // Capacidad
        System.out.println("Capacidad del vehiculo es: " + getCapacidad());
        // Estado ON - OFF
        if (getEstado() == true) {
            System.out.println("El estado del vehículo está Activo. Estado: "+ getEstado() + "|Posicion: " + getPosicion());
        } else {
            System.out.println("El estado del vehículo está Inactivo. Estado: "+ getEstado() + "| Posicion: " + getPosicion());
        }
        // Velocidad 
        if (getVelocidad() >= 1) {
            System.out.println("El vehículo está en movimiento. Velocidad: "+ getVelocidad());
        } else {
            System.out.println("El vehículo no está en movimiento"+ "| Posicion: " + getPosicion());
        }
        // Marca 
        System.out.println("Marca: " + getMarca());
        // BARCO !!
        System.out.println("El vehiculo es un BARCO |  Eslora: " + getEslora() + " Manga: " + getManga());
    }
}
