--this IS a SQL COMMENT

-- DDL commands
DROP TABLE IF EXISTS users CASCADE;

--I need to add to the Users table 

CREATE TABLE Users (

userid serial PRIMARY KEY,
usernm varchar(30),
firstName varchar(30),
lastName varchar(30),
userType varchar(30),
birthday varchar(30),
pswd varchar(20)
);

DROP TABLE IF EXISTS account CASCADE;

CREATE TABLE account(
acc_no serial primary key,
acctype varchar(30),
balance integer ,
status varchar(20),
userid integer REFERENCES Users(userid)

);

INSERT INTO Users(usernm,firstName,lastName,userType,birthday,pswd)
VALUES('jumanji','Robin','Williams','employee','011045','sky'),
('singer','Selena','Gomez','admin','072292','sky'),
('wilson','Tom','Hanks','employee','033070','sky'),
('cat','Julia','Roberts','admin','022089','sky'),
('handsome','Edward','Norton','admin','031375','sky'),
('ironMan', 'Robert','DowingJ','customer','011077','sky');

INSERT INTO account( acctype, balance,status, userid)
VALUES  ('checking',1000,'pending',1),
	   ('savings',2000,'pending',2),
	  ('savings',120000,'pending',3),
	   ('checking',50000,'pending',4),
	   ('checking',900,'pending',5),
	   ('checking',0,'approved',6);
	   
--ALTER TABLE account RENAME isvalid TO status
--ALTER TABLE account DROP COLUMN pswd;

	  
--STORED PROCEDURE FOR PROJECT ZERO
CREATE PROCEDURE myproject()
AS $$
BEGIN
	SELECT * 
	FROM account
	ORDER BY
	acc_no ;
	
END;$$language plpgsql

