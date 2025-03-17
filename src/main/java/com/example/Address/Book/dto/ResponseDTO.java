package com.example.Address.Book.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ResponseDTO {

    private String message;
    private String status;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }
    public ResponseDTO(String message,String status)
    {
        this.message=message;
        this.status=status;
    }
}
