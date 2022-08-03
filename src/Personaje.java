public class Personaje {
    private int id;
    private String nombre;
    private int [] ataques;

    Personaje(int id, String nombre, int [] ataques){
        this.id = id;
        this.nombre = nombre;

    }


    public String getNombre(){
        return nombre;
    }

    public int getId(){
        return id;
    }

    
}
