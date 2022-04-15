DROP TABLE IF EXISTS product_tbl;

CREATE TABLE product_tbl (
  product_id INT AUTO_INCREMENT  PRIMARY KEY,
  product_category VARCHAR(250) NOT NULL,
  product_name VARCHAR(250) NOT NULL,
  product_description VARCHAR(250) DEFAULT NULL,
  units INT

);