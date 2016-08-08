package org.ksug.board.module;


import org.springframework.http.HttpStatus;

/**
 * Project: SpringBootHandsonlan
 * FileName: ResourceNotFoundException
 * Date: 2016-08-08
 * Time: 오전 10:39
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public abstract class ResourceNotFoundException extends RuntimeException {
    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }

    public String getError() {

        return HttpStatus.NOT_FOUND.getReasonPhrase();
    }

    public String getCode() {
        return "error." + getClass().getSimpleName();
    }

    public java.lang.Object[] getArgs() {
        return null;
    }
}
