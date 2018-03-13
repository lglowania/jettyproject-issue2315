# jettyproject-issue2315
Demonstration that getting params from the query string is not possible with jetty's multipart requests.

## Usage
`mvn jetty:run`

Then go to `localhost:8080` in your browser, upload a file > 1MB a watch the stack trace. 
