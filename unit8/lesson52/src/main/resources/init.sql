CREATE TABLE IF NOT EXISTS category (
  id SERIAL,
  name VARCHAR NOT NULL UNIQUE,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS question (
  id SERIAL,
  category_id INTEGER,
  text VARCHAR NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (category_id) REFERENCES category(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS answer (
  id SERIAL,
  question_id INTEGER,
  text VARCHAR NOT NULL,
  is_correct BOOLEAN,
  PRIMARY KEY (id),
  FOREIGN KEY (question_id) REFERENCES question(id) ON DELETE CASCADE
);

/* Data copied from Open Trivia DB - https://opentdb.com/ */
COPY category(id, name) FROM '/data/categories.csv' DELIMITER ',' CSV HEADER;
COPY question(id, text, category_id) FROM '/data/questions.csv' DELIMITER ',' CSV HEADER;
COPY answer(id, question_id, text, is_correct) FROM '/data/answers.csv' DELIMITER ',' CSV HEADER;
