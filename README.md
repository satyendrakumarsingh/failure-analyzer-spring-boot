# Failur analyzer with spring boot
We can easly implement our own custom failure analyzer with spring boot.

# Why we need falure analyzer
When we run our boot application or any spring application we encounter startup issues like - 
* Port in use
* No unique bean definition
* Bean in creation 

Or any other exception with stack trace or with spring default exception message some times it difficult to find the actual issue or we need to check complete stack trace to identify the issue.

Through FailureAnalyzer we can intercept exceptions at startup with more human readable format.
Complete list of FailureAnalyzer present in org.springframework.boot.diagnostics package of spring boot.
