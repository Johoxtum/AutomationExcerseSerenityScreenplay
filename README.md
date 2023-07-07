# Automation Exercise  :computer: :mag_right:

[![Serenity BDD](https://img.shields.io/badge/Serenity%20BDD-3.6.12-green)](https://serenity-bdd.info/)
[![Cucumber](https://img.shields.io/badge/Cucumber-3.6.12-brightgreen)](https://cucumber.io/)
[![Gradle](https://img.shields.io/badge/Gradle-7.1.1-blue)](https://gradle.org/)

Este proyecto es un ejemplo de automatización de pruebas utilizando Serenity Screenplay con Gradle. El objetivo de este proyecto es mostrar mis habilidades como QA Automation Engineer y mi capacidad para desarrollar pruebas automatizadas de calidad utilizando el enfoque de Screenplay.

## Características principales :star2:

- Utiliza Serenity como herramienta principal para la automatización de pruebas.
- Implementa el patrón de diseño Screenplay para escribir pruebas en un lenguaje más orientado a las acciones y el comportamiento.
- Utiliza Gradle como gestor de dependencias y para ejecutar las pruebas de manera eficiente.
- Genera informes detallados y visualmente atractivos de los resultados de las pruebas.

## Requisitos previos :heavy_check_mark:

Asegúrate de tener instalados los siguientes componentes en tu entorno de desarrollo:

- Java JDK 8 o superior
- Gradle
- Git

## Configuración del proyecto :wrench:

1. Clona este repositorio en tu máquina local utilizando el siguiente comando:

```bash
git clone https://github.com/Johoxtum/AutomationExcerseSerenityScreenplay.git
```

2. Abre el proyecto en tu entorno de desarrollo preferido (por ejemplo, IntelliJ IDEA o Eclipse).

3. Configura las dependencias y configuraciones del proyecto en el archivo `build.gradle`.

4. Actualiza los Actores, Tareas y Preguntas en el proyecto de acuerdo a tus necesidades y la aplicación que estás probando.

## Ejecución de las pruebas :arrow_forward:

1. Desde la línea de comandos, dirígete al directorio raíz del proyecto.

2. Ejecuta el siguiente comando para ejecutar las pruebas automatizadas:

```bash
./gradlew clean test
```

3. Después de que se completen las pruebas, se generarán informes detallados en el directorio `target/site/serenity`.

## Estructura del Proyecto

```Gherkin
src
+ main                                  | Source main
+ test                                  |
 + java                                | Test runners and supporting code
   + features                          | Features set
     + {feature_name}                  | Feature name
       + pages                         | Pages use with webdriver test
       + steps                         | Utility class for definition steps
     + {feature_name}Definition.java   | Definition class 
   + model                             | DTOs, Pojos, VOs, etc ...
   + utils                             | General utility class
   + RunnerTestSuite.java              | Main class
 + resources                           |
   + features                          | Feature files
       + {feature_name}                 | Feature file  specific
          {feature_name}.feature        |
   + serenity.conf                     | Config file for Serenity
serenity.properties                       | General properties Serenity
```

## Contacto :email:

Si tienes alguna pregunta o comentario sobre este proyecto, no dudes en contactarme:

- Nombre: Johoxtum Jiménez
- Email: [Johoxtum@gmail.com](mailto:Johoxtum@gmail.com)
- LinkedIn: [Perfil de LinkedIn](https://www.linkedin.com/in/johoxtum-jimenez-463ba1211/)

¡Gracias por tu interés en este proyecto de automatización QA con Serenity Screenplay!