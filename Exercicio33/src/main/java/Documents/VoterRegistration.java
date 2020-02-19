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
public class VoterRegistration extends FederalDocument{
    public String Number;
    public String Zone;
    public String Section;

    public VoterRegistration(String Number, String Zone, String Section) {
        this.Number = Number;
        this.Zone = Zone;
        this.Section = Section;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getZone() {
        return Zone;
    }

    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String Section) {
        this.Section = Section;
    }
    
    public String GetDocument(){
        return this.Number + " " + this.Zone + " " + this.Section;
    }
}
