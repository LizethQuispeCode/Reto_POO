package com.reto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Estilo visual Nimbus (Look & Feel)
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Lanza la ventana principal
        new VentanaBienvenida();
    }
}
