/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import Documents.Document;

/**
 *
 * @author Aluno
 */
public class Person {
    public String Name;
    public Document Document;

    public Person(String Name, Document Document) {
        this.Name = Name;
        this.Document = Document;
    }
    
    public String GetPersonInformation(){
        return this.Name + " - " + this.Document.GetDocument();
    }
}
