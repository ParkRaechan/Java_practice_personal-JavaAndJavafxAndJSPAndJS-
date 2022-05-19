create table category(
	cno int primary key auto_increment ,  /* 카테고리 번호 */
    cname varchar(100) /* 카테고리 이름 */
);
create table product(
	pno int primary key auto_increment , /* 제품 번호 */
    pname varchar(1000) ,  /* 제품 명 */
    pprice int ,  /* 제품 가격 */
    pdiscount float ,  /* 제품 할인율 = float = 실수 자료형*/
    pactive int default 0,  /* 제품 상태 [ 0:준비중(기본값)  1:판매중  2:재고준비중 */
	pimg varchar(1000) ,  /* 제품 이미지 */
    cno int , /* 제품 카테고리 */
    foreign key( cno ) references category(cno) on update cascade 
    /*  product의 cno필드(fk)가 category의 cno(pk) 와 참조(연결)한다 */
    /* on update cascade : pk 레코드가 수정 되면 fk 레코드 도 같이 수정된다 */
);

create table stock( 
	sno int primary key auto_increment , /* 재고 번호 */
    scolor varchar(100) ,  /* 재고 색상 */
    ssize varchar(100) ,   /* 재고 색상 */
    samount int ,   /* 재고 수량 */
    firstdate datetime default now(),   /* 재고 최초등록일 */
	updatedate datetime default now() on update now(),  /* 재고 최근수정일 */
    pno int ,  /* 제품 번호 */
    foreign key( pno ) references product(pno) on delete cascade
    /* 레코드가 변경되면 자동으로 현재날짜를 부여 */
    /* default : 값이 안들어왔을때 초기값 설정 */
    /* on update : 레코드가 변경 되었을때 값 설정 */ 
    /* on delete cascade : pk 레코드가 삭제 되면 fk 레코드 도 같이 삭제된다 */
);

/* 한 명령어( ; 기준 = 커서위치 ) 씩 실행단축키 = ctrl+엔터 */

create table plike(
	plikeno int primary key auto_increment , 
    pno int ,
    mno int ,
    foreign key(pno) references product(pno) on delete cascade ,
    foreign key(mno) references member(mno) on delete cascade 
)

create table porderdetail(
	orderdetailno int primary key auto_increment , 	/* 주문상세 번호 */
    orderdetailactive  int ,   /* 주문상세 상태 */
	samount int , 			/* 수량 */ 
    totalprice	int , 		/* 총결제액 */
	sno int , 				/* 재고번호 */
    orderno int ,  			/* 주문번호 */ 
    foreign key( sno ) references stock( sno ) on update cascade , 
    foreign key( orderno ) references porder( orderno) on update cascade 
);
create table cart(
	cartno int primary key auto_increment , 	/* 카트 번호 */
    samount int , 			/* 수량 */ 
    totalprice	int , 		/* 총결제액 */
    sno int , 				/* 재고번호 */
	mno int , 				/* 회원번호 */ 
    foreign key( sno ) references stock( sno ) on update cascade , 
    foreign key ( mno ) references member(mno) on update cascade 
);
create table porder(
	orderno	 int primary key auto_increment , 	/* 주문 번호 */
    orderdate datetime default now() , /* 주문 날짜 */
    ordername varchar(20) , /* 받는사람 성명 */
    orderphone varchar(20) , /* 받는사람 연락처 */ 
    orderaddress varchar(100) , /* 받는사람 주소 */
    ordertotalpay int ,   /* 주문 총 결제액  */
    orderactive int ,   /* 주문 상태 */
    orderrequest varchar(100) ,   /* 주문 요청사항 */
    orderdeliverno int ,   /* 배송 번호  */
    mno int , 				/* 회원번호 */ 
    foreign key ( mno ) references member(mno) on update cascade 
);
















select pno , pimg from product;
/* pno 와 pimg 표시 */

select * from product;
 /* 모든 필드 표시 */

select * from product where pprice >= 20000; 
/* 가격이 2만원이상인 레코드 검색( 모든필드 표시 ) */

select pname from product where pprice >=20000 and pprice <30000;
/* 가격이 2만원대 인 레코드 검색 ( 제품이름만 표시 )*/

select * from product order by pprice desc; 
/* 가격 내림차순 모든 필드 검색*/

select * from product order by pprice desc limit 0 , 3 ;  
/* 가격이 상위 3개 검색 */

select * from product group by cno;
/*카테고리가 동일하면 레코드 그룹 */

select * , count(*) as categorycount from product group by cno;
/* 모든필드 표시 , 그룹개수 표시  */

select * from product join stock on product.pno = stock.pno;
/* 제품 테이블과 재고 테이블 조인  */

/* DML
	select : 검색
		select 필드명1 필드명2 from 테이블 : 특정 필드를 검색
        select * from 테이블 : 모든 필드를 검색 
        select 새로운필드명 as 별칭명 from 테이블
			as : 별칭 ( 해당 필드명을 별명으로 표시 하기 )
    insert : 추가 
		insert into 테이블명 values( 값1 , 값2 , 값3 )
    update : 수정
		update 테이블명 set 필드명1 = 값1 , 필드명2 = 값2 
    delete : 삭제 
		delete from 테이블 ;
	
    조건 : where 필드명 = 값 
		and / or 
    정렬 : order by 필드명 asc / desc
    제한 : limit 시작인덱스 , 개수 
    그룹 : group by 필드명 
    조인 : 두개 이상의 테이블 합치기 [ 필수조건 : 동일한 데이터 존재 ]
			select * from 테이블명1 join 테이블명2 ;
			select * from 테이블명1 join 테이블명2 on 테이블명1.pk = 테이블명2.fk; 		
    
    SQL함수 
		// 집계 함수
		count( 필드명 ) : 해당 필드의 레코드 개수 [ NULL 제외 ]  
        count( * ) : 레코드 개수  [ NULL 포함 ] 
        sum( 필드명 ) : 합계
        avg( 필드명 ) : 평균
        max( 필드명 ) : 최댓값
        min( 필드명 ) : 최솟값 
/*	









/* 개인별 장바구니내 제품별 정보 */
-- 1. 개인별 장바구니 [ 장바구니번호 , 수량 , 가격 , 재고번호 , 회원번호 ] 
select * from cart where mno = 2; -- 회원번호 2번의 장바구니 
-- 2. 장바구니번호 별 제품 정보( 색상 , 사이즈 ) 
select * from stock where sno = 33; -- 재고번호 33번의 정보( 색상 , 사이즈 )
-- 3. table 합치기(  cart테이블 stock테이블 -> join  )
select * from cart join stock;
-- 4. 동일한 데이터의 table 합치기 
select * from cart join stock on sno = sno ; -- on 필드명이 동일한경우 오류
select * from cart A join stock B on A.sno = B.sno ; -- 테이블명 별칭 
-- 5. 특정 회원의 장바구니 테이블과 재고 테이블의 join 결과  
select * from cart A join stock B on A.sno = B.sno where mno = 2 ;
-- 6. 특정 필드 표시 [ 장바구니 view 에서 사용할 필드만 빼오기 ] 
select 
   A.cartno as 장바구니번호 ,       /* A  : cart테이블 */
    A.samount as 구매수량 , 
    A.totalprice as 총가격 , 
    B.scolor as 색상 ,             /* B  : stock테이블 */
    B.ssize as 사이즈 ,
    B.pno as 제품번호 
from cart A 
join stock B
on A.sno = B.sno 
where mno = 2;

-- 7. 2개 테이블 조인 
select * from cart A join stock B on A.sno = B.sno;
-- 8. 3개 테이블 조인
select * from cart join stock join product;
-- 9. 3개 테이블 조인내 동일한 재고번호 이면서 동일한 제품번호 이면
select * from cart A join stock B on A.sno = B.sno join product C on B.pno = C.pno ;
-- 10. 제품명과 제품이미지도 추가로 가져오기
select 
   A.cartno as 장바구니번호 ,       
    A.samount as 구매수량 , 
    A.totalprice as 총가격 , 
    B.scolor as 색상 ,          
    B.ssize as 사이즈 ,
    B.pno as 제품번호 ,            
    C.pname as 제품명 , 
    C.pimg as 제품이미지
from cart A 
join stock B 
on A.sno = B.sno 
join product C 
on B.pno = C.pno
where A.mno = 2;

