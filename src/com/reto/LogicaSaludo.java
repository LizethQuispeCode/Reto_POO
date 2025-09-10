package com.reto;

import javax.swing.*;

public class LogicaSaludo {

    public static void mostrarSaludo() {
        // Pedir nombre (intermedio)
        String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");

        // Validar entrada
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ingresaste un nombre.");
            return;
        }

        // Mostrar saludo personalizado
        JOptionPane.showMessageDialog(null,
                "¡Hola, " + nombre + "! ¡Buen trabajo!");
    }
}
