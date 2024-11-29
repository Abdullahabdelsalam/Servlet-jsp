DROP SCHEMA IF EXISTS `registratian`;

CREATE SCHEMA `registratian`;

use `registratian`;

CREATE TABLE `visitors`
(
  `visitor_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) DEFAULT NULL,
  `last_name` VARCHAR(45) DEFAULT NULL,
  `email` VARCHAR(200) DEFAULT NULL,
  `password` VARCHAR(200) DEFAULT NULL,
  `phone_number` VARCHAR(35) DEFAULT NULL,
  `address` VARCHAR(200) DEFAULT NULL,
  `age` VARCHAR(3) DEFAULT NULL,
   PRIMARY KEY (`visitor_id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;