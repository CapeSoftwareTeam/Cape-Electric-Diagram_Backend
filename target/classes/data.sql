CREATE DATABASE lv_safety_verification;
use lv_safety_verification;


-----------> Diagram <----------

			CREATE TABLE DIAGRAM_COMPONENT(
			DIAGRAM_ID INT AUTO_INCREMENT,
			USER_NAME VARCHAR(255),
			FILE_NAME VARCHAR(255),
			FILE longtext,
			CREATED_BY VARCHAR(255),
			CREATED_DATE DATETIME,
			UPDATED_BY VARCHAR(255),
			UPDATED_DATE DATETIME,
			CONSTRAINT PK_DIAGRAM_ID PRIMARY KEY(DIAGRAM_ID)
			)
            
            CREATE TABLE DIAGRAM_SYMBOL(
			ID INT AUTO_INCREMENT,
			IMAGE_SOURCE VARCHAR(200),
			IMAGE_NAME VARCHAR(200),
			CONSTRAINT PK_ID PRIMARY KEY(ID)	
			)
			
			INSERT INTO DIAGRAM_SYMBOL VALUES (1, '../../assets/img/Generator.png', 'Generator');
			INSERT INTO DIAGRAM_SYMBOL VALUES (2, '../../assets/img/Delta.png', 'Delta');
			INSERT INTO DIAGRAM_SYMBOL VALUES (3, '../../assets/img/AC current source.png', 'AC current source');
			INSERT INTO DIAGRAM_SYMBOL VALUES (4, '../../assets/img/Switch.png', 'Switch');
			INSERT INTO DIAGRAM_SYMBOL VALUES (5, '../../assets/img/Fuse.png', 'Fuse');
			INSERT INTO DIAGRAM_SYMBOL VALUES (6, '../../assets/img/Low Voltage.png', 'Low Voltage');
			INSERT INTO DIAGRAM_SYMBOL VALUES (7, '../../assets/img/Medium Voltage.png', 'Medium Voltage');
			INSERT INTO DIAGRAM_SYMBOL VALUES (8, '../../assets/img/Motor.png', 'Motor');
			INSERT INTO DIAGRAM_SYMBOL VALUES (9, '../../assets/img/Current Transformer.png', 'Current Transformer');
			INSERT INTO DIAGRAM_SYMBOL VALUES (10, '../../assets/img/Potential Transformer.png', 'Potential Transformer');
			INSERT INTO DIAGRAM_SYMBOL VALUES (11, '../../assets/img/Circuit Breaker.png', 'Circuit Breaker');
			INSERT INTO DIAGRAM_SYMBOL VALUES (12, '../../assets/img/Ground.png', 'Ground');
			INSERT INTO DIAGRAM_SYMBOL VALUES (13, '../../assets/img/Diode.png', 'Diode');
			INSERT INTO DIAGRAM_SYMBOL VALUES (14, '../../assets/img/Inductor.png', 'Inductor');
			INSERT INTO DIAGRAM_SYMBOL VALUES (15, '../../assets/img/Resistor.png', 'Resistor');
			INSERT INTO DIAGRAM_SYMBOL VALUES (16, '../../assets/img/Capacitor.png', 'Capacitor');
			INSERT INTO DIAGRAM_SYMBOL VALUES (17, '../../assets/img/DC.png', 'DC');
			INSERT INTO DIAGRAM_SYMBOL VALUES (18, '../../assets/img/Electric Lamp.png', 'Electric Lamp');
			INSERT INTO DIAGRAM_SYMBOL VALUES (19, '../../assets/img/Wattmeter.png', 'Wattmeter');
			INSERT INTO DIAGRAM_SYMBOL VALUES (20, '../../assets/img/Wire.png', 'Wire');
			INSERT INTO DIAGRAM_SYMBOL VALUES (21, '../../assets/img/Ammeter.png', 'Ammeter');
			INSERT INTO DIAGRAM_SYMBOL VALUES (22, '../../assets/img/Voltmeter.png', 'Voltmeter');
			INSERT INTO DIAGRAM_SYMBOL VALUES (23, '../../assets/img/cell.png', 'cell');
			INSERT INTO DIAGRAM_SYMBOL VALUES (24, '../../assets/img/Battery.png', 'Battery');
			