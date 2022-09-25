INSERT INTO paciente(nombre, apellido,edad) VALUES('miguel' , 'guevara', '26');

INSERT INTO administrador( usuario, contrasenia,paciente_id) VALUES( 'admin@gmail.com', '123',1);

INSERT INTO doctor(nombre, apellido,especialidad) VALUES('Jacqueline','Abad Nuñez', 'cirugia');
INSERT INTO doctor(nombre, apellido,especialidad) VALUES('Segundo Carlos','Abanto Argomedo', 'cirugia');
INSERT INTO doctor(nombre, apellido,especialidad) VALUES('Marcela','Abarca Benavente', 'cirugia');
INSERT INTO doctor(nombre, apellido,especialidad) VALUES('Arturo','Aguilar Maldonado', 'cirugia');
INSERT INTO doctor(nombre, apellido,especialidad) VALUES('Sergio Ricardo','Aguilar Romero', 'cirugia');
INSERT INTO doctor(nombre, apellido,especialidad) VALUES('Carlos Roberto','Aguirre Masson', 'cirugia');
INSERT INTO doctor(nombre, apellido,especialidad) VALUES('Cesar Anibal','Alarcon Olivera', 'cirugia');
INSERT INTO doctor(nombre, apellido,especialidad) VALUES('Jose Samuel','Alarcon Vera', 'cirugia');

INSERT INTO especialidad(nombre) VALUES('oncologia');
INSERT INTO especialidad(nombre) VALUES('gastroenterologia');
INSERT INTO especialidad(nombre) VALUES('ginecologia');
INSERT INTO especialidad(nombre) VALUES('pediatria');
INSERT INTO especialidad(nombre) VALUES('oftalmologia');
INSERT INTO especialidad(nombre) VALUES('traumatologia');
INSERT INTO especialidad(nombre) VALUES('otorrinolaringologia');
INSERT INTO especialidad(nombre) VALUES('odontologia');
INSERT INTO especialidad(nombre) VALUES('dermatologia');
INSERT INTO especialidad(nombre) VALUES('medicina interna');

INSERT INTO cita(doctor_id, paciente_id, especialidad_id,fechacita,hora) VALUES(1,1,2,'2022-05-30','15:30');
INSERT INTO cita(doctor_id, paciente_id, especialidad_id,fechacita,hora) VALUES(1,1,2,'2022-06-16','15:30');