package logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable {
    
    private boolean tiene_OS;
    private String tipo_sangre;
    
    @OneToOne
    private Responsable unResponsable;
    
    @OneToMany (mappedBy="pacien")
    private ArrayList<Turno> turnos;

    public Paciente() {
    }

    public Paciente(boolean tiene_OS, String tipo_sangre, Responsable unResponsable, ArrayList<Turno> turnos, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fechaNac) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNac);
        this.tiene_OS = tiene_OS;
        this.tipo_sangre = tipo_sangre;
        this.unResponsable = unResponsable;
        this.turnos = turnos;
    }

    public boolean isTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(boolean tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
    
    
}
