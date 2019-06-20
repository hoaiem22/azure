Create database fptueventclub default character set utf8;
drop user if exists fptueventclub@localhost;
CREATE USER fptueventclub@'localhost' IDENTIFIED BY 'FPTUEventClub@123';
GRANT ALL PRIVILEGES ON fptueventclub.* TO fptueventclub@localhost WITH GRANT OPTION;