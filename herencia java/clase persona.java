package main_h;

/**
 *
 * @author ginag
 */ 
 // supercalse o clase padre o madre
public class persona {
    /*aqui decalramos la vatiable o atributos y esta potegida para que las otras clases 
   tenga acceso 
   */
   protected String nombre;
   protected String apellido;
   protected String edad;

    public persona(String nombre, String apellido, String edad) { 
        //Este es el  metodo costructor para inicializar los atributos de esta clase
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
     // con estos  metodos gets se retornaran los datos del los atributos portrgidos
    public String getNombre() { 
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }
     
   @Override // aqui sobre escribimos el metodo to String
    public String toString(){ // y se retornara los datos segun tal cual esta en la clase
        
        return nombre+","+apellido+","+edad;
    }

   
    
    
   
}

