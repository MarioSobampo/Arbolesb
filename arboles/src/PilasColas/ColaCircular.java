package PilasColas;
public class ColaCircular{
    private int v[];
    private int frente, fin, max;
    public ColaCircular(){
        max = 100;
        v = new int[max];
        frente = -1;
        fin = -1;
    }
    public ColaCircular(int max){
        this.max = max;
        v = new int[max];
        frente = -1;
        fin = -1;
    }
    public boolean vacia(){
        return frente == -1;
    }
    public boolean llena(){
        return ((frente == 0) && (fin == max-1) || (frente-1==fin));
    }
    public void poner(int dato){
        if(!llena()){
           if(vacia())
              frente = 0;
           if(fin == max-1)
              fin = -1;
           fin++;
           v[fin] = dato;               
        }else
           System.out.println("Cola Llena...!");
    }
    public int quitar(){
        int dato = 0;
        if(!vacia()){
           dato = v[frente];
           if(frente == fin){
              frente = -1;
              fin = -1;
           }else{
              if(frente == max-1)
                 frente = -1;
              frente++;
           }         
        }else
           System.out.println("Cola Vacía...!");
        return dato;
    }

}
