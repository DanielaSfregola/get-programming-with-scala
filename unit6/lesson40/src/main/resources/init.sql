CREATE TABLE IF NOT EXISTS student (
    id INTEGER,
    name VARCHAR(45) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS exam_session (
    id INTEGER,
    title VARCHAR(45) NOT NULL,
    local_date DATE NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS registration (
    student_id INTEGER,
    exam_session_id INTEGER,
    PRIMARY KEY (student_id, exam_session_id),
    FOREIGN KEY (student_id) REFERENCES exam_session(id),
    FOREIGN KEY (exam_session_id) REFERENCES student(id)
);

INSERT INTO student (id, name)
VALUES
    (1, 'Jon Snow'),
    (2, 'Daenerys Targaryen'),
    (3, 'Arya Stark');

INSERT INTO exam_session (id, title, local_date)
VALUES
    (1, 'History', CURRENT_DATE + INTERVAL '30'),
    (2, 'Chemistry', CURRENT_DATE + INTERVAL '45');

