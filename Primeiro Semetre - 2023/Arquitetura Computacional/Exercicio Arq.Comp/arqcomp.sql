CREATE DATABASE arqComp;

USE arqComp;


CREATE TABLE ciclo (
idCiclo int primary key auto_increment,
dthora datetime
);

INSERT INTO ciclo VALUES 
(null, "2023-05-04 14:31:05");



CREATE TABLE maceracao (
idMaceracao int primary key auto_increment,
temp decimal,
fkCicloMaceracao int,
    constraint fkCicloAtual foreign key (fkCicloMaceracao)
    references ciclo(idCiclo)
); 

CREATE TABLE malteacao (
idMalteacao int primary key auto_increment,
temp1 decimal,
temp2 decimal,
temp3 decimal,
fkCicloMalteacao int,
    constraint fkCicloAtual1 foreign key (fkCicloMalteacao)
    references ciclo(idCiclo)
);

CREATE TABLE brasagem (
idCozimento int primary key auto_increment,
temp1 decimal,
temp2 decimal,
temp3 decimal,
fkCicloBrasagem int,
    constraint fkCicloAtual2 foreign key (fkCicloBrasagem)
    references ciclo(idCiclo)
);

CREATE TABLE moagem (
 idMoagem int primary key auto_increment,
 temp decimal,
     fkCicloMoagem int,
    constraint fkCicloAtual3 foreign key (fkCicloMoagem)
    references ciclo(idCiclo)
);

CREATE TABLE fervura (
	idFervura int primary key auto_increment,
    temp decimal,
    fkCicloFervura int,
    constraint fkCicloAtual4 foreign key (fkCicloFervura)
    references ciclo(idCiclo)
);

 CREATE TABLE resfriamento (
	idResfriamento int primary key auto_increment,
    temp1 decimal,
    temp2 decimal,
    temp3 decimal,
    fkCicloResfriamento int,
    constraint fkCicloAtual5 foreign key (fkCicloResfriamento)
    references ciclo(idCiclo)
 );
 
 CREATE TABLE maturacao (
	idMaturacao int primary key auto_increment,
    temp decimal,
    fkCicloMaturacao int,
    constraint fkCicloAtual6 foreign key (fkCicloMaturacao)
    references ciclo(idCiclo)
 );
 
 CREATE TABLE pasteurizacao (
	idPasteurizacao int primary key auto_increment,
    temp decimal,
    fkCicloPasteurizacao int,
    constraint fkCicloAtual7 foreign key (fkCicloPasteurizacao)
    references ciclo(idCiclo)
 );
 
  CREATE TABLE procFinal (
	idFinal int primary key auto_increment,
    temp decimal,
    fkCicloProcFinal int,
    constraint fkCicloAtual8 foreign key (fkCicloProcFinal)
    references ciclo(idCiclo)
 );
 
  select * from ciclo join maceracao on fkCicloMaceracao = idCiclo join malteacao on fkCicloMalteacao = idCiclo join brasagem on fkCicloBrasagem = idCiclo join moagem on fkCicloMoagem = idMoagem join fervura on fkCiclo = idCiclo 
 join resfriamento on fkCicloResfriamento = idCiclo join maturacao on fkCicloMaturacao = idCiclo join pasteurizacao on fkCicloPasteurizacao = idCiclo join procFinal on fkCicloProcFinal = idCiclo;


 
 
 
 
 
 
 