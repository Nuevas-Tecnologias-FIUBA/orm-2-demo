# Demo ORM 2
## El proyecto contiene:
* Integración con MySQL (ver build.gradle y application.yml)
* Ejemplo de API REST (ver clase Student, @Resource)
* Ejemplo para resolver problema de N + 1 (ver clase Teacher, students fetch: 'join')
* Uso de transacciones (ver index2 en TeacherController y GrailsappService, dos formas de hacer lo mismo)

## Otros temas vistos:
### ddl-auto
* create: dropea las tablas y las crea cuando inicia la aplicación
* create-drop: idem anterior + dropea las tablas cuando termina la aplicación
* update: modifica la base para que coincida con las clases de dominio (no hace drop)
* validate: valida que la base coincida con las clases de dominio, en caso contrario la aplicación da un error al iniciar
Desde application.yml pueden cambiar esta configuración

### Diferencia entre Lazy e Eager loading
* Lazy: Por default las relaciones 1 a N son lazy, se cargan cuando son necesarias, hasta ese momento el atributo es un proxy en la clase que tiene la relación.
* Eager: Por default las relaciones N a 1 son eager, se cargan cuando se carga la clase que tiene la relación. Que una relación sea eager no evita el problema de N + 1 en listas, para eso es necesario usar fetch join (ver más arriba)

### Diferencia entre optimistic y pessimistic locking
* Optimistic: no lockea lecturas ni escrituras, maneja una atributo "versión" para saber si al escribir se está tomando como base la versión del objeto más reciente. Ejemplo: dos usuarios toman la versión 2 de un objeto, el primero escribe en la base y se graba con versión 3, el segundo va a tener un error ya que va a intentar escribir teniendo versión 2 cuando en la base ya está la versión 3.
* Pessimistic: al tomar un objeto para escribir, genera un lockeo del objeto y ningún otro usuario lo puede usar al mismo tiempo. 
Hay variantes de ambos tipos.

