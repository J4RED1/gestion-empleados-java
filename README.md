# 📊 Sistema de Gestión de Empleados en Java

## 📌 Descripción del Proyecto
El **Sistema de Gestión de Empleados** es una aplicación de consola desarrollada en **Java** que permite administrar empleados de manera eficiente. Su diseño modular basado en **Programación Orientada a Objetos (POO)** facilita su mantenimiento y expansión. 

### 🌟 Características Principales
- 📌 **Registro de empleados** con diferentes tipos de contrato.
- ✏ **Modificación de información** con opciones específicas para cada tipo de empleado.
- 📋 **Listar empleados** con una vista tabular clara y organizada.
- 🗑 **Eliminación segura** con confirmación para evitar errores.
- ✅ **Validaciones avanzadas** para garantizar datos correctos y evitar inconsistencias.
- 📊 **Interfaz optimizada en consola** para mejorar la experiencia del usuario.

---

## 🚀 Funcionalidades

✔ **Tipos de empleados gestionados:**

- 🏢 **Empleado de Planta:** Salario fijo + Bono.  
- ⏳ **Empleado por Hora:** Horas trabajadas + Tarifa por hora.  
- 🎯 **Gerente:** Salario fijo + Bonificación de liderazgo.  

✔ **Sistema de validaciones** para evitar errores en la entrada de datos.  
✔ **Interfaz en consola mejorada** con formato estructurado.  
✔ **Manejo eficiente de datos** utilizando estructuras como `ArrayList`.  
✔ **Gestión de empleados por ID** para una mejor administración.  
✔ **Control de excepciones** para garantizar estabilidad y robustez.  


---

## 🛠️ Tecnologías Utilizadas

- **Java 17+** ☕
- **Paradigma POO** 🏗️
- **Colecciones Java (`ArrayList`)** 📂
- **Manejo de excepciones (`try-catch`)** ⚠️
- **Control de Versiones con Git y GitHub** 🖥️

---

## 📂 Estructura del Proyecto

```plaintext
gestion-empleados-java/
│── src/
│   ├── Main.java              # Punto de entrada de la aplicación
│   ├── Empleado.java          # Clase base para empleados
│   ├── EmpleadoFijo.java      # Implementación para empleados fijos
│   ├── EmpleadoPorHora.java   # Implementación para empleados por hora
│   ├── Gerente.java           # Implementación para gerentes
│   ├── utils/                 # Métodos auxiliares (validaciones, entrada de datos, etc.)
```

---

## 🖥️ Ejemplo de Uso en Consola

### 📌 Menú Principal
```plaintext
Administración de empleados
-----------------------------
1. Agregar empleados
2. Modificar empleados
3. Lista de empleados
4. Eliminar empleados
5. Salir de la aplicación
Seleccione una opción:
```

### ✅ Agregar un nuevo empleado (Opción 1)
```plaintext
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
```

### ✏ Modificar un empleado (Opción 2)
```plaintext
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
```

### 📋 Lista de Empleados (Opción 3)
```plaintext
-----------------------------------------------------------------------------------------
ID    Nombre        Cargo                 Edad  Salario   Depto   Detalles Extras
-----------------------------------------------------------------------------------------
1     Juan Pérez   Empleado de Planta     30    $1200.00   A      Bono: $300.00
2     Ana Torres   Empleado por Hora      25    $800.00    B      Horas: 40  Tarifa/Hora: $20.00
3     Carlos Ruiz  Gerente                40    $2500.00   C      Bonificación: $500.00
-----------------------------------------------------------------------------------------
```

### 🗑️ Eliminar Empleado (Opción 4)
```plaintext
Ingrese el ID del empleado a eliminar: 3
¿Está seguro de eliminar a Carlos Ruiz? (s/n): s
✅ Empleado Carlos Ruiz eliminado correctamente.
```

---

## 📌 Cómo Ejecutarlo

1️⃣ **Clona el repositorio**
```bash
git clone https://github.com/J4RED1/gestion-empleados-java.git
```
2️⃣ **Abre el proyecto en tu IDE** (IntelliJ, Eclipse, VS Code)
3️⃣ **Compila y ejecuta `Main.java`**
```bash
javac Main.java
java Main
```
4️⃣ **Sigue las instrucciones en la consola** 📜

---

## 🏗️ Mejoras Futuras

✔ **Persistencia de datos** mediante archivos o base de datos.  
✔ **Interfaz gráfica** (JavaFX o Swing) para mejorar la experiencia del usuario.  
✔ **Sistema de autenticación** para restringir acceso a ciertas funciones.  
✔ **Integración con nómina** para cálculo automático de pagos.  
✔ **Soporte para más tipos de empleados** con beneficios adicionales.  


---

## 🚀 Desarrollado por [J4RED1]
📌 **GitHub:** [https://github.com/J4RED1](https://github.com/J4RED1)
📌 **LinkedIn:**

💡 **¿Ideas para mejorar el proyecto?** ¡Haz un fork y colabora! 🎯
