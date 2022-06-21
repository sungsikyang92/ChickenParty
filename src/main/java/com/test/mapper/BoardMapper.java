package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.test.dto.BoardDto;

@Mapper
public interface BoardMapper {
	@Select("SELECT board_seq, board_title, board_date FROM board ") 
	List<BoardDto> getBoardList();
	
	
	@Select(" SELECT * FROM board WHERE board_seq= #{board_seq} ")
	BoardDto getBoardDetail(int board_seq);
	
	@Insert(" INSERT INTO board VALUES( null, #{board_title}, #{board_content}, now(),null) ")
	int insertBoard(BoardDto dto);

	@Update(" UPDATE board SET board_title= #{board_title}, board_content=#{board_content} where board_seq=#{board_seq}")
	int updatetBoard(BoardDto dto);

	@Delete(" DELETE FROM board WHERE board_seq= #{board_seq} ")
	int deletetBoard(int boardSeq);
	
}
