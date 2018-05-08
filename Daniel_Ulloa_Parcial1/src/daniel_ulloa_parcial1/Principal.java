/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel_ulloa_parcial1;

import java.util.ArrayList;

/**
 *
 * @author dalejwtf
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Consulta> consultas= new ArrayList<>();
        ArrayList <Medicamento>medicamentos= new ArrayList<>();
        Persona paciente= new Persona("147852369","Daniel","Ulloa","8/9/1996","Masculino");
        Persona medico= new Persona("147852369","Carlos","Ulloa","13/12/1956","Masculino");
        medicamentos.add(new Medicamento(2235,"Ambroxol","5ml")); 
        medicamentos.add(new Medicamento(3698,"Paracetamol","10mg"));
        medicamentos.add(new Medicamento(2147,"Umbral","5ml"));
        Receta r1= new Receta(3,"Ingerir la dosis recomendada",medicamentos);
        consultas.add(new Consulta("08/05/2018",79.5,1.72,"El paciente cuenta con gripe",medico,paciente,"Realizar aguas aromaticas para descongestion nasal",r1));
        
        System.out.println(consultas.get(0));
        
        System.out.println("Elegi composicion por lo que tanto los medicamentos dependen de la receta y la receta de la consulta,\nal mismo tiempo que la consulta siempre va a tener un medico y el paciente atendido");
        
    }
    
}
