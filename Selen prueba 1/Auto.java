
/**
 * Selen Ehagaraz 
 * 11/04/2025
 */
public class Auto {
    private String patente;
    
    public String getPatente(){ //getPatente es el nombre del metodo - nombre de función.
        return patente;  //Retorna la variable "patente"
    }
    
    public void setPatente(String nuevaPatente){ //el nuevo parametro
        patente=nuevaPatente;
    }
    
    private String marca;
    
    public String getMarca(){ //getMarca es el nombre del metodo - nombre de función.
        return marca;  //Retorna la variable "marca"
    }
    
    public void setMarca(String nuevaMarca){ //el nuevo parametro
        marca = nuevaMarca;
    }
    
    public Auto(){
        patente="";
        marca="";
    }
    
    public void imprimir(){
        System.out.println("Es auto es de la marca: " + marca + " La patente es: " + patente);
    }
}
