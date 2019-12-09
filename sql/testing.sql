CREATE TABLE Pathways (
    id int NOT NULL AUTO_INCREMENT,
    title varchar(255) NOT NULL, #title of pathway
    languageReq double, #language arts requirement
    mathReq double, #mathematics requirement
    scienceReq double, #science requirement
    socialReq double, #social studies requirement
    govReq double, #us government/citizenship requirement
    healthReq double, #health education requirement
    peReq double, #physical education requirement
    fitnessReq double, #fitness for life requirement
    artsReq double, #fine arts requirement
    cteReq double, #career and technical education requirement
    compReq double, #computer technology requirement
    financialReq double, #financial literacy requirement
    electiveReq double, #general electives requirement
    PRIMARY KEY (id)
);

CREATE TABLE Students (
    id int NOT NULL UNIQUE,
    name varchar(255),
    grade int NOT NULL,
    pathwayId int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (pathwayId) REFERENCES Pathways(id)
);

INSERT INTO Pathways (title, languageReq, mathReq, scienceReq, socialReq, govReq, healthReq, peReq, fitnessReq, artsReq, cteReq, compReq, financialReq, electiveReq) VALUES #no need to insert into the id column as it is auto incremented from 1
('Utah Aerospace Pathway', 4.00, 6.00, 4.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 2.00, 0.50, 0.00, 8.00),
('Regents', 4.00, 4.00, 4.00, 3.00, 0.50, 0.50, 0.50, 0.50, 2.00, 0.00, 0.00, 0.00, 8.00),
('Medical Forensics', 4.00, 3.00, 4.00, 0.00, 0.00, 1.00, 0.50, 1.00, 0.00, 2.00, 0.00, 0.00, 8.00),
('Culinary Arts', 1.00, 1.00, 1.00, 1.00, 0.50, 0.50, 0.50, 0.50, 0.50, 2.00, 0.00, 0.00, 8.00);

INSERT INTO Students VALUES
(9632013, 'Daniel Elliott', 12, 1),
(9625463, 'Jackson Elder', 12, 1),
(9563743, 'Zach Greenberg', 12, 2),
(9645342, 'Stefan Todorov', 12, 3);
