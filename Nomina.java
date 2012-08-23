class Nomina { 
    public static String Pago(double base , int horas,String nombre){ 
	Double pago; 
	if(horas>40){
	System.out.print ("el pago de "    +nombre+ " " );
	    pago = (base*40) + (base*(1.5*(horas-40)));
	}
	if(horas>60){
	    return(" ,Ha trabajado mucho!! Descance!"    +nombre);
	}

	if(base < 8.00){
	    return("Muy poco sueldo!  "  +nombre);
	}
	else{
	    pago = base*horas;
	}
	return(pago.toString());
}

    public static void main(String[] arguments){ 
    System.out.println(Pago(7.00,35,"juan")); 
	System.out.println(Pago(8.200,47,"mauricio")); 
	System.out.println(Pago(10.00,73,"pedro")); 

    } 
}