package Modelo;


public class AprendizajesEsperados {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAprendizaje() {
        return Aprendizaje;
    }

    public void setAprendizaje(String Aprendizaje) {
        this.Aprendizaje = Aprendizaje;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }
    private int id;
    private String Aprendizaje;
    private String Asignatura;
}
