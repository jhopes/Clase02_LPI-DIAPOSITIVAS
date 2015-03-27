/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOEL
 */
public class ClsEstudiante  extends ClsPersona{
    
    Estudiante e ;

    public ClsEstudiante(Estudiante e) {
        
        this.e = e;
    }
    
    
    public void matricula(){        
    System.out.println(e.getNombre()+"\t"+e.getApellido()+"\t Yupi!... me estoy matriculando");
    }

    @Override
    public String asistencia_clases() {    
        return e.getNombre()+"\tSoy puntual";    
    }
       
}
