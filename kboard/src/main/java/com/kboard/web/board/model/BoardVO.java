package com.kboard.web.board.model;

/*
 * create table kboard(
num int auto_increment primary key,
mb_sq int,
subject varchar(100) not null,
content text,
hit int default 0,
wdate datetime default now(),
udate datetime,
ddate datetime);
 */
public class BoardVO {
	//글 번호
	private int num;
	//회원 번호
	private int mb_sq;
	//글 제목
	private String subject;
	//글 내용
	private String content;
	//조회수
	private int hit;
	//작성자
	private String writer;
	//작성일자
	private String wdate;
	//수정일자
	private String udate;
	//삭제일자
	private String ddate;
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getMb_sq() {
		return mb_sq;
	}

	public void setMb_sq(int mb_sq) {
		this.mb_sq = mb_sq;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public String getUdate() {
		return udate;
	}

	public void setUdate(String udate) {
		this.udate = udate;
	}

	public String getDdate() {
		return ddate;
	}

	public void setDdate(String ddate) {
		this.ddate = ddate;
	}

}
