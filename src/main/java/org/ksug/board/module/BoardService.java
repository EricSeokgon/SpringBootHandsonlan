package org.ksug.board.module;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Project: SpringBootHandsonlan
 * FileName: BoardService
 * Date: 2016-08-05
 * Time: 오후 6:04
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class BoardService {
    private BoardRepository boardRepository;
    private PostRepository postRepository;
}
