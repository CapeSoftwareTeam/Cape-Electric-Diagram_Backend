CREATE DATABASE lv_safety_verification;
use lv_safety_verification;


-----------> Diagram <----------

			CREATE TABLE DIAGRAM_COMPONENT(
			DIAGRAM_ID INT AUTO_INCREMENT,
			EMAIL_ID VARCHAR(255),
			USER_NAME VARCHAR(255),
			FILE_NAME VARCHAR(255),
			FILE BLOB,
			CREATED_BY VARCHAR(255),
			CREATED_DATE DATETIME,
			UPDATED_BY VARCHAR(255),
			UPDATED_DATE DATETIME,
			CONSTRAINT PK_DIAGRAM_ID PRIMARY KEY(DIAGRAM_ID)
			)