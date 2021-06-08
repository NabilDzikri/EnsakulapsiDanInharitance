/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulapsiandinharitance;

/**
 *
 * @author ASUS
 */
public class Guru extends Ortu{
    
    void displaySuper(){
        System.out.println("nama : "+ super.nama);
        System.out.println("mapel : "+ this.mapel );
    }

    void displaysuper() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
