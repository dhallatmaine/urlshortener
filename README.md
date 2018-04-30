# URL Shortener - Derrick Hall

This application was written for Schireson and is intended for a demostration purpose only

#### Structure

I've chosen to use spring boot as the main logic for the application as it's the language and
framework I'm most comfortable with in terms of supporting production applications. The application
is backed by a redis database for the persistence of the links and I've chosen to front the app
with nginx to show how easy something like this is using docker.

#### Running

This project requires docker to run, please consult the docker documentation on installing 
to your operating system. After docker has been installed, proceed with the following commands:

**Build the spring boot artifact first** `./mvnw clean package`

**Build the docker images** `docker-compose build`

**Launch the docker images** `docker-compose up`

You can then navigate your browser to `http://localhost` to view the application. **NOTE** You 
may need to go to the docker machines ip address if you're using boot2docker on the mac.