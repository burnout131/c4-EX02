DROP TABLE IF EXISTS visitas;
DROP TABLE IF EXISTS dentistas;
DROP TABLE IF EXISTS clientes;

CREATE TABLE clientes(
	dni VARCHAR(9) UNIQUE NOT NULL,
	nombre_apellidos VARCHAR(255) DEFAULT NULL,
	telefono INT DEFAULT NULL,
	email VARCHAR(255) NOT NULL,
	PRIMARY KEY (dni)
);

CREATE TABLE dentistas(
	dni VARCHAR(9) UNIQUE NOT NULL,
	nombre_apellidos VARCHAR(255) DEFAULT NULL,
	telefono INT DEFAULT NULL,
	email VARCHAR(100) NOT NULL,
	especialidad VARCHAR(100) DEFAULT NULL,
	PRIMARY KEY(dni)
);

CREATE TABLE visitas(
	id INT NOT NULL AUTO_INCREMENT,
	dni_cliente VARCHAR(9) NOT NULL,
	dni_dentista VARCHAR(9) NOT NULL,
	descripcion VARCHAR(255) DEFAULT NULL,
	fecha_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
	precio DECIMAL(6,2) DEFAULT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (dni_cliente) REFERENCES clientes(dni) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (dni_dentista) REFERENCES dentistas(dni) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO clientes(dni, nombre_apellidos, telefono, email) VALUES ('39123456F', 'Ned Flanders', 91123456, 'nflanders@gmail.com');
INSERT INTO clientes(dni, nombre_apellidos, telefono, email) VALUES ('03789123R', 'Daenerys Targaryen Parera', 949125689, 'dracarys@outlook.com');
INSERT INTO clientes(dni, nombre_apellidos, telefono, email) VALUES ('33333333H', 'Fernando Alonso Diaz', 984123321, 'comoque33@f1.com');

INSERT INTO dentistas(dni, nombre_apellidos, telefono, email, especialidad) VALUES ('02123456W', 'Doctor Garcia Vaquero', 977000000, 'dgarcia@gmail.com', 'Periodoncia');
INSERT INTO dentistas(dni, nombre_apellidos, telefono, email, especialidad) VALUES ('77101010Y', 'Doctor Valentino Rossi', 955987654, 'vrossi@outlook.com', 'Ortodoncia');
INSERT INTO dentistas(dni, nombre_apellidos, telefono, email, especialidad) VALUES ('99999999B', 'Doctora Meridith Grey', 91789987, 'mgrey@hotmail.com', 'Maxilofacial');

INSERT INTO visitas(dni_cliente, dni_dentista, descripcion, fecha_hora, precio) VALUES ('39123456F', '02123456W', 'Limpieza periodica', '2022-04-01 17:00:00', 80.00);
INSERT INTO visitas(dni_cliente, dni_dentista, descripcion, fecha_hora, precio) VALUES ('03789123R', '77101010Y', 'Colocacion brackets', '2023-05-01 10:00:00', 399.99);
INSERT INTO visitas(dni_cliente, dni_dentista, descripcion, fecha_hora, precio) VALUES ('33333333H', '99999999B', 'Extraccion muela juicio', '2023-05-31 12:00:00', 200.00);