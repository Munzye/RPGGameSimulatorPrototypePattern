# RPGGameSimulatorPrototypePattern
En esta solución se implementa el patrón Prototype para optimizar la creación de personajes en un sistema RPG. En lugar de crear repetidamente objetos mediante constructores o mediante una fábrica, se registran personajes base en una clase PrototypeRegistry. Cada vez que se necesita un nuevo personaje, el sistema clona el prototipo correspondiente y modifica únicamente los atributos necesarios.

La interfaz Prototype declara el método clone(), mientras que las clases Guerrero, Mago y Arquero implementan la clonación concreta. Además, se utiliza un constructor de copia para garantizar una clonación profunda, especialmente en el atributo Inventario, evitando que el clon y el prototipo compartan la misma lista de objetos internos.
