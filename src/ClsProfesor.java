/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOEL
 */
public class ClsProfesor implements ClsPersona, ClsAnimal {
    
    Profesor p;

    public ClsProfesor(Profesor p) {
        this.p = p;
    }
    
    public void dictar_clase()
    {
        System.out.println(p.getNombre()+" clases de Lenguaje de programación I");    
    }
    @Override
    public String asistencia_clases(){
    return p.getNombre()+"\tSoy puntual";
    }

    @Override
    public void correr() {
        System.out.println("estoy corriendo");
    }
    
}
