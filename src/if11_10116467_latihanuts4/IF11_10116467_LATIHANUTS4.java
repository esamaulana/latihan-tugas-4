/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if11_10116467_latihanuts4;

/**
 *
 * @author Esa IF11 PBO11
 */
public class IF11_10116467_LATIHANUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner oMdes = new ModelDesigner();
        oMdes.bonusDesigner();
        
        ModelProgrammer mProg= new ModelProgrammer();
        mProg.bonusProgrammer();
                
        ModelAnalyst oMana = new ModelAnalyst();
        oMana.bonusAnalyst();
        
    }
    
}
