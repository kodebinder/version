CREATE TABLE `employee_table` (
  `employee_id` INTEGER NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `employee_name` varchar(255) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `EMAIL_INDEX` (`email`)
);
