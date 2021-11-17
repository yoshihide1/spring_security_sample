echo -----------create_database----------
cd db

mysql --defaults-extra-file=develop.conf < create_todo_list_db.sql
mysql --defaults-extra-file=develop.conf < create_spring_security_db.sql

cd ../

echo ----------finish----------
