package com.reto;

import javax.swing.*;
import java.awt.*;

public class VentanaBienvenida extends JFrame {
    private JButton botonSaludo;

    public VentanaBienvenida() {
        // Configuración de la ventana
        setTitle("Bienvenid@");
        setSize(400, 250); // un poco más grande
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Ícono (nivel avanzado)
        ImageIcon icon = new ImageIcon("C:/Users/LAb25/Desktop/liz/src/com/reto/resources/img.png");
        setIconImage(icon.getImage());
        setIconImage(icon.getImage());

        // Etiqueta de título
        JLabel titulo = new JLabel("Ventana de Bienvenida");
        titulo.setFont(new Font("Arial", Font.BOLD, 22)); // fuente grande y negrita
        titulo.setHorizontalAlignment(SwingConstants.CENTER); // centrar texto
        titulo.setForeground(new Color(50, 50, 50)); // color del texto
        add(titulo, BorderLayout.NORTH); // lo coloca arriba


        // Botón con estilo
        botonSaludo = new JButton("Mostrar saludo");
        botonSaludo.setPreferredSize(new Dimension(200, 60)); // tamaño más grande
        botonSaludo.setBackground(new Color(70, 130, 180));   // azul acero
        botonSaludo.setForeground(Color.WHITE);               // texto blanco
        botonSaludo.setFont(new Font("Arial", Font.BOLD, 18));// fuente más grande y negrita

        // Panel para centrar el botón
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 50));
        panelBoton.setOpaque(false); // transparente para que se vea el fondo
        panelBoton.add(botonSaludo);

        // Agregar el panel al centro
        add(panelBoton, BorderLayout.CENTER);


        // Fondo de la ventana
        getContentPane().setBackground(new Color(230, 240, 250)); // un azul muy claro

        // Evento al hacer clic
        botonSaludo.addActionListener(e -> LogicaSaludo.mostrarSaludo());

        // Centrar en pantalla y mostrar
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
