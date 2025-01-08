package ex.enumeration.test2;

public enum HttpStatus {
    OK(200, "OK"),
    Bad_Request (400, "Bad Request"),
    Not_Found (404, "Not Found"),
    Internal_Server_Error(500, "Internal Server Error");

    private final int code;
    private final String message;


    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int code) {
        for (HttpStatus status : values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }
}
