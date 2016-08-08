package org.ksug.webservice;

import org.ksug.board.module.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: SpringBootHandsonlan
 * FileName: BoardController
 * Date: 2016-08-08
 * Time: 오전 9:45
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/board")
public class BoardController {
    private BoardService boardService;

    @Autowired
    public void setBoardService(BoardService boardService) {
        this.boardService = boardService;
    }
}
