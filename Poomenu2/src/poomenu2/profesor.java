
package poomenu2;


public class profesor {
    private String nombre,materia;
    public profesor(String nombre,String materia){
        this.nombre=nombre;
        this.materia=materia;
    }
    public String verNombre(){
        return this.nombre;
    }
    public String verMateria(){
        return this.materia;
    }
}
