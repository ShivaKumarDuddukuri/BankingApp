CREATE DATABASE  IF NOT EXISTS `accounts`;
USE `accounts`;



CREATE TABLE user (
  id       INT(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(255)     DEFAULT NULL,
  password VARCHAR(255)     DEFAULT NULL,
  PRIMARY KEY (id)
)