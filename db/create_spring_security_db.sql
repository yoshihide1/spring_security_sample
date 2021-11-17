drop database if exists spring_security_test;

create database spring_security_test;

use spring_security_test;

CREATE TABLE members (
  `id` VARCHAR(100) NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `role` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`))
DEFAULT CHARACTER SET = utf8mb4;

INSERT INTO members (id, name, password, `role`) VALUES('admin', '管理者', '$2a$10$F9PClZY7wQBuNHRzqI55rug.3mN55lH6M1.BRYT.rat1hQeij/TJ6', 'ROLE_ADMIN');
INSERT INTO members (id, name, password, `role`) VALUES('super', 'スーパーユーザ', '$2a$10$F9PClZY7wQBuNHRzqI55rug.3mN55lH6M1.BRYT.rat1hQeij/TJ6', 'ROLE_ADMIN,ROLE_USER');
INSERT INTO members (id, name, password, `role`) VALUES('test', '管理者', '$2a$10$22sUsRZRnBsF6qeJYYIGWuyDUhD010C9PUd6Vd5I38esvzopk8j6W', 'ROLE_ADMIN');
INSERT INTO members (id, name, password, `role`) VALUES('user', '一般ユーザ', '$2a$10$F9PClZY7wQBuNHRzqI55rug.3mN55lH6M1.BRYT.rat1hQeij/TJ6', 'ROLE_USER');
