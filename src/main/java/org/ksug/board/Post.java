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

    public Post(Board board, String author, String title, String content) { }

    public Post(String author, String title, String content, Board board) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.board = board;
        this.createdAt = new Date();
    }

    public Post update(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
        return this;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
