CREATE TABLE pessoa(
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR (50),
    logradouro VARCHAR(50),
    numero VARCHAR(10),
    complemento VARCHAR(50),
    bairro VARCHAR(50),
    cep VARCHAR(9),
    cidade VARCHAR(50),
    estado VARCHAR(2),
    ativo BOOLEAN
);

INSERT INTO pessoa  (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Fabio Damas', "Rua X", "123", "Apt 123", "Bairro X", "17209440", "Sao Paulo", "SP", true);

