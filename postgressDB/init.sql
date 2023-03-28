CREATE DATABASE tccDb;
CREATE TABLE tb_cliente (
  uuid SERIAL PRIMARY KEY,
  primeiro_nome VARCHAR(255),
  sobre_nome VARCHAR(255),
  data_de_cadastro TIMESTAMP,
  telefone VARCHAR(20),
  email VARCHAR(255),
  data_nascimento DATE
);