## purpose for this repo
for getting acquainted with ancient struts1 framework

planning to create a subscriptions management tool, given too many subscriptions like netflix, google-drive, dropbox, office365 were subscribed recently.
might be a good chance to also tidy up these messes

develop with following:
- windows11 10.0.22621 (202211)
- vscode 1.73.1 (202211)
- jdk1.8.0_202
- maven 3.6.4
- mssqlserver 2016 sp2
- apache-tomcat-8.5.83

## to run this app
```
create database myapp;
create login usr1 with password = '1qaz@WSX';
use myapp;
create user usr1 for login usr1;

create table subscriptions (
	id int identity(1,1) primary key,
	name nvarchar(50),
	monthlyfee decimal(19,4),
	startedon datetime2,
	endedon datetime2,
);

insert into subscriptions (name, monthlyfee, startedon, endedon) values ('netflix', 300, '20220101', null);
insert into subscriptions (name, monthlyfee, startedon, endedon) values ('office365', 500, '20220301', null);
```

download [tomcat apache-tomcat-8.5.83-windows-x64.zip](https://archive.apache.org/dist/tomcat/tomcat-8/v8.5.83/bin/), extract and start tomcat by execcute D:\whereyouinstalled\bin\startup.bat

run deploy.bat from this project (need to modify the tomcat install dir of this script)

open web browser and navigate to http://localhost:8080/myapp