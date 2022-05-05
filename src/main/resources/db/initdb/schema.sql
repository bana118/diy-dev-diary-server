DROP DATABASE IF EXISTS development;

CREATE DATABASE development;

USE development;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS products;


CREATE TABLE users (
    id VARCHAR(36) PRIMARY KEY,
    name VARCHAR(256) NOT NULL,
    email VARCHAR(256) NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL
);

CREATE TABLE products (
    id VARCHAR(36) PRIMARY KEY,
    name VARCHAR(256) NOT NULL,
    description VARCHAR(500),
    url VARCHAR(2048) NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL
);