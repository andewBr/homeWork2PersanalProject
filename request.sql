create database garbage_database;

create table public.subject(
                               id serial primary key ,
                               subject varchar(128)
);

create table public.teacher(
                               id serial primary key ,
                               name varchar(128) not null ,
                               subject_id bigint REFERENCES subject not null
);

INSERT INTO public.subject (subject) VALUES ('Математика');
INSERT INTO public.subject (subject) VALUES ('Физика');
INSERT INTO public.subject (subject) VALUES ('Литература');
INSERT INTO public.subject (subject) VALUES ('История');
INSERT INTO public.subject (subject) VALUES ('Биология');

INSERT INTO public.teacher (name, subject_id) VALUES ('Иванов', 1);
INSERT INTO public.teacher (name, subject_id) VALUES ('Петров', 2);
INSERT INTO public.teacher (name, subject_id) VALUES ('Сидорова', 3);
INSERT INTO public.teacher (name, subject_id) VALUES ('Козлов', 4);
INSERT INTO public.teacher (name, subject_id) VALUES ('Смирнов', 5);

drop table schoolsubjects cascade ;
drop table teacher cascade ;
drop table school cascade ;

select * from subject;
select * from teacher;
