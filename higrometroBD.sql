drop database if exists Projeto_Estufa; 
create database  Projeto_Estufa; 
use  Projeto_Estufa;

CREATE TABLE cliente (
    id_cliente INT(6) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(80) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL,
    email VARCHAR(50) NOT NULL,
    celular VARCHAR(15) NOT NULL,
    data_nasc DATE NULL,
    senha varchar(20) NOT NULL
);
 
 
 CREATE TABLE higrometro (
    id_higrometro INT(6) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    temp_interna DECIMAL(4 , 2 ),
    temp_externa DECIMAL(4 , 2 ),
    umid_ar DECIMAL(4 , 2 ),
    umid_solo DECIMAL(4 , 2 )
);
 
CREATE TABLE cultivo (
    id_cultivo INT(6) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    id_higrometro INT,
    horario_irrigacao DATETIME,
    FOREIGN KEY (id_higrometro)
        REFERENCES higrometro (id_higrometro)
);  






 

 