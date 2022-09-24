package Day11_Switch.Day11_Task;

public class HTTP {
    public static void main(String[] args) {
        int massage = 201;
        String result = "";

        switch (massage){
            case    200:
                result = "OK";
                break;


            case    201:
                result = "Created";
                break;


            case    202:
                result = "Accepted";
                break;


            case    301:
                result = "Moved Permanently";
                break;


            case    303:
                result = "See Other";
                break;


            case    304:
                result = "Not Modified";
                break;


            case    307:
                result = "Temporary Redirect";
                break;


            case    400:
                result = "Bad Request";
                break;


            case    401:
                result = "Unauthorized";
                break;


            case    403:
                result = "Forbidden";
                break;


            case    404:
                result  =  "Not Found";
                break;


            case    410:
                result = "Gone";
                break;


            case    500:
                result = "Internal Server Error";
                break;


            case    503:
                result = "Service Unavailable";
                break;
        }
        System.out.println(result);
    }
}
