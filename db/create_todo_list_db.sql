drop database if exists todo_list;

create database todo_list;

use todo_list;

create table TODO (
id int auto_increment primary key,
memo varchar(256),
is_done int, -- 完了フラグ
create_datetime datetime default CURRENT_TIMESTAMP, -- 作成日
update_datetime datetime default CURRENT_TIMESTAMP, -- 更新日
end_datetime datetime, -- 期限日
finish_datetime datetime -- 完了日
)DEFAULT CHARSET = utf8;