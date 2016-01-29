import java.util.*;
/**
 * Write a description of class Parejas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parejas
{
    //Variable que representa las parejas.
    private ArrayList<Personas> pareja;
    //Variable que representa las personas por separado.
    private ArrayList<Personas> personas;
    //Variable que representa un número aleatorio.
    private int numerAleatorio;
    /**
     * Constructor for objects of class Parejas
     */
    public Parejas()
    {
        pareja = new ArrayList<Personas>();
        personas = new ArrayList<Personas>();
        numerAleatorio = (int)(Math.random()*(9999-1000+1)+1000);
    }
    
    public void añadirPersonas(Personas persona){
        for (Personas pers : personas){
            personas.add(persona);
       }
    }
    
    public int getNumerAleatorio(){
       return numerAleatorio; 
    }
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void getPareja()
    {
        Collections.shuffle(personas);
        int a;
        Random rnd = new Random();
        a = (int)(rnd.nextDouble() * personas.size());     
        System.out.println(a);
        Personas persona = personas.get(a);
        System.out.println(persona.getNombre());
    }
}
