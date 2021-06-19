public class Empleado
{
    private String nombre;
    protected int sueldo;
    protected int aniosTrabajo;
    protected int dinero;
    protected int diasVacaciones;
    public Empleado (String nombre){
        this.nombre = nombre;
        sueldo = 0;
        aniosTrabajo = 0;
        dinero = 0;
        diasVacaciones = 0;
    }
    public String trabajar(int anios){
        String reporte;
        aniosTrabajo = aniosTrabajo + anios;
        diasVacaciones = diasVacaciones + (anios * 10/100);
        reporte = "El empleado: " + nombre + " trabajó durante: " + anios + " anios.";
        return reporte;
    }
    public String recibirPaga(){
        String reporte;
        dinero = dinero + sueldo;
        reporte = "El empleado: " + nombre +  " recibio un sueldo de: " + sueldo + "Bs.";
        return reporte;
    }
    public String salirDeVacaciones(){
        String reporte;
        reporte = "El empleado: " + nombre + " se fue de vacaciones por "+ diasVacaciones + " dias.";  
        diasVacaciones = 0;
        return  reporte;
    }
    public String aumentarSueldo(int aumento){
        sueldo = sueldo + aumento;
        return "El empleado: " + nombre + " ha recibido un aumento de: " + aumento + "Bs.";
    }
} 
