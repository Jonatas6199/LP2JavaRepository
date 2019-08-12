/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversação;

import java.awt.List;


/**
 *
 * @author 081170035
 */
public class Conversação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa("Paulo",1);
        CristianoRonaldo ronaldo = new CristianoRonaldo("Cristiano Ronaldo",1);
        p.Salute(ronaldo);
        ronaldo.Salute(p);
        ronaldo.Presentation();
        p.Presentation();
        p.Emotion("bem");
        ronaldo.Emotion("campeão da champions league");
    }
    
    
}
