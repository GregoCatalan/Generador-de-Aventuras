package principal;

public class GeneradorDeAventuras {
    public static void main(String[] args) throws Exception {
        /*
        1. Agregar carteles de confirmación
        2. Agregar botones de Volver a inicio
        3. Pensar en la posibilidad de armar categorías extra de monstruos
        4. Investigar para agregar más generadores        
        */
        
        //Se instancia, muestra, centra e impide que se maximice Principal.
        Principal PP = new Principal();
        PP.setVisible(true);
        PP.setLocationRelativeTo(null);//para centrar la ventana
        PP.setResizable(false);//Evita que se maximice la ventana
    }
}