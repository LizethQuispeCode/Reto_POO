# 🚀 Reto Práctico Nº 1: Ventana de Bienvenida con Mensaje Emergente

Este proyecto es mi primera práctica usando **Java Swing** para crear una pequeña aplicación gráfica.  
La aplicación muestra una ventana de bienvenida con un botón, y al hacer clic en él aparece un mensaje emergente con un saludo personalizado.

---

## 🎯 ¿Qué hace la aplicación?
- Abre una ventana con el título **“Bienvenid@”**.
- Tiene un botón **“Mostrar saludo”**.
- Al hacer clic:
    - Se pide tu nombre.
    - Te saluda de forma personalizada:  
      _“¡Hola, Valery! ¡Buen trabajo!”_
- Además:
    - Cambié colores, fuente y tamaño del botón.
    - Agregué un ícono en la ventana.
    - Apliqué el estilo visual **Nimbus (Look & Feel)**.
    - Separa la lógica en otra clase (buenas prácticas).
    - Incluye una imagen decorativa en la ventana.

---

## 📸 Capturas
En la carpeta [`/screenshots`](./screenshots) puedes ver imágenes de:
- Ventana inicial con el título.
- Input dialog pidiendo el nombre.
- Mensaje emergente con el saludo.
- Estilos de color, ícono y fuente.

---

## ⚙️ Cómo ejecutar
1. Clona el repositorio o descarga el proyecto.
2. Abre una terminal en la carpeta del proyecto.
3. Compila los archivos:
   ```bash
   javac src/com/reto/*.java
4. Ejecuta la aplicación con:

java -cp src com.reto.Main
5. Y en IntelliJ, solo dale a ▶️ en Main.java