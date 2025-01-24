package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    @Override
    public int compare(Contacto c1, Contacto c2) {
        // Primero comparamos apellidos
        int comparacionApellido = Integer.compare(c1.getApellido().length(), c2.getApellido().length());
        if (comparacionApellido != 0){
            comparacionApellido = c1.getApellido().compareTo(c2.getApellido());
            return comparacionApellido;
        } else {
            int comparacionNombre = Integer.compare(c1.getNombre().length(), c2.getNombre().length());
            return comparacionNombre;
        }
    }

}
