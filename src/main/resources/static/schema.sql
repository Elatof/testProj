CREATE TABLE Admin
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(32) NOT NULL UNIQUE,
    password VARCHAR(32) NOT NULL
);

CREATE TABLE Category
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(32) NOT NULL UNIQUE
);

CREATE TABLE Product
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    name   VARCHAR(32) NOT NULL,
    description VARCHAR(255) NOT NULL,
    price  INT NOT NULL,
    release_date DATE,
    category_id INT NOT NULL,

    CONSTRAINT fk_category
        FOREIGN KEY (category_id)
            REFERENCES Category (id)
);

INSERT INTO Admin(login, password)
VALUES ('admin@gmail.com', 'admin');

INSERT INTO Category(name)
VALUES ('footwear'), ('clothes');

INSERT INTO Product(name, description, price, release_date, category_id)
VALUES
('Core Red', 'Example of text', 100, parsedatetime('17-09-2018', 'dd-MM-yyyy'), 1),
('TUC', 'Example of text', 69, parsedatetime('6-11-2019', 'dd-MM-yyyy'), 2);
