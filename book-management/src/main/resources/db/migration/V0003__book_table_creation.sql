CREATE TABLE book (
  idbook int(11) NOT NULL AUTO_INCREMENT,
  title varchar(50) DEFAULT NULL,
  publisher_name varchar(50) DEFAULT NULL,
  publish_date varchar(4) DEFAULT NULL,
  language varchar(50) DEFAULT NULL,
  PRIMARY KEY (idbook)
)