# Verificacion y Validacion de Software

Objetivos
--------------
Se plantea desarrollar un algoritmo que simule el juego bowling, el cual debe soportar todas las jugadas permitidas en el juego, acatando a las reglas del mismo. El desarrollo debe ser llevado a cabo usando una metodologia llamada TDD (Test Driven Development) o tambien conocido como Desarrollo Guiado por Pruebas. 

Arquitectura del proyecto
----------------------------
El proyecto es bastante simple, solo contiene dos clases:
+ bowling
+ testBowling

La primera, bowling, es un modelo de objeto que contiene 3 metodos, el primero, lanzarBola, recibe el parametro cantidadDePinos y se encarga de setear con valores todas las jugadas que fueron realizadas, teniendo en cuenta el caso especial de si se logra un strike en las ultimas rondas del juego.
Luego tenemos el segundo metodo, calcularPuntaje, que se encarga de ejecutar el algoritmo que decide que acciones tomar en base al estado del juego, con este metodo determinamos el puntaje. 
Por ultimo tenemos el tercer metodo, getPuntaje, retorna el puntaje basado en el estado actual del juego en el momento de su ejecucion.

La segunda, es una clase encargada de ejecutar diferentes test, donde cada uno tiene un nombre descriptivo de su responsabilidad como test.

Complicaciones encontradas
-----------------------------
+ Encontrar un nombre suficientemente descriptivo para un test es complejo, ya que para encontrarlo, se debe tener un lenguaje unificado capaz de representar cada elemento del dominio, ya que al trabajar en equipo, una misma accion, objeto o situacion puede llamarse de diferentes formas. Por ejemplo, realizar una jugada, es decir, lanzar 2 veces la bola, puede ser llamada como "lanzamiento", "jugada", "tiro", etc generando confusion y falta de claridad a la hora de definir nombres totalmente descriptivos.

+ Saber por donde comenzar es complicado. Tuvimos situaciones donde definiamos un test, y resulto muy complejo desarrollar el codigo que cumpla con ese objetivo definido por el test, por lo tanto nos obligaba a replantearnos si estabamos siendo lo suficientemente especificos o demasiado generales. A su vez, nos ayudo a descomponer un fragmento del problema en sub problemas mas facilmente.

+ Tuvimos que reestructurar muchas veces la logica del juego ya que al avanzar en los casos del test y darle mas dificultad nos encontramos que no respetabamos ciertas jugadas, de esta manera agregamos nuevas variables de control y mas condicionales que eran necesarios para el correcto calculo del puntaje.

+ Adaptarse a la forma de trabajo es dificil, pero como todo, es solo superar la curva de aprendizaje.

Ventajas encontradas
----------------------
+ Permite generar trazas mas facilmente. Esto se debe a que al realizar simulaciones con los test, probabamos casos mas especificos y cuando uno fallaba, ya nos daba una idea de por que camino del codigo podia estar la falla.

+ Cuando se codifica una funcionalidad, no es necesario revisarla exhaustivamente antes de probarla ya que se prueba el(los) test correspondiente(s) y si estos test estan bien diseñados y abarcan todas las posibilidades, entonces la ejecucion deberia dar correctamente. Esto a la larga, alivia la energia, tiempo y estres en revisar el codigo.

+ Obliga a entender el dominio con el que se trabaja. En este caso, es un juego de bowling, pero al ser una metodologia de programacion, se puede aplicar a cualquier dominio. Es imposible definir un test de calidad sin saber que es lo que se desea, y para saber lo que se desea, se debe saber como funciona el dominio.

+ Da la posibilidad a cuantificar el software. Pensar en todos los test que debe cumplir un modulo antes de codificarlo, permite saber el avance del mismo, por ejemplo, que una funcionalidad tenga que cumplir 10 test, y se lleven 4 de los 10 test codificados y que cumplan con el mismo significa que se lleva un 40% del modulo codificado.

+ Nos dio la capacidad de trabajar de manera colaborativa y revisando todos los cambios de nuestro compañero antes de hacer cualquier commit, ademas el hecho de la historia nos permite volver rapidamente a una version antigua. En nuestro caso utilizamos el IDE Eclipse y logramos sincronizar con nuestro repositorio de github, permitiendonos trabajar al mismo tiempo pero en distintas clases, esto ayudo al trabajo colaborativo.
