# iteriamCalculadora
##test 4 prueba Iteriam

* Se desarrolla la rama master con el proyecto base dividido en varios módulos (boot, controller, dto, service), una vez creado el esqueleto pasamos a la rama develop para comenzar el desarrollo.

* Se necesita añadir la libreria trace en el repositorio local para poder usarla en el pom. Para ello debemos ejecutar el siguiente comando en la consola:
```
mvn install:install-file -Dfile=D:\Sanitas\pruebas-tecnicas\test4\tracer-1.0.0.jar -DgroupId=io.corp.calculator -DartifactId=tracer -Dversion=1.0.0 -Dpackaging=jar
```
* Se hace uso de Swagger para que el consumo y la publicación de la API sea más sencilla.

* El desarrollo se ha ido haciendo por fases, en primer lugar lo que se podría denominar core, que son las clases del DTO donde estan las clases que almacenan los datos de entrada y salida así como una clase enumerada que se encarga de indicar que tipos de operaciones se pueden realizar (en este momento SUMA y RESTA), con esto se crea el servicio que realiza las operaciones y además se genera un test para probar los dos métodos.

* Una vez completada la parte core se realiza la configuración del controller y la app, en la que se hace uso de lo desarrollado anteriormente.

* Una vez está todo funcionando correctamente se mezcla en la rama master y se publica.

* Una vez terminada lo que es esta version estable se sigue desarrollando, añadiendo la clase tracer que se comentó anteriormente. Se traza los parametros de entrada, la operación y la salida.

* Además se ha intentado añador test a la parte web, pero no han llegado a funcionar correctamente por problemas de configuración y se han dejado en la rama develop_test sin llegar a mezclar en master.

* Para poder hacer uso de la aplicacion bastaría con ejecutar mvn clean compile package install en la carpeta principal para que se generen todos los módulos y se instalen. En el modulo boot estará el jar necesario para ejecutar la app, en concreto en la ruta boot/target/boot-1.0.0-SNAPSHOT.jar. Ejecutando este jar se podrá acceder a la interfaz swagger a través de la url http://localhost:9080/swagger-ui.html
