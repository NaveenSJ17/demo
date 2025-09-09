package com.tp.bookmydoctor.responsedto;

import lombok.Data;

@Data
public class GlobalResponseDto {
    private boolean error;
    private String message;
    private Object data;

    public GlobalResponseDto(boolean error, String message, Object data) {
        this.error = error;
        this.message = message;
        this.data = data;
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
