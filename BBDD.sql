/* Necesito la base de datos sobre la que haces el examen, pero bueno toma,
es una referencia de hacer lo que te piden pero con tablas imaginarias, es lo mismo,
solo tienes que cambiar las tablas a las que hace referencia el codigo */

/* EJERCICIO 1 */

  DELETE FROM Actors
  WHERE name LIKE 'A%';

/* EJERCICIO 2 */

  -- Función para obtener la categoría de una película dado su ID
  CREATE FUNCTION GetMovieCategory(movie_id INT) RETURNS VARCHAR(255)
  BEGIN
      DECLARE category VARCHAR(255);
      SELECT category INTO category FROM Movies WHERE id = movie_id;
      RETURN category;
  END;
  
  -- Función para convertir minutos a formato TIME
  CREATE FUNCTION MinutesToTime(minutes INT) RETURNS TIME
  BEGIN
      RETURN ADDTIME('00:00:00', SEC_TO_TIME(minutes * 60));
  END;
  
  -- Vista para mostrar el nombre de las películas, su duración en formato TIME y la categoría en mayúscula
  CREATE VIEW MovieDetails AS
  SELECT
      title AS 'Nombre de la Película',
      MinutesToTime(duration) AS 'Duración',
      UPPER(GetMovieCategory(movie_id)) AS 'Categoría'
  FROM Movies;

/* EJERCICIO 3 */

  ALTER TABLE Inventory
  ADD COLUMN available BOOLEAN;
  
  /* Luego, actualizaremos la disponibilidad de las películas y sus fechas de last_update según la duración de la película. */
  UPDATE Inventory
  SET available = CASE
      WHEN (SELECT duration FROM Movies WHERE id = Inventory.movie_id) > 120 THEN FALSE
      ELSE TRUE
  END,
  last_update = CASE
      WHEN (SELECT duration FROM Movies WHERE id = Inventory.movie_id) > 120 THEN CURDATE()
      ELSE last_update
  END;
