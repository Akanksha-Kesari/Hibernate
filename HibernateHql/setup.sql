DROP TABLE IF EXISTS `Employee`;
CREATE TABLE `Employee` (
  `emp_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(20) NOT NULL,
  `emp_salary` double(10,0) NOT NULL DEFAULT '0',
  PRIMARY KEY (`emp_id`)
) 
DROP TABLE IF EXISTS `Address`;
CREATE TABLE `Address` (
  `emp_id` int(11) unsigned NOT NULL,
  `address_line1` varchar(50) NOT NULL DEFAULT '',
  `zipcode` varchar(10) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  CONSTRAINT `emp_fk_1` FOREIGN KEY (`emp_id`) REFERENCES `Employee` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `Employee` (`emp_id`, `emp_name`, `emp_salary`)
VALUES
	(1, 'Keshav', 70000),
	(2, 'Sumit', 20000),
	(3, 'Mukesh', 30000),
	(4, 'Jai', 40000);


INSERT INTO `Address` (`emp_id`, `address_line1`, `zipcode`, `city`)
VALUES
	(1, 'Gali No - 08', '95129', 'Gurgaon'),
	(2, 'Near Hanuman Mandir', '95051', 'Noida'),
	(3, 'Near Radhay Sweet', '560100', 'Faridabad'),
	(4, 'City Centre', '100100', 'New Delhi');
	
commit;
