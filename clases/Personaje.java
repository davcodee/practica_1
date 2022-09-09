import java.util.List;

/*
 * 
 */
public class Personsaje implements RobaPoder{
    private String name;
    private Double salud;
    private Defensa defensa;
    private List<Ataque> ataques; 


   /*
    * Construction of object
    *@
    *
    */
   public Personsaje(String name, Object defensa2){
    this.salud = 100.0; 
   }

   public getName(){
    return this.name;

   }

   public setSalud(Double salud){
    this.salud = salud ;
   }

   public setDefensa(Defensa defensa){
    this.defensa = defensa;
   }

   /*
    * 
    */
   @Override
   public robaPoder(Ataque ataque){
    ataques.add(ataque);
   }

}