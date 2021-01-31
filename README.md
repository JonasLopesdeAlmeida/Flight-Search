# Flight-Search

# Rest API built as a task for Traveltek company

# Running the project
- After make download the project, import the project in the code editor(Elipse) as "existing mavem projects" and go to the file root where the project is based in.
- For runnig the project, click on "FlightSearchApplication.java"class and go to "Run as" and click on "Spring Boot App"
- The project running in the default port 8080
- the project will create an database automatically as well as all data in the mysql (phpmyadmin).
- testing the endpoints within client HTTP such as: POSTMAN, INSOMNIA and son on.

# Rest api endpoints

http://localhost:8080/flightsin/id
- This endpoint brings all data related to outbound flights.They can come with flight connections or not.
ex: http://localhost:8080/flightsin/1

http://localhost:8080/flightsout/id
- This endpoint brings all data related to return flights.They can come with flight connections or not as well.
ex: http://localhost:8080/flightsout/1

http://localhost:8080/flights/id
- This endpoint brings all data related to outbound flights together with return flights or outbound flights only.They can come with flight connections or not as well.
ex: http://localhost:8080/flights/1

http://localhost:8080/flightsin/time
- This endpoint brings a response for the question: What’s the average journey time between London Heathrow (LHR) and Dubai (DXB)?
ex: http://localhost:8080/flightsin/time

http://localhost:8080/flightsin/date
- This endpoint brings a response for the question: Which airport day has the most departures from Manchester (MAN)?
ex: http://localhost:8080/flightsin/date

http://localhost:8080/flightsin/percentage
- This endpoint brings a response for the question: What percentage of the total set of flights fly into Sweden?
ex: http://localhost:8080/flightsin/percentage

http://localhost:8080/flightsin/canceled
- This endpoint brings a response for my personal statistic: What percentage of flights fly into London Heathrow (LHR) that have been canceled in the specific date: 09/02/2021?
ex: http://localhost:8080/flightsin/canceled




