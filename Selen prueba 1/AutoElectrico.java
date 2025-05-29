public class AutoElectrico extends Auto
{
    private String gasolina;
    
    public String getGasolina(){ //getPatente es el nombre del metodo - nombre de función.
        return gasolina;  //Retorna la variable "patente"
    }
    
    public void imprimir(){
        System.out.println("El auto seleccionado es un auto Electico" + " Es auto es de la marca: " + getMarca() + " La patente es: " + getPatente());
    }
    }
