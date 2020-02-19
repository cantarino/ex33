/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrance;

import Documents.Cpf;
import Documents.Identity;
import Documents.VoterRegistration;
import Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Entrance {
    
    public static void main(String[] args) {
        ArrayList<Person> People = new ArrayList<>();
        Cpf Cpf = new Cpf("12345");
        Identity Identity = new Identity("13579", "MG");
        VoterRegistration VoterRegistration = new VoterRegistration("02468", "013", "000");
        People.add(new Person("Christian", Cpf));
        People.add(new Person("Robert", Identity));
        People.add(new Person("Alexandre", VoterRegistration));
        
        for (Person person : People) {
            System.out.println(person.GetPersonInformation());
        }
    }
}
