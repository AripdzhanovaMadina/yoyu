BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "Insurance_type" (
	"Code"	INTEGER NOT NULL,
	"Name"	TEXT,
	"Percent"	INTEGER,
	PRIMARY KEY("Code")
);
CREATE TABLE IF NOT EXISTS "contract" (
	"Code"	INTEGER NOT NULL,
	"name"	TEXT,
	"Summa"	INTEGER,
	"Tariff"	INTEGER,
	"Branch"	TEXT,
	"data"	TEXT,
	"Agent"	TEXT,
	PRIMARY KEY("Code")
);
CREATE TABLE IF NOT EXISTS "Employees" (
	"Agent"	INTEGER NOT NULL,
	"Name"	TEXT,
	"address"	TEXT,
	"Telephone"	TEXT,
	"code"	TEXT,
	PRIMARY KEY("Agent")
);
CREATE TABLE IF NOT EXISTS "Branch" (
	"code"	INTEGER NOT NULL,
	"Name"	TEXT,
	"address"	TEXT,
	"Telephone"	TEXT,
	PRIMARY KEY("code" AUTOINCREMENT)
);
INSERT INTO "Insurance_type" VALUES (100,'Авто от угона',20);
INSERT INTO "Insurance_type" VALUES (101,'Домашнего имущества',25);
INSERT INTO "Insurance_type" VALUES (102,'Медицинское',15);
INSERT INTO "Insurance_type" VALUES (103,'Грузов',20);
INSERT INTO "Insurance_type" VALUES (104,'Финансовых рисков',30);
INSERT INTO "contract" VALUES (1,'Авто от угона',10000,1.5,'Московский','2021-05-01','Ханинов Артур Юриевич');
INSERT INTO "contract" VALUES (2,'Домашнего имущества',15000,3,'Ленинградский','2021-05-01','Разумов Эрнст Фомевич');
INSERT INTO "contract" VALUES (3,'Медицинское',50000,2.5,'Новосибирский','2021-05-01','Ячменьков Константин Эрнестович');
INSERT INTO "contract" VALUES (4,'Грузов',100000,2,'Саратовский','2021-05-03','Кузарин Богдан Адрианович');
INSERT INTO "contract" VALUES (5,'Финансовых рисков',500000,1.5,'Омский','2021-05-03','Капшукова Нина Родионовна');
INSERT INTO "contract" VALUES (6,'Авто от угона',25500,3,'Томский','2021-05-08','Тихоненко Анна Семеновна');
INSERT INTO "contract" VALUES (7,'Авто от угона',30000,4,'Волгоградский','2021-05-08','Белолипецкий Сергей Чеславович');
INSERT INTO "contract" VALUES (8,'Домашнего имущества',150000,2,'Владимерский','2021-05-08','Богомазова Ева Ильевна');
INSERT INTO "contract" VALUES (9,'Финансовых рисков',250000,2,'Томский','2021-05-10','Тихоненко Анна Семеновна');
INSERT INTO "contract" VALUES (10,'Медицинское',250000,1.2,'Владимерский','2021-05-10','Богомазова Ева Ильевна');
INSERT INTO "contract" VALUES (11,'Медицинское',150000,1.8,'Смоленский','2021-05-11','Кондуров Артём  Левович');
INSERT INTO "contract" VALUES (12,'Грузов',500000,2.5,'Курский','2021-05-13','Теребова Александра Анатолиевна');
INSERT INTO "contract" VALUES (13,'Финансовых рисков',440000,3.2,'Московский','2021-05-14','Константинов Юлий Зиновиевич');
INSERT INTO "contract" VALUES (14,'Авто от угона',45000,1.5,'Ленинградский','2021-05-15','Разумов Эрнст Фомевич');
INSERT INTO "contract" VALUES (15,'Домащнего имущества',50000,2,'Новосибирский','2021-05-15','Габулов Роман Евграфович');
INSERT INTO "contract" VALUES (16,'Медицинское',75500,2.2,'Омский','2021-05-16','Капшукова Нина Родионовна');
INSERT INTO "contract" VALUES (17,'Авто от угона',80000,2.5,'Саратовский','2021-05-18','Кузарин Богдан Адрианович');
INSERT INTO "contract" VALUES (18,'Грузов',70000,3,'Волгоградский','2021-05-19','Белолипецкий Сергей Чеславович');
INSERT INTO "contract" VALUES (19,'Финансовых рисков',60000,1.2,'Томский','2021-05-20','Тихоненко Анна Семеновна');
INSERT INTO "contract" VALUES (20,'Авто от угона',45500,1.5,'Владимерский','2021-05-20','Богомазова Ева Ильевна');
INSERT INTO "contract" VALUES (21,'Домашнего имущества',50000,1.8,'Смоленский','2021-05-21','Кондуров Артём  Левович');
INSERT INTO "contract" VALUES (22,'Домашнего имущества',90000,2,'Курский','2021-05-22','Стародубцева Надежда Борисовна');
INSERT INTO "contract" VALUES (23,'Авто от угона',125000,2.2,'Ленинградский','2021-05-23','Боброва Любава Николаевна');
INSERT INTO "contract" VALUES (24,'Медицинское',250000,2,'Омский','2021-05-24','Капшукова Нина Родионовна');
INSERT INTO "contract" VALUES (25,'Финансовых рисков',300000,2,'Томский','2021-05-24','Тихоненко Анна Семеновна');
INSERT INTO "Employees" VALUES (1,'Муленко Виктория Тимуровна','Щорса, 5-2','540-65-40','Московский');
INSERT INTO "Employees" VALUES (2,'Константинов Юлий Зиновиевич','Кирова, 2-22','540-65-78','Московский');
INSERT INTO "Employees" VALUES (3,'Боброва Любава Николаевна','Котика, 15-8','541-98-88','Ленинградский');
INSERT INTO "Employees" VALUES (4,'Разумов Эрнст Фомевич','Осенняя, 15-3','541-87-45','Ленинградский');
INSERT INTO "Employees" VALUES (5,'Габулов Роман Евграфович','Столярная, 5-10','542-68-99','Новосибирский');
INSERT INTO "Employees" VALUES (6,'Капшукова Нина Родионовна','Палубная, 14-5','542-70-00','Омский');
INSERT INTO "Employees" VALUES (7,'Кузарин Богдан Адрианович','Новосибирский','545-05-01','Саратовский');
INSERT INTO "Employees" VALUES (8,'Белолипецкий Сергей Чеславович','Карла Маркса, 18-56','543-61-20','Волгоградский');
INSERT INTO "Employees" VALUES (9,'Ячменьков Константин Эрнестович','Дунайская, 15-33','544-98-70','Новосибирский');
INSERT INTO "Employees" VALUES (10,'Тихоненко Анна Семеновна','Саратовская, 1-2','545-98-70','Томский');
INSERT INTO "Employees" VALUES (11,'Богомазова Ева Ильевна','Серпуховская, 42-16','546-98-89','Владимирский');
INSERT INTO "Employees" VALUES (12,'Кондуров Артём Левович','Мира, 8-2','547-89-59','Смоленский');
INSERT INTO "Employees" VALUES (13,'Стародубцева Надежда Борисовна','Молдавская, 1-4','548-99-90','Курский');
INSERT INTO "Employees" VALUES (14,'Теребова Александра Анатолиевна','Комсомольская, 14-9','548-70-70','Курский');
INSERT INTO "Employees" VALUES (15,'Ханинов Артур Юриевич','Комсомольская, 1а-15','547-00-01','Московский');
INSERT INTO "Branch" VALUES (1,'Московский','Герцена, 5','458-62-30');
INSERT INTO "Branch" VALUES (2,'Ленинградский','Максимовского, 15','457-12-00');
INSERT INTO "Branch" VALUES (3,'НоKod_Filialasotrudnikisotrudnikiвосибирский','Пролетарская, 8','649-58-75');
INSERT INTO "Branch" VALUES (4,'Омский','Морина, 3','628-14-75');
INSERT INTO "Branch" VALUES (5,'Саратовский','Шухова, 44','976-96-58');
INSERT INTO "Branch" VALUES (6,'Волгоградский','Кутузова, 15','948-65-75');
INSERT INTO "Branch" VALUES (7,'Томский','Гастелло, 8','962-58-45');
INSERT INTO "Branch" VALUES (8,'Владимирский','Щепкина, 1','946-38-74');
INSERT INTO "Branch" VALUES (9,'Смоленский','Копровая, 10','540-65-40');
INSERT INTO "Branch" VALUES (10,'Курский','Газовая, 17','544-98-70');
COMMIT;
