
public class AvionGuerra extends Avion 
{
    private int cantidadDeBombasTotales;
    private int cantidadDeBombasDisponibles;
    private int alturaDelVuelo;
    
    //// Cantidad de Bombas TOTALES
    public int getCantidadDeBombasTotales(){
        return cantidadDeBombasTotales;  
    }
    
    public void getCantidadDeBombasTotales(int getCantidadDeBombasTotales){ 
        this.cantidadDeBombasTotales = cantidadDeBombasTotales;
    }
    //// Cantidad de Bombas Disponibles
    public int getCantidadDeBombasDisponibles(){
        return cantidadDeBombasDisponibles;  
    }
    
    public void setCantidadDeBombasDisponibles(int cantidadDeBombasDisponibles){ 
        this.cantidadDeBombasDisponibles = cantidadDeBombasDisponibles;
    }
    // Altura de vuelo
    public int getAlturaDelVuelo(){
        return alturaDelVuelo;  
    }
    
    public void setAlturaDelVuelo(int alturaDelVuelo){ 
        this.alturaDelVuelo = alturaDelVuelo;
    }
    
    public void disparar(int cantidadDeBombasTotales) {
        // Verificamos si hay suficientes bombas para disparar
        if (cantidadDeBombasTotales <= cantidadDeBombasDisponibles) {
            cantidadDeBombasDisponibles -= cantidadDeBombasTotales;  // Disminuimos la cantidad de bombas disponibles
            System.out.println("El avión de guerra disparó " + cantidadDeBombasTotales + " bombas. Bombas restantes: " + cantidadDeBombasDisponibles);
        } else {
            System.out.println("No hay suficientes bombas para disparar esa cantidad.");
        }
    }
    
    public void ascender(int valor) {
        // Si el avión está por encima de los 5000 metros, debe haber disparado al menos el 50% de las bombas??
        if (alturaDelVuelo > 5000) {
            if (cantidadDeBombasDisponibles <= cantidadDeBombasTotales / 2) {
                alturaDelVuelo += valor;
                System.out.println("Ascendiendo... nueva altura: " + alturaDelVuelo + " metros.");
            } else {
                System.out.println("No se puede ascender. Se debe disparar al menos el 50% de las bombas.");
            }
        } else {
            // Si está por debajo de 5000 metros, puede ascender sin restricciones
            alturaDelVuelo += valor;
            System.out.println("Ascendiendo... nueva altura: " + alturaDelVuelo + " metros.");
        }
    }
}