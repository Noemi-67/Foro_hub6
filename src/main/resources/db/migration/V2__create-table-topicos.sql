CREATE TABLE topico (
    topic_id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    mensaje TEXT NOT NULL,
    status BOOLEAN NOT NULL,
    curso VARCHAR(100) NOT NULL,
    usuario_id BIGINT NOT NULL,
    feDeCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (topic_id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)  -- Assuming there's a 'usuario' table with id as the primary key
);

