import java.util.*;
public class ejemplo {
public static void main(String[] args) {
System.out.print("***Programa hecho en java, para calcular el Indice de Masa Muscular.****");
System.out.print("***Hecho por Mauricio Navarro codigo 625171,estudiante de ingenieria de sistemas.***");
System.out.println("***Presentado al ingeniero Camilo Pino , materia programacion orientada de objetos.***");
Float estatura = new Float(0);
String nombre = new String();
Float peso = new Float(0);
Scanner scan = new Scanner(System.in);
System.out.println("Cual es tu nombre?");
nombre = scan.nextLine();
System.out.println("Cual es tu estatura ?");
estatura = Float.parseFloat(scan.nextLine());
System.out.println("Cual es tu peso ?");
peso = Float.parseFloat(scan.nextLine());
Float imc = peso/(estatura * estatura);
System.out.println(
"tu masa corporal es:");
System.out.println(imc);
if (imc<18.50) {
	System.out.println(
" Hola "+ nombre +" tienes infrapeso " );
}
if (imc<16.00) {
	System.out.println("Hola "+nombre+"  tienes delgadez severa ");
}
if (imc>=16.00&&imc<16.99) {
	System.out.println("Hola "+ nombre +"  tienes delgadez moderada ");
}
if (imc>=17.00&&imc<18.49) {
	System.out.println("Hola "+ nombre +"  tienes delgadez no muy moderada ");
}
if (imc>=18.5&&imc<24.99) {
	System.out.println("Hola "+ nombre +"  tienes Peso normal ");
}
if (imc>=25.00) {
	System.out.println("Hola "+ nombre +"  tienes sobrepeso ");
}
if (imc>25.00&&imc<29.99) {
	System.out.println("Hola "+ nombre +"  tienes preobesidad");
}
if (imc>=30.00) {
	System.out.println("Hola "+ nombre +"  tienes obesidad");
}
if (imc>30.00&&imc<34.99) {
	System.out.println("Hola "+ nombre +"  tienes Obesidad tipo I ");
}
if (imc>35.00&&imc<39.99) {
	System.out.println("Hola "+ nombre +"  tienes Obesidad tipo II ");
}
if (imc>=40.00) {
	System.out.println("Hola REGORDO "+ nombre +"  tienes Obesidad tipo III ");
}
	}
}
	
