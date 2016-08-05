package org.ksug.board.module;

import org.ksug.board.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Project: SpringBootHandsonlan
 * FileName: BoardRepository
 * Date: 2016-08-05
 * Time: 오후 5:58
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface BoardRepository extends JpaRepository<Post, Long> {
    List<Post> findByName(String name);
}
