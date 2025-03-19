public class EmpleadoFijo extends Empleado  {
    private double bono;


    public EmpleadoFijo(String name,String cargo, int age, double salary, String departamento,double bono) {
        super(name, age, salary, departamento,cargo);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bono;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + String.format(", Bono: $%-6.2f", bono);
    }

    @Override
    public String getDetallesExtras() {
        return String.format("Bono: $%-6.2f", bono);
    }
}
