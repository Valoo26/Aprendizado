/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author luizv
 */
public class Atendente extends Pessoa {
    
    int ID;

    public Atendente(int ID, String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone, endereco);
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

       
        
     
        
        
    }
    
    
    
    

