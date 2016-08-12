package demo.ksug.webservice.support;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;

import java.util.Locale;
import java.util.Optional;

/**
 * Project: SpringBootHandsonlan
 * FileName: MessageSourceAccessor
 * Date: 2016-08-08
 * Time: 오전 11:16
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MessageSourceAccessor {
    private MessageSource messageSource;

    public MessageSourceAccessor(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Optional<String> getMessage(String code, Locale locale) {
        return Optional.ofNullable(messageSource.getMessage(code, null, null, locale));
    }

    public Optional<String> getMessage(String code, Object[] args, Locale locale) {
        return Optional.ofNullable(messageSource.getMessage(code, args, null, locale));
    }

    public Optional<String> getMessage(MessageSourceResolvable resolvable, Locale locale) {
        try {
            return Optional.of(messageSource.getMessage(resolvable, locale));
        } catch (NoSuchMessageException e) {
            return Optional.empty();
        }
    }
}
