import java.io.*;
public class Menu {
    private BufferedReader buffer;
    private Personaje prueba;
    private int [] lista;
     Ataque ataque1;
     Ataque ataque2;
     Ataque ataque3;
     Ataque ataque4;

     Ataque [] lista_ataques;

    
    Menu(){
        buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Probando Menu");
        this.lista_ataques= new Ataque[]{ataque1,ataque2,ataque3,ataque4}; 
        this.lista= new int[]{1, 2, 3, 4}; 
        this.ataque1= new Ataque(1, "Primer golpe", 10, 0);
        this.ataque2= new Ataque(2, "Segundo golpe", 20, 0);
        this.ataque3= new Ataque(3, "Tercer golpe", 30, 0);
        this.ataque4= new Ataque(4, "Cuarto golpe", 40, 0);



        this.prueba = new Personaje(1,"Fede", this.lista);
        opciones();
    } 
    
    
    public void opciones(){
        int op;
        
        System.out.println("Seleccione las opciones que quiere utilizar: ");
        System.out.println("1 ver el nombre del personaje, 2 ver el id del personaje: ");
        try{
            op= Integer.parseInt(buffer.readLine() );
            switch(op){
                case 1: System.out.println("el nombre del personaje creado es: "+this.prueba.getNombre() );
            }

        }catch(IOException e){
            System.out.println("ERROR");
        }

        





    }
}
