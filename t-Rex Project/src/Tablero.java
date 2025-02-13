import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;
import java.net.URL;

public class Tablero extends JPanel {
    private final int ANCHO;
    private final int ALTO;
    private URL urlbulto;
    private Image imgBulto;

    private boolean gameover;
    private URL urlgameover;
    private Image imggameover;
    private int pocisionXbulto = 250;
    private int pocision2Xbulto = 400;

    private Personaje personaje; 
    private URL urlFondo;
    private Image imgFondo;

    private URL urlInicio;
    private Image imgInicio;

    private URL urlPersonaje;
    private Image imgPersonaje;
    private int pocisionXfondo = 0;
    private Rectangle Obstaculos1;
    private Rectangle Obstaculos2;

    private int puntos; 
    boolean enInicio = true; 

    // Constructor de la clase Tablero
    public Tablero(int alto, int ancho, Personaje personaje) {
        this.ANCHO = ancho;
        this.ALTO = alto;
        this.personaje = personaje;
        new Bulto(); 
        this.gameover = false;
        this.Obstaculos1 = new Rectangle(0, 0, 1, 1);
        this.Obstaculos2 = new Rectangle(0, 0, 1, 1);
        this.puntos = 0; 

        this.setPreferredSize(new Dimension(ANCHO, ALTO));
        this.setSize(ANCHO, ALTO);
        this.setBackground(Color.BLACK);

        // Cargar imágenes
        urlFondo = Tablero.class.getResource("/img/fondo.jpg");
        imgFondo = new ImageIcon(urlFondo).getImage();

        urlPersonaje = Tablero.class.getResource(personaje.getImage());
        imgPersonaje = new ImageIcon(urlPersonaje).getImage();

        urlbulto = Tablero.class.getResource("/img/bulto.png");
        imgBulto = new ImageIcon(urlbulto).getImage();

        urlgameover = Tablero.class.getResource("/img/Game Over.png");
        imggameover = new ImageIcon(urlgameover).getImage();

        urlInicio = Tablero.class.getResource("/img/inicio.jpg");
        imgInicio = new ImageIcon(urlInicio).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (enInicio) {
            mostrarInicio(g); 
        } else {
            dibujarFondo(g);
            dibujarPersonaje(g);
            dibujarbulto(g);
            dibujarGameOver(g);
            dibujarPuntos(g); 
        }
    }

    private void dibujarFondo(Graphics g) {
        g.drawImage(imgFondo, pocisionXfondo, 0, getWidth(), getHeight(), this);
        g.drawImage(imgFondo, pocisionXfondo + getWidth(), 0, getWidth(), getHeight(), this);
        pocisionXfondo -= 1;
        if (pocisionXfondo <= -getWidth()) {
            pocisionXfondo = 0;
        }
    }

    private void dibujarPersonaje(Graphics g) {
        g.drawImage(imgPersonaje, personaje.getPosicionX(), personaje.getPosiciony(), 100, 100, this);
    }

    private void dibujarbulto(Graphics g) {
        g.drawImage(imgBulto, pocisionXbulto, 355, 65, 65, this);
        pocisionXbulto -= 1;
        Obstaculos1.setLocation(pocisionXbulto + 10, 375);
        if (pocisionXbulto <= -65) {
            pocisionXbulto = getWidth();
            puntos++; 
        }

        g.drawImage(imgBulto, pocision2Xbulto, 355, 65, 65, this);
        pocision2Xbulto -= 1;
        Obstaculos2.setLocation(pocision2Xbulto + 10, 375);
        if (pocision2Xbulto <= -65) {
            pocision2Xbulto = getWidth() + getWidth() / 2;
            puntos++; 
        }
    }

    private void dibujarGameOver(Graphics g) {
        if (gameover) {
            g.drawImage(imggameover, 0, 0, getWidth(), getHeight(), this);
            puntos=0;
        }
    }

    private void dibujarPuntos(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Puntos: " + puntos, 10, 20);
    }

    private void mostrarInicio(Graphics g) {
        g.drawImage(imgInicio, 0, 0, getWidth(), getHeight(), this);
    }

    public Rectangle[] getObstaculos() {
        return new Rectangle[]{Obstaculos1, Obstaculos2};
    }

    public void setGameover(boolean gameover) {
        this.gameover = gameover;
    }

    public void iniciarJuego() {
        enInicio = false; 
    }

    public int getPuntos() {
        return puntos; 
    }

    public boolean enInicio() {
    
        throw new UnsupportedOperationException("Unimplemented method 'enInicio'");
    }
}
