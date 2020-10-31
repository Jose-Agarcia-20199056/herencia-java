package main_h;

/**
 *
 * @author ginag
 */
 //SubClase
public class profesores extends persona {
    /*aqui decalramos la vatiable o atributos y estan privada ya que el metodo get 
     retornara el valor  de las variables o atributos  */
    private String telefono;
    private String codigodelprof;

    public profesores( String nombre, String apellido, String edad,String  telefono ,String codigodelprof) {
       //Este es el  metodo costructor para inicializar los atributos de esta clase
        super(nombre, apellido, edad);/* aqui le decimos a esta clase que estos atributos estan
        inicializados en otra clase"persona"
        */
        this.telefono = telefono;
        this.codigodelprof = codigodelprof;
    }
    // con estos  metodos gets se retornaran los datos del los atributos portrgidos
    public String getTelefono() {
        return telefono;
    }

    public String getCodigodelprof() {
        return codigodelprof;
    }
    
   @Override// aqui sobre escribimos el metodo to String
    public String toString(){// y se retornara los datos segun tal cual esta en la clase
        
        return nombre+","+apellido+","+edad+","+telefono+","+codigodelprof;
    }
    
    
    
}