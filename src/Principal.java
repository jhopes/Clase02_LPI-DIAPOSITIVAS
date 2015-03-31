/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//  EXTENDS CLASE ABSTRACTA Y SOLO SE UTILIZA A UNA CLASE
//  INTERFACE =PARA HACER HERENCIA MULTIPLE y IMPLEMENTS SOLO ES PARA INTERFACE
//OVERRIDE=SOBREESCRIBE UN METODO EXISTENTE
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
        e.setNombre("Pedrito");
        e.setApellido("liseth");
        p.setNombre("JHOPES");
        
        ClsEstudiante ce = new ClsEstudiante(e);
        ce.matricula();
        
        System.out.println(ce.asistencia_clases());
        
        ClsProfesor cp = new ClsProfesor(p);
        System.out.println(cp.asistencia_clases());
        cp.dictar_clase();
        
        
        
        
    }
    
}
