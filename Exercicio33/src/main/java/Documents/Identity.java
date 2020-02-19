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
public class Identity extends StateDocument {

    private String Number;
    private String State;

    public Identity(String Number, String State) {
        this.Number = Number;
        this.State = State;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String GetDocument() {
        return this.State + " " + this.Number;
    }

}
