Hello Oracle,
To build docker image, in cmd/terminal enter:
1. docker build -t sa54_eugene_fibonacci .

To run the docker image, in cmd/ terminal
2. docker run -p 9090:8080 sa54_eugene_fibonacci.jar

Application started running in:
3a. 192.168.99.100:9090/fibonacci   --> default docker
3b. localhost:8080/fibonacci        --> expose localhost port as configured

Using Postman (postman.com) to create new HTTP Request
5. GET (url request) localhost:8080/fibonacci
6. For the body content, enter the following JSON string:
{
 "elements": 10
}

6. JSON string response is returned with "fibonacci" and "sorted" arrays

Thank you.

Eugene Ong
NUS ISS
SA54 GDip ISS