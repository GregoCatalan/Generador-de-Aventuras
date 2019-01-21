package principal;

public class GeneradorDeAventuras {
    public static void main(String[] args) throws Exception {
        
        
        //Se instancia, muestra, centra e impide que se maximice Principal.
        Principal PP = new Principal();
        PP.setVisible(true);
        PP.setLocationRelativeTo(null);//para centrar la ventana
        PP.setResizable(false);//Evita que se maximice la ventana
    }
}