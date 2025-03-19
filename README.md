📊 Sistema de Gestión de Empleados en Java

Este proyecto es una aplicación de consola en Java que permite administrar empleados en una empresa.Incluye funciones para agregar, modificar, listar y eliminar empleados con distintos tipos de contrato.

🚀 Características

✔ Agregar empleados con diferentes tipos de contrato:

📌 Empleado de Planta (Salario fijo + Bono)

⏳ Empleado por Hora (Horas trabajadas + Tarifa por hora)

🎯 Gerente (Salario fijo + Bonificación de liderazgo)✔ Validaciones robustas para la entrada de datos (edad, salario, horas trabajadas, etc.).✔ Edición de empleados por ID con opciones específicas según el tipo de empleado.✔ Eliminación segura con confirmación para evitar eliminaciones accidentales.✔ Interfaz en consola optimizada y clara con formato tabular.

🛠️ Tecnologías Utilizadas

Java 17+

Paradigma de Programación Orientada a Objetos (POO)

Colecciones (ArrayList)

Manejo de excepciones (try-catch) para entrada de datos

Control de versiones con Git y GitHub

📂 Estructura del Proyecto

gestion-empleados-java/
│── src/
│   ├── Main.java              # Punto de entrada de la aplicación
│   ├── Empleado.java          # Clase base Empleado
│   ├── EmpleadoFijo.java      # Clase para empleados fijos
│   ├── EmpleadoPorHora.java   # Clase para empleados por hora
│   ├── Gerente.java           # Clase para gerentes
│   ├── utils/                 # Métodos auxiliares (validaciones, entrada de datos, etc.)

🖥️ Ejemplo de Uso en Consola

📌 Menú Principal

Administración de empleados
-----------------------------
1. Agregar empleados
2. Modificar empleados
3. Lista de empleados
4. Eliminar empleados
5. Salir de la aplicación
Seleccione una opción: 

✅ Agregar un nuevo empleado (Opción 1)

Seleccione el tipo de empleado:
1. Empleado de Planta
2. Empleado por Hora
3. Gerente
Ingrese una opción: 1
Ingrese el nombre: Juan Pérez
Ingrese edad: 30
Ingrese el departamento (A, B o C): A
Ingrese salario base: 1200
Ingrese bono: 300
✅ Empleado agregado: Juan Pérez - Empleado de Planta

✏ Modificar un empleado (Opción 2)

Ingrese el ID del empleado a modificar: 2

¿Qué desea modificar? (Modificando a Ana Torres con ID: 2)
--------------------------------------------------------------
1. Nombre
2. Edad
3. Departamento
4. Horas Trabajadas
5. Tarifa por Hora
9. Salir
Seleccione una opción: 4
Ingrese nuevas horas trabajadas (Actual: 40): 45
✅ Horas trabajadas actualizadas a: 45

📋 Lista de Empleados (Opción 3)

-----------------------------------------------------------------------------------------
ID    Nombre        Cargo                 Edad  Salario   Depto   Detalles Extras
-----------------------------------------------------------------------------------------
1     Juan Pérez   Empleado de Planta     30    $1200.00   A      Bono: $300.00
2     Ana Torres   Empleado por Hora      25    $800.00    B      Horas: 40  Tarifa/Hora: $20.00
3     Carlos Ruiz  Gerente                40    $2500.00   C      Bonificación: $500.00
-----------------------------------------------------------------------------------------

🗑️ Eliminar Empleado (Opción 4)

Ingrese el ID del empleado a eliminar: 3
¿Está seguro de eliminar a Carlos Ruiz? (s/n): s
✅ Empleado Carlos Ruiz eliminado correctamente.

📌 Cómo Ejecutarlo

1️⃣ Clona el repositorio
git clone https://github.com/J4RED1/gestion-empleados-java.git
2️⃣ Abre el proyecto en tu IDE (IntelliJ, Eclipse, VS Code)
3️⃣ Compila y ejecuta Main.java
4️⃣ Sigue las instrucciones en la consola 📜

🏗️ Posibles Mejoras Futuras

✅ Agregar persistencia de datos con archivos o base de datos.
✅ Implementar una interfaz gráfica (JavaFX o Swing).
✅ Soporte para más tipos de empleados y beneficios adicionales.
✅ Integración con un sistema de gestión de nómina.

🚀 Desarrollado por @J4RED1

💡 ¿Ideas para mejorar el proyecto? ¡Haz un fork y colabora! 🎯

