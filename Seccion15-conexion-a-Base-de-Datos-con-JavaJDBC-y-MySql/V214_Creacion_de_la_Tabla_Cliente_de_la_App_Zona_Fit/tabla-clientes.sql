CREATE TABLE `zona_fit_db`.`clientes` (
  -- Creamos una nueva tabla llamada "clientes" dentro de la base de datos "zona_fit_db"
  `id` INT NOT NULL AUTO_INCREMENT,
  -- Column "id": Un número entero único para cada cliente, se incrementa automáticamente.
  -- NOT NULL: Este campo no puede estar vacío.
  -- AUTO_INCREMENT: El valor de "id" se incrementa automáticamente cada vez que se 
  --inserta un nuevo registro.

  `nombre` VARCHAR(45) NULL,
  -- Column "nombre": Un texto de máximo 45 caracteres para el nombre del cliente.
  -- NULL: Este campo puede estar vacío.

  `apellido` VARCHAR(45) NULL,
  -- Column "apellido": Un texto de máximo 45 caracteres para el apellido del cliente.
  -- NULL: Este campo puede estar vacío.

  `membresia` INT NULL,
  -- Column "membresia": Un número entero que representa el tipo de membresía del cliente.
  -- NULL: Este campo puede estar vacío.

  PRIMARY KEY (`id`),
  -- Establecemos la columna "id" como clave primaria. Esto significa que cada valor en "id" debe ser único
  -- y no puede ser nulo.

  UNIQUE INDEX `membresia_UNIQUE` (`membresia` ASC) VISIBLE);
  -- Creamos un índice único en la columna "membresia". Esto garantiza que cada valor en "membresia"
  -- también sea único.
  -- ASC: Indica que el índice se ordenará en orden ascendente.
  -- VISIBLE: El índice será visible para el optimizador de consultas.