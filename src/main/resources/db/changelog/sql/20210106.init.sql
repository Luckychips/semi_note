--liquibase formatted sql
--changeset bwkim:20210106

CREATE TABLE `release_note` (
	`note_no`	bigint	NOT NULL primary key	COMMENT '시퀀스 - autoIncrement',
	`note_ver`	varchar(20)	NULL	COMMENT '버전',
	`note_content`	varchar(2000)	NULL	COMMENT '버전에서 변경된 사항',
	`release_file_path`	varchar(100)	NULL	COMMENT '릴리즈버전 경로',
	`release_file_download_count`	bigint	NULL	COMMENT '릴리즈버전 다운수',
	`debug_file_path`	varchar(100)	NULL	COMMENT '베타버전 경로',
	`debug_file_download_count`	bigint	NULL	COMMENT '베타버전 다운수',
	`creator_id`	bigint	NOT NULL	COMMENT '생성 관리자 시퀀스',
	`create_at`	datetime	default current_timestamp() not null 	COMMENT '생성시간',
	`updater_id`	bigint	NOT NULL	COMMENT '수정 관리자 시퀀스',
	`update_at`	datetime	default current_timestamp() not null on update current_timestamp()	COMMENT '수정시간'
);

CREATE TABLE `release_note_manager` (
	`manager_id`	bigint	NOT NULL	primary key    COMMENT '시퀀스 - autoIncrement',
	`name`	varchar(20)	NOT NULL	COMMENT '관리자명 - 슬랙',
	`password`	varchar(200)	NOT NULL	COMMENT '비밀번호 - 암호화 필요',
	`is_enabled`	boolean	NULL	DEFAULT true	COMMENT '사용여부',
	`create_at`	datetime	default current_timestamp() not null 	COMMENT '생성시간',
	`update_at`	datetime	default current_timestamp() not null on update current_timestamp()	COMMENT '수정시간'
);

CREATE TABLE `attachment` (
	`file_no`	bigint	NOT NULL    primary key	COMMENT '시퀀스 - autoIncrement',
	`board_no`	bigint	NULL	COMMENT '시퀀스 - autoIncrement',
	`file_path`	varchar(32)	NOT NULL	COMMENT '파일경로',
	`create_at`	datetime	default current_timestamp() not null 	COMMENT '생성시간',
	`update_at`	datetime	default current_timestamp() not null on update current_timestamp()	COMMENT '수정시간'
);

CREATE TABLE `anonymous_board` (
	`board_no`	bigint	NOT NULL    primary key	COMMENT '시퀀스 - autoIncrement',
	`title`	varchar(50)	NOT NULL	COMMENT '타이틀',
	`creator_name`	varchar(50)	NOT NULL	COMMENT '생성자명',
	`password`	varchar(200)	NOT NULL	COMMENT '비밀번호 - 암호화 필요',
	`content`	varchar(2000)	NULL	COMMENT '게시판 내용',
	`create_at`	datetime	default current_timestamp() not null 	COMMENT '생성시간',
	`update_at`	datetime	default current_timestamp() not null on update current_timestamp()	COMMENT '수정시간'
);

CREATE TABLE `reply` (
	`reply_no`	bigint	NOT NULL    primary key	COMMENT '시퀀스 - autoIncrement',
	`board_no`	bigint	NOT NULL	COMMENT '현재 게시판 번호',
	`message`	varchar(2000)	NULL	COMMENT '댓글 내용',
	`creator_name`	varchar(50)	NOT NULL	COMMENT '생성자명',
	`password`	varchar(200)	NOT NULL	COMMENT '비밀번호 - 암호화 필요',
	`create_at`	datetime	default current_timestamp() not null	COMMENT '생성시간',
	`update_at`	datetime	default current_timestamp() not null on update current_timestamp() COMMENT '수정시간'
);
