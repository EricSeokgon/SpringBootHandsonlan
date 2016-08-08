package org.ksug.board.module;

import org.ksug.board.Board;
import org.ksug.board.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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

    @Autowired
    public void setBoardRepository(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Autowired
    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Board findBoard(String boardname) {
        Board board = boardRepository.findByName(boardname);
        return board;
    }

    public List<Post> findPosts(String boardname) {
        Board board = findBoard(boardname);
        return postRepository.findByBoard(board);
    }

    private Post getPost(long postId) {
        Post post = postRepository.findOne(postId);
        return post;
    }

}
