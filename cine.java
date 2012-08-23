import java.util.*;
public class cine{
public static void main(String[] args) {
System.out.print("***Programa hecho en java, Gestion Boletas Cine.****");
System.out.print("***Hecho por Mauricio Navarro codigo 625171,estudiante de ingenieria de sistemas.***");
System.out.println("***Presentado al ingeniero Camilo Pino , materia programacion orientada de objetos.***");
int boletas ;
String calidad = new String();
int gafas ;
String tipopelicula = new String();
Scanner scan = new Scanner(System.in);
System.out.println("!BIENVENIDO HA CINEMAX! ");
System.out.println(" Cantidad de boletas que deseas comprar ? ");
boletas = Integer.parseInt(scan.nextLine());
System.out.println(" 3d o 2d ");
tipopelicula = scan.nextLine();
if (tipopelicula.equals("3d")) {
		System.out.println(" !!!has escogido ver una pelicula en calidad 3d!!! ");
	System.out.println("  Cuantos paquetes de gafas quieres incluir en tu paquete 3d ?? ");
gafas = Integer.parseInt(scan.nextLine());
if (gafas<=boletas) {
	System.out.println(" Preferencial o General ??");
calidad = scan.nextLine();
		} else {
System.out.println("!!Necesitas comprar mas  boletas para adquirir otro paquete de gafas!!" );
}
if (calidad.equals("Preferencial")) {
			System.out.println(" el valor de "+boletas+" boletas para una pelicula 3d y "+gafas+
			"  paquete de gafas   3d de tipo preferencial es igual a "+"$ "+(boletas*15000+gafas*3000)+"");
		}
if (calidad.equals("General")) {
			System.out.println(" el valor de "+boletas+"boletas para una pelicula 3d y "+gafas+" paquetes de de gafas 3d de tipo general ,es igual a"+"$ "+(boletas*12000+gafas*3000)+"");
		}
} else {
		System.out.println(" ha escogido una pelicula 2d");
		System.out.println(" Preferencial o General ??");
calidad = scan.nextLine();
if (calidad.equals("Preferencial")) {
System.out.println(" el valor de "+boletas+" boletas para una pelicula 2d de tipo preferencial ,es igual a "+"$ "+(boletas*11000)+"");
}
if (calidad.equals("General")) {
System.out.println(" el valor de "+boletas+" boletas para una pelicula 2d de tipo general ,es igual a "+"$ "+(boletas*8000)+"");
}
}
}
}


