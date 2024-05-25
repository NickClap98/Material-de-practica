
package arreglos;

/**
 *
 * @author Nick
 */
public class Arreglos {

  
    public static void main(String[] args) {
 
        String[][] Grados  = new String[3][4];
        Grados[0][0] = "1ero";
        Grados[0][1] = "2do";
        Grados[0][2] = "3ero";
        Grados[0][3] = "4to";
        Grados[1][0] = "5to";
        Grados[1][1] = "6to";
        Grados[1][2] = "7to";
        Grados[1][3] = "8vo";                
        Grados[2][0] = "9no";
        Grados[2][1] = "10mo";
        Grados[2][2] = "11vo";
        Grados[2][3] = "12mo";
      //GRADOS [PRIMARIA]
System.out.println(Grados.length);
      
      
int secundaria = 0;
while(secundaria <=2){
/*EN EL WIHLE DICE SECUNDARIA QUE ES 0 ES <= a 2? SI ENTONCES ENTRA EN FOR
    EN EL CICLO FOR PASA QUE PRIMARIA ARRANCA EN 0 
    y PREGUNTA primaria es <= A 3 (que 3 es el .lenght) Respuesta:SI porque es 0
    y repite el ciclo hasta llegar a hasta que primaria sea 4 <= 3 
 AHI ENTRA DENUVO EN EL WHILE Y LE ASIGNA A SECUNDARIA 1 y vuelve a preguntar 
    SECUNDARIA 1 <= 2 respuesta SI entonces repite 
    ASI otra vez mas
    hasta que es 2 <= 2 respuesta es SI osea no es menor pero si es igual
    entonces repite 
    cuando termina pasa al else o sale del while
    */


for (int primaria= 0; primaria <= Grados.length; ) {
            System.out.println(Grados[secundaria][primaria]);
        primaria++;
       }
secundaria++;
}
        System.out.println("Conteo Terminado");
 
     
       
    }
    
}
