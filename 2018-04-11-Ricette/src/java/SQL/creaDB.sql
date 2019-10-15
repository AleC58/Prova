PRAGMA foreign_key = 1;

DROP TABLE IF EXISTS tblComposizione;
DROP TABLE IF EXISTS tblIngrediente;
DROP TABLE IF EXISTS tblRicetta;

CREATE TABLE tblIngrediente(
	idIngrediente INTEGER PRIMARY KEY AUTOINCREMENT,
	nomeIngrediente VARCHAR(30),
	unitaDiMisura VARCHAR(30),
	costoUnitario FLOAT
);

CREATE TABLE tblRicetta(
	idRicetta INTEGER PRIMARY KEY AUTOINCREMENT,
	nomeRicetta VARCHAR(30),
	preparazione TEXT
);

CREATE TABLE tblComposizione(
	idRicetta INTEGER,
	idIngrediente INTEGER,
	quantita INTEGER,
	PRIMARY KEY(idRicetta, idIngrediente),
	FOREIGN KEY (idRicetta) REFERENCES tblRicetta(idRicetta),
	FOREIGN KEY (idIngrediente) REFERENCES tblIngrediente(idIngrediente)
);
