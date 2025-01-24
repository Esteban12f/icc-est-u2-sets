import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    
    public Sets() {

    }

    public Set<String> construirHashSet(){
        Set<String> miHashSet = new HashSet<>();

        miHashSet.add("Manzana");
        miHashSet.add("Pera");
        miHashSet.add("Melocotón");
        miHashSet.add("Melón");
        miHashSet.add("Pera");

        return miHashSet;
    }

    public Set<String> construirLinkedHashSet(){
        Set<String> miLinkedHashSet = new LinkedHashSet<>();

        miLinkedHashSet.add("Manzana");
        miLinkedHashSet.add("Pera");
        miLinkedHashSet.add("Melocotón");
        miLinkedHashSet.add("Melón");
        miLinkedHashSet.add("Pera");

        return miLinkedHashSet;
    }

    public Set<String> construirTreeSet(){
        Set<String> miTreeSet = new TreeSet<>();

        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Melocotón");
        miTreeSet.add("Melón");
        miTreeSet.add("Pera");

        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparador(){
        Comparator<String> comparadorPorLongitud = new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                int resultado = Integer.compare(s1.length(), s2.length());
                if (resultado == 0){
                    resultado = s1.compareTo(s2);
                } 
                return resultado;
            }
        };

        Set<String> miTreeSetComparador = new TreeSet<>(comparadorPorLongitud);

        miTreeSetComparador.add("Melón");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Fresa");
        miTreeSetComparador.add("Kiwi");
        miTreeSetComparador.add("Melocotón");
        miTreeSetComparador.add("Pera");      
        
        return miTreeSetComparador;
    }

}
