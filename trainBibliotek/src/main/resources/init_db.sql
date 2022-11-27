CREATE DATABASE `bibliotek` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `kunde` (
                         `id` bigint NOT NULL AUTO_INCREMENT,
                         `name` varchar(45) NOT NULL,
                         `surname` varchar(45) NOT NULL,
                         `passport` varchar(45) NOT NULL,
                         `admonished` tinyint NOT NULL,
                         `login` varchar(45) NOT NULL,
                         `password` varchar(45) NOT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


CREATE TABLE `books` (
                         `isbn` bigint NOT NULL AUTO_INCREMENT,
                         `title` varchar(45) NOT NULL,
                         `author` varchar(45) NOT NULL,
                         `available` tinyint NOT NULL,
                         `description` varchar(255) DEFAULT NULL,
                         `genre` varchar(45) DEFAULT NULL,
                         PRIMARY KEY (`isbn`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;


CREATE TABLE `borrowings` (
                              `id` bigint NOT NULL AUTO_INCREMENT,
                              `kunden_id` bigint NOT NULL,
                              `book_id` bigint NOT NULL,
                              PRIMARY KEY (`id`),
                              KEY `fk1_idx` (`kunden_id`),
                              KEY `fk2_idx` (`book_id`),
                              CONSTRAINT `fk1` FOREIGN KEY (`kunden_id`) REFERENCES `kunde` (`id`),
                              CONSTRAINT `fk2` FOREIGN KEY (`book_id`) REFERENCES `books` (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;


