public class Personaje {
    private int x,y,yInicial;
    private boolean saltar=false;
    private int vsalto=3,hsalto=115 ;
    private String ImgDinosaurio="/img/Dinosaurio.gif";
    public void aparecer (int x, int y){
        this.x=x;
        this.y=y;
        this.yInicial=y;

    }
    public String getImage(){
        return ImgDinosaurio;
    }
    public int getPosicionX(){
        return x;
    }
    public int getPosiciony(){
        return y;
    }
    public void saltar(int altura){
        saltar=true;
        this.hsalto=altura;

    }
    
public void actualizarpocicion(){
    if(saltar){
        y=y-vsalto;
        if(y<hsalto){
            saltar=false;

        }
        
    }else if(y!=yInicial){
        y=y+vsalto;

    }
}
}
