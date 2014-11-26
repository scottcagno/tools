Some basic RESTful tools
========================
##### A basic spring boot tools service that exposes restful endpoints for some useful web related tooling

### CREATE TABLE
-----
CREATE TABLE `geoip` (
  `ipstart` varbinary(16) NOT NULL,
  `ipend` varbinary(16) NOT NULL,
  `country` char(2) NOT NULL,
  `state` varchar(80) NOT NULL,
  `city` varchar(80) NOT NULL,
  PRIMARY KEY (`ipstart`)
);

### IMPORT
-----
mysql -uuser -ppass -D tools < tools.geoip.sql

### QUERY
-----
SELECT state FROM geoip WHERE ipstart <= 'ipaddr goes here' ORDER BY ipstart DESC LIMIT 1;
