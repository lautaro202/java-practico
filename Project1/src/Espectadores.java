public class Espectadores {

        private String DNI;
        private String nombre;
        private int edad;

    public Espectadores(){};

    public Espectadores(String name, String dni, int age){;
        this.setNombre(name);
        this.setDNI(dni);
        this.setEdad(age);
    };

    public void setEdad( int N){
        this.edad = N;
    }
    public void setDNI(String  s){
        this.DNI= s;
    }
    public void setNombre(String N){
        this.nombre = N;
    }


    public String getDNI(){
        return this.DNI;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }




}