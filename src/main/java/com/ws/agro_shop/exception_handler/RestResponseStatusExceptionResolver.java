package com.ws.agro_shop.exception_handler;


import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
class RestResponseStatusExceptionResolver extends AbstractHandlerExceptionResolver {

    @Override
    protected ModelAndView doResolveException(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            Exception ex) {
        try {
            if (ex instanceof IllegalArgumentException) {
                return handleIllegalArgument((IllegalArgumentException) ex, response);
            }
            ///
        } catch (Exception handlerException) {
            logger.warn("Handling of [" + ex.getClass().getName() + "]resulted in Exception", handlerException);
        }
        return null;
    }

    private ModelAndView
    handleIllegalArgument(IllegalArgumentException ex, HttpServletResponse response)
            throws IOException {
        response.sendError(HttpServletResponse.SC_CONFLICT);
        String accept = response.getHeader(HttpHeaders.ACCEPT);
        ///
        return new ModelAndView();
    }
}
