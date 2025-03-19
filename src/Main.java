import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        while (true){
            System.out.println("");
            System.out.println("Administracion de empleados");
            System.out.println("---------------------------");

            System.out.println("1. Agregar empleados");
            System.out.println("2. Modificar empleados");
            System.out.println("3. Lista de empleados");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir de la app");
            System.out.println("Seleccione alguna opcion: ");

            int opcion = leerEntero(sc);

            switch (opcion){
                case 1:
                    String cargo = validarTipoEmpleado(sc);

                    System.out.println("Ingrese el nombre:");
                    String name = validarTexto(sc);

                    int age = validarEdad(sc);

                    System.out.println("Ingrese el departamento (A, B o C): ");
                    String departamento = validarDepartamento(sc);

                    Empleado nuevoEmpleado = crearEmpleado(sc, cargo, name, age, departamento);

                    if (nuevoEmpleado != null) {
                        listaEmpleados.add(nuevoEmpleado);
                        System.out.println("✅ Empleado agregado: " + nuevoEmpleado.getName() + " - " + nuevoEmpleado.getCargo());
                    } else {
                        System.out.println("⚠️ No se pudo agregar el empleado.");
                    }
                    break;
                case 2:
                    listarEmpleados(listaEmpleados);
                    if (listaEmpleados.isEmpty()) {
                        break;
                    }

                    System.out.println("Ingrese el ID del empleado a modificar: ");
                    int idBuscado = leerEntero(sc);

                    Empleado empleado = buscarEmpleadoPorId(listaEmpleados, idBuscado);

                    if (empleado != null) {
                        mostrarMenuEdicion(empleado, sc);
                        System.out.println("✅ Empleado modificado correctamente.");
                    } else {
                        System.out.println("⚠️ ID inválido, intenta nuevamente.");
                    }
                    break;


                case 3:
                    listarEmpleados(listaEmpleados);
                    break;


                case 4:
                    System.out.println("!!!!!! ELIMINANDO EMPLEADOS !!!!!!!");
                    listarEmpleados(listaEmpleados);

                    if (listaEmpleados.isEmpty()) {
                        break;
                    }
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Ingrese el ID del empleado a ELIMINAR: ");
                    int idEliminar = leerEntero(sc);

                    Empleado empSeleccionado = buscarEmpleadoPorId(listaEmpleados, idEliminar);

                    if (empSeleccionado != null) {
                        System.out.println("Esta seguro de eliminar al empleado ==> " + empSeleccionado.getName() + " ? (s/n)");
                        String confirmacion = sc.nextLine();
                        if (confirmacion.equalsIgnoreCase("s")) {
                            listaEmpleados.remove(empSeleccionado);
                            System.out.println("✅ Empleado " + empSeleccionado.getName() + " eliminado correctamente.");
                        } else {
                            System.out.println("⚠️ Solicitud de eliminación cancelada.");
                        }
                    } else {
                        System.out.println("⚠️ No se encontró un empleado con ese ID.");
                    }
                    break;


                case 5:
                    System.out.println("Saliendo del programa...");
                    sc.close();
                    return;
                default:
                    System.out.println("OPCION NO VALIDA!");

            }
        }
    }
    public static int validarEdad(Scanner sc ) {
        System.out.println("Ingrese edad:");
        int age;


        do {
            age = leerEntero(sc);
            if (age < 18) {
                System.out.println("⚠️ Error: La edad debe ser mayor o igual a 18.");
            }
        } while (age < 18);
        return age;
    }

    public static String validarTexto(Scanner sc) {
        String texto;
        while (true) {
            texto = sc.nextLine().trim();

            if (texto.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
                return texto;
            } else {
                System.out.println("⚠️ Error: Solo se permiten letras y espacios.");
            }
        }
    }

    public static int leerEntero(Scanner sc) {
        while (true) {
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("⚠️ Error: Debe ingresar un número.");
                continue;
            }

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Error: Debe ingresar un número entero válido.");
            }
        }
    }


    public static String validarDepartamento(Scanner sc) {
        String departamento;
        while (true) {
            departamento = sc.nextLine().trim().toUpperCase();

            if (departamento.equals("A") || departamento.equals("B") || departamento.equals("C")) {
                return departamento;
            } else {
                System.out.println("⚠️ Error: Solo se permite 'A', 'B' o 'C'. Intente de nuevo.");
            }
        }
    }

    public static String validarTipoEmpleado(Scanner sc) {
        int tipoEmpleado;
        while (true) {
            System.out.println("Seleccione el tipo de empleado:");
            System.out.println("1. Empleado de Planta");
            System.out.println("2. Empleado por Hora");
            System.out.println("3. Gerente");

            tipoEmpleado = leerEntero(sc);

            switch (tipoEmpleado) {
                case 1:
                    return "Empleado de Planta";
                case 2:
                    return "Empleado por Hora";
                case 3:
                    return "Gerente";
                default:
                    System.out.println("⚠️ Error: Tipo de empleado no válido! Intente de nuevo.");
            }
        }
    }

    public static Empleado crearEmpleado(Scanner sc, String cargo, String name, int age, String departamento) {
        switch (cargo) {
            case "Empleado de Planta":
                System.out.println("Ingrese salario base:");
                double salarioPlanta = validarSalario(sc);
                System.out.println("Ingrese bono:");
                double bonoPlanta = validarBono(sc);
                return new EmpleadoFijo(name, cargo, age, salarioPlanta, departamento, bonoPlanta);

            case "Empleado por Hora":
                System.out.println("Ingrese horas trabajadas:");
                int horas = leerHorasTrabajo(sc);
                System.out.println("Ingrese tarifa por hora:");
                double tarifa = validarSalario(sc);
                return new EmpleadoPorHora(name, cargo, age, departamento, horas, tarifa);

            case "Gerente":
                System.out.println("Ingrese salario base:");
                double salarioGerente = validarSalario(sc);
                System.out.println("Ingrese bonificación de liderazgo:");
                double bonoGerente = validarBono(sc);
                return new Gerente(name, cargo, age, salarioGerente, departamento, bonoGerente);

            default:
                System.out.println("⚠️ Tipo de empleado no válido.");
                return null;
        }
    }
    public static void listarEmpleados(ArrayList<Empleado> listaEmpleados) {
        System.out.println("\n📋 Lista de Empleados:");

        if (listaEmpleados.isEmpty()) {
            System.out.println("--------------------------------------------------------");
            System.out.println("⚠️ No hay empleados registrados.");
            System.out.println("--------------------------------------------------------");
            return;
        }


        System.out.printf("%-5s %-15s %-25s %-5s %-12s %-8s %s\n",
                "ID", "Nombre", "Cargo", "Edad", "Salario", "Depto", "Detalles Extras");
        System.out.println("------------------------------------------------------------------------------------------------------");


        for (Empleado emp : listaEmpleados) {
            System.out.printf("%-5d %-15s %-25s %-5d $%-11.2f %-8s %s\n",
                    emp.getId(), emp.getName(), emp.getCargo(), emp.getAge(), emp.getSalary(), emp.getDepartamento(), emp.getDetallesExtras());
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
    }
    public static Empleado buscarEmpleadoPorId(ArrayList<Empleado> lista, int id) {
        for (Empleado emp : lista) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }
    public static void mostrarMenuEdicion(Empleado emp, Scanner sc) {
        boolean continuar = true;
        while (continuar) {

            System.out.println("\n¿Qué desea modificar? (Modificando a " + emp.getName() + " ; id: " + emp.getId());

            System.out.println("1. Nombre");
            System.out.println("2. Edad");
            System.out.println("4. Departamento");

            if (emp instanceof EmpleadoFijo || emp instanceof Gerente) {
                System.out.println("4. Salario Base");
            }

            if (emp instanceof EmpleadoFijo) {
                System.out.println("5. Bono");
            } else if (emp instanceof EmpleadoPorHora) {
                System.out.println("6. Horas Trabajadas");
                System.out.println("7. Tarifa por Hora");
            } else if (emp instanceof Gerente) {
                System.out.println("8. Bonificación de Liderazgo");
            }

            System.out.println("9. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = leerEntero(sc);


            if (opcion == 9) {
                continuar = false;
            } else {
                modificarAtributo(emp, opcion, sc);
            }
        }
    }
    public static void modificarAtributo(Empleado emp, int opcion, Scanner sc) {
        switch (opcion) {
            case 1:
                System.out.println("Nombre actual: (" + emp.getName() + "): ");
                System.out.println("Ingrese nuevo nombre (ENTER para cancelar): ");
                String nuevoNombre = sc.nextLine().trim();

                if (!nuevoNombre.isEmpty()) {
                    emp.setName(nuevoNombre);
                    System.out.println("✅ Nombre actualizado a: " + nuevoNombre);
                } else {
                    System.out.println("⚠️ No se realizaron cambios en el nombre.");
                }
                break;

            case 2:
                System.out.print("Nueva edad (" + emp.getAge() + "): ");
                int nuevaEdad = validarEdad(sc);
                emp.setAge(nuevaEdad);
                break;
            case 3:
                System.out.print("Nuevo salario base ($" + emp.getSalary() + "): ");
                double nuevoSalario = sc.nextDouble();
                emp.setSalary(nuevoSalario);
                break;
            case 4:
                String nuevoDepartamento = validarDepartamento(sc);
                emp.setDepartamento(nuevoDepartamento);
                break;

            case 5:
                if (emp instanceof EmpleadoFijo) {
                    System.out.print("Ingrese nuevo bono ($" + ((EmpleadoFijo) emp).getBono() + "): ");
                    double nuevoBono = sc.nextDouble();
                    ((EmpleadoFijo) emp).setBono(nuevoBono);
                }
                break;
            case 6:
                if (emp instanceof EmpleadoPorHora) {
                    System.out.print("Ingrese nuevas horas trabajadas (" + ((EmpleadoPorHora) emp).getHorasTrabajadas() + "): ");
                    int nuevasHoras = leerEntero(sc);
                    ((EmpleadoPorHora) emp).setHorasTrabajadas(nuevasHoras);
                }
                break;
            case 7:
                if (emp instanceof EmpleadoPorHora) {
                    System.out.print("Ingrese nueva tarifa por hora ($" + ((EmpleadoPorHora) emp).getTarifaPorHora() + "): ");
                    double nuevaTarifa = sc.nextDouble();
                    ((EmpleadoPorHora) emp).setTarifaPorHora(nuevaTarifa);
                }
                break;
            case 8:
                if (emp instanceof Gerente) {
                    System.out.print("Ingrese nueva bonificación de liderazgo ($" + ((Gerente) emp).getBonificacionLiderazgo() + "): ");
                    double nuevoBonoLiderazgo = sc.nextDouble();
                    ((Gerente) emp).setBonificacionLiderazgo(nuevoBonoLiderazgo);
                }
                break;
            default:
                System.out.println("⚠️ Opción inválida, intenta nuevamente.");
        }
    }

    public static double validarSalario(Scanner sc) {
        double salario;
        while (true) {
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("⚠️ Error: El salario no puede estar vacío.");
                continue;
            }

            try {
                salario = Double.parseDouble(input);
                if (salario > 0) {
                    return salario;
                } else {
                    System.out.println("⚠️ Error: El salario debe ser mayor a 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Error: Debe ingresar un número válido.");
            }
        }
    }
    public static double validarBono(Scanner sc) {
        double bono;
        while (true) {

            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("⚠️ Error: El bono no puede estar vacío.");
                continue;
            }

            try {
                bono = Double.parseDouble(input);
                if (bono >= 0) {
                    return bono;
                } else {
                    System.out.println("⚠️ Error: El bono no puede ser negativo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Error: Debe ingresar un número válido.");
            }
        }
    }
    public static int leerHorasTrabajo(Scanner sc) {
        while (true) {
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("⚠️ Error: Debe ingresar un número.");
                continue;
            }

            try {
                int horas = Integer.parseInt(input);
                if (horas >= 0) { // 🔹 Ahora permite 0
                    return horas;
                } else {
                    System.out.println("⚠️ Error: Las horas no pueden ser negativas.");
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Error: Debe ingresar un número entero válido.");
            }
        }
    }



}