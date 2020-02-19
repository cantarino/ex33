/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documents;

/**
 *
 * @author Aluno
 */
public class Cpf extends FederalDocument {
    private String Number;

    public Cpf(String Number) {
        this.Number = Number;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }
    
    public String GetDocument(){
        return this.Number;
    }
}
