
CREATE TABLE TBL_USERS ( USERID INT NOT NULL AUTO_INCREMENT , MOBILE INT NOT NULL , PASSWORD VARCHAR(20) NOT NULL , NAME VARCHAR(30) NOT NULL , ADDRESS VARCHAR(50) NULL , PRIMARY KEY (USERID));

CREATE TABLE TBL_MENU 
( ITEMID INT NOT NULL , 
ITEMNAME VARCHAR(20) NOT NULL , 
ITEMPRICE DECIMAL(10,2) NOT NULL , 
ITEMQTY INT NOT NULL , PRIMARY KEY (ITEMID));

CREATE TABLE TBL_ORDERS 
( ORDERID INT NOT NULL AUTO_INCREMENT , 
USERID INT NOT NULL , 
BILLCONTACT VARCHAR(80) NOT NULL , 
TOTALBILL DECIMAL(10,2) NOT NULL , 
ORDERDATE DATETIME NOT NULL , 
STATUS VARCHAR(1) NOT NULL , PRIMARY KEY (ORDERID));

CREATE TABLE TBL_ORDERDETAILS ( ORDERID INT NOT NULL , ITEMID INT NOT NULL , ORDERQTY INT NOT NULL );


INSERT INTO TBL_MENU(ITEMID, ITEMNAME, ITEMPRICE, ITEMQTY) VALUES (1,"Dhokla (250 gms)",28.00,5);
INSERT INTO TBL_MENU(ITEMID, ITEMNAME, ITEMPRICE, ITEMQTY) VALUES (2,"Jalebi (100gm)",28.00,5);
INSERT INTO TBL_MENU(ITEMID, ITEMNAME, ITEMPRICE, ITEMQTY) VALUES (3,"gulabjamun (3pcs)",28.00,5);
INSERT INTO TBL_MENU(ITEMID, ITEMNAME, ITEMPRICE, ITEMQTY) VALUES (4,"samosa",28.00,5);
INSERT INTO TBL_MENU(ITEMID, ITEMNAME, ITEMPRICE, ITEMQTY) VALUES (5,"aloo tikki chat",28.00,5);
INSERT INTO TBL_MENU(ITEMID, ITEMNAME, ITEMPRICE, ITEMQTY) VALUES (6,"khaste",28.00,5);
INSERT INTO TBL_MENU(ITEMID, ITEMNAME, ITEMPRICE, ITEMQTY) VALUES (7,"dahi bhalla",28.00,5);
INSERT INTO TBL_MENU(ITEMID, ITEMNAME, ITEMPRICE, ITEMQTY) VALUES (8,"panipuri",28.00,5);




INSERT INTO TBL_ORDERS(USERID, BILLCONTACT, TOTALBILL, ORDERDATE)
 VALUES (2,"chiya 9910102345 vikas nager",234.00,"2018-09-02 18:12:00");
