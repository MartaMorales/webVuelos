drop database if exists wiku_airlines;
create database wiku_airlines;
use wiku_airlines;

create table if not exists continente (
id int auto_increment not null primary key,
nombre varchar (140)
);

create table if not exists pais (
id int auto_increment not null primary key,
id_continente int,
nombre varchar (140),
acronimo varchar (10),
FOREIGN KEY (id_continente) REFERENCES continente(id)
);

create table if not exists ciudad (
id int auto_increment not null primary key,
id_pais int,
nombre varchar (140),
acronimo varchar (10),
FOREIGN KEY (id_pais) REFERENCES pais(id)
);

create table if not exists  cliente(
id int not null auto_increment primary key , -- el autoincrement incrementa automaticamente en 1
nombre  varchar  (20)not null, -- not null se pone siempre despues del tipo
apellido1 varchar (20),
apellido2 varchar (20),
dni  varchar (9)not null,
fecha_nacimiento date,
telefono int,
direccion varchar (140),
id_ciudad int, -- son enteros porque van a estar relacionados con el id de la ciudad y el pais
id_pais int,
codigo_postal int,
unique key unique_key_dni (dni), -- de esta forma no se pueden meter dos dni iguales y se crea un indice de forma que si se busca por dni va a ser mas rapido
FOREIGN KEY (id_ciudad) REFERENCES ciudad(id),
FOREIGN KEY (id_pais) REFERENCES  pais(id)
);

create table if not exists reserva(
id int auto_increment not null primary key,
id_cliente int,
FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);

create table if not exists avion(
id int auto_increment not null primary key,
asientos int,
modelo varchar(140),
matricula varchar(140)
);

create table if not exists aeropuerto(
id int auto_increment not null primary key,
id_ciudad int,
nombre varchar (140),
FOREIGN KEY (id_ciudad) REFERENCES ciudad(id)	
);

create table if not exists vuelo( 
id int auto_increment not null primary key,
id_aeropuerto_salida int,
id_aeropuerto_llegada int,
hora_salida timestamp,
hora_llegada timestamp,
id_avion int,
FOREIGN KEY (id_aeropuerto_salida) REFERENCES aeropuerto(id),
FOREIGN KEY (id_aeropuerto_llegada) REFERENCES aeropuerto(id),
FOREIGN KEY (id_avion) REFERENCES avion(id)
);

create table if not exists oferta( 
id int auto_increment not null primary key,
id_vuelo int,
descripcion varchar(240),
precio double (8,2),
img_url varchar(200),
FOREIGN KEY (id_vuelo) REFERENCES vuelo(id)
);

create table if not exists reserva_vuelo(
id int auto_increment not null primary key,
id_reserva int,
id_vuelo int,
FOREIGN KEY (id_reserva) REFERENCES reserva(id),
FOREIGN KEY (id_vuelo) REFERENCES vuelo(id)
);

create table if not exists pasajero(
id int auto_increment not null primary key,
dni varchar (9),
nombre varchar (20),
apellido1 varchar (20),
apellido2 varchar (20)
);

create table if not exists pasajero_reserva(
id int auto_increment not null primary key,
id_pasajero int,
id_reserva int,
FOREIGN KEY (id_pasajero) REFERENCES pasajero(id),
FOREIGN KEY (id_reserva) REFERENCES reserva(id)
);

create table if not exists asiento(
id int auto_increment not null primary key,
numero varchar(4),
id_avion int,
FOREIGN KEY (id_avion) REFERENCES avion(id)
);

create table if not exists pasajero_asiento(
id int auto_increment not null primary key,
id_pasajero int, 
id_asiento int,
FOREIGN KEY (id_pasajero) REFERENCES pasajero(id),
FOREIGN KEY (id_asiento) REFERENCES asiento(id)
);

create table if not exists tarjeta_de_credito(
id int auto_increment not null primary key,
numero_tarjeta int,
fecha_caducidad date,
id_cliente int,
cvv int (3),
tipo varchar (20),
FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);


