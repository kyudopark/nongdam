-- 231217~ laky --

create table chat(
	chatroom_idx int,
	user_idx int,
	chat_time datetime,
	chat_message text
)

create table chatRoom(
	chatroom_idx int,
	user_idx int,
	chat_disabled_time datetime
)

-- ====================================
drop table chat
drop table chatroom
select * from user
select * from chat 
select * from chatroom
delete from chatroom where chatroom_idx=0
delete from chat

