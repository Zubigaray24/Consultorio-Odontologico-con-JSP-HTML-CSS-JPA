package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Responsable;
import logica.Turno;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-12-31T15:30:59")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile SingularAttribute<Paciente, Boolean> tiene_OS;
    public static volatile ListAttribute<Paciente, Turno> turnos;
    public static volatile SingularAttribute<Paciente, Responsable> unResponsable;
    public static volatile SingularAttribute<Paciente, String> tipo_sangre;

}