# Resolid
## Integrantes
* Diego Camilo Moncada Avendaño
* Camilo Ramirez Fernandez
* Juan Pablo Benitez

## Problemas
### EmployeeManager
1- SRP: Esta clase tiene varias responsabilidades que no están relacionadas; crear y eliminar empleados, calcular salarios y guardar en archivo.
### EmployeeOperations
1-ISP: La interfaz tiene demasiadas responsabilidades, lo cual fuerza a la clase EmployeeManager a implementar métodos que no son necesarios
### PartTimeEmployee
1- LSP: La clase Employee no puede ser reemplazada por un PartTime debido a que ésta última usa un método para lanzar una UnsupportedOperationExcepion.
### ReportGenerator
1- OCP: La clase tiene que modificar el método de generateReport cuando se quiera añadir un formato distinto. 

2-DIP: La clase depende directamente de un EmployeeManager en vez de una abstracción.
### SalaryCalculator
1- DIP: SalaryCalculator está creando una instancia EmployeeManager para funcionar, incrementando el acoplamiento. 
