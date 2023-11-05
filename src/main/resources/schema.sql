  CREATE TABLE IF NOT EXISTS employee
   (id VARCHAR(4) PRIMARY KEY,
	email VARCHAR(60),
	first_name VARCHAR(60),
	last_name VARCHAR(60),
	STATUS NUMERIC(1,0) DEFAULT 1 ,
	AUD_CREATED_DATE TIMESTAMP 	,
	AUD_CREATED_USER VARCHAR(120 ) ,
	AUD_UPDATE_DATE TIMESTAMP		,
	AUD_UPDATE_USER VARCHAR(120 )
   );

   COMMENT ON COLUMN employee.id IS 'Identificador de la tabla de 4 caracteres númericos';
   COMMENT ON COLUMN employee.first_name IS 'Denominación del los documentos de identidad';
   COMMENT ON COLUMN employee.last_name IS 'Denominación del los documentos de identidad';
   COMMENT ON TABLE  employee  IS 'La tabla employee el ID';
