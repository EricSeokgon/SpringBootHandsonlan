package demo.ksug.board.module;

import demo.ksug.board.Post;
import demo.ksug.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Project: SpringBootHandsonlan
 * FileName: PostRepository
 * Date: 2016-08-05
 * Time: 오후 6:05
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByBoard(Board board);
}
