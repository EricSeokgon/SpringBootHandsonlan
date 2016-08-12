package demo.ksug.board.module;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Project: SpringBootHandsonlan
 * FileName: PostForm
 * Date: 2016-08-08
 * Time: 오전 11:26
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PostForm {

    @NotEmpty
    private String author;
    @NotEmpty
    private String title;
    @NotEmpty
    private String content;

    public PostForm() {
    }

    public PostForm(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
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
}
