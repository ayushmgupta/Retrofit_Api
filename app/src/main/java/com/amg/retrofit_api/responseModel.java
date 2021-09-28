package com.amg.retrofit_api;

public class responseModel {
    String message,documentation_url;

    public responseModel() {
    }

    public responseModel(String message, String url) {
        this.message = message;
        this.documentation_url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDocumentation_url() {
        return documentation_url;
    }

    public void setDocumentation_url(String documentation_url) {
        this.documentation_url = documentation_url;
    }

}
