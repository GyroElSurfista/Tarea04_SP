public class Economista extends Empleado
{
  private Calculadora c; 
  public Economista(String nombre){
      super(nombre);
      super.sueldo = 6000;
      c = new Calculadora();
  }
  public int calcularGanancias(int monto){
      int ganancias;
      ganancias = c.calcular(monto);
      return ganancias;
  }
}
