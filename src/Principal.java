/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOEL
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        Profesor p = new Profesor();
        e.setNombre("Juan");
        e.setApellido("Pastrulo");
        p.setNombre("JHOPES");
        
        ClsEstudiante ce = new ClsEstudiante(e);
        ce.matricula();
        
        System.out.println(ce.asistencia_clases());
        
        ClsProfesor cp = new ClsProfesor(p);
        System.out.println(cp.asistencia_clases());
        cp.dictar_clase();
        
        
        
        
    }
    
}
