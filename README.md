# c4-EX02 API Clinica dental

1.    Introducción
En el presente proyecto del Bootcamp Full Stack correspondiente a la parte Spring Framework se espera que el alumno demuestre todos los conocimientos adquiridos en desarrollo de APIs. 

2.    Descripción 
Desde el departamento de producto nos piden crear el backend correspondiente al sistema de gestión de citas para una Clínica Dental.

Para ello el cliente deberá ser capaz de registrarse en la aplicación, hacer login & logout y acceder a su área de cliente, todo ello visualmente desde el navegador.(*** en este punto el registro y login no son necesarios) En su área de cliente deberá poder ver una lista de las citas que tiene a futuro, crear citas, modificarlas y anularlas.

También existirá una zona de usuario con sus datos personales, que solo podrá ver él mismo. Además, los dentistas deberán poder registrarse como profesionales, hacer login y logout y ver todas las citas y clientes registrados.

Teniendo en cuenta los requisitos, llegamos a la conclusión de que este sería el mínimo de endpoints convenientes:

Perfil de usuario
Modificación de datos del perfil
Creación de citas
Modificación de citas
Anulación de citas
Ver todas las citas que tengo como cliente (solo las propias)
Ver todas las citas existentes (como dentista)
Ver todos los clientes registrados (como dentista)

# Endpoints

## Cliente

### GET

/api/clientes --> Muestra toda la info de todos los clientes

/api/clientes/{clienteDni} --> Muestra toda la info del cliente en cuestión, según el DNI pasado por parámetro

/api/clientes/{clienteDni}/visitas --> Muestra las visitas de un determinado cliente

### POST

/api/clientes --> Añade un nuevo cliente

### PUT

/api/clientes/{clienteDni} --> Modifica datos de un determinado cliente

### DELETE

/api/clientes/{clienteDni} --> Elimina un determinado cliente


## Dentista

### GET

/api/dentistas --> Muestra toda la info de todos los dentistas

/api/dentistas/{dentistaDni} --> Muestra toda la info del dentista en cuestión, según el DNI pasado por parámetro

/api/dentistas/{dentistaDni}/visitas --> Muestra las visitas de un determinado dentista

### POST

/api/dentistas --> Añade un nuevo dentista

### PUT

/api/dentistas/{dentistaDni} --> Modifica datos de un determinado dentista

### DELETE

/api/dentista/{dentistaDni} --> Elimina un determinado dentista


## Visita

### GET

/api/visitas --> Muestra toda la info de todas las visitas

/api/visitas/{id} --> Muestra toda la info de la visita en cuestión, según el ID pasado por parámetro

### POST

/api/visitas --> Añade una nueva visita

### PUT

/api/visitas/{id} --> Modifica datos de una determinada visita

### DELETE

/api/visitas/{id} --> Elimina una determinada visita
