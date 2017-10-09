/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketderestaurante;

/**
 *
 * @author ggarciaalvarez
 */
public class Ticketderestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**"Nome establecimiento"
         * 2 Cocacolas =15
         * 3 Aguas =7
         * Total=22
         * Entregado=30
         * Devolve= 8
         * Grazas por vir
         * 
         */
        
        int x;//Cocacolas
        int y;//Aguas
        int t;//Total
        int e;//Entregado
        int d;//Devolve
        x=15;
        y=7;
        t=x+y;
        e=30;
        d=e-t;
        System.out.println("La Piragua");
        System.out.println("2 Cocacolas =>   "+x);
        System.out.println("3 Aguas =>       "+y);
        System.out.println("Total =>         "+t);
        System.out.println("Entregado =>     "+e);
        System.out.println("A devolver =>    "+d);
        System.out.println("Grazas por vir");
    }
    
}
