# Verificacion-y-Validacion

Objetivos
--------------
Se plantea desarrollar un algoritmo que simule el juego bowling, el cual debe soportar todas las jugadas permitidas en el juego, acatando a las reglas del mismo. El desarrollo debe ser llevado a cabo usando una metodologia llamada TDD (Test Driven Development) o tambien conocido como Desarrollo Guiado por Pruebas. 

Arquitectura del proyecto
----------------------------
El proyecto es bastante simple, solo contiene dos clases:
+ bowling
+ testBowling
La primera, bowling, es un modelo de objeto que contiene 2 metodos, el primero, lanzarBola, se encarga de recibir el parametro cantidadDePinos, el cual indica cuantos pinos se tiran en ese tiro. Considerando tal parametro, se encarga de ejecutar el algoritmo que decide que acciones tomar, en base al estado del juego este toma determinadas acciones. 
El segundo metodo correspondiente a esta clase es el  getPuntaje, retorna el puntaje basado en el estado actual del juego en el momento de su ejecucion.

La segunda, es una clase encargada de ejecutar diferentes test, donde cada uno tiene un nombre descriptivo de su responsabilidad como test.

Complicaciones encontradas
-----------------------------
+ Encontrar un nombre suficientemente descriptivo para un test es complejo, ya que para encontrarlo, se debe tener un lenguaje unificado capaz de representar cada elemento del dominio, ya que al trabajar en equipo, una misma accion, objeto o situacion puede llamarse de diferentes formas. Por ejemplo, realizar una jugada, es decir, lanzar 2 veces la bola, puede ser llamada como "lanzamiento", "jugada", "tiro", etc generando confusion y falta de claridad a la hora de definir nombres totalmente descriptivos.

+ Saber por donde comenzar es complicado. Tuvimos situaciones donde definiamos un test, y resulto muy complejo desarrollar el codigo que cumpla con ese objetivo definido por el test, por lo tanto nos obligaba a replantearnos si estabamos siendo lo suficientemente especificos o demasiado generales. A su vez, nos ayudo a descomponer un fragmento del problema en sub problemas mas facilmente.

+ Adaptarse a la forma de trabajo es dificil, pero como todo, es solo superar la curva de aprendizaje.
