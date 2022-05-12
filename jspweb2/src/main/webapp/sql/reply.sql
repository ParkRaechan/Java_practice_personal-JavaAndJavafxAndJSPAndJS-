create table jspweb.reply( /* 테이블 생성 */

	rno int primary key auto_increment ,
	rcontent varchar(1000) ,
	rdate datetime default now() ,
	rindex int ,
	bno int ,
	mno int ,
	foreign key( bno ) references board(bno) on delete cascade,
	foreign key( mno ) references member(mno)
);