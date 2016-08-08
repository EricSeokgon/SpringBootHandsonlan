package org.ksug.board.module;

import org.omg.CORBA.Object;
import org.springframework.http.HttpStatus;

/**
 * Project: SpringBootHandsonlan
 * FileName: BoardNotFoundException
 * Date: 2016-08-08
 * Time: 오전 10:53
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class BoardNotFoundException extends ResourceNotFoundException{
    private final String boardname;

    public BoardNotFoundException(String boardname) {
        this.boardname = boardname;
    }
    public String getBoardname() {
        return boardname;
    }
    @Override
    public String getError(){
        return "Board "+ HttpStatus.NOT_FOUND.getReasonPhrase();
    }
    @Override
    public Object[] getArgs(){
        return new Object[](boardname);
    }

}
