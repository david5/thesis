/**
 * 
 * En [7-2, clause 5.4, tabla 19] el servicio se llama
 * MULTICAST-SAMPLE-VALUE-CONTROL-BLOCK
 * y en la parte [7-2, clause 5.3, figure 3] se llama
 * MULTICAST-SAMPLED-VALUE-CTRL-B. * 
 * la misma cosa pasa con las clases 
 * 		UNICAST-SAMPLED-VALUES-CTRL-B. vs UNICAST_SAMPLE_VALUE_CONTROL_BLOCK
 * 		GOOSE-CONTROL BLOCK vs GOOSE
 * 		Control vs Control-Model
 * 		en las mismas relaciones citadas arriba 
 *
 * En [7-2, clause 5.5.1, parrafo 4] el nombre de la clase es
 * CompositComponent y en la figura 4 de la misma secci�n es CompositeComponent
 * CompositComponent vs CompositeComponent
 * 
 * 
 * PrimitiveComponent no puede tener como herencia los m�todos de 
 * DAType si es un tipo primitivo como double por ejemplo
 * Debo saber si estoy entendiendo mal o no esta parte. 
 * 
 * 
 * En [7-2, clause 5.5.3.6] el nombre de la clase a definidar
 * es presentada en el  t�tulo de la clausula en min�scula,
 * con la primera letra en may�scula, y en palabras separadas:
 * 'Packet list' y luego en el primer p�rrafo ya usa
 * may�sculas nuevamente y espacio entre palabras 'PACKET LIST'
 * y en la cabecera de la tabla 6 de la misma cl�usula se usa gui�n:
 * 'PACKET-LIST' y al final se vuelve a utilizar en la misma tabla
 * de la siguiente forma: 'Packet list'. 
 * Con los dem�s items se sigui� el patr�n de unificar todos los nombres
 * ya sea en los t�tulos, referencias, tablas, etc., solo este no cumple
 * con dichos patrones y dificulta la escritura de c�digo
 * en forma clara.
 * Una sugerencia es definir que es forma m�s clara los nombres
 * de las clases gracias a la definici�n de unos pasos para
 * nombramiento de tipo de datos, as� como se definen con los
 * procedimientos para nombramiento de los nodos l�gicos en los anexos.
 * En los Commons ACSI types de la parte 7-2 clausula 5.5.3 por ejemplo
 * se nombran siguiendo la convenci�n java, pero en el uml de la figura 3
 * de la clausula 5.2 se usan may�sculas y guiones de por medio, abreviado,
 * cualquier cosa es... y en la tabla 1 de la clausula 5.4 se puede visualizar
 * que los nombres de las clases mezclan ambas convenciones y no usa
 * abreviaciones (por lo tanto tienen nombre distinto) para las mismas clases
 * del uml citado en este p�rrafo.
 * 
 * 
 * Puedo hacer una encuesta para ver como interpretan los ingenieros
 * de software el uml definido en la figura 4 de la parte 7-2 clausula 5.5
 * Podr�a reclamar la mala representaci�n de la relaci�n de herencia
 * con tipos de datos primitivos, de que eso es imposible implementar
 * o que cada uno interpretar� a su manera lo definido en dicho uml
 * No se puede pues extender el tipo integer por ejemplo para que
 * tenga los atributos name y prescence. Los tipos Integer, Double,
 * entre otros, son clases FINALES, por lo tanto, no pueden ser
 * extendidas
 * 
 * 
 * 
 * En IEC 61850 parte 7-2 (2003)
 *  p�gina 22, cl�usula 5.5.1 , note 1<br>
 *  cuenta que DAType es una clase abstracta, "cualquier cosa", 
 *  esta mal expresado o en su UML o en donde cito, pues
 *  para que quiero una clase abstracta que solo tenga atributos?
 *  En el UML name y presence son atributos pues no llevan los 
 *  parentesis () necesarios para indicar que son metodos abstractos
 *  
 *  
 *  El grafico UML que muestra que cualquier clase hereda la clase Name
 *  se vuelve a tratar m�s adelante en los common ACSI y all� se llama
 *  ObjectName, lo cual es un poco inconsistente. Luego para dar mas
 *  pleito se usa como atributo de la clase DAType, donde se declara
 *  como string y no como un tipo de datos NAME.
 *  Esta relaci�n no la iba a pillar nunca, a no ser por este PDF
 *  http://bit.ly/9ayCEK donde hay una referencia cruzada al hacer
 *  click sobre la clase UML indicada en la p�gina 5 del pdf
 *  
 *  Al leer el PDF que redacto el TC 75 pero que no es un documento
 *  formal de la norma, solo un apoyo de la parte 7, pude entender
 *  como va el tema de los nombres de las clases. All� est�n bien
 *  definidos los nombres y tienen diferencias cruzadas. Luego fui
 *  a la norma, por ejemplo, en la parte 7-2: 9.1.1, en la definici�n
 *  de Logical Node, y pude ver que en la columna Attribute Type
 *  de la tabla 15 usan nombres abreviados, los cuales se encuentran
 *  en el pdf informal del tc57 que cit� arriba.
 *  Deber�a hacerce una presentaci�n formal de las clases que heredan
 *  DAType para que sea m�s f�cil, y de all� en adelante utilizar
 *  solamente esas palabras abreviadas bien definidas ya y no 
 *  mezclar todo, para que haya mayor presici�n en la interpretaci�n.
 *  As� como ocurre con los nodos l�gicos de la parte 7-4, que no 
 *  tienen ese problema por el hecho de que est�n bien definidos.
 *  
 *  
 *  
 *  
 */


package util;

public class Incoherencias_de_las_notaciones_en_la_norma {

}
