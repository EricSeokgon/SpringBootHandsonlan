package org.ksug.board;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Project: SpringBootHandsonlan
 * FileName: Post
 * Date: 2016-08-05
 * Time: 오후 5:53
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Post {
    private long id;
    private String author;
    private String title;
    private String content;
    private Date createdAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Board board;

    public Post() { }

    public Post(String author, String title, String content, Board board) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.board = board;
        this.createdAt = new Date();
    }
}
