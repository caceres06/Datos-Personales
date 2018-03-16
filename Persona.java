package datos;

public class Persona {
    String nombre;
    int edad;
    String nacimiento;
    String carrera;
    
    public Persona(String nombre, int edad, String nacimiento, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.carrera = carrera;
       
        System.out.println("Conociendo al alumno");
    }    
   
    public void PrintInformación(){
        System.out.println("Alumna:"+" "+ nombre);
        System.out.println("Edad:"+" "+edad+"anios");
        System.out.println("Fecha de Nacimiento:"+" "+nacimiento);
        System.out.println("Carrera:"+ carrera);
    }
}
