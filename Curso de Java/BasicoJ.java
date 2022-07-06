package BasicoP;
import java.util.Scanner;

public class BasicoJ {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // el scaner
		System.out.println("Hola mundo"); //un hola mundo
String usuario; // un string
System.out.println("Cual es tu nombre?"); //un mensaje en consola
usuario=entrada.nextLine(); //una entrada string
System.out.println("Hola "+usuario+""); // un mensaje con variable
System.out.println("");//salto de linea
int a,b; // un int
double c; // un char

	System.out.println("Dame el valor para a"); // un mensaje en cosola
a=entrada.nextInt(); // una entrada int


	System.out.println("Dame un valor para b"); // un mensaje en cosola
b=entrada.nextInt(); // una entrada int

System.out.println("");//salto de linea
c=a+b; //una suma
System.out.println("a    b    c");// un mensaje en cosola
System.out.println(a+" + "+b+" = "+c);// un mensaje en cosola
c=a-b; // una resta
System.out.println(a+" - "+b+" = "+c);// un mensaje en cosola
c=a*b; // una multiplicacion
System.out.println(a+" * "+b+" = "+c);// un mensaje en cosola
c=a/b; // una division
System.out.println(a+" / "+b+" = "+c);// un mensaje en cosola
c=Math.pow(a,b); // elebar a a la b 
System.out.println(a+" ^ "+b+" = "+c);// un mensaje en cosola
c=(a+b)+(a+b*0.21); //sacar el iva de a+b
System.out.println("Iva de "+a+" + "+b+" = "+c);// un mensaje en cosola
System.out.println("");//salto de linea
if (a==b) { //a es igual a b?
	System.out.println("a = "+a+ "y b ="+b+" son iguales");// un mensaje en cosola si sí son iguales
}else { // si a no es igual a b
	if(a<b) { //a es menor que b?
		System.out.println("a = "+a+ " es menor que b = "+b);// un mensaje en cosola si sí
	}else { // si a no es menor que b
		System.out.println("a ="+a+ " es mayor que b = "+b);// un mensaje en cosola si no
	}}// cerramos condicionales de menor mayor
if(a%2==0) { // a es divisible entre 2? 
	System.out.println("El nuero a = "+a+" es dibisible entre 2");// un mensaje en cosola si sí
}else {// si a no es divisible entre 2?
	System.out.println("El nuero a ="+a+" no es dibisible entre 2");// un mensaje en cosola si no
}// cerramos condicionales a divisible
if(b%2==0) {// b es divisible entre 2?
	System.out.println("El nuero b ="+b+" es dibisible entre 2");// un mensaje en cosola si sí
}else {// si b no es divisible entre 2?
	System.out.println("El nuero b ="+b+" no es dibisible entre 2");// un mensaje en cosola si no
}// cerramos condicionales b divisible
char A,B; //2 chars
A=(char)a;// de "a" int a "A" char
B=(char)b;// de "b" int a "B" char
System.out.println("El numero a = "+a+" en AscII es "+A );// un mensaje en cosola
System.out.println("El numero b = "+b+" en AscII es "+B );// un mensaje en cosola
System.out.println("");//salto de linea
int ac=1; //int contador
System.out.println("Vamor a mostrar b = "+b+" veces el a = "+a);// un mensaje en cosola
while (ac<=b) { // un siclo while
	System.out.println(a); // se imprime a
	ac++;// el contador sube mientras sema menor o igual a b
}
System.out.println("Vamor a mostrar a = "+a+" veces el b = "+b);// un mensaje en cosola
for(int bc=1;bc<=a;bc++) { // Un for deblara contador de b, funciona mientras bc sea menor o igual a "a", aumentamos uno por cada vulta
	System.out.println(b); // se imprime b
}
System.out.println("Vamor a mostrar ac = "+ac+" hasta que sea 0 de nuevo a");// un mensaje en cosola
do {//abrimos un do while 
	System.out.println(ac); // se imprime ac
	ac--; //restamos una a ac
}while(ac!=-1); // mientras que ac sea diferete de 1
	
	}}
