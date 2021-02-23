CREATE TABLE IF NOT EXISTS category (
  id SERIAL,
  name VARCHAR(45) NOT NULL UNIQUE,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS question (
  id SERIAL,
  category_id INTEGER,
  text VARCHAR(45) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (category_id) REFERENCES category(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS answer (
  id SERIAL,
  question_id INTEGER,
  text VARCHAR(45) NOT NULL,
  is_correct BOOLEAN,
  PRIMARY KEY (id),
  FOREIGN KEY (question_id) REFERENCES question(id) ON DELETE CASCADE
);
