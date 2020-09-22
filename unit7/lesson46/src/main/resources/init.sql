CREATE TABLE IF NOT EXISTS customer (
    id INTEGER,
    name VARCHAR(45) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS product (
    id INTEGER,
    title VARCHAR(45) NOT NULL,
    creation_date DATE NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO customer (id, name)
VALUES
    (1, 'Jon Snow'),
    (2, 'Daenerys Targaryen'),
    (3, 'Arya Stark');

INSERT INTO product (id, title, creation_date)
VALUES
    (1, 'Sword', CURRENT_DATE + INTERVAL '30'),
    (2, 'Potion', CURRENT_DATE + INTERVAL '45');

