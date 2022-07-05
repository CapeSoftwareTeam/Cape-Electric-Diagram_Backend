CREATE DATABASE lv_safety_verification;
use lv_safety_verification;


-----------> Diagram <----------

			CREATE TABLE diagram_component(
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
			
-----------> Diagram Symbols <----------
			
            
            CREATE TABLE diagram_symbol(
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
			INSERT INTO DIAGRAM_SYMBOL VALUES (10, '../../assets/img/motor.png', 'Motor');
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
			INSERT INTO DIAGRAM_SYMBOL VALUES (21, '../../assets/img/PortableAppliance.png', 'PortableAppliance');
			INSERT INTO DIAGRAM_SYMBOL VALUES (22, '../../assets/img/Fan.png', 'Fan');

			
			
-----------> MCB <----------

CREATE TABLE mcb(
			MCB_ID INT AUTO_INCREMENT,
			NODE_ID VARCHAR(200),
			FILE_NAME VARCHAR(200),
			USER_NAME VARCHAR(200),
			REFERENCE_NAME VARCHAR(200),
			MANUFACTURER_NAME VARCHAR(200),
			RATING INTEGER,
			VOLTAGE INTEGER,
			NO_OF_POLES VARCHAR(200),
			CURRENT_CURVE VARCHAR(200),
			OUTGOING_SIZE_PHASE INTEGER,
			OUTGOING_SIZE_NEUTRAL INTEGER,
			OUTGOING_SIZE_PROTECTIVE INTEGER,
			CREATED_BY VARCHAR(200),
			CREATED_DATE DATETIME,
			UPDATED_BY VARCHAR(200),
			UPDATED_DATE DATETIME,		
			CONSTRAINT PK_MCB_ID PRIMARY KEY(MCB_ID)	
			);
			

CREATE TABLE general_testing_mcb(
			GENERAL_TESTING_MCB_ID INT AUTO_INCREMENT,
			MCB_ID INTEGER,
			RN VARCHAR(200),
			YN VARCHAR(200),
			BN VARCHAR(200),
			RE VARCHAR(200),
			YE VARCHAR(200),
			BE VARCHAR(200),
			RY VARCHAR(200),
			YB VARCHAR(200),
			BR VARCHAR(200),
			NE VARCHAR(200),
			IR_CURRENT VARCHAR(200),
			IY_CURRENT VARCHAR(200),
			IB_CURRENT VARCHAR(200),
			IN_CURRENT VARCHAR(200),
			IPE_CURRENT VARCHAR(200),
			POWER_FACTOR VARCHAR(200),
			FREQUENCY VARCHAR(200),
			CONSTRAINT PK_GENERAL_TESTING_MCB_ID PRIMARY KEY(GENERAL_TESTING_MCB_ID),
			CONSTRAINT FK_GENERAL_TESTING_MCB_ID FOREIGN KEY(MCB_ID) REFERENCES mcb(MCB_ID) ON DELETE CASCADE
			);
			
CREATE TABLE safety_testing_mcb(
			SAFETY_TESTING_MCB_ID INT AUTO_INCREMENT,
			MCB_ID INTEGER,
			RN VARCHAR(200),
			YN VARCHAR(200),
			BN VARCHAR(200),
			RE VARCHAR(200),
			YE VARCHAR(200),
			BE VARCHAR(200),
			RY VARCHAR(200),
			YB VARCHAR(200),
			BR VARCHAR(200),
			SHOCK_VOLTAGE VARCHAR(200),
			FLOOR_RESISTANCE VARCHAR(200),
			WALL_RESISTANCE VARCHAR(200),
			CONSTRAINT PK_SAFETY_TESTING_MCB_ID PRIMARY KEY(SAFETY_TESTING_MCB_ID),
			CONSTRAINT FK_SAFETY_TESTING_MCB_ID FOREIGN KEY(MCB_ID) REFERENCES mcb(MCB_ID) ON DELETE CASCADE
			);
			
			
-----------> MCCB <----------

CREATE TABLE mccb(
			MCCB_ID INT AUTO_INCREMENT,
			NODE_ID VARCHAR(200),
			FILE_NAME VARCHAR(200),
			USER_NAME VARCHAR(200),
			REFERENCE_NAME VARCHAR(200),
			MANUFACTURER_NAME VARCHAR(200),
			RATING INTEGER,
			VOLTAGE INTEGER,
			NO_OF_POLES VARCHAR(200),
			RELAY_MANUFACTURERS VARCHAR(200),
            MODEL VARCHAR(200),
            CURRENT_SETTING INTEGER,
            OVERCURRENT VARCHAR(200),
            SET_TIMES VARCHAR(200),
            EARTH_FAULT VARCHAR(200),
            SET_TIME VARCHAR(200),
            OUTGOING_SIZE_PHASE INTEGER,
			OUTGOING_SIZE_NEUTRAL INTEGER,
			OUTGOING_SIZE_PROTECTIVE INTEGER,
			OUTGOING_CABLE INTEGER,
			CREATED_BY VARCHAR(200),
			CREATED_DATE DATETIME,
			UPDATED_BY VARCHAR(200),
			UPDATED_DATE DATETIME,		
			CONSTRAINT PK_MCCB_ID PRIMARY KEY(MCCB_ID)	
			);
			

CREATE TABLE general_testing_mccb(
			GENERAL_TESTING_MCCB_ID INT AUTO_INCREMENT,
			MCCB_ID INTEGER,
			RN VARCHAR(200),
			YN VARCHAR(200),
			BN VARCHAR(200),
			RE VARCHAR(200),
			YE VARCHAR(200),
			BE VARCHAR(200),
			RY VARCHAR(200),
			YB VARCHAR(200),
			BR VARCHAR(200),
			NE VARCHAR(200),
			IR_CURRENT VARCHAR(200),
			IY_CURRENT VARCHAR(200),
			IB_CURRENT VARCHAR(200),
			IN_CURRENT VARCHAR(200),
			IPE_CURRENT VARCHAR(200),
			POWER_FACTOR VARCHAR(200),
			FREQUENCY VARCHAR(200),
			CONSTRAINT PK_GENERAL_TESTING_MCCB_ID PRIMARY KEY(GENERAL_TESTING_MCCB_ID),
			CONSTRAINT FK_GENERAL_TESTING_MCCB_ID FOREIGN KEY(MCCB_ID) REFERENCES mccb(MCCB_ID) ON DELETE CASCADE
			);
			
CREATE TABLE safety_testing_mccb(
			SAFETY_TESTING_MCCB_ID INT AUTO_INCREMENT,
			MCCB_ID INTEGER,
			RN VARCHAR(200),
			YN VARCHAR(200),
			BN VARCHAR(200),
			RE VARCHAR(200),
			YE VARCHAR(200),
			BE VARCHAR(200),
			RY VARCHAR(200),
			YB VARCHAR(200),
			BR VARCHAR(200),
			SHOCK_VOLTAGE VARCHAR(200),
			FLOOR_RESISTANCE VARCHAR(200),
			WALL_RESISTANCE VARCHAR(200),
			CONSTRAINT PK_SAFETY_TESTING_MCCB_ID PRIMARY KEY(SAFETY_TESTING_MCCB_ID),
			CONSTRAINT FK_SAFETY_TESTING_MCCB_ID FOREIGN KEY(MCCB_ID) REFERENCES mccb(MCCB_ID) ON DELETE CASCADE
			);
			

-----------> RCBO <----------

CREATE TABLE rcbo(
			RCBO_ID INT AUTO_INCREMENT,
			NODE_ID VARCHAR(200),
			FILE_NAME VARCHAR(200),
			USER_NAME VARCHAR(200),
			REFERENCE_NAME VARCHAR(200),
			MANUFACTURER_NAME VARCHAR(200),
			RATING INTEGER,
			VOLTAGE INTEGER,
			NO_OF_POLES VARCHAR(200),
			CURRENT_CURVE VARCHAR(200),
			RESIDUAL_CURRENT_TYPE VARCHAR(200),
			RESIDUAL_CURRENT INTEGER,
			OUTGOING_SIZE_PHASE INTEGER,
			OUTGOING_SIZE_NEUTRAL INTEGER,
			OUTGOING_SIZE_PROTECTIVE INTEGER,
			CREATED_BY VARCHAR(200),
			CREATED_DATE DATETIME,
			UPDATED_BY VARCHAR(200),
			UPDATED_DATE DATETIME,		
			CONSTRAINT PK_RCBO_ID PRIMARY KEY(RCBO_ID)	
			);
			

CREATE TABLE general_testing_rcbo(
			GENERAL_TESTING_RCBO_ID INT AUTO_INCREMENT,
			RCBO_ID INTEGER,
			RN VARCHAR(200),
			YN VARCHAR(200),
			BN VARCHAR(200),
			RE VARCHAR(200),
			YE VARCHAR(200),
			BE VARCHAR(200),
			RY VARCHAR(200),
			YB VARCHAR(200),
			BR VARCHAR(200),
			NE VARCHAR(200),
			IR_CURRENT VARCHAR(200),
			IY_CURRENT VARCHAR(200),
			IB_CURRENT VARCHAR(200),
			IN_CURRENT VARCHAR(200),
			IPE_CURRENT VARCHAR(200),
			POWER_FACTOR VARCHAR(200),
			FREQUENCY VARCHAR(200),
			CONSTRAINT PK_GENERAL_TESTING_RCBO_ID PRIMARY KEY(GENERAL_TESTING_RCBO_ID),
			CONSTRAINT FK_GENERAL_TESTING_RCBO_ID FOREIGN KEY(RCBO_ID) REFERENCES rcbo(RCBO_ID) ON DELETE CASCADE
			);
			
CREATE TABLE safety_testing_rcbo(
			SAFETY_TESTING_RCBO_ID INT AUTO_INCREMENT,
			RCBO_ID INTEGER,
			RN VARCHAR(200),
			YN VARCHAR(200),
			BN VARCHAR(200),
			RE VARCHAR(200),
			YE VARCHAR(200),
			BE VARCHAR(200),
			RY VARCHAR(200),
			YB VARCHAR(200),
			BR VARCHAR(200),
			SHOCK_VOLTAGE VARCHAR(200),
			FLOOR_RESISTANCE VARCHAR(200),
			WALL_RESISTANCE VARCHAR(200),
			CONSTRAINT PK_SAFETY_TESTING_RCBO_ID PRIMARY KEY(SAFETY_TESTING_RCBO_ID),
			CONSTRAINT FK_SAFETY_TESTING_RCBO_ID FOREIGN KEY(RCBO_ID) REFERENCES rcbo(RCBO_ID) ON DELETE CASCADE
			);
			
-----------> LT Motor <----------

CREATE TABLE lt_motor(
			MOTOR_ID INT AUTO_INCREMENT,
			NODE_ID VARCHAR(200),
			FILE_NAME VARCHAR(200),
			USER_NAME VARCHAR(200),
			REFERENCE_NAME VARCHAR(200),
			MANUFACTURER_NAME VARCHAR(200),
			WINDING_CONNECTION VARCHAR(200),
			POWER_CAPACITY INTEGER,
			CURRENT_RATING INTEGER,
			VOLTAGE INTEGER,
            NO_OF_PHASE VARCHAR(255),
            Model INTEGER,
            INCOMING_SIZE_PHASE INTEGER,
            INCOMING_SIZE_NEUTRAL INTEGER,
            INCOMING_SIZE_PROTECTIVE INTEGER,
            INCOMING_LENGTH_PHASE INTEGER,
			INCOMING_LENGTH_NEUTRAL INTEGER,
			INCOMING_LENGTH_PROTECTIVE INTEGER,
			CREATED_BY VARCHAR(200),
			CREATED_DATE DATETIME,
			UPDATED_BY VARCHAR(200),
			UPDATED_DATE DATETIME,		
			CONSTRAINT PK_MOTOR_ID PRIMARY KEY(MOTOR_ID)	
			);
			

CREATE TABLE general_testing_lt_motor(
			GENERAL_TESTING_MOTOR_ID INT AUTO_INCREMENT,
			MOTOR_ID INTEGER,
			RE VARCHAR(200),
			YE VARCHAR(200),
			BE VARCHAR(200),
			RY VARCHAR(200),
			YB VARCHAR(200),
			BR VARCHAR(200),
			IR_CURRENT VARCHAR(200),
			IY_CURRENT VARCHAR(200),
			IB_CURRENT VARCHAR(200),
			IPE_CURRENT VARCHAR(200),
			POLARITY_R VARCHAR(200),
			POLARITY_Y VARCHAR(200),
			POLARITY_B VARCHAR(200),
			POWER_FACTOR VARCHAR(200),
			FREQUENCY VARCHAR(200),
			CONSTRAINT PK_GENERAL_TESTING_MOTOR_ID PRIMARY KEY(GENERAL_TESTING_MOTOR_ID),
			CONSTRAINT FK_GENERAL_TESTING_MOTOR_ID FOREIGN KEY(MOTOR_ID) REFERENCES lt_motor(MOTOR_ID) ON DELETE CASCADE
			);
			
CREATE TABLE safety_testing_lt_motor(
			SAFETY_TESTING_MOTOR_ID INT AUTO_INCREMENT,
			MOTOR_ID INTEGER,
			RN VARCHAR(200),
			YN VARCHAR(200),
			BN VARCHAR(200),
			RE VARCHAR(200),
			YE VARCHAR(200),
			BE VARCHAR(200),
			RY VARCHAR(200),
			YB VARCHAR(200),
			BR VARCHAR(200),
			SHOCK_VOLTAGE VARCHAR(200),
			FLOOR_RESISTANCE VARCHAR(200),
			WALL_RESISTANCE VARCHAR(200),
			CONSTRAINT PK_SAFETY_TESTING_MOTOR_ID PRIMARY KEY(SAFETY_TESTING_MOTOR_ID),
			CONSTRAINT FK_SAFETY_TESTING_MOTOR_ID FOREIGN KEY(MOTOR_ID) REFERENCES lt_motor(MOTOR_ID) ON DELETE CASCADE
			);
            
-----------> LIGHT <----------

CREATE TABLE light(
			LIGHT_ID INT AUTO_INCREMENT,
			NODE_ID VARCHAR(200),
			FILE_NAME VARCHAR(200),
			USER_NAME VARCHAR(200),
			REFERENCE_NAME VARCHAR(200),
			MANUFACTURER_NAME VARCHAR(200),
			POWER_CAPACITY VARCHAR(200),
			CURRENT_RATING INTEGER,
			VOLTAGE INTEGER,
			TYPE INTEGER,
			INCOMING_SIZE_PHASE INTEGER,
			INCOMING_SIZE_NEUTRAL INTEGER,
			INCOMING_SIZE_PROTECTIVE INTEGER,
			INCOMING_LENGTH_PHASE INTEGER,
			INCOMING_LENGTH_NEUTRAL INTEGER,
			INCOMING_LENGTH_PROTECTIVE INTEGER,
			CREATED_BY VARCHAR(200),
			CREATED_DATE DATETIME,
			UPDATED_BY VARCHAR(200),
			UPDATED_DATE DATETIME,		
			CONSTRAINT PK_LIGHT_ID PRIMARY KEY(LIGHT_ID)	
			);
			

CREATE TABLE general_testing_light(
			GENERAL_TESTING_LIGHT_ID INT AUTO_INCREMENT,
			LIGHT_ID INTEGER,
			PHN VARCHAR(200),
			PHE VARCHAR(200),
			NE VARCHAR(200),
			IR_CURRENT VARCHAR(200),
			IN_CURRENT VARCHAR(200),
			IPE_CURRENT VARCHAR(200),
			POWER_FACTOR VARCHAR(200),
			FREQUENCY VARCHAR(200),
			CONSTRAINT PK_GENERAL_TESTING_LIGHT_ID PRIMARY KEY(GENERAL_TESTING_LIGHT_ID),
			CONSTRAINT FK_GENERAL_TESTING_LIGHT_ID FOREIGN KEY(LIGHT_ID) REFERENCES light(LIGHT_ID) ON DELETE CASCADE
			);
			
CREATE TABLE safety_testing_light(
			SAFETY_TESTING_LIGHT_ID INT AUTO_INCREMENT,
			LIGHT_ID INTEGER,
			PHN VARCHAR(200),
			PHE VARCHAR(200),
			NE VARCHAR(200),
			SHOCK_VOLTAGE VARCHAR(200),
			FLOOR_RESISTANCE VARCHAR(200),
			WALL_RESISTANCE VARCHAR(200),
			CONSTRAINT PK_SAFETY_TESTING_LIGHT_ID PRIMARY KEY(SAFETY_TESTING_LIGHT_ID),
			CONSTRAINT FK_SAFETY_TESTING_LIGHT_ID FOREIGN KEY(LIGHT_ID) REFERENCES light(LIGHT_ID) ON DELETE CASCADE
			);

-----------> Fan <----------

CREATE TABLE fan(
			FAN_ID INT AUTO_INCREMENT,
			NODE_ID VARCHAR(200),
			FILE_NAME VARCHAR(200),
			USER_NAME VARCHAR(200),
			REFERENCE_NAME VARCHAR(200),
			MANUFACTURER_NAME VARCHAR(200),
			POWER_CAPACITY INTEGER,
			CURRENT_RATING INTEGER,
            VOLTAGE INTEGER,
            MODEL VARCHAR(200),
            INCOMING_SIZE_PHASE INTEGER,
			INCOMING_SIZE_NEUTRAL INTEGER,
			INCOMING_SIZE_PROTECTIVE INTEGER,
			INCOMING_LENGTH_PHASE INTEGER,
            INCOMING_LENGTH_NEUTRAL INTEGER,
			INCOMING_LENGTH_PROTECTIVE INTEGER,
			CREATED_BY VARCHAR(200),
			CREATED_DATE DATETIME,
			UPDATED_BY VARCHAR(200),
			UPDATED_DATE DATETIME,		
			CONSTRAINT PK_FAN_ID PRIMARY KEY(FAN_ID)	
			);
			

CREATE TABLE general_testing_fan(
			GENERAL_TESTING_FAN_ID INT AUTO_INCREMENT,
			FAN_ID INTEGER,
			PHN VARCHAR(200),
			PHE VARCHAR(200),
			NE VARCHAR(200),
			IR_CURRENT VARCHAR(200),
			IN_CURRENT VARCHAR(200),
			IPE_CURRENT VARCHAR(200),
			POWER_FACTOR VARCHAR(200),
			FREQUENCY VARCHAR(200),
			CONSTRAINT PK_GENERAL_TESTING_FAN_ID PRIMARY KEY(GENERAL_TESTING_FAN_ID),
			CONSTRAINT FK_GENERAL_TESTING_FAN_ID FOREIGN KEY(FAN_ID) REFERENCES fan(FAN_ID) ON DELETE CASCADE
			);
			
CREATE TABLE safety_testing_fan(
			SAFETY_TESTING_FAN_ID INT AUTO_INCREMENT,
			FAN_ID INTEGER,
			PHN VARCHAR(200),
			PHE VARCHAR(200),
			NE VARCHAR(200),
			SHOCK_VOLTAGE VARCHAR(200),
			FLOOR_RESISTANCE VARCHAR(200),
			WALL_RESISTANCE VARCHAR(200),
			CONSTRAINT PK_SAFETY_TESTING_FAN_ID PRIMARY KEY(SAFETY_TESTING_FAN_ID),
			CONSTRAINT FK_SAFETY_TESTING_FAN_ID FOREIGN KEY(FAN_ID) REFERENCES fan(FAN_ID) ON DELETE CASCADE
			);
			
			


            
-----------> Cables <----------

CREATE TABLE cables(
			CABLE_ID INT AUTO_INCREMENT,
			NODE_ID VARCHAR(200),
			FILE_NAME VARCHAR(200),
			USER_NAME VARCHAR(200),
			MANUFACTURER_NAME VARCHAR(200),
			CONDUCTOR_TYPE VARCHAR(200),
            VOLTAGE INTEGER,
            BUS_DUCT_TYPE VARCHAR(200),
			INSTALLATION_TYPE VARCHAR(200),
			BUS_DUCT_PHASE_M VARCHAR(200),
			BUS_DUCT_NEUTRAL_M VARCHAR(200),
            BUS_DUCT_PROTECTIVE_M VARCHAR(200),
			BUS_DUCT_LENGTH VARCHAR(200),
            POTENTIAL_TEST_REPORT VARCHAR(200),
			CREATED_BY VARCHAR(200),
			CREATED_DATE DATETIME,
			UPDATED_BY VARCHAR(200),
			UPDATED_DATE DATETIME,		
			CONSTRAINT PK_CABLE_ID PRIMARY KEY(CABLE_ID)	
			);
		CREATE TABLE general_testing_cables(
			GENERAL_TESTING_CABLE_ID INT AUTO_INCREMENT,
			CABLE_ID INTEGER,
			PHN VARCHAR(200),
			PHE VARCHAR(200),
			NE VARCHAR(200),
			CONSTRAINT PK_GENERAL_TESTING_CABLE_ID PRIMARY KEY(GENERAL_TESTING_CABLE_ID),
			CONSTRAINT FK_GENERAL_TESTING_CABLE_ID FOREIGN KEY(CABLE_ID) REFERENCES cables(CABLE_ID) ON DELETE CASCADE
			);	

-----------> PAT <----------

CREATE TABLE portable_appliance(
            PORTABLE_APPLIANCE_ID INT AUTO_INCREMENT,
            NODE_ID VARCHAR(200),
            FILE_NAME VARCHAR(200),
            USER_NAME VARCHAR(200),
            REFERENCE_NAME VARCHAR(200),
            PORTABLE_APPLIANCE_NAME VARCHAR(200),
            MANUFACTURER_NAME VARCHAR(200),
            RATING INTEGER,
            VOLTAGE INTEGER,
            INSULATION_CLASS VARCHAR(200),
            CREATED_BY VARCHAR(200),
            CREATED_DATE DATETIME,
            UPDATED_BY VARCHAR(200),
            UPDATED_DATE DATETIME,        
            CONSTRAINT PK_PORTABLE_APPLIANCE_ID PRIMARY KEY(PORTABLE_APPLIANCE_ID)    
            );

CREATE TABLE general_testing_pat(
            GENERAL_TESTING_PAT_ID INT AUTO_INCREMENT,
            PORTABLE_APPLIANCE_ID INTEGER,
            CLASS_TYPE VARCHAR(200),
            REFERANCE VARCHAR(200),
            VOLTAGE VARCHAR(200),
            CONTINUITY_RESISTANCE VARCHAR(200),
            INSULATION_RESISTANCE VARCHAR(200),
            LEAKAGE_CURRENT VARCHAR(200),
            FLAG VARCHAR(200),
            CONSTRAINT PK_GENERAL_TESTING_PAT_ID PRIMARY KEY(GENERAL_TESTING_PAT_ID),
            CONSTRAINT FK_GENERAL_TESTING_PAT_ID FOREIGN KEY(PORTABLE_APPLIANCE_ID) REFERENCES portable_appliance(PORTABLE_APPLIANCE_ID) ON DELETE CASCADE
            );
			
-----------> Cable Connector <----------

CREATE TABLE cableconnector(
			CABLE_ID INT AUTO_INCREMENT,
			CABLE_CONNECTOR_ID VARCHAR(200),
			FILE_NAME VARCHAR(200),
			USER_NAME VARCHAR(200),
			MANUFACTURER_NAME VARCHAR(200),
			CONDUCTOR_TYPE VARCHAR(200),
            VOLTAGE INTEGER,
            BUS_DUCT_TYPE VARCHAR(200),
			INSTALLATION_TYPE VARCHAR(200),
			BUS_DUCT_PHASE_M VARCHAR(200),
			BUS_DUCT_NEUTRAL_M VARCHAR(200),
            BUS_DUCT_PROTECTIVE_M VARCHAR(200),
			BUS_DUCT_LENGTH VARCHAR(200),
            POTENTIAL_TEST_REPORT VARCHAR(200),
			CREATED_BY VARCHAR(200),
			CREATED_DATE DATETIME,
			UPDATED_BY VARCHAR(200),
			UPDATED_DATE DATETIME,		
			CONSTRAINT PK_CABLE_ID PRIMARY KEY(CABLE_ID)	
			);
		CREATE TABLE general_testing_cable_connector(
			GENERAL_TESTING_CABLE_CONNECTOR_ID INT AUTO_INCREMENT,
			CABLE_ID INTEGER,
			PHN VARCHAR(200),
			PHE VARCHAR(200),
			NE VARCHAR(200),
			CONSTRAINT PK_GENERAL_TESTING_CABLE_CONNECTOR_ID PRIMARY KEY(GENERAL_TESTING_CABLE_CONNECTOR_ID),
			CONSTRAINT FK_GENERAL_TESTING_CABLE_CONNECTOR_ID FOREIGN KEY(CABLE_ID) REFERENCES cableconnector(CABLE_ID) ON DELETE CASCADE
			);	
