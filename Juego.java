import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Juego implements ActionListener, KeyListener {
    private Tablero tablero;
    private Personaje Trex; 
    private JFrame ventana;
    private Timer temporizador;
    private Controles controles;
    private Rectangle colision;
    private Rectangle[] obstaculos;

    // método constructor
    public Juego() {
        Trex = new Personaje();
        new Bulto();
        new GameOver();
        
        Trex.aparecer(50, 300);
        tablero = new Tablero(400, 600, Trex);
        ventana = new JFrame();
        controles = new Controles();
        configurarVentana();
        colision = new Rectangle(0, 0, 50, 80);
        obstaculos = new Rectangle[2];
    }

    public static void main(String[] args) throws Exception {
        new Juego();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!tablero.enInicio) {
            System.out.println(controles.getAccion());
            if (controles.getAccion().equals("saltar")) {
                Trex.saltar(195);
                controles.setAccion("nada");
            }
            detectarColision();
            Trex.actualizarpocicion();
            tablero.repaint();

            
            System.out.println("Puntos: " + tablero.getPuntos());
        } else {
            tablero.repaint(); 
        }
    }

    private void configurarVentana() {
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.addKeyListener(this); 
        ventana.add(tablero);
        ventana.pack();
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
        
    private void detectarColision() {
        colision.setLocation(Trex.getPosicionX(), Trex.getPosiciony());
        obstaculos = tablero.getObstaculos();
        for (int i = 0; i < obstaculos.length; i++) {
            if (colision.intersects(obstaculos[i])) {
                temporizador.stop();
                System.out.println("over");
                tablero.setGameover(true);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER && tablero.enInicio) {
            tablero.iniciarJuego();
            temporizador = new Timer(7, this);
            temporizador.start();
        } else {
            controles.keyPressed(e); 
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }
}



        



        

        
        


