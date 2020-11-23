
CREATE TABLE Ksiazki(
id int auto_increment PRIMARY KEY,
tytul varchar(20) NOT NULL,
autor varchar(20) NOT NULL,
rok_wydania year,
wydawnictwo varchar(20),
liczba_stron int,
cena float);

CREATE TABLE Wypozyczenia(
id int auto_increment PRIMARY KEY,
id_ksiazki int NOT NULL,
data_wypozyczenia date NOT NULL,
data_zwrotu date
);

CREATE TABLE Czytelnicy(
id int auto_increment PRIMARY KEY,
imie varchar(20) NOT NULL,
nazwisko varchar(20) NOT NULL,
email varchar(20),
status enum('N','S'),
data_zapisu date NOT NULL,
data_waznosci date
);

ALTER TABLE Wypozyczenia
ADD id_czytelnika int;

ALTER TABLE Ksiazki
MODIFY wydawnictwo varchar(60);

ALTER TABLE Ksiazki
MODIFY tytul varchar(60);

ALTER TABLE Ksiazki
MODIFY autor varchar(40);

INSERT INTO Ksiazki (tytul,autor,rok_wydania,wydawnictwo,liczba_stron,cena) VALUES
	("Kolejne 365 dni","Blanka Lipińska",2019,'AGORA',400,28.85),
    ("Kwestia Ceny","Miłoszewski Zygmunt",2020,"Wydawnictwo W.A.B",528,33.12),
    ('Gwiazdor',"Piotr C.",2018,"Novae Res",296,31.99),
    ("Osiedle RZNiW","Mróz Remigiusz",2019,"Czwarta Strona",NULL,23.94),
    ("Jadłonomia po polsku","Dymek Marta",2015,"Wydawnictwo Marginesy",280,50.12),
    ("Mam wątpliwość","Radomska Aleksandra",2017,"Wielka Litera",264,30.52),
    ("Ballada ptaków i węży","Collins Suzanne",2018,"Media Rodzina",NULL,40.12),
    ("Ile trzeba zjeść czekolady, żeby dostać Nobla?","Bąk Janina",2015,"Wydawnictwo W.A.B.",NULL,28),
    ("W głębi lasu","Coben Harlan",2014,"Wydawnictwo Albatros",432,70),
    ("Gorące lato. Grzeszne opowieści","Świst Paulina",2020,"Akurat",NULL,NULL),
    ("Menopauza. Podróż do esencji kobiecości","Maciąg Agnieszka",2012,"Wydawnictwo Otwarte",312,40.49),
    ("Srebrne skrzydła","Lackberg Camilla",2017,"Wydawnictwo Czarna Owca",NULL,24.89),
    ("Na odległość. The Kissing Booth.","Reekles Beth",2016,"Wydawnictwo Insignis",NULL,23.43),
    ("Wyrwa","Chmielarz Wojciech",2017,"Wydawnictwo Marginesy",400,25.94),
    ("W samym sercu morza","Moyes Jojo",2019,"Społeczny Instytut Wydawniczy Znak",544,29.94),
    ("Jedz i chudnij z dietą SIRT","Jarzynka-Jendrzejewska Magdalena",2016,"Wydawnictwo RM",200,NULL),
    ("Pies","Gończyk Jakub",2016,"Akurat",NULL,NULL),
    ("Smak wiecznej młodości","Maciąg Agnieszka",2017,"Wydawnictwo Otwarte",320,32.67),
    ("Osobisty przewodnik po Pradze","Szczygieł Mariusz",2019,"Fundacja Instytut Reportażu",400,32.67),
    ("Miecz przeznaczenia","Sapkowski Andrzej",2016,"SUPERNOWA",400,33.26);
    
ALTER TABLE czytelnicy
MODIFY email varchar(50);    

INSERT INTO Czytelnicy (imie,nazwisko,email,status,data_zapisu,data_waznosci) VALUES
	('Celina','Majewska','CelinaMajewska@wp.pl','N','2012-01-10','2014-01-10'),
    ('Ania','Tomaszewska','AniaTomaszewska@op.pl','N','2016-01-27','2018-01-27'),
    ('Marzena','Zawadzka','MarzenaZawadzka@onet.pl','S','2018-12-2',NULL),
    ('Dobrosław','Walczak','DobroslawWalczak@o2.pl','N','2017-05-09','2019-05-09'),
    ('Wisław','Olszewski','WislawOlszewski@wp.pl','S','2018-03-21','2020-03-21'),
    ('Izabella','Dąbrowska','IzabellaDabrowska@o2.pl','S','2016-03-20','2018-03-20'),
    ('Krzsztof','Sokołowski','KrzysSokolowski@o2.pl','S','2012-11-08','2014-11-08'),
    ('Sobiesław','Wozniak','SobieslawWozniak@wp.pl','N','2010-01-30','2012-01-30'),
    ('Justyna','Majewska','JustynaMajewska@onet.pl','S','2014-05-06',NULL),
    ('Przemysław','Duda','PrzemyslDuda@gmail.com','N','2019-03-20','2021-03-20'),
    ('Wioletta','Borkowska','WiolettaBorkowska@gmail.com','S','2020-05-15','2022-05-15'),
    ('Sylwia','Kaminska','SylwiaKaminska@gmail.com','N','2018-06-14','2020-06-14'),
    ('Walerian','Piotrowski','WalerianPiotrowski@onet.pl','N','2017-12-15','2019-12-15'),
    ('Urszula','Zawadzka','UrszulaZawadzka@gmail.com','S','2015-06-02','2017-06-02'),
    ('Radomił','Górski','RadomilGorski@o2.pl','N','2017-10-27','2019-10-27'),
    ('Bazyli','Duda','BazyliDuda@gmail.com','S','2020-09-16','2022-09-16'),
    ('Grzegorz','Michalski','GrzegorzMichalski@o2.pl','N','2019-05-24',NULL),
    ('Konstancja','Wysocka','KonstancjaWysocka@gmail.com','S','2010-04-19','2012-04-19'),
    ('Celina','Walczak','CelinaWalczak@o2.pl','N','2014-01-09',NULL),
    ('Urszula','Kwiatkowska','UrszulaKwiatkowska@wp.pl','S','2012-02-04','2014-02-04');

INSERT INTO Wypozyczenia (id_ksiazki,id_czytelnika,data_wypozyczenia,data_zwrotu) VALUES
	(12,7,'2012-09-25','2012-11-20'),
    (4,20,'2012-09-27','2012-11-10'),
    (15,4,'2018-08-13',NULL),
    (2,15,'2012-10-12','2013-01-02'),
    (18,1,'2020-05-20','2020-05-25'),
    (13,4,'2018-05-17','2018-06-10'),
    (15,2,'2019-04-19','2019-05-25'),
    (10,10,'2020-02-14',NULL),
    (11,6,'2016-01-01','2016-05-14'),
    (7,6,'2016-01-01',NULL),
    (6,15,'2012-08-13',NULL),
    (5,7,'2020-02-25',NULL),
    (3,12,'2020-01-11','2020-03-05'),
    (18,7,'2016-10-25','2016-10-30'),
    (6,20,'2019-09-13','2019-11-01'),
    (9,11,'2019-12-04','2020-02-12'),
    (4,17,'2017-12-26',NULL),
    (5,5,'2017-07-04','2017-11-12'),
    (2,12,'2016-10-05','2016-12-23'),
    (1,11,'2018-06-13',NULL);
    

ALTER TABLE Wypozyczenia
ADD foreign key (id_czytelnika) REFERENCES Czytelnicy(id);

ALTER TABLE Wypozyczenia
ADD foreign key (id_ksiazki) REFERENCES Ksiazki(id);

SELECT tytul,liczba_stron,cena FROM Ksiazki WHERE liczba_stron < 400 AND cena < 40;
SELECT count(status) AS "Liczba Studentów" FROM Czytelnicy WHERE status = 'S' AND data_waznosci IS NOT NULL;
SELECT data_wypozyczenia FROM Wypozyczenia WHERE year(data_wypozyczenia) > 2018 AND data_zwrotu IS NOT NULL;

UPDATE Ksiazki
SET cena=cena+10 AND rok_wydania = 2020
WHERE wydawnictwo = "Wydawnictwo W.A.B";

UPDATE Czytelnicy
SET data_waznosci = date_add(data_waznosci, INTERVAL 2 YEAR)
WHERE status = 'S' AND data_waznosci IS NULL;

UPDATE Wypozyczenia
SET data_zwrotu = date_add(data_wypozyczenia, INTERVAL 2 MONTH)
WHERE data_zwrotu IS NULL AND data_wypozyczenia > date_add(data_wypozyczenia,INTERVAL 2 MONTH);

DELETE FROM Ksiazki WHERE Cena IS NULL OR liczba_stron IS NULL;

DELETE FROM Czytelnicy WHERE data_waznosci IS NULL AND status = 'N';

DELETE FROM Wypozyczenia WHERE data_zwrotu IS NOT NULL;

SELECT imie,nazwisko,tytul,data_wypozyczenia FROM Wypozyczenia W JOIN Czytelnicy C ON W.id_czytelnika = C.id JOIN Ksiazki K ON W.id_ksiazki = K.id;

ALTER TABLE Ksiazki
ADD PRIMARY KEY(id);
ALTER TABLE Czytelnicy
ADD PRIMARY KEY(id);
ALTER TABLE Wypozyczenia
ADD PRIMARY KEY(id);

ALTER TABLE Czytelnicy
MODIFY email varchar(50) UNIQUE;
ALTER TABLE Ksiazki
MODIFY tytul varchar(60) UNIQUE;

ALTER TABLE Czytelnicy
MODIFY email varchar(50) NOT NULL;
ALTER TABLE Czytelnicy
MODIFY status enum('S','N') NOT NULL;
