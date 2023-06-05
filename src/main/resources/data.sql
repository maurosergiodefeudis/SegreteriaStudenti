INSERT INTO ACCOUNTS (Id, Nome, Cognome, Data_di_nascita, CF, Matricola)
VALUES(1, 'Guido', 'Lavespa', '03/02/1980', 'GLVPS8LG893319GL', '10001');
INSERT INTO ACCOUNTS (Id, Nome, Cognome, Data_di_nascita, CF, Matricola)
VALUES(2, 'Felice', 'Buonanno', '06/06/1998', 'FLBN83983938B983', '10002');
INSERT INTO ACCOUNTS (Id, Nome, Cognome, Data_di_nascita, CF, Matricola)
VALUES(3, 'Camisa', 'Bianca', '07/01/2000', 'CMBNC9S387388D3C', '10003');
INSERT INTO ACCOUNTS (Id, Nome, Cognome, Data_di_nascita, CF, Matricola)
VALUES(4, 'Assunto', 'Licenziato', '28/08/1995', 'ASS8LC1995MLC28A', '10004');
INSERT INTO ACCOUNTS (Id, Nome, Cognome, Data_di_nascita, CF, Matricola)
VALUES(5, 'Madonna', 'Perla', '09/15/1998', 'MAD09PRL15MDP98M', '10005');
INSERT INTO ACCOUNTS (Id, Nome, Cognome, Data_di_nascita, CF, Matricola)
VALUES(6, 'Guido', 'Avanti', '27/01/1999', 'GD27A1VNT99G99GA', '10006');
INSERT INTO ACCOUNTS (Id, Nome, Cognome, Data_di_nascita, CF, Matricola)
VALUES(7, 'Natale', 'Grasso', '09/06/1992', 'NT9R06RSS92N19NG', '10007');
INSERT INTO ACCOUNTS (Id, Nome, Cognome, Data_di_nascita, CF, Matricola)
VALUES(8, 'Rosa', 'Salsa', '12/12/2002', 'RS12SL12RSLS02CR', '10008');
INSERT INTO ACCOUNTS (Id, Nome, Cognome, Data_di_nascita, CF, Matricola)
VALUES(9, 'Lino', 'Baratto', '02/11/1994', 'LBR01TT11LB94A4B', '10009');
INSERT INTO ACCOUNTS (Id, Nome, Cognome, Data_di_nascita, CF, Matricola)
VALUES(10, 'Felice', 'Russo', '05/04/2001', 'FLC04RSS4FS01A5S', '10010');

CREATE SEQUENCE ACCOUNTS_SEQUENCE_ID START WITH (select max(id) + 1 from ACCOUNTS);