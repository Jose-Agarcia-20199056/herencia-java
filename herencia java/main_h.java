package main_h;
import java.util.Scanner;
/**
 *
 * @author ginag
 */
public class Main_h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int select = 0;// iniciacion y declaracion de variable
     Scanner entrada = new Scanner(System.in); //clase donde leeran los datos incresados
      do{   
     estudiantes arr1[]={ // araay donde se guardaran los datos de los estudiantes  
     new estudiantes("Nombre:pedro","apellido:Perez","edad:28","curso:2A","matricula:20199030"),
     new estudiantes("Nombre:Manuel","Apellido:Gomez","Edad:25","Curso:2c","Matricula:20185020") ,
     new estudiantes("Nombre:Carlos","Apellido:ramirez","Edad:28","Curso:2d","Matricula:20171270"),
     new estudiantes("Nombre;Carmela","Apellido:Sanchez","Edad:30","Curso:3e","Matricula:20161990"),
     new estudiantes("Nombre:carmen","Apellido:solano","Edad:22","Curso:3c","Matricula:20155040")};
     profesores arr2[]={ //array donde se guardaran los datos de los profesores 
     new profesores("Nombre:Alberto","Apellido:Fabian","Edad:35","Telef:829-555-3020","Codigodelp:201530"),
     new profesores("Nombre:Matias","Apellido:Alfaro","Edad;45","Telef;829-220-1570","Codigodelp;221430"),
     new profesores("Nombre:Maria","Apellido:Pineda","Edad;32","Telef;829-120-5107","Codigodelp;114130"),  
     new profesores("Nombre:carala","Apellido:Apolinar","Edad;41","Telef;829-987-1054","Codigodelp;601939"),
     new profesores("Nombre:Alexa","Apellido:Carmona","Edad;29","Telef;829-309-4070","Codigodelp;805580")};
     
     clientes arr3[]={// array donde se guardaran los datos de los clientes
     new clientes("Nombre:Marcos","Apellido:Almanzar","Edad:19","Cedula:002-0020018-1","Email:marc@gmamil.com"),
     new clientes("Nombre:Perla","Apellido:Camacho","Edad:19","Cedula:001-0050078-2","Email:perlc@gmamil.com"),
     new clientes("Nombre:Carla","Apellido:Valdez","Edad:18","Cedula:003-0000147-6","Email:carl2@gamil.com"),
     new clientes("Nombre:Marlen","Apellido:Rodrigez","Edad:22","Cedula:002-0080020-8","Email:marln1@gamil.com"),
     new clientes("Nombre:Marta","Apellido:Peralta","Edad:25","Cedula:002-0042048-1","Email:mart80@gamil.com"),};
     
      //Menu donde se hara la eleccion para mostrar los datos guardados segun la eleccion 
      System.out.println("^^^^ Menu^^^^");
      System.out.println("^^^^ Elija una opcion^^^^");
      System.out.println("01-Captar Estudiantes");
      System.out.println("02-Captar Profesores");
      System.out.println("03-Captar clientes");
      System.out.println("00-Salir");
      select = entrada.nextInt(); // Aqui se guarada la eleccion del usuari segun la eleccion
      
      switch(select){// este switch mostrara los datos segun a aleccion del usuario 
          
        case 01:{ // aqui se mostrara la eleccion #1 "Estudiantes capatados"
          System.out.println("");  //salto de linea
          System.out.println("^^^^Estos son los estudiantes captados ^^^");    
       
         for(estudiantes i: arr1){ // bucle foreach que se movera por los  datos guardados en el arreglo
         System.out.println(i); // aqui se mostraran los datos segun el movimiento del foreach               
}        System.out.println(""); // salto de linea
         break;
          }
        
        case 02:{ // aqui se mostrara la eleccion #2 "Profesores capatados"
           System.out.println(""); //salto de linea 
          System.out.println("^^^^Estos son los profesores captados ^^^");    
       
         for(profesores i: arr2){ // bucle foreach que se movera por los  datos guardados en el arreglo
         System.out.println(i);// aqui se mostraran los datos segun el movimiento del foreach               
}        System.out.println("");
         break;
        }  
        case 03:{
         System.out.println("");  
         System.out.println("^^^^Estos son los clientes captados ^^^");    
       
         for(clientes i: arr3){
         System.out.println(i);                 
}        System.out.println("");
         break;
            
        }
        default:// este default indicara al usuario que escribio un numero incorrecto del menu
        System.out.println("ERROR El numero ingresado esta fuera de rango");
        break;
      }
         
     }while(select!=00);// cierra el bucle do while con el cuando el numero sea 00
     
     }
    
}
     // programa creado por; jose garcia inicializado: 29/10/20 finalizado: 30/10/20