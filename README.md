# URL Shortener

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

#### Notes

There are definitely chances for conflicts with the link generation given the way I approached it. 
Given more time, there are a few approaches I would have used to solve this issue. An easy approach 
would have been to refactor this method to check if the generated link already existed, and if so, 
regenerate a new link. A better and more scalable approach would involve this solution, along with
expiring links after a set amount of time.
