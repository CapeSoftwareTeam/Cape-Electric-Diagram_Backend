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
			INSERT INTO DIAGRAM_SYMBOL VALUES (2, '../../assets/img/Breaker.png', 'Breaker');
			INSERT INTO DIAGRAM_SYMBOL VALUES (3, '../../assets/img/Breaker1.png', 'Breaker1');
			INSERT INTO DIAGRAM_SYMBOL VALUES (4, '../../assets/img/Distribution board.png', 'Distribution board');
			INSERT INTO DIAGRAM_SYMBOL VALUES (5, '../../assets/img/Generator.png', 'Generator');
			INSERT INTO DIAGRAM_SYMBOL VALUES (6, '../../assets/img/Light.png', 'Light');
			INSERT INTO DIAGRAM_SYMBOL VALUES (7, '../../assets/img/MCB.png', 'MCB');
			INSERT INTO DIAGRAM_SYMBOL VALUES (8, '../../assets/img/MCB_with_RCD.png', 'MCB_with_RCD');
			INSERT INTO DIAGRAM_SYMBOL VALUES (9, '../../assets/img/MCCB.png', 'MCCB');
			INSERT INTO DIAGRAM_SYMBOL VALUES (10, '../../assets/img/Motor.png', 'Motor');
			INSERT INTO DIAGRAM_SYMBOL VALUES (11, '../../assets/img/Transformer_delta_delta.png', 'Transformer_delta_delta');
			INSERT INTO DIAGRAM_SYMBOL VALUES (12, '../../assets/img/Transformer_delta_star.png', 'Transformer_delta_star');
			INSERT INTO DIAGRAM_SYMBOL VALUES (13, '../../assets/img/Transformer_star_delta.png', 'Transformer_star_delta');
			INSERT INTO DIAGRAM_SYMBOL VALUES (14, '../../assets/img/Transformer_star_star.png', 'Transformer_star_star');
			INSERT INTO DIAGRAM_SYMBOL VALUES (15, '../../assets/img/Wire.png', 'Wire');
			INSERT INTO DIAGRAM_SYMBOL VALUES (16, '../../assets/img/Capacitor.png', 'Capacitor');
			INSERT INTO DIAGRAM_SYMBOL VALUES (17, '../../assets/img/Inductor.png', 'Inductor');
			INSERT INTO DIAGRAM_SYMBOL VALUES (18, '../../assets/img/Diode.png', 'Diode');
			INSERT INTO DIAGRAM_SYMBOL VALUES (19, '../../assets/img/Resistor.png', 'Resistor');
			INSERT INTO DIAGRAM_SYMBOL VALUES (20, '../../assets/img/Ground1.png', 'Ground1');
			
			
			