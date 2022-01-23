package com.ais.QuizService.exception;

public class ErrorCode {
    public final static int notFound = 80801;
    public final static int notPermision = notFound + 1;
    public final static int DuplicateRequest = notFound + 3;

    public static String getErrorMessage(int code) {
        switch (code) {
            case notFound:
                return "Not found !!!";

            case notPermision:
                return "Don't have permission";

            case DuplicateRequest:
                return "this Request is duplicate !!!";
        }
        return "";
    }
}
