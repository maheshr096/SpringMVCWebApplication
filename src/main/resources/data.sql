
insert into employe (ID,NAME,EXPERIAENCE,TECHNOLOGY)
values(1,'vamsi', 'java', '2 years');

insert into employe (ID,NAME,EXPERIAENCE,TECHNOLOGY)
values(2,'sandya', 'spring','1.6 years');

insert into employe (ID,NAME,EXPERIAENCE,TECHNOLOGY)
values(3,'Kiran', 'Jsf', '2 years');

insert into employe (ID,NAME,EXPERIAENCE,TECHNOLOGY)
values(4,'mahesh', 'System', '0.6 years');

insert into employe (ID,NAME,EXPERIAENCE,TECHNOLOGY)
values(5,'ravi', 'primeface', '0.6 years');

ALTER TABLE EMPLOYE ALTER COLUMN ID RESTART WITH (SELECT MAX(ID) FROM EMPLOYE) + 1;