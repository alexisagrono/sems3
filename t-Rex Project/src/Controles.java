import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controles extends KeyAdapter {
    private String accion = "nada";

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        switch (tecla) {
            case KeyEvent.VK_SPACE:
            case KeyEvent.VK_RIGHT:
                accion = "saltar";
                break;
            case KeyEvent.VK_ENTER:
            
                accion = "iniciar";
                break;
            default:
                accion = "nada";
                break;
        }
    }
}
