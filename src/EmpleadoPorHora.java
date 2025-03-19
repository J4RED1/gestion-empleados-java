public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora(String name,String cargo, int age, String departamento, int horasTrabajadas, double tarifaPorHora) {
        super(name, age, 0, departamento,cargo);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }


    @Override
    public double getSalary() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String mostrarDetalles() {
        return super.mostrarDetalles() + String.format(", Horas: %-3d Tarifa/Hora: $%-6.2f", horasTrabajadas, tarifaPorHora);
    }

    @Override
    public String getDetallesExtras() {
        return String.format("Horas: %-3d Tarifa/Hora: $%-6.2f", horasTrabajadas, tarifaPorHora);
    }
}
