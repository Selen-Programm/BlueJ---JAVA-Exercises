public class Transporte {
    private int capacidad;
    private int velocidad;
    private boolean estado;
    private String marca;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int newVelocidad) {
        velocidad = newVelocidad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean newEstado) {
        estado = newEstado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String newMarca) {
        marca = newMarca;
    }

    // METODOS

    // Arrancar
    public void arrancar() {
        setEstado(true);
    }

    // Acelerar 
    public void acelerar() {
        setVelocidad(getVelocidad() + 1);
    }

    // Frenar
    public void frenar() {
        setVelocidad(getVelocidad() - 1);
    }

    public Transporte() {
        // Inicializar variables
        velocidad = 0;
        estado = false;
    }

    public void MiVehiculo() {
        System.out.println("Capacidad del vehículo: " + getCapacidad());

        if (estado == true) {
            System.out.println("El estado del vehículo está Activo. Estado: " + getEstado());
        } else {
            System.out.println("El estado del vehículo está Inactivo. Estado: " + getEstado());
        }

        if (velocidad >= 1) {
            System.out.println("El vehículo está en movimiento. Velocidad: " + getVelocidad());
        } else {
            System.out.println("El vehículo no está en movimiento.");
        }

        System.out.println("Marca: " + getMarca());
    }

    // MÉTODO NUEVO 
    public void ejecutarAccion(String accion) {
        if (accion.equalsIgnoreCase("Arrancar")) {
            if (estado) {
                System.out.println("El vehículo ya está arrancado.");
            } else {
                arrancar();
            }
        } else if (accion.equalsIgnoreCase("Acelerar")) {
            if (!estado) {
                System.out.println("Primero debes arrancar el vehículo.");
            } else if (velocidad > 0) {
                System.out.println("Ya aceleraste, no puedes volver a activar una opción activa.");
            } else {
                acelerar();
            }
        } else if (accion.equalsIgnoreCase("Frenar")) {
            if (velocidad > 0) {
                frenar();
            } else {
                System.out.println("El vehículo ya está detenido.");
            }
        } else if (accion.equalsIgnoreCase("Estado")) {
            MiVehiculo();
        } else {
            System.out.println("Acción no reconocida. Usa: Arrancar, Acelerar, Frenar, Estado.");
        }
    }
}
