package demo.ksug.board.module;

import demo.ksug.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project: SpringBootHandsonlan
 * FileName: BoardRepository
 * Date: 2016-08-05
 * Time: 오후 5:58
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByName(String name);
}
