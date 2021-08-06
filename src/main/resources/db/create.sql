SET MODE PostgresSql;
CREATE TABLE IF NOT EXIST tasks(
id int PRIMARY KEY auto_increment,
description VARCHAR,
completed  BOOLEAN
);