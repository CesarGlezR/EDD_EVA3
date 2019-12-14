
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> miLista=new LinkedList<Integer>();
        llenar(miLista);
        System.out.println(miLista);
        Comparator c = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                int resu;
                //Cero-->Igual
                //Positivo-->mayor
                //Negativo-->menor
                
                Integer val1, val2;
                val1=(Integer)o1;
                val2=(Integer)o2;
                resu=val1-val2;
                return resu;
            }
        };
        miLista.sort(c);
        System.out.println(miLista);
        
        
        //Ordenamos una lista con sitrings
        LinkedList<String> miLista2=new LinkedList<String>();
        miLista2.add("Hola");
        miLista2.add(" ");
        miLista2.add("Mundo");
        miLista2.add(" ");
        miLista2.add("Cruel");
        miLista2.add("!!");
        
        
        Comparator cmpStr=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String cade1 = (String)o1;
                String cade2 = (String)o2;
                char c1 = cade1.charAt(0);
                char c2 = cade2.charAt(0);
                return c1-c2;
            }
        };
        System.out.println(miLista2);
        miLista2.sort(cmpStr);
        System.out.println(miLista2);
    }
    
    public static void llenar(LinkedList lista){
        for (int i = 0; i < 15; i++) {
            lista.add((int)(Math.random()*100));
        }
    }
    
}
