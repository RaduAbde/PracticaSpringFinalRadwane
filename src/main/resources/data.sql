-- Tabla estrategia --
INSERT INTO estrategia (neumaticos, combustible) VALUES ('Blandos', 5.75);
INSERT INTO estrategia (neumaticos, combustible) VALUES ('Lluvia', 5.75);
INSERT INTO estrategia (neumaticos, combustible) VALUES ('Duros', 5.75);
INSERT INTO estrategia (neumaticos, combustible) VALUES ('Blandos', 3.25);
INSERT INTO estrategia (neumaticos, combustible) VALUES ('Lluvia', 3.25);
INSERT INTO estrategia (neumaticos, combustible) VALUES ('Duros', 3.25);
INSERT INTO estrategia (neumaticos, combustible) VALUES ('Blandos', 10.00);
INSERT INTO estrategia (neumaticos, combustible) VALUES ('Lluvia', 10.00);
INSERT INTO estrategia (neumaticos, combustible) VALUES ('Duros', 10.00);

-- Tabla coche --
INSERT INTO coche (matricula, marca, modelo, potencia) VALUES ('S048830', 'Porsche', '918 Spyder', 887);
INSERT INTO coche (matricula, marca, modelo, potencia) VALUES ('P100V', 'McLaren', 'P1', 916);
INSERT INTO coche (matricula, marca, modelo, potencia) VALUES ('FLAF350', 'Ferrari', 'LaFerrari', 963);
INSERT INTO coche (matricula, marca, modelo, potencia) VALUES ('BGEB351', 'Bugatti', 'EB110 SS', 611);
INSERT INTO coche (matricula, marca, modelo, potencia) VALUES ('PAGHU388', 'Pagani', 'Huayara BC', 790);
INSERT INTO coche (matricula, marca, modelo, potencia) VALUES ('MCLF391', 'McLaren', 'F1', 636);
INSERT INTO coche (matricula, marca, modelo, potencia) VALUES ('KOENCR395', 'Koenigsegg', 'CCR', 816);
INSERT INTO coche (matricula, marca, modelo, potencia) VALUES ('SALLS739', 'Saleen', 'S7 Twin Turbo', 760);
INSERT INTO coche (matricula, marca, modelo, potencia) VALUES ('MCTAIL403', 'McLaren', 'Speedtail', 1050);
INSERT INTO coche (matricula, marca, modelo, potencia) VALUES ('BUGVEY40', 'Bugatti', 'Veyron', 1000);

-- Tabla equipo --
INSERT INTO equipo (nombre, presupuesto, estrategia_id, competicion) VALUES ('Hot Wheels', 1000000, 2, 'Mario Kart Grand Prix');
INSERT INTO equipo (nombre, presupuesto, estrategia_id, competicion) VALUES ('Toretos Family', 5000000, 1, 'The 1% Club');
INSERT INTO equipo (nombre, presupuesto, estrategia_id) VALUES ('The Crew', 1450000, 3);
INSERT INTO equipo (nombre, presupuesto, estrategia_id, competicion) VALUES ('Midnight CLub', 750000, 4, 'Crash Tag Team Racing Cup');
INSERT INTO equipo (nombre, presupuesto, estrategia_id) VALUES ('Drivers', 1350000, 1);
INSERT INTO equipo (nombre, presupuesto, estrategia_id, competicion) VALUES ('Need For Speed', 1800000, 7, 'Wreck Fest');
INSERT INTO equipo (nombre, presupuesto, estrategia_id, competicion) VALUES ('Speed Hunters', 3000000, 8, 'The 1% Club');
INSERT INTO equipo (nombre, presupuesto, estrategia_id, competicion) VALUES ('Riders On The Storm', 500000, 2, 'Crash Tag Team Racing Cup');
INSERT INTO equipo (nombre, presupuesto, estrategia_id, competicion) VALUES ('619 Customs', 1250000, 4, 'Mario Kart Grand Prix');
INSERT INTO equipo (nombre, presupuesto, estrategia_id, competicion) VALUES ('Los Big Playas', 1750000, 6, 'Wreck Fest');
INSERT INTO equipo (nombre, presupuesto, estrategia_id, competicion) VALUES ('By Invitation Only', 2000000, 8, 'Mario Kart Grand Prix');
INSERT INTO equipo (nombre, presupuesto, estrategia_id, competicion) VALUES ('Tuners', 1500000, 5, 'The 1% Club');

-- Tabla piloto --
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('X5230958E', 'Joan Romero', 31, 'Agresivo', 1, 'P100V');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Z7696765G', 'Antonio Ortiz', 32, 'Normal', 1, 'FLAF350');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Z4536953R', 'Alberto Fernandez', 19, 'Agresivo', 2, 'KOENCR395');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('X4150001L', 'Ricardo Vidal', 23, 'Drifter', 2, 'MCLF391');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Z5871668A', 'Jaime Vidal', 28, 'Normal', 3, 'SALLS739');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('X2465826L', 'Mariano Caballero', 27, 'Drifter', 3, 'S048830');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Y7297137X', 'Felipe Navarro', 35, 'Agresivo', 4, 'BGEB351');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Z9427426F', 'Adrian Lopez', 26, 'Drifter', 4, 'PAGHU388');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('X2199306T', 'Lucas Vidal', 22, 'Normal', 5, 'BUGVEY40');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('X8559283V', 'Francisco Vicente', 28, 'Drifter', 5, 'BGEB351');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Y5362619E', 'Rafael Ruiz', 35, 'Rammer', 6, 'KOENCR395');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('X3973437A', 'Jose Herrero', 28, 'Normal', 6, 'FLAF350');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('X3542113K', 'Juan Antonio Herrera', 27, 'Drifter', 7, 'MCLF391');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('X4976158Q', 'Ismael Santos', 26, 'Rammer', 7, 'P100V');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Y4465383Q', 'Andres Esteban', 22, 'Agresivo', 8, 'PAGHU388');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Z0700846H', 'Martin Martin', 33, 'Drifter', 8, 'S048830');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Z3029468M', 'Emilio Herrero', 22, 'Rammer', 9, 'BGEB351');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Z7331935T', 'Sergio Carrasco', 26, 'Rammer', 9, 'BUGVEY40');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Z6837756E', 'Ivan Sanz', 19, 'Drifter', 10, 'FLAF350');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Y2088114G', 'Javier Ramirez', 23, 'Rammer', 10, 'MCTAIL403');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Y0172950G', 'Manuel Nieto', 25, 'Agresivo', 11, 'P100V');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Y0676455Q', 'Juan Manuel Gallego', 23, 'Agresivo', 11, 'MCTAIL403');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Z6986349N', 'Jose Miguel Aguilar', 21, 'Drifter', 12, 'SALLS739');
INSERT INTO piloto (dni, nombre, edad, estilo, equipo_id, coche_matricula) VALUES ('Z5097314J', 'Domingo Rodriguez', 24, 'Agresivo', 12, 'S048830');