import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;

public class App {
    public static void main(String[] args) throws Exception {
        //runHashSet();
        //runLinkedHashSet();
        //runTreeSet();
        //runTreeSetConComparador();
        runEjercicio();
    }

    public static void runHashSet(){
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("----- HashSet -----");
        System.out.println("Elementos del HashSet (no se garantiza el orden): ");
        for (String elemento : ejemploHashSet){
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet(){
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("----- LinkedHashSet -----");
        System.out.println("Elementos del LinkedHashSet (respeta el orden de insercion): ");
        for (String elemento : ejemploLinkedHashSet){
            System.out.println(elemento);
        }
    }

    public static void runTreeSet(){
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("----- TreeSet -----");
        System.out.println("Elementos del TreeSet (orden alfabetico): ");
        for (String elemento : ejemploTreeSet){
            System.out.println(elemento);
        }
    }

    public static void runTreeSetConComparador(){
        Sets sets = new Sets();
        Set<String> ejemploTreeSetConComparador = sets.construirTreeSetConComparador();
        System.out.println("----- TreeSetConComparador -----");
        System.out.println("Elementos del TreeSetConComparador (doble comparacion): ");
        for (String elemento : ejemploTreeSetConComparador){
            System.out.println(elemento);
        }
    }

    public static void runEjercicio(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));

        for (Contacto c : agenda){
            System.out.println(c);
        }

    }

}
