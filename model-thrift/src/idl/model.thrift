namespace java com.model.message

struct Request {
    1: string url,
    2: string method
}

struct Response {
    1: string code,
    2: string message
}

service ThriftTestService{
    Response test(1: Request request)
}