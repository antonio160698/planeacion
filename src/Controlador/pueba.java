/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AprendizajesEsperados;
import Modelo.ConsultasAprendizajes;
import Vista.Competencias;
import Vista.Index;

public class pueba {
    public static void main(String[] args) {
        AprendizajesEsperados ap = new AprendizajesEsperados();
        ConsultasAprendizajes ca = new ConsultasAprendizajes();
        Index in = new Index();
        Competencias com = new Competencias();
        
       // CtrAprendizaje ctra = new CtrAprendizaje(com,ca,ap);
       // ctra.iniciar();
        in.setVisible(true);
    }
    
}
