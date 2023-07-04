# Automation Exercise

Proyecto de Pruebas Automatizadas con Serenity Screenplay y Cucumber

## Descripción

Este proyecto contiene una suite de pruebas automatizadas desarrolladas utilizando el patrón de diseño Screenplay de Serenity BDD y el lenguaje de especificación BDD (Behavior-Driven Development) de Cucumber. La automatización se realiza sobre una aplicación web utilizando el framework Serenity Screenplay.

La suite de pruebas está diseñada para validar los escenarios clave de la aplicación web y garantizar su correcto funcionamiento. Se han utilizado técnicas de Screenplay para crear una estructura modular, mantenible y reutilizable.

## Características

- Implementación del patrón de diseño Screenplay de Serenity BDD para una mayor legibilidad y mantenibilidad del código.
- Uso de Cucumber para escribir los escenarios de prueba utilizando un lenguaje natural y facilitar la colaboración entre equipos técnicos y no técnicos.
- Implementación de actores, tareas (Tasks), preguntas (Questions) y pasos (Steps) de Serenity Screenplay para representar la interacción del usuario con la aplicación y las validaciones de estado.
- Integración con el framework Serenity BDD para generar informes de prueba detallados y claros.
- Utilización de patrones de diseño como Page Objects y Screenplay para estructurar y modularizar las pruebas automatizadas.

## Instalación y Configuración

1. Clona el repositorio en tu máquina local: [https://github.com/Johoxtum/AutomationExcerseSerenityScreenplay.git](https://github.com/Johoxtum/AutomationExcerseSerenityScreenplay.git)

2. Asegúrate de tener las siguientes herramientas instaladas en tu entorno de desarrollo:

    - Java Development Kit (JDK)
    - Gradle

3. Abre el proyecto en tu IDE y asegúrate de que todas las dependencias de Gradle se descarguen correctamente.

4. Ejecuta el siguiente comando para compilar y ejecutar las pruebas:
```bash
./gradlew clean test
```


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

## Contacto

Para cualquier consulta o pregunta, puedes contactarme a través de mi dirección de correo electrónico 📧 [Johoxtum@gmail.com](mailto:Johoxtum@gmail.com) y también puedes encontrarme en LinkedIn 💼 [Perfil de LinkedIn](https://www.linkedin.com/in/johoxtum-jimenez-463ba1211/) 😊
