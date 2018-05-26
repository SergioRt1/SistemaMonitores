# PDSWproject2018-1-SistemaMonitores
# Semestre 2018-1
   - Curso: Proceso de Desarrollo de Software (PDSW)

# Integrantes
  - Sergio Rodriguez 
 
# Sistema explicacion Especifica
El sistema de monitorias cuenta con varios roles y cada un con determinadas funciones
* Rol de Administrador
* Rol de Profesor
* Rol de Monitor
* Usuario Publico
# Rol de Monitor
Para el rol de monitor el monitor puede registrar una monitoria y puede consultar sus monitorias.
# Rol Profesor
Para el rol de profesor se tiene consultas estadisticas de consultas generales,consultas por monitor, consultas por curso
se tiene analisis de graficas,ademas de las tablas con el discriminado de toda la informacion de las monitorias por profesor
# Rol de Administrador
Para el rol de administrador se tiene inserciones para tema de los cursos, monitores, profesores, materias o cursos
# Usuario Publico
Para el usuario Publico se tiene una vista inicial de los horarios desde hay inicia y es la raiz de la aplicacion para
login y demas roles.

#### Tecnologia usada
- Para la interfaz grafica se utilizo Primefaces que es un componente OPS para facilitar la creacion y manipulacion de elementos de la interfaz.
- Se utilizo Guice para realizar la inyeccion, esto facilita que sea el mismo gestor quien determine que necesita para crear cada objeto y garantizar su iniacion sin fallos.
- La base de datos es gestionada con un sistema PostgreSQL, que al estar enfocada en objetos-relacional facilita la integracion con Java.

### Link Heroku: https://sistemamonitores.herokuapp.com

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/19b424cce5fb4ec8ad4d930babd98f8a)](https://app.codacy.com/app/SergioRt1/SistemaMonitores?utm_source=github.com&utm_medium=referral&utm_content=SergioRt1/SistemaMonitores&utm_campaign=badger)
[![CircleCI](https://circleci.com/gh/SergioRt1/SistemaMonitores.svg?style=svg)](https://circleci.com/gh/SergioRt1/SistemaMonitores)




 
