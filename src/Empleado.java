public class Empleado {

    private static int contadorId = 1;
    private int id;
    private String name;
    private String cargo;
    private int age;
    private double salary;
    private String departamento;


    public Empleado(String name, int age, double salary,String departamento,String cargo){
        this.id = contadorId++;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.departamento = departamento;
        this.cargo = cargo;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String mostrarDetalles() {
        return String.format("ID: %-3d Nombre: %-15s Cargo: %-20s Edad: %-3d Salario: $%-8.2f Departamento: %s",
                id, name, cargo, age, getSalary(), departamento);
    }

    public String getCargo() {
        return cargo;
    }

    public String getDetallesExtras() {
        return "";
    }

    public void setCargo(String cargo) {
        cargo = cargo;
    }
}
