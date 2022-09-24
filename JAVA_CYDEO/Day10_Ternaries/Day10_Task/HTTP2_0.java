package Day10_Ternaries.Day10_Task;

public class HTTP2_0 {
    public static void main(String[] args) {
        int massage = 200;
        String result = "";

        result = (massage == 200)? "OK" :(massage == 201)? "Created" :(massage == 202)? "Accepted"
       :(massage == 301)? "Moved Permanently":(massage == 303)? "See Other":(massage == 304)? "Not Modified"
       :(massage == 307)? "Temporary Redirect" :(massage == 400)? "Bad Request":(massage == 401)? "Unauthorized"
       :(massage == 403)? "Forbidden":(massage == 404)? "Not Found":(massage == 410)? "Gone"
       :(massage == 500)? "Internal Server Error" : "Service Unavailable";

        System.out.println(result);



    }


}
