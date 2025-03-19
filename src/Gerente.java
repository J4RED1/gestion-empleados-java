public class Gerente extends Empleado {
    private double bonificacionLiderazgo;

    public Gerente(String name,String cargo, int age, double salary, String departamento, double bonificacionLiderazgo) {
        super(name, age, salary, departamento,cargo);
        this.bonificacionLiderazgo = bonificacionLiderazgo;
    }
    public double getBonificacionLiderazgo() {
        return bonificacionLiderazgo;
    }

    public void setBonificacionLiderazgo(double bonificacionLiderazgo) {
        this.bonificacionLiderazgo = bonificacionLiderazgo;
    }


    @Override
    public double getSalary() {
        return super.getSalary() + bonificacionLiderazgo;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + String.format(", Bono Liderazgo: $%-6.2f", bonificacionLiderazgo);
    }

    @Override
    public String getDetallesExtras() {
        return String.format("Bono Liderazgo: $%-6.2f", bonificacionLiderazgo);
    }
}
