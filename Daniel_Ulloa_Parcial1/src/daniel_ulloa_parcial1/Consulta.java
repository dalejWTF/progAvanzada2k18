/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel_ulloa_parcial1;

/**
 *
 * @author dalejwtf
 */
public class Consulta {
    private String fecha;
    private double peso;
    private double estatura;
    private String diagnostico;
    private Persona medico;
    private Persona paciente;
    private String indicaciones;
    private Receta receta;

    public Consulta(String fecha, double peso, double estatura, String diagnostico, Persona medico, Persona paciente, String indicaciones, Receta receta) {
        this.fecha = fecha;
        this.peso = peso;
        this.estatura = estatura;
        this.diagnostico = diagnostico;
        this.medico = medico;
        this.paciente = paciente;
        this.indicaciones = indicaciones;
        this.receta = receta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Persona getMedico() {
        return medico;
    }

    public void setMedico(Persona medico) {
        this.medico = medico;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public Persona getPaciente() {
        return paciente;
    }

    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }
    
    @Override
    public String toString(){
        return String.format("Datos Paciente:\n\n"
                + "%10s %10s %10s\n"
                + "%s\n\n"
                + "Datos Medico Tratante:\n\n"
                + "%10s %10s %10s\n"
                + "%s\n\n"
                + "El paciente atendido tiene las siguientes caracteristicas:\n"
                + "Peso: %.2fKg\n"
                + "Estatura: %.2fm\n\n"
                + "Diagnostico:\n"
                + "%s\n"
                + "Indicaciones:\n"
                + "%s\n\n"
                + "%s\n","Nombre","Apellido","Genero",getPaciente(),"Nombre","Apellido","Genero",getMedico(),getPeso(),getEstatura(), getDiagnostico(),getIndicaciones(),getReceta());
    }
}
