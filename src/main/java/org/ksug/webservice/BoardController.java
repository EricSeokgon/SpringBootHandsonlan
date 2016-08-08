package org.ksug.webservice;

import org.ksug.board.Board;
import org.ksug.board.Post;
import org.ksug.board.module.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping(value = "/{boardname}/info", method = {RequestMethod.GET, RequestMethod.HEAD})
    public ResponseEntity<Board> info(@PathVariable String boardname) {
        return ResponseEntity.ok(boardService.findBoard(boardname));
    }

    @RequestMapping(value = "{boardname", method = {RequestMethod.GET, RequestMethod.HEAD})
    public ResponseEntity<List<Post>> listPosts(@PathVariable String boardname) {
        return ResponseEntity.ok(boardService.findPosts(boardname));
    }
}
