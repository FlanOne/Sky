import java.io.*;
public class Menu {
    private BufferedReader buffer;
    private Personaje prueba;
    private int [] lista;
     

     Ataque [] lista_ataques;

    
    Menu(){
        buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Probando Menu");
         
        this.lista= new int[]{1, 2, 3, 4}; 
        



        this.prueba = new Personaje(1,"Fede", this.lista);
        opciones();
    } 
    
    
    public void opciones(){
        int op;
        
        System.out.println("Seleccione las opciones que quiere utilizar: ");
        System.out.println("1 ver el nombre de las habilidades del personaje , 2 ver el id del personaje: ");
        try{
            op= Integer.parseInt(buffer.readLine() );
            switch(op){
                case 1: System.out.println(Setup.perso1.devolverAtaques() );
            }

        }catch(IOException e){
            System.out.println("ERROR");
        }

        





    }
}
