package demo.ksug.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Project: SpringBootHandsonlan
 * FileName: Board
 * Date: 2016-08-05
 * Time: 오후 5:47
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Date createdAt;

    protected Board() {
    }

    public Board(String name) {
        this.name = name;
        this.createdAt = new Date();
    }

    public Post write(String author, String title, String content) {
        return new Post(this, author, title, content);
    }

    public String getName() {
        return name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}


